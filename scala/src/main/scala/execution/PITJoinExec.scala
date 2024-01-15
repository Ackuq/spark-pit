/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Modifications copyright (C) 2022 Axel Pettersson
 */

package io.github.ackuq.pit
package execution

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.catalyst.InternalRow
import org.apache.spark.sql.catalyst.expressions.BindReferences.bindReferences
import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.expressions.codegen.Block.BlockHelper
import org.apache.spark.sql.catalyst.expressions.codegen._
import org.apache.spark.sql.catalyst.plans.Inner
import org.apache.spark.sql.catalyst.plans.JoinType
import org.apache.spark.sql.catalyst.plans.physical._
import org.apache.spark.sql.execution._
import org.apache.spark.sql.execution.joins.ShuffledJoin
import org.apache.spark.sql.execution.metric.SQLMetric
import org.apache.spark.sql.execution.metric.SQLMetrics

import logical.{CustomJoinType, PITJoinType}

/** Performs a PIT join of two child relations.
  */
protected[pit] case class PITJoinExec(
    leftPitKeys: Seq[Expression],
    rightPitKeys: Seq[Expression],
    leftEquiKeys: Seq[Expression],
    rightEquiKeys: Seq[Expression],
    condition: Option[Expression],
    left: SparkPlan,
    right: SparkPlan,
    returnNulls: Boolean,
    tolerance: Long
) extends ShuffledJoin
    with CodegenSupport {

  override def isSkewJoin: Boolean = false

  override protected def withNewChildrenInternal(
      newLeft: SparkPlan,
      newRight: SparkPlan
  ): PITJoinExec = copy(left = newLeft, right = newRight)

  override lazy val metrics: Map[String, SQLMetric] = Map(
    "numOutputRows" -> SQLMetrics.createMetric(
      sparkContext,
      "number of output rows"
    )
  )

  override def nodeName: String = {
    super.nodeName
  }

  override def stringArgs: Iterator[Any] =
    super.stringArgs.toSeq.dropRight(1).iterator

  override def requiredChildDistribution: Seq[Distribution] = {
    if (leftEquiKeys.isEmpty || rightEquiKeys.isEmpty) {
      // TODO: This should be improved, but for now just keep everything in one partition
      AllTuples :: AllTuples :: Nil
    } else {
      ClusteredDistribution(leftEquiKeys) :: ClusteredDistribution(
        rightEquiKeys
      ) :: Nil
    }
  }

  val customJoinType: CustomJoinType = PITJoinType

  // Set as inner
  override def joinType: JoinType = Inner

  override def outputPartitioning: Partitioning = customJoinType match {
    // Left and right output partitioning should equal in the results
    case PITJoinType => left.outputPartitioning
    case x =>
      throw new IllegalArgumentException(
        s"${getClass.getSimpleName} not take $x as the JoinType"
      )
  }

  override def outputOrdering: Seq[SortOrder] = customJoinType match {
    // For PIT join, the order should be in descending time order for both sides
    case PITJoinType => getKeyOrdering(leftKeys, left.outputOrdering)
    case x =>
      throw new IllegalArgumentException(
        s"${getClass.getSimpleName} should not take $x as the JoinType"
      )
  }

  override def leftKeys: Seq[Expression] = leftEquiKeys ++ leftPitKeys

  /** The utility method to get output ordering for left or right side of the
    * join.
    *
    * Returns the required ordering for left or right child if
    * childOutputOrdering does not satisfy the required ordering; otherwise,
    * which means the child does not need to be sorted again, returns the
    * required ordering for this child with extra "sameOrderExpressions" from
    * the child's outputOrdering.
    */
  private def getKeyOrdering(
      keys: Seq[Expression],
      childOutputOrdering: Seq[SortOrder]
  ): Seq[SortOrder] = {
    val requiredOrdering = requiredOrders(keys)
    if (SortOrder.orderingSatisfies(childOutputOrdering, requiredOrdering)) {
      keys.zip(childOutputOrdering).map { case (key, childOrder) =>
        val sameOrderExpressionsSet = ExpressionSet(childOrder.children) - key
        // Changed to descending
        SortOrder(key, Descending, sameOrderExpressionsSet.toSeq)
      }
    } else {
      requiredOrdering
    }
  }

  private def requiredOrders(keys: Seq[Expression]): Seq[SortOrder] = {
    // This must be descending in order to agree with the `keyOrdering` defined in `doExecute()`.
    keys.map(SortOrder(_, Descending))
  }

  override def requiredChildOrdering: Seq[Seq[SortOrder]] =
    requiredOrders(leftKeys) :: requiredOrders(rightKeys) :: Nil

  override def rightKeys: Seq[Expression] = rightEquiKeys ++ rightPitKeys

  protected override def doExecute(): RDD[InternalRow] = {
    val numOutputRows = longMetric("numOutputRows")

    left.execute().zipPartitions(right.execute()) { (leftIter, rightIter) =>
      // An ordering that can be used to compare keys from both sides.
      // Ordering of the equi-keys
      val equiOrder: Seq[SortOrder] =
        leftEquiKeys.map(_.dataType).zipWithIndex.map { case (dt, index) =>
          SortOrder(BoundReference(index, dt, nullable = true), Descending)
        }

      val equiKeyOrdering =
        RowOrdering.create(equiOrder, Seq.empty)

      // Ordering for the PIT keys
      val pitOrder: Seq[SortOrder] =
        leftPitKeys.map(_.dataType).zipWithIndex.map { case (dt, index) =>
          SortOrder(BoundReference(index, dt, nullable = true), Descending)
        }

      val pitKeyOrdering = RowOrdering.create(pitOrder, Seq.empty)

      val resultProj: InternalRow => InternalRow =
        UnsafeProjection.create(output, output)

      customJoinType match {
        case PITJoinType =>
          new RowIterator {
            private[this] var currentLeftRow: InternalRow = _
            private[this] var currentRightMatch: UnsafeRow = _
            private[this] val smjScanner = new PITJoinScanner(
              createLeftPITKeyGenerator(),
              createRightPITKeyGenerator(),
              pitKeyOrdering,
              createLeftEquiKeyGenerator(),
              createRightEquiKeyGenerator(),
              equiKeyOrdering,
              RowIterator.fromScala(leftIter),
              RowIterator.fromScala(rightIter),
              cleanupResources,
              returnNulls,
              tolerance
            )

            private[this] val joinRow = new JoinedRow()
            private[this] val nullRightRow =
              new GenericInternalRow(right.output.length)

            override def advanceNext(): Boolean = {
              if (smjScanner.findNextJoinRow()) {
                currentRightMatch = smjScanner.getRightMatch
                currentLeftRow = smjScanner.getLeftRow
                if (currentRightMatch == null) {
                  joinRow(currentLeftRow, nullRightRow)
                  joinRow.withRight(nullRightRow)
                  numOutputRows += 1
                  return true
                } else {
                  joinRow(currentLeftRow, currentRightMatch)
                  numOutputRows += 1
                  return true
                }
              }
              false
            }

            override def getRow: InternalRow = {
              resultProj(joinRow)
            }
          }.toScala

        case x =>
          throw new IllegalArgumentException(
            s"PITJoin should not take $x as the JoinType"
          )
      }

    }
  }

  override def output: Seq[Attribute] = {
    customJoinType match {
      case PITJoinType =>
        if (returnNulls) {
          left.output ++ right.output.map(_.withNullability(true))
        } else {
          left.output ++ right.output
        }
      case x =>
        throw new IllegalArgumentException(
          s"${getClass.getSimpleName} not take $x as the JoinType"
        )
    }
  }

  /** These generator are for generating for the equi-keys
    */

  private def createLeftEquiKeyGenerator(): Projection =
    UnsafeProjection.create(leftEquiKeys, left.output)

  private def createRightEquiKeyGenerator(): Projection =
    UnsafeProjection.create(rightEquiKeys, right.output)

  /** These generator are for generating the PIT keys
    */

  private def createLeftPITKeyGenerator(): Projection = {
    UnsafeProjection.create(leftPitKeys, left.output)
  }

  private def createRightPITKeyGenerator(): Projection =
    UnsafeProjection.create(rightPitKeys, right.output)

  override def inputRDDs(): Seq[RDD[InternalRow]] =
    left.execute() :: right.execute() :: Nil

  private def copyKeys(
      ctx: CodegenContext,
      vars: Seq[ExprCode],
      keys: Seq[Expression]
  ): Seq[ExprCode] = {
    vars.zipWithIndex.map { case (ev, i) =>
      ctx.addBufferedState(keys(i).dataType, "value", ev.value)
    }
  }

  private def createJoinKeys(
      ctx: CodegenContext,
      row: String,
      pitKeys: Seq[Expression],
      equiKeys: Seq[Expression],
      input: Seq[Attribute]
  ): (Seq[ExprCode], Seq[ExprCode]) = {
    ctx.INPUT_ROW = row
    ctx.currentVars = null
    (
      bindReferences(pitKeys, input).map(_.genCode(ctx)),
      bindReferences(equiKeys, input).map(_.genCode(ctx))
    )
  }

  private def genToleranceConditions(
      leftPIT: Seq[ExprCode],
      rightPIT: Seq[ExprCode]
  ): String = {
    val toleranceCheck =
      leftPIT.zip(rightPIT).zipWithIndex.map { case ((l, r), i) =>
        s"""
           | (${l.value} - ${r.value} > $tolerance)
           |""".stripMargin
      }
    toleranceCheck.mkString(" && ")
  }

  private def genComparision(
      ctx: CodegenContext,
      a_PIT: Seq[ExprCode],
      a_EQUI: Seq[ExprCode],
      b_PIT: Seq[ExprCode],
      b_EQUI: Seq[ExprCode]
  ): String = {
    val pitComparisons =
      a_PIT.zip(b_PIT).zipWithIndex.map { case ((l, r), i) =>
        s"""
           |if (pitComp >= 0) {
           |  pitComp = ${ctx.genComp(
            leftPitKeys(i).dataType,
            l.value,
            r.value
          )};
           |}
           """.stripMargin
      }
    val equiComparisons =
      a_EQUI.zip(b_EQUI).zipWithIndex.map { case ((l, r), i) =>
        s"""
           |if (equiComp == 0) {
           |  equiComp = ${ctx.genComp(
            leftEquiKeys(i).dataType,
            l.value,
            r.value
          )};
           |}
           """
      }
    s"""
       |equiComp = 0;
       |pitComp = 0;
       |${pitComparisons.mkString("\n")}
       |${equiComparisons.mkString("\n")}
     """.stripMargin
  }

  /** Creates variables and declarations for left part of result row.
    *
    * In order to defer the access after condition and also only access once in
    * the loop, the variables should be declared separately from accessing the
    * columns, we can't use the codegen of BoundReference here.
    */
  private def createLeftVars(
      ctx: CodegenContext,
      leftRow: String
  ): (Seq[ExprCode], Seq[String]) = {
    ctx.INPUT_ROW = leftRow
    left.output.zipWithIndex.map { case (a, i) =>
      val value = ctx.freshName("value")
      val valueCode = CodeGenerator.getValue(leftRow, a.dataType, i.toString)
      val javaType = CodeGenerator.javaType(a.dataType)
      val defaultValue = CodeGenerator.defaultValue(a.dataType)
      if (a.nullable) {
        val isNull = ctx.freshName("isNull")
        val code =
          code"""
                |$isNull = $leftRow.isNullAt($i);
                |$value = $isNull ? $defaultValue : ($valueCode);
           """.stripMargin
        val leftVarsDecl =
          s"""
             |boolean $isNull = false;
             |$javaType $value = $defaultValue;
           """.stripMargin
        (
          ExprCode(
            code,
            JavaCode.isNullVariable(isNull),
            JavaCode.variable(value, a.dataType)
          ),
          leftVarsDecl
        )
      } else {
        val code = code"$value = $valueCode;"
        val leftVarsDecl = s"""$javaType $value = $defaultValue;"""
        (
          ExprCode(code, FalseLiteral, JavaCode.variable(value, a.dataType)),
          leftVarsDecl
        )
      }
    }.unzip
  }

  /** Creates the variables for right part of result row, using BoundReference,
    * since the right part are accessed inside the loop.
    */
  private def createRightVar(
      ctx: CodegenContext,
      rightRow: String
  ): Seq[ExprCode] = {
    ctx.INPUT_ROW = rightRow
    right.output.zipWithIndex.map { case (a, i) =>
      val ev = BoundReference(i, a.dataType, a.nullable).genCode(ctx)
      if (returnNulls) {
        val isNull = ctx.freshName("isNull")
        val value = ctx.freshName("value")
        val javaType = CodeGenerator.javaType(a.dataType)
        val code =
          code"""
                |boolean $isNull = true;
                |$javaType $value = ${CodeGenerator.defaultValue(
                 a.dataType
               )};
                |if ($rightRow != null) {
                |  ${ev.code}
                |  $isNull = ${ev.isNull};
                |  $value = ${ev.value};
                |}
          """.stripMargin
        ExprCode(
          code,
          JavaCode.isNullVariable(isNull),
          JavaCode.variable(value, a.dataType)
        )
      } else {
        ev
      }
    }
  }

  private def genScanner(ctx: CodegenContext) = {
    // Create class member for next row from both sides.
    // Inline mutable state since not many join operations in a task
    val leftRow =
      ctx.addMutableState("InternalRow", "leftRow", forceInline = true)
    val rightRow =
      ctx.addMutableState("InternalRow", "rightRow", forceInline = true)

    // Create variables fro join keys
    val (leftPITKeyVars, leftEquiKeyVars) =
      createJoinKeys(ctx, leftRow, leftPitKeys, leftEquiKeys, left.output)
    val leftAnyNull =
      (leftPITKeyVars.map(_.isNull) ++ leftEquiKeyVars.map(_.isNull))
        .mkString(" || ")

    val (rightPITKeyTmpVars, rightEquiKeyTmpVars) =
      createJoinKeys(ctx, rightRow, rightPitKeys, rightEquiKeys, right.output)
    val rightAnyNull =
      (rightPITKeyTmpVars.map(_.isNull) ++ rightEquiKeyTmpVars.map(_.isNull))
        .mkString(" || ")

    // Copy the right key as class members so they could be used in next function call.
    val rightPITKeyVars = copyKeys(ctx, rightPITKeyTmpVars, leftPitKeys)
    val rightEquiKeyVars = copyKeys(ctx, rightEquiKeyTmpVars, leftEquiKeys)

    val matched =
      ctx.addMutableState("InternalRow", "matched", forceInline = true)

    val matchedPITKeyVars = copyKeys(ctx, leftPITKeyVars, leftPitKeys)
    val matchedEquiKeyVars = copyKeys(ctx, leftEquiKeyVars, leftEquiKeys)

    // Generate a function to scan both left and right sides to find a match.
    // Return whether a match is found.
    //
    // `leftIter`: the iterator for left side.
    // `rightIter`: the iterator for right  side.
    // `leftRow`: the current row from left side.
    //                When `leftIter` is empty, `leftRow` is null.
    // `rightRow`: the current match candidate row from right side.
    // `match`: the row from right side which matches the with `leftRow`.
    //            If there is no match with `leftRow`, `matches` is empty.
    //
    // The function has the following step:
    //  - Step 1: Find the next `leftRow` with non-null join keys.
    //            For `leftRow` with null join keys:
    //            1. Inner join: skip this `leftRow` the row, and try the next one.
    //            2. Left Outer join: keep the row and return false with null `match`.
    //
    //  - Step 2: Find the first `match` from right side matching the join keys
    //            with `leftRow`. Return true after finding a match.
    //            For `leftRow` without `match`:
    //            1. Inner join: skip this `leftRow` the row, and try the next one.
    //            2. Left Outer join: keep the row and return false with null `match`.
    ctx.addNewFunction(
      "findNextJoinRows",
      s"""
         |private boolean findNextJoinRows(
         |scala.collection.Iterator leftIter,
         |scala.collection.Iterator rightIter
         |){
         |  $leftRow = null;
         |  int equiComp = 0;
         |  int pitComp = 0;
         |  while($leftRow == null) {
         |    if(!leftIter.hasNext()) return false;
         |    $leftRow = (InternalRow) leftIter.next();
         |    ${leftPITKeyVars.map(_.code).mkString("\n")}
         |    ${leftEquiKeyVars.map(_.code).mkString("\n")}
         |    if($leftAnyNull) {
         |      if($returnNulls) {
         |        $matched = null;
         |        return false;
         |      }
         |      $leftRow = null;
         |      continue;
         |    }
         |    do {
         |      if($rightRow == null) {
         |        if(!rightIter.hasNext()) {
         |          $matched = null;
         |          return false;
         |        }
         |        $rightRow = (InternalRow) rightIter.next();
         |        ${rightPITKeyTmpVars.map(_.code).mkString("\n")}
         |        ${rightEquiKeyTmpVars.map(_.code).mkString("\n")}
         |        if ($rightAnyNull) {
         |          $rightRow = null;
         |          continue;
         |        }
         |        ${rightPITKeyVars.map(_.code).mkString("\n")}
         |        ${rightEquiKeyVars.map(_.code).mkString("\n")}
         |      }
         |      ${genComparision(
          ctx,
          leftPITKeyVars,
          leftEquiKeyVars,
          rightPITKeyVars,
          rightEquiKeyVars
        )}
         |      if (equiComp > 0) {
         |        if($returnNulls) {
         |          $matched = null;
         |          return false;
         |        }
         |        $leftRow = null;
         |      } else if (equiComp < 0 || pitComp < 0) {
         |        $rightRow = null;
         |      } else if ($tolerance > 0 && ${genToleranceConditions(
          leftPITKeyVars,
          rightPITKeyVars
        )}) {     
         |        if($returnNulls) {
         |          $matched = null;
         |          return false;
         |        }
         |        $leftRow = null;
         |      } else {
         |        $matched = (UnsafeRow) $rightRow;
         |        ${matchedPITKeyVars.map(_.code).mkString("\n")}
         |        ${matchedEquiKeyVars.map(_.code).mkString("\n")}
         |        return true;
         |      }
         |    } while($leftRow != null);
         |  }
         |  return false;
         |}
        """.stripMargin,
      inlineToOuterClass = true
    )
    (leftRow, matched)
  }

  /** Splits variables based on whether it's used by condition or not, returns
    * the code to create these variables before the condition and after the
    * condition.
    *
    * Only a few columns are used by condition, then we can skip the accessing
    * of those columns that are not used by condition also filtered out by
    * condition.
    */
  private def splitVarsByCondition(
      attributes: Seq[Attribute],
      variables: Seq[ExprCode]
  ): (String, String) = {
    if (condition.isDefined) {
      val condRefs = condition.get.references
      val (used, notUsed) =
        attributes.zip(variables).partition { case (a, ev) =>
          condRefs.contains(a)
        }
      val beforeCond = evaluateVariables(used.map(_._2))
      val afterCond = evaluateVariables(notUsed.map(_._2))
      (beforeCond, afterCond)
    } else {
      (evaluateVariables(variables), "")
    }
  }

  override def needCopyResult: Boolean = true

  override protected def doProduce(ctx: CodegenContext): String = {
    // Inline mutable state since not many join operations in a task
    val leftInput = ctx.addMutableState(
      "scala.collection.Iterator",
      "leftInput",
      v => s"$v = inputs[0];",
      forceInline = true
    )
    val rightInput = ctx.addMutableState(
      "scala.collection.Iterator",
      "rightInput",
      v => s"$v = inputs[1];",
      forceInline = true
    )

    val (leftRow, matched) = genScanner(ctx)

    // Create variables for row from both sides.
    val (leftVars, leftVarDecl) = createLeftVars(ctx, leftRow)
    val rightRow = ctx.freshName("rightRow")
    val rightVars = createRightVar(ctx, rightRow)

    val numOutput = metricTerm(ctx, "numOutputRows")

    val (beforeLoop, condCheck) = if (condition.isDefined) {
      // Split the code of creating variables based on whether it's used by condition or not.
      val loaded = ctx.freshName("loaded")
      val (leftBefore, leftAfter) = splitVarsByCondition(left.output, leftVars)
      val (rightBefore, rightAfter) =
        splitVarsByCondition(right.output, rightVars)
      // Generate code for condition
      ctx.currentVars = leftVars ++ rightVars
      val cond =
        BindReferences.bindReference(condition.get, output).genCode(ctx)
      // evaluate the columns those used by condition before loop
      val before =
        s"""
           |boolean $loaded = false;
           |$leftBefore
         """.stripMargin

      val checking =
        s"""
           |$rightBefore
           |${cond.code}
           |if (${cond.isNull}|| !${cond.value}) continue;
           |if (!$loaded) {
           |  $loaded = true;
           |  $leftAfter
           |}
           |$rightAfter
     """.stripMargin
      (before, checking)
    } else {
      (evaluateVariables(leftVars), "")
    }

    val thisPlan = ctx.addReferenceObj("plan", this)
    val eagerCleanup = s"$thisPlan.cleanupResources();"
    if (returnNulls) {
      s"""
         |while($leftInput.hasNext()) {
         |  findNextJoinRows($leftInput, $rightInput);
         |  ${leftVarDecl.mkString("\n")}
         |  ${beforeLoop.trim}
         |  InternalRow $rightRow = (InternalRow) $matched;
         |  ${condCheck.trim}
         |  $numOutput.add(1);
         |  ${consume(ctx, leftVars ++ rightVars)};
         |  if (shouldStop()) return;
         |}
         |""".stripMargin
    } else {
      s"""
         |while (findNextJoinRows($leftInput, $rightInput)) {
         |  ${leftVarDecl.mkString("\n")}
         |  ${beforeLoop.trim}
         |  InternalRow $rightRow = (InternalRow) $matched;
         |  ${condCheck.trim}
         |  $numOutput.add(1);
         |  ${consume(ctx, leftVars ++ rightVars)}
         |  if (shouldStop()) return;
         |}
         |$eagerCleanup
         |""".stripMargin
    }
  }
}

