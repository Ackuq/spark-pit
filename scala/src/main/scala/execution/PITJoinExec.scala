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

import logical.{CustomJoinType, PITJoinType}

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.catalyst.InternalRow
import org.apache.spark.sql.catalyst.expressions.BindReferences.bindReferences
import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.expressions.codegen.Block.BlockHelper
import org.apache.spark.sql.catalyst.expressions.codegen._
import org.apache.spark.sql.catalyst.plans.physical._
import org.apache.spark.sql.catalyst.plans.{Inner, JoinType}
import org.apache.spark.sql.execution._
import org.apache.spark.sql.execution.joins.ShuffledJoin
import org.apache.spark.sql.execution.metric.{SQLMetric, SQLMetrics}

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
      val boundCondition: InternalRow => Boolean = {
        condition
          .map { cond =>
            Predicate.create(cond, left.output ++ right.output).eval _

          }
          .getOrElse { (r: InternalRow) =>
            true
          }
      }

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
              while (smjScanner.findNextLeftOuterJoinRows()) {
                currentRightMatch = smjScanner.getBufferedMatch
                currentLeftRow = smjScanner.getStreamedRow
                if (currentRightMatch == null) {
                  if (returnNulls) {
                    joinRow(currentLeftRow, nullRightRow)
                    joinRow.withRight(nullRightRow)
                    numOutputRows += 1
                    return true
                  }
                } else {
                  joinRow(currentLeftRow, currentRightMatch)
                  if (boundCondition(joinRow)) {
                    numOutputRows += 1
                    return true
                  }
                }
              }

              currentRightMatch = null
              currentLeftRow = null
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

  /** Generate a function to scan both left and right to find a match, returns
    * the term for matched one row from left side and buffered rows from right
    * side.
    */
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

    ctx.addNewFunction(
      "findNextInnerJoinRows",
      s"""
         |private boolean findNextInnerJoinRows(
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
         |  findNextInnerJoinRows($leftInput, $rightInput);
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
         |while (findNextInnerJoinRows($leftInput, $rightInput)) {
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
  * To perform an inner (outer) join, users of this class call
  * [[findNextInnerJoinRows()]] which returns `true` if a result has been
  * produced and `false` otherwise. If a result has been produced, then the
  * caller may call [[getStreamedRow]] to return the matching row from the
  * streamed input For efficiency, both of these methods return mutable objects
  * which are re-used across calls to the `findNext*JoinRows()` methods.
  *
  * @param streamedPITKeyGenerator
  *   a projection that produces PIT join keys from the streamed input.
  * @param bufferedPITKeyGenerator
  *   a projection that produces PIT join keys from the buffered input.
  * @param pitKeyOrdering
  *   an ordering which can be used to compare PIT join keys.
  * @param streamedEquiKeyGenerator
  *   a projection that produces join keys from the streamed input.
  * @param bufferedEquiKeyGenerator
  *   a projection that produces join keys from the buffered input.
  * @param equiKeyOrdering
  *   an ordering which can be used to compare equi join keys.
  * @param streamedIter
  *   an input whose rows will be streamed.
  * @param bufferedIter
  *   an input whose rows will be buffered to construct sequences of rows that
  *   have the same join key.
  * @param eagerCleanupResources
  *   the eager cleanup function to be invoked when no join row found
  * @param returnNulls
  *   event if no PIT match found, return the left row with right columns filled
  *   with null
  * @param tolerance
  *   tolerance for how long we want to look back, if value is 0, do no use
  *   tolerance
  */
protected[pit] class PITJoinScanner(
    streamedPITKeyGenerator: Projection,
    bufferedPITKeyGenerator: Projection,
    pitKeyOrdering: Ordering[InternalRow],
    streamedEquiKeyGenerator: Projection,
    bufferedEquiKeyGenerator: Projection,
    equiKeyOrdering: Ordering[InternalRow],
    streamedIter: RowIterator,
    bufferedIter: RowIterator,
    eagerCleanupResources: () => Unit,
    returnNulls: Boolean = false,
    tolerance: Long = 0
) {
  private[this] var streamedRow: InternalRow = _
  private[this] var streamedRowEquiKey: InternalRow = _
  private[this] var streamedRowPITKey: InternalRow = _
  private[this] var bufferedRow: InternalRow = _
  // Note: this is guaranteed to never have any null columns:
  private[this] var bufferedRowEquiKey: InternalRow = _
  private[this] var bufferedRowPITKey: InternalRow = _

  /** The join key for the rows buffered in `bufferedMatches`, or null if
    * `bufferedMatches` is empty
    */
  private[this] var matchJoinEquiKey: InternalRow = _
  private[this] var matchJoinPITKey: InternalRow = _

  /** Contains the current match */
  private[this] var bufferedMatch: UnsafeRow = _

  // Initialization (note: do _not_ want to advance streamed here).
  advancedBuffered()

  // --- Public methods ---------------------------------------------------------------------------

  def getStreamedRow: InternalRow = streamedRow

  def getBufferedMatch: UnsafeRow = bufferedMatch

  /** Advances both input iterators, stopping when we have found rows with
    * matching join keys. If no join rows found, try to do the eager resources
    * cleanup.
    *
    * @return
    *   true if matching rows have been found and false otherwise. If this
    *   returns true, then [[getStreamedRow]] can be called to construct the
    *   joinresults.
    */
  final def findNextLeftOuterJoinRows(): Boolean = {
    while (
      advancedStreamed() && streamedRowEquiKey.anyNull && streamedRowPITKey.anyNull
    ) {
      // Advance the streamed side of the join until we find the next row whose join key contains
      // no nulls or we hit the end of the streamed iterator.
    }
    val found = if (streamedRow == null) {
      // We have consumed the entire streamed iterator, so there can be no more matches.
      matchJoinEquiKey = null
      matchJoinPITKey = null
      bufferedMatch = null
      false
    } else if (
      matchJoinEquiKey != null && equiKeyOrdering.compare(
        streamedRowEquiKey,
        matchJoinEquiKey
      ) == 0
      && matchJoinPITKey != null && pitKeyOrdering.compare(
        streamedRowPITKey,
        matchJoinPITKey
        // Streamed row key must be equal or greater than match
      ) <= 0
    ) {
      // The new streamed row has the same join key as the previous row, so return the same matches.
      true
    } else if (bufferedRow == null) {
      // The streamed row's join key does not match the current batch of buffered rows and there are
      // no more rows to read from the buffered iterator, so there can be no more matches.
      matchJoinEquiKey = null
      matchJoinPITKey = null
      bufferedMatch = null
      // If not returnNulls then we can exit early without searching through the remainder of the 
      // streamed row. If returnNulls then it doesn't matter that there are no more candidate rows
      // to match with - we still need to return the streamed row so they can be matched with nulls. 
      returnNulls
    } else {
      // Advance both the streamed and buffered iterators to find the next pair of matching rows.
      var equiComp =
        equiKeyOrdering.compare(streamedRowEquiKey, bufferedRowEquiKey)
      var pitComp = pitKeyOrdering.compare(streamedRowPITKey, bufferedRowPITKey)
      do {
        if (streamedRowPITKey.anyNull || streamedRowEquiKey.anyNull) {
          advancedStreamed()
        } else {
          assert(!bufferedRowPITKey.anyNull && !bufferedRowEquiKey.anyNull)

          equiComp =
            equiKeyOrdering.compare(streamedRowEquiKey, bufferedRowEquiKey)
          pitComp = pitKeyOrdering.compare(streamedRowPITKey, bufferedRowPITKey)

          if (equiComp < 0) {
            if (returnNulls) {
              bufferedMatch = null
              return true
            }
            advancedStreamed()
          } else if (equiComp > 0) advancedBuffered()
          else if (pitComp > 0) advancedBuffered()
        }
      } while (streamedRow != null && bufferedRow != null && (equiComp != 0 || pitComp > 0))
      if (returnNulls && streamedRow != null && bufferedRow == null) {
        // Not a match found for the streamed row
        bufferedMatch = null
        true
      } else if (streamedRow == null || bufferedRow == null) {
        // We have either hit the end of one of the iterators, so there can be no more matches.
        matchJoinEquiKey = null
        matchJoinPITKey = null
        bufferedMatch = null
        false
      } else {
        // The streamed row's join key matches the current buffered row's join, only take this row
        assert(equiComp == 0 && pitComp <= 0)

        if (tolerance > 0) {
          val streamedTS = streamedRowPITKey.getLong(0)
          val bufferedTS = bufferedRowPITKey.getLong(0)
          if (streamedTS - bufferedTS > tolerance) {
            // The one closest to the streamed row exceeds the tolerance, continue...
            bufferedMatch = null
            return true
          }
        }

        bufferedMatch = bufferedRow.asInstanceOf[UnsafeRow]
        true
      }
    }
    if (!found) eagerCleanupResources()
    found
  }

  // --- Private methods --------------------------------------------------------------------------

  /** Advance the streamed iterator and compute the new row's join key.
    *
    * @return
    *   true if the streamed iterator returned a row and false otherwise.
    */
  private def advancedStreamed(): Boolean = {
    if (streamedIter.advanceNext()) {
      streamedRow = streamedIter.getRow
      streamedRowEquiKey = streamedEquiKeyGenerator(streamedRow)
      streamedRowPITKey = streamedPITKeyGenerator(streamedRow)
      true
    } else {
      streamedRow = null
      streamedRowPITKey = null
      streamedRowEquiKey = null
      false
    }
  }

  /** Advance the buffered iterator until we find a row with join key
    *
    * @return
    *   true if the buffered iterator returned a row and false otherwise.
    */
  private def advancedBuffered(): Boolean = {
    if (bufferedIter.advanceNext()) {
      bufferedRow = bufferedIter.getRow
      bufferedRowEquiKey = bufferedEquiKeyGenerator(bufferedRow)
      bufferedRowPITKey = bufferedPITKeyGenerator(bufferedRow)
      true
    } else {
      bufferedRow = null
      bufferedRowEquiKey = null
      bufferedRowPITKey = null
      false
    }
  }
}