/** Helper class that is used to implement [[PITJoinExec]].
  *
  * To perform an inner or outer join, users of this class call
  * [[findNextJoinRow()]], which returns `true` if a result has been produced
  * and `false` otherwise. If a result has been produced, then the caller may
  * call [[getLeftRow]] and [[getRightMatch]] to get left and right sides
  * respectively, of the joined row. Both of these methods return mutable
  * objects which are re-used across calls to the `findNextJoinRow()`.
  * @param leftPITKeyGenerator
  *   a projection that produces PIT join keys from the left input.
  * @param rightPITKeyGenerator
  *   a projection that produces PIT join keys from the right input.
  * @param pitKeyOrdering
  *   an ordering which can be used to compare PIT join keys.
  * @param leftEquiKeyGenerator
  *   a projection that produces join keys from the left input.
  * @param rightEquiKeyGenerator
  *   a projection that produces join keys from the right input.
  * @param equiKeyOrdering
  *   an ordering which can be used to compare equi join keys.
  * @param leftIter
  *   an input whose rows will be left.
  * @param rightIter
  *   an input whose rows will be right.
  * @param eagerCleanupResources
  *   the eager cleanup function to be invoked when no join row found
  * @param returnNulls
  *   if no PIT match found, return the left row with right columns filled with
  *   null (left outer join)
  * @param tolerance
  *   tolerance for how long we want to look back, if value is 0, do no use
  *   tolerance
  */
protected[pit] class PITJoinScanner(
    leftPITKeyGenerator: Projection,
    rightPITKeyGenerator: Projection,
    pitKeyOrdering: Ordering[InternalRow],
    leftEquiKeyGenerator: Projection,
    rightEquiKeyGenerator: Projection,
    equiKeyOrdering: Ordering[InternalRow],
    leftIter: RowIterator,
    rightIter: RowIterator,
    eagerCleanupResources: () => Unit,
    returnNulls: Boolean = false,
    tolerance: Long = 0
) {
  private[this] var leftRow: InternalRow = _
  private[this] var leftRowEquiKey: InternalRow = _
  private[this] var leftRowPITKey: InternalRow = _
  private[this] var rightRow: InternalRow = _
  // Note: this is guaranteed to never have any null columns:
  private[this] var rightRowEquiKey: InternalRow = _
  private[this] var rightRowPITKey: InternalRow = _

  /** Contains the current match */
  private[this] var rightMatch: UnsafeRow = _

  // Initialization (note: do _not_ want to advance left here).
  advancedRightToRowWithNullFreeJoinKeys()

  // --- Public methods ---------------------------------------------------------------------------

  def getLeftRow: InternalRow = leftRow

  def getRightMatch: UnsafeRow = rightMatch

  /** Advances left iterator by one then starts searching for a match. If
    * returnNulls it will always return a result for every left row so it will
    * only advance the right iterator when searching. If not returnNulls it will
    * may advance both iterators when searching for a match. When there are no
    * more potential matches it does eager cleanup.
    * @return
    *   true if matching rows have been found and false otherwise. If this
    *   returns true, then [[getLeftRow]] and [[getRightMatch]] can be called to
    *   construct the join result.
    */
  final def findNextJoinRow(): Boolean = {
    // Advance the `leftRow` at the start of every call to avoid returning the same rows repeatedly.
    val leftIteratorNotEmpty = advancedLeft()
    val rightIteratorNotEmpty = rightRow != null
    var keepSearchingPotentiallyMoreJoinRows: (Boolean, Boolean) =
      (
        // If both iterators are non-empty then searching might find a match - keep searching.
        leftIteratorNotEmpty && rightIteratorNotEmpty,
        // For more join rows the left iterator must be non-empty and either returnNulls is allowed or
        // the right iterator is non-empty.
        leftIteratorNotEmpty && (returnNulls || rightIteratorNotEmpty)
      )
    // Run the search. If not returnNulls this might require advancing both iterators.
    while (keepSearchingPotentiallyMoreJoinRows._1) {
      keepSearchingPotentiallyMoreJoinRows = {
        if (leftRowPITKey.anyNull || leftRowEquiKey.anyNull) {
          handleNoMatchForLeftRow()
        } else {
          assert(!rightRowPITKey.anyNull && !rightRowEquiKey.anyNull)

          val equiComp =
            equiKeyOrdering.compare(leftRowEquiKey, rightRowEquiKey)
          val pitComp =
            pitKeyOrdering.compare(leftRowPITKey, rightRowPITKey)

          if (equiComp < 0) {
            // leftRowEquiKey > rightRowEquiKey
            // Advance (decrement) `leftRow` to find next potential matches.
            handleNoMatchForLeftRow()
          } else if (equiComp > 0 || pitComp > 0) {
            // leftRowEquiKey < rightRowEquiKey || leftRowPITKey < rightRowPITKey
            // Advance (decrement) `rightRow` to find next potential matches.
            handleRightRowDoesNotMatch()
          } else if (
            tolerance > 0 && (
              leftRowPITKey
                .getLong(0) - rightRowPITKey.getLong(0) > tolerance
            )
          ) {
            // Tolerance is enabled and `rightRow` is outside the tolerance. No other
            // `rightRow` will be any closer to this `leftRow`, so advance to the
            // next `leftRow`.
            handleNoMatchForLeftRow()
          } else {
            // The left row's join key matches the current right row's join, only take this row
            assert(equiComp == 0 && pitComp <= 0)
            rightMatch = rightRow.asInstanceOf[UnsafeRow]
            (
              false, // Stop searching after finding a valid match.
              true // Potentially there will be another left row, therefore more join rows.
            )
          }
        }
      }
    }
    if (!keepSearchingPotentiallyMoreJoinRows._2) eagerCleanupResources()
    keepSearchingPotentiallyMoreJoinRows._2
  }

  // --- Private methods --------------------------------------------------------------------------

  /** Advance the left iterator and compute the new row's join key.
    *
    * @return
    *   true if the left iterator returned a row and false otherwise.
    */
  private def advancedLeft(): Boolean = {
    if (leftIter.advanceNext()) {
      leftRow = leftIter.getRow
      leftRowEquiKey = leftEquiKeyGenerator(leftRow)
      leftRowPITKey = leftPITKeyGenerator(leftRow)
      true
    } else {
      leftRow = null
      leftRowPITKey = null
      leftRowEquiKey = null
      false
    }
  }

  /** If returnNulls exit search early with `rightMatch = null`, otherwise
    * advance the left iterator to continue searching.
    *
    * @return
    *   (keepSearching: Boolean, potentiallyMoreJoinRows: Boolean)
    */
  private def handleNoMatchForLeftRow(): (Boolean, Boolean) = {
    if (returnNulls) {
      rightMatch = null
      return (
        false, // Stop searching to return the left row.
        true // Potentially there will be another left row, therefore more join rows.
      )
    }
    return (
      advancedLeft(), // Stop searching if the left iterator is exhausted
      // Only relevant if the search is stopped on this iteration. That will happen only
      // if the steamed iterator is exhausted, so there will be no more join rows.
      false
    )
  }

  /** Advance to the next right row.
    *
    * @return
    *   (keepSearching: Boolean, potentiallyMoreJoinRows: Boolean)
    */
  private def handleRightRowDoesNotMatch(): (Boolean, Boolean) = {
    rightMatch = null
    return (
      advancedRightToRowWithNullFreeJoinKeys(), // Stop searching if right iterator is exhausted.
      // If returnNulls there could be more unmatched join rows.
      // If not returnNulls there can be no more join rows.
      returnNulls
    )
  }

  /** Advance the right iterator until we find a row with join keys
    *
    * @return
    *   true if the right iterator returned a row and false otherwise.
    */
  private def advancedRightToRowWithNullFreeJoinKeys(): Boolean = {
    var foundRow: Boolean = false
    while (!foundRow && rightIter.advanceNext()) {
      rightRow = rightIter.getRow
      rightRowEquiKey = rightEquiKeyGenerator(rightRow)
      rightRowPITKey = rightPITKeyGenerator(rightRow)
      foundRow = !rightRowEquiKey.anyNull && !rightRowPITKey.anyNull
    }
    if (!foundRow) {
      rightRow = null
      rightRowEquiKey = null
      rightRowPITKey = null
      false
    } else {
      true
    }
  }
}
