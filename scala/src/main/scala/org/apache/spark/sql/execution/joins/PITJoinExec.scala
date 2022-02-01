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
 */

package org.apache.spark.sql.execution.joins

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.catalyst.InternalRow
import org.apache.spark.sql.catalyst.expressions.BindReferences.bindReferences
import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.expressions.codegen.Block._
import org.apache.spark.sql.catalyst.expressions.codegen._
import org.apache.spark.sql.catalyst.plans._
import org.apache.spark.sql.catalyst.plans.physical.{
  Partitioning,
  PartitioningCollection
}
import org.apache.spark.sql.execution._
import org.apache.spark.sql.execution.metric.{SQLMetric, SQLMetrics}
import org.apache.spark.util.collection.BitSet

import scala.collection.mutable.ArrayBuffer

/** Performs a sort merge join of two child relations.
  */
case class PITJoinExec(
    leftKeys: Seq[Expression],
    rightKeys: Seq[Expression],
    joinType: JoinType,
    condition: Option[Expression],
    left: SparkPlan,
    right: SparkPlan,
    isSkewJoin: Boolean = false
) extends ShuffledJoin {

  override lazy val metrics = Map(
    "numOutputRows" -> SQLMetrics.createMetric(
      sparkContext,
      "number of output rows"
    )
  )

  override def outputPartitioning: Partitioning = joinType match {
    case PITJoin =>
      PartitioningCollection(
        Seq(left.outputPartitioning, right.outputPartitioning)
      )
    case _ =>
      super.outputPartitioning
  }

  override def output: Seq[Attribute] = {
    joinType match {
      case PITJoin =>
        left.output ++ right.output
      case x =>
        throw new IllegalArgumentException(
          s"${getClass.getSimpleName} not take $x as the JoinType"
        )
    }
  }

  override def outputOrdering: Seq[SortOrder] = joinType match {
    // For inner join, orders of both sides keys should be kept.
    case PITJoin => getKeyOrdering(leftKeys, left.outputOrdering)
    case x =>
      throw new IllegalArgumentException(
        s"${getClass.getSimpleName} should not take $x as the JoinType"
      )
  }

  /** The utility method to get output ordering for left or right side of the join.
    *
    * Returns the required ordering for left or right child if childOutputOrdering does not
    * satisfy the required ordering; otherwise, which means the child does not need to be sorted
    * again, returns the required ordering for this child with extra "sameOrderExpressions" from
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
        SortOrder(key, Ascending, sameOrderExpressionsSet.toSeq)
      }
    } else {
      requiredOrdering
    }
  }

  override def requiredChildOrdering: Seq[Seq[SortOrder]] =
    requiredOrders(leftKeys) :: requiredOrders(rightKeys) :: Nil

  private def requiredOrders(keys: Seq[Expression]): Seq[SortOrder] = {
    // This must be ascending in order to agree with the `keyOrdering` defined in `doExecute()`.
    keys.map(SortOrder(_, Ascending))
  }

  private def createLeftKeyGenerator(): Projection =
    UnsafeProjection.create(leftKeys, left.output)

  private def createRightKeyGenerator(): Projection =
    UnsafeProjection.create(rightKeys, right.output)

  private def getSpillThreshold: Int = {
    conf.sortMergeJoinExecBufferSpillThreshold
  }

  // Flag to only buffer first matched row, to avoid buffering unnecessary rows.
  private val onlyBufferFirstMatchedRow = (joinType, condition) match {
    case (LeftExistence(_), None) => true
    case _                        => false
  }

  private def getInMemoryThreshold: Int = {
    if (onlyBufferFirstMatchedRow) {
      1
    } else {
      conf.sortMergeJoinExecBufferInMemoryThreshold
    }
  }

  protected override def doExecute(): RDD[InternalRow] = {
    val numOutputRows = longMetric("numOutputRows")
    val spillThreshold = getSpillThreshold
    val inMemoryThreshold = getInMemoryThreshold
    left.execute().zipPartitions(right.execute()) { (leftIter, rightIter) =>
      val boundCondition: (InternalRow) => Boolean = {
        condition
          .map { cond =>
            Predicate.create(cond, left.output ++ right.output).eval _
          }
          .getOrElse { (r: InternalRow) =>
            true
          }
      }

      // An ordering that can be used to compare keys from both sides.
      val keyOrdering =
        RowOrdering.createNaturalAscendingOrdering(leftKeys.map(_.dataType))
      val resultProj: InternalRow => InternalRow =
        UnsafeProjection.create(output, output)

      joinType match {
        case PITJoin =>
          new RowIterator {
            private[this] var currentLeftRow: InternalRow = _
            private[this] var currentRightMatches
                : ExternalAppendOnlyUnsafeRowArray = _
            private[this] var rightMatchesIterator: Iterator[UnsafeRow] = null
            private[this] val smjScanner = new SortMergeJoinScanner(
              createLeftKeyGenerator(),
              createRightKeyGenerator(),
              keyOrdering,
              RowIterator.fromScala(leftIter),
              RowIterator.fromScala(rightIter),
              inMemoryThreshold,
              spillThreshold,
              cleanupResources
            )
            private[this] val joinRow = new JoinedRow

            if (smjScanner.findNextInnerJoinRows()) {
              currentRightMatches = smjScanner.getBufferedMatches
              currentLeftRow = smjScanner.getStreamedRow
              rightMatchesIterator = currentRightMatches.generateIterator()
            }

            override def advanceNext(): Boolean = {
              while (rightMatchesIterator != null) {
                if (!rightMatchesIterator.hasNext) {
                  if (smjScanner.findNextInnerJoinRows()) {
                    currentRightMatches = smjScanner.getBufferedMatches
                    currentLeftRow = smjScanner.getStreamedRow
                    rightMatchesIterator =
                      currentRightMatches.generateIterator()
                  } else {
                    currentRightMatches = null
                    currentLeftRow = null
                    rightMatchesIterator = null
                    return false
                  }
                }
                joinRow(currentLeftRow, rightMatchesIterator.next())
                if (boundCondition(joinRow)) {
                  numOutputRows += 1
                  return true
                }
              }
              false
            }

            override def getRow: InternalRow = resultProj(joinRow)
          }.toScala

        case x =>
          throw new IllegalArgumentException(
            s"PITJoin should not take $x as the JoinType"
          )
      }

    }
  }

  private lazy val (
    (streamedPlan, streamedKeys),
    (bufferedPlan, bufferedKeys)
  ) = joinType match {
    case PITJoin =>
      ((left, leftKeys), (right, rightKeys))
    case x =>
      throw new IllegalArgumentException(
        s"PITJoin.streamedPlan/bufferedPlan should not take $x as the JoinType"
      )
  }

  private lazy val streamedOutput = streamedPlan.output
  private lazy val bufferedOutput = bufferedPlan.output

  override def supportCodegen: Boolean = joinType match {
    case _: InnerLike | LeftOuter | RightOuter | LeftSemi | LeftAnti => true
    case _                                                           => false
  }

  override def inputRDDs(): Seq[RDD[InternalRow]] = {
    streamedPlan.execute() :: bufferedPlan.execute() :: Nil
  }

  private def createJoinKey(
      ctx: CodegenContext,
      row: String,
      keys: Seq[Expression],
      input: Seq[Attribute]
  ): Seq[ExprCode] = {
    ctx.INPUT_ROW = row
    ctx.currentVars = null
    bindReferences(keys, input).map(_.genCode(ctx))
  }

  private def copyKeys(
      ctx: CodegenContext,
      vars: Seq[ExprCode]
  ): Seq[ExprCode] = {
    vars.zipWithIndex.map { case (ev, i) =>
      ctx.addBufferedState(leftKeys(i).dataType, "value", ev.value)
    }
  }

  private def genComparison(
      ctx: CodegenContext,
      a: Seq[ExprCode],
      b: Seq[ExprCode]
  ): String = {
    val comparisons = a.zip(b).zipWithIndex.map { case ((l, r), i) =>
      s"""
         |if (comp == 0) {
         |  comp = ${ctx.genComp(leftKeys(i).dataType, l.value, r.value)};
         |}
       """.stripMargin.trim
    }
    s"""
       |comp = 0;
       |${comparisons.mkString("\n")}
     """.stripMargin
  }

  /** Generate a function to scan both sides to find a match, returns:
    * 1. the function name
    * 2. the term for matched one row from streamed side
    * 3. the term for buffered rows from buffered side
    */
  private def genScanner(ctx: CodegenContext): (String, String, String) = {
    // Create class member for next row from both sides.
    // Inline mutable state since not many join operations in a task
    val streamedRow =
      ctx.addMutableState("InternalRow", "streamedRow", forceInline = true)
    val bufferedRow =
      ctx.addMutableState("InternalRow", "bufferedRow", forceInline = true)

    // Create variables for join keys from both sides.
    val streamedKeyVars =
      createJoinKey(ctx, streamedRow, streamedKeys, streamedOutput)
    val streamedAnyNull = streamedKeyVars.map(_.isNull).mkString(" || ")
    val bufferedKeyTmpVars =
      createJoinKey(ctx, bufferedRow, bufferedKeys, bufferedOutput)
    val bufferedAnyNull = bufferedKeyTmpVars.map(_.isNull).mkString(" || ")
    // Copy the buffered key as class members so they could be used in next function call.
    val bufferedKeyVars = copyKeys(ctx, bufferedKeyTmpVars)

    // A list to hold all matched rows from buffered side.
    val clsName = classOf[ExternalAppendOnlyUnsafeRowArray].getName

    val spillThreshold = getSpillThreshold
    val inMemoryThreshold = getInMemoryThreshold

    // Inline mutable state since not many join operations in a task
    val matches = ctx.addMutableState(
      clsName,
      "matches",
      v => s"$v = new $clsName($inMemoryThreshold, $spillThreshold);",
      forceInline = true
    )
    // Copy the streamed keys as class members so they could be used in next function call.
    val matchedKeyVars = copyKeys(ctx, streamedKeyVars)

    // Handle the case when streamed rows has any NULL keys.
    val handleStreamedAnyNull = joinType match {
      case _: InnerLike | LeftSemi =>
        // Skip streamed row.
        s"""
           |$streamedRow = null;
           |continue;
         """.stripMargin
      case LeftOuter | RightOuter | LeftAnti =>
        // Eagerly return streamed row. Only call `matches.clear()` when `matches.isEmpty()` is
        // false, to reduce unnecessary computation.
        s"""
           |if (!$matches.isEmpty()) {
           |  $matches.clear();
           |}
           |return false;
         """.stripMargin
      case x =>
        throw new IllegalArgumentException(
          s"SortMergeJoin.genScanner should not take $x as the JoinType"
        )
    }

    // Handle the case when streamed keys has no match with buffered side.
    val handleStreamedWithoutMatch = joinType match {
      case _: InnerLike | LeftSemi =>
        // Skip streamed row.
        s"$streamedRow = null;"
      case LeftOuter | RightOuter | LeftAnti =>
        // Eagerly return with streamed row.
        "return false;"
      case x =>
        throw new IllegalArgumentException(
          s"SortMergeJoin.genScanner should not take $x as the JoinType"
        )
    }

    val addRowToBuffer =
      if (onlyBufferFirstMatchedRow) {
        s"""
           |if ($matches.isEmpty()) {
           |  $matches.add((UnsafeRow) $bufferedRow);
           |}
         """.stripMargin
      } else {
        s"$matches.add((UnsafeRow) $bufferedRow);"
      }

    // Generate a function to scan both streamed and buffered sides to find a match.
    // Return whether a match is found.
    //
    // `streamedIter`: the iterator for streamed side.
    // `bufferedIter`: the iterator for buffered side.
    // `streamedRow`: the current row from streamed side.
    //                When `streamedIter` is empty, `streamedRow` is null.
    // `matches`: the rows from buffered side already matched with `streamedRow`.
    //            `matches` is buffered and reused for all `streamedRow`s having same join keys.
    //            If there is no match with `streamedRow`, `matches` is empty.
    // `bufferedRow`: the current matched row from buffered side.
    //
    // The function has the following step:
    //  - Step 1: Find the next `streamedRow` with non-null join keys.
    //            For `streamedRow` with null join keys (`handleStreamedAnyNull`):
    //            1. Inner and Left Semi join: skip the row. `matches` will be cleared later when
    //                                         hitting the next `streamedRow` with non-null join
    //                                         keys.
    //            2. Left/Right Outer and Left Anti join: clear the previous `matches` if needed,
    //                                                    keep the row, and return false.
    //
    //  - Step 2: Find the `matches` from buffered side having same join keys with `streamedRow`.
    //            Clear `matches` if we hit a new `streamedRow`, as we need to find new matches.
    //            Use `bufferedRow` to iterate buffered side to put all matched rows into
    //            `matches` (`addRowToBuffer`). Return true when getting all matched rows.
    //            For `streamedRow` without `matches` (`handleStreamedWithoutMatch`):
    //            1. Inner and Left Semi join: skip the row.
    //            2. Left/Right Outer and Left Anti join: keep the row and return false (with
    //                                                    `matches` being empty).
    val findNextJoinRowsFuncName = ctx.freshName("findNextJoinRows")
    ctx.addNewFunction(
      findNextJoinRowsFuncName,
      s"""
         |private boolean $findNextJoinRowsFuncName(
         |    scala.collection.Iterator streamedIter,
         |    scala.collection.Iterator bufferedIter) {
         |  $streamedRow = null;
         |  int comp = 0;
         |  while ($streamedRow == null) {
         |    if (!streamedIter.hasNext()) return false;
         |    $streamedRow = (InternalRow) streamedIter.next();
         |    ${streamedKeyVars.map(_.code).mkString("\n")}
         |    if ($streamedAnyNull) {
         |      $handleStreamedAnyNull
         |    }
         |    if (!$matches.isEmpty()) {
         |      ${genComparison(ctx, streamedKeyVars, matchedKeyVars)}
         |      if (comp == 0) {
         |        return true;
         |      }
         |      $matches.clear();
         |    }
         |
         |    do {
         |      if ($bufferedRow == null) {
         |        if (!bufferedIter.hasNext()) {
         |          ${matchedKeyVars.map(_.code).mkString("\n")}
         |          return !$matches.isEmpty();
         |        }
         |        $bufferedRow = (InternalRow) bufferedIter.next();
         |        ${bufferedKeyTmpVars.map(_.code).mkString("\n")}
         |        if ($bufferedAnyNull) {
         |          $bufferedRow = null;
         |          continue;
         |        }
         |        ${bufferedKeyVars.map(_.code).mkString("\n")}
         |      }
         |      ${genComparison(ctx, streamedKeyVars, bufferedKeyVars)}
         |      if (comp > 0) {
         |        $bufferedRow = null;
         |      } else if (comp < 0) {
         |        if (!$matches.isEmpty()) {
         |          ${matchedKeyVars.map(_.code).mkString("\n")}
         |          return true;
         |        } else {
         |          $handleStreamedWithoutMatch
         |        }
         |      } else {
         |        $addRowToBuffer
         |        $bufferedRow = null;
         |      }
         |    } while ($streamedRow != null);
         |  }
         |  return false; // unreachable
         |}
       """.stripMargin,
      inlineToOuterClass = true
    )

    (findNextJoinRowsFuncName, streamedRow, matches)
  }

  /** Creates variables and declarations for streamed part of result row.
    *
    * In order to defer the access after condition and also only access once in the loop,
    * the variables should be declared separately from accessing the columns, we can't use the
    * codegen of BoundReference here.
    */
  private def createStreamedVars(
      ctx: CodegenContext,
      streamedRow: String
  ): (Seq[ExprCode], Seq[String]) = {
    ctx.INPUT_ROW = streamedRow
    streamedPlan.output.zipWithIndex.map { case (a, i) =>
      val value = ctx.freshName("value")
      val valueCode =
        CodeGenerator.getValue(streamedRow, a.dataType, i.toString)
      val javaType = CodeGenerator.javaType(a.dataType)
      val defaultValue = CodeGenerator.defaultValue(a.dataType)
      if (a.nullable) {
        val isNull = ctx.freshName("isNull")
        val code =
          code"""
                |$isNull = $streamedRow.isNullAt($i);
                |$value = $isNull ? $defaultValue : ($valueCode);
           """.stripMargin
        val streamedVarsDecl =
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
          streamedVarsDecl
        )
      } else {
        val code = code"$value = $valueCode;"
        val streamedVarsDecl = s"""$javaType $value = $defaultValue;"""
        (
          ExprCode(code, FalseLiteral, JavaCode.variable(value, a.dataType)),
          streamedVarsDecl
        )
      }
    }.unzip
  }

  /** Splits variables based on whether it's used by condition or not, returns the code to create
    * these variables before the condition and after the condition.
    *
    * Only a few columns are used by condition, then we can skip the accessing of those columns
    * that are not used by condition also filtered out by condition.
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

  override def doProduce(ctx: CodegenContext): String = {
    // Inline mutable state since not many join operations in a task
    val streamedInput = ctx.addMutableState(
      "scala.collection.Iterator",
      "streamedInput",
      v => s"$v = inputs[0];",
      forceInline = true
    )
    val bufferedInput = ctx.addMutableState(
      "scala.collection.Iterator",
      "bufferedInput",
      v => s"$v = inputs[1];",
      forceInline = true
    )

    val (findNextJoinRowsFuncName, streamedRow, matches) = genScanner(ctx)

    // Create variables for row from both sides.
    val (streamedVars, streamedVarDecl) = createStreamedVars(ctx, streamedRow)
    val bufferedRow = ctx.freshName("bufferedRow")
    val bufferedVars = genBuildSideVars(ctx, bufferedRow, bufferedPlan)

    val iterator = ctx.freshName("iterator")
    val numOutput = metricTerm(ctx, "numOutputRows")
    val resultVars = joinType match {
      case _: InnerLike | LeftOuter =>
        streamedVars ++ bufferedVars
      case RightOuter =>
        bufferedVars ++ streamedVars
      case LeftSemi | LeftAnti =>
        streamedVars
      case x =>
        throw new IllegalArgumentException(
          s"SortMergeJoin.doProduce should not take $x as the JoinType"
        )
    }

    val (streamedBeforeLoop, condCheck, loadStreamed) =
      if (condition.isDefined) {
        // Split the code of creating variables based on whether it's used by condition or not.
        val loaded = ctx.freshName("loaded")
        val (streamedBefore, streamedAfter) =
          splitVarsByCondition(streamedOutput, streamedVars)
        val (bufferedBefore, bufferedAfter) =
          splitVarsByCondition(bufferedOutput, bufferedVars)
        // Generate code for condition
        ctx.currentVars = streamedVars ++ bufferedVars
        val cond = BindReferences
          .bindReference(
            condition.get,
            streamedPlan.output ++ bufferedPlan.output
          )
          .genCode(ctx)
        // Evaluate the columns those used by condition before loop
        val before = joinType match {
          case LeftAnti =>
            // No need to initialize `loaded` variable for Left Anti join.
            streamedBefore.trim
          case _ =>
            s"""
               |boolean $loaded = false;
               |$streamedBefore
         """.stripMargin
        }

        val loadStreamedAfterCondition = joinType match {
          case LeftAnti =>
            // No need to evaluate columns not used by condition from streamed side, as for Left Anti
            // join, streamed row with match is not outputted.
            ""
          case _ =>
            s"""
               |if (!$loaded) {
               |  $loaded = true;
               |  $streamedAfter
               |}
         """.stripMargin
        }

        val loadBufferedAfterCondition = joinType match {
          case LeftSemi | LeftAnti =>
            // No need to evaluate columns not used by condition from buffered side
            ""
          case _ => bufferedAfter
        }

        val checking =
          s"""
             |$bufferedBefore
             |if ($bufferedRow != null) {
             |  ${cond.code}
             |  if (${cond.isNull}|| !${cond.value}) {
             |    continue;
             |  }
             |}
             |$loadStreamedAfterCondition
             |$loadBufferedAfterCondition
         """.stripMargin
        (before, checking.trim, streamedAfter.trim)
      } else {
        (evaluateVariables(streamedVars), "", "")
      }

    val beforeLoop =
      s"""
         |${streamedVarDecl.mkString("\n")}
         |${streamedBeforeLoop.trim}
         |scala.collection.Iterator<UnsafeRow> $iterator = $matches.generateIterator();
       """.stripMargin
    val outputRow =
      s"""
         |$numOutput.add(1);
         |${consume(ctx, resultVars)}
       """.stripMargin
    val findNextJoinRows =
      s"$findNextJoinRowsFuncName($streamedInput, $bufferedInput)"
    val thisPlan = ctx.addReferenceObj("plan", this)
    val eagerCleanup = s"$thisPlan.cleanupResources();"

    joinType match {
      case PITJoin =>
        codegenInner(
          findNextJoinRows,
          beforeLoop,
          iterator,
          bufferedRow,
          condCheck,
          outputRow,
          eagerCleanup
        )
      case x =>
        throw new IllegalArgumentException(
          s"SortMergeJoin.doProduce should not take $x as the JoinType"
        )
    }
  }

  /** Generates the code for Inner join.
    */
  private def codegenInner(
      findNextJoinRows: String,
      beforeLoop: String,
      matchIterator: String,
      bufferedRow: String,
      conditionCheck: String,
      outputRow: String,
      eagerCleanup: String
  ): String = {
    s"""
       |while ($findNextJoinRows) {
       |  $beforeLoop
       |  while ($matchIterator.hasNext()) {
       |    InternalRow $bufferedRow = (InternalRow) $matchIterator.next();
       |    $conditionCheck
       |    $outputRow
       |  }
       |  if (shouldStop()) return;
       |}
       |$eagerCleanup
     """.stripMargin
  }

  override protected def withNewChildrenInternal(
      newLeft: SparkPlan,
      newRight: SparkPlan
  ): PITJoinExec =
    copy(left = newLeft, right = newRight)
}

/** Helper class that is used to implement [[SortMergeJoinExec]].
  *
  * To perform an inner (outer) join, users of this class call [[findNextInnerJoinRows()]]
  * ([[findNextOuterJoinRows()]]), which returns `true` if a result has been produced and `false`
  * otherwise. If a result has been produced, then the caller may call [[getStreamedRow]] to return
  * the matching row from the streamed input and may call [[getBufferedMatches]] to return the
  * sequence of matching rows from the buffered input (in the case of an outer join, this will return
  * an empty sequence if there are no matches from the buffered input). For efficiency, both of these
  * methods return mutable objects which are re-used across calls to the `findNext*JoinRows()`
  * methods.
  *
  * @param streamedKeyGenerator  a projection that produces join keys from the streamed input.
  * @param bufferedKeyGenerator  a projection that produces join keys from the buffered input.
  * @param keyOrdering           an ordering which can be used to compare join keys.
  * @param streamedIter          an input whose rows will be streamed.
  * @param bufferedIter          an input whose rows will be buffered to construct sequences of rows that
  *                              have the same join key.
  * @param inMemoryThreshold     Threshold for number of rows guaranteed to be held in memory by
  *                              internal buffer
  * @param spillThreshold        Threshold for number of rows to be spilled by internal buffer
  * @param eagerCleanupResources the eager cleanup function to be invoked when no join row found
  * @param onlyBufferFirstMatch  [[bufferMatchingRows]] should buffer only the first matching row
  */
private[joins] class SortMergeJoinScanner(
    streamedKeyGenerator: Projection,
    bufferedKeyGenerator: Projection,
    keyOrdering: Ordering[InternalRow],
    streamedIter: RowIterator,
    bufferedIter: RowIterator,
    inMemoryThreshold: Int,
    spillThreshold: Int,
    eagerCleanupResources: () => Unit,
    onlyBufferFirstMatch: Boolean = false
) {
  private[this] var streamedRow: InternalRow = _
  private[this] var streamedRowKey: InternalRow = _
  private[this] var bufferedRow: InternalRow = _
  // Note: this is guaranteed to never have any null columns:
  private[this] var bufferedRowKey: InternalRow = _

  /** The join key for the rows buffered in `bufferedMatches`, or null if `bufferedMatches` is empty
    */
  private[this] var matchJoinKey: InternalRow = _

  /** Buffered rows from the buffered side of the join. This is empty if there are no matches. */
  private[this] val bufferedMatches: ExternalAppendOnlyUnsafeRowArray =
    new ExternalAppendOnlyUnsafeRowArray(inMemoryThreshold, spillThreshold)

  // Initialization (note: do _not_ want to advance streamed here).
  advancedBufferedToRowWithNullFreeJoinKey()

  // --- Public methods ---------------------------------------------------------------------------

  def getStreamedRow: InternalRow = streamedRow

  def getBufferedMatches: ExternalAppendOnlyUnsafeRowArray = bufferedMatches

  /** Advances both input iterators, stopping when we have found rows with matching join keys. If no
    * join rows found, try to do the eager resources cleanup.
    *
    * @return true if matching rows have been found and false otherwise. If this returns true, then
    *         [[getStreamedRow]] and [[getBufferedMatches]] can be called to construct the join
    *         results.
    */
  final def findNextInnerJoinRows(): Boolean = {
    while (advancedStreamed() && streamedRowKey.anyNull) {
      // Advance the streamed side of the join until we find the next row whose join key contains
      // no nulls or we hit the end of the streamed iterator.
    }
    val found = if (streamedRow == null) {
      // We have consumed the entire streamed iterator, so there can be no more matches.
      matchJoinKey = null
      bufferedMatches.clear()
      false
    } else if (
      matchJoinKey != null && keyOrdering.compare(
        streamedRowKey,
        matchJoinKey
      ) == 0
    ) {
      // The new streamed row has the same join key as the previous row, so return the same matches.
      true
    } else if (bufferedRow == null) {
      // The streamed row's join key does not match the current batch of buffered rows and there are
      // no more rows to read from the buffered iterator, so there can be no more matches.
      matchJoinKey = null
      bufferedMatches.clear()
      false
    } else {
      // Advance both the streamed and buffered iterators to find the next pair of matching rows.
      var comp = keyOrdering.compare(streamedRowKey, bufferedRowKey)
      do {
        if (streamedRowKey.anyNull) {
          advancedStreamed()
        } else {
          assert(!bufferedRowKey.anyNull)
          comp = keyOrdering.compare(streamedRowKey, bufferedRowKey)
          if (comp > 0) advancedBufferedToRowWithNullFreeJoinKey()
          else if (comp < 0) advancedStreamed()
        }
      } while (streamedRow != null && bufferedRow != null && comp != 0)
      if (streamedRow == null || bufferedRow == null) {
        // We have either hit the end of one of the iterators, so there can be no more matches.
        matchJoinKey = null
        bufferedMatches.clear()
        false
      } else {
        // The streamed row's join key matches the current buffered row's join, so walk through the
        // buffered iterator to buffer the rest of the matching rows.
        assert(comp == 0)
        bufferMatchingRows()
        true
      }
    }
    if (!found) eagerCleanupResources()
    found
  }

  /** Advances the streamed input iterator and buffers all rows from the buffered input that
    * have matching keys. If no join rows found, try to do the eager resources cleanup.
    *
    * @return true if the streamed iterator returned a row, false otherwise. If this returns true,
    *         then [[getStreamedRow]] and [[getBufferedMatches]] can be called to produce the outer
    *         join results.
    */
  final def findNextOuterJoinRows(): Boolean = {
    val found = if (!advancedStreamed()) {
      // We have consumed the entire streamed iterator, so there can be no more matches.
      matchJoinKey = null
      bufferedMatches.clear()
      false
    } else {
      if (
        matchJoinKey != null && keyOrdering.compare(
          streamedRowKey,
          matchJoinKey
        ) == 0
      ) {
        // Matches the current group, so do nothing.
      } else {
        // The streamed row does not match the current group.
        matchJoinKey = null
        bufferedMatches.clear()
        if (bufferedRow != null && !streamedRowKey.anyNull) {
          // The buffered iterator could still contain matching rows, so we'll need to walk through
          // it until we either find matches or pass where they would be found.
          var comp = 1
          do {
            comp = keyOrdering.compare(streamedRowKey, bufferedRowKey)
          } while (comp > 0 && advancedBufferedToRowWithNullFreeJoinKey())
          if (comp == 0) {
            // We have found matches, so buffer them (this updates matchJoinKey)
            bufferMatchingRows()
          } else {
            // We have overshot the position where the row would be found, hence no matches.
          }
        }
      }
      // If there is a streamed input then we always return true
      true
    }
    if (!found) eagerCleanupResources()
    found
  }

  // --- Private methods --------------------------------------------------------------------------

  /** Advance the streamed iterator and compute the new row's join key.
    *
    * @return true if the streamed iterator returned a row and false otherwise.
    */
  private def advancedStreamed(): Boolean = {
    if (streamedIter.advanceNext()) {
      streamedRow = streamedIter.getRow
      streamedRowKey = streamedKeyGenerator(streamedRow)
      true
    } else {
      streamedRow = null
      streamedRowKey = null
      false
    }
  }

  /** Advance the buffered iterator until we find a row with join key that does not contain nulls.
    *
    * @return true if the buffered iterator returned a row and false otherwise.
    */
  private def advancedBufferedToRowWithNullFreeJoinKey(): Boolean = {
    var foundRow: Boolean = false
    while (!foundRow && bufferedIter.advanceNext()) {
      bufferedRow = bufferedIter.getRow
      bufferedRowKey = bufferedKeyGenerator(bufferedRow)
      foundRow = !bufferedRowKey.anyNull
    }
    if (!foundRow) {
      bufferedRow = null
      bufferedRowKey = null
      false
    } else {
      true
    }
  }

  /** Called when the streamed and buffered join keys match in order to buffer the matching rows.
    */
  private def bufferMatchingRows(): Unit = {
    assert(streamedRowKey != null)
    assert(!streamedRowKey.anyNull)
    assert(bufferedRowKey != null)
    assert(!bufferedRowKey.anyNull)
    assert(keyOrdering.compare(streamedRowKey, bufferedRowKey) == 0)
    // This join key may have been produced by a mutable projection, so we need to make a copy:
    matchJoinKey = streamedRowKey.copy()
    bufferedMatches.clear()
    do {
      if (!onlyBufferFirstMatch || bufferedMatches.isEmpty) {
        bufferedMatches.add(bufferedRow.asInstanceOf[UnsafeRow])
      }
      advancedBufferedToRowWithNullFreeJoinKey()
    } while (bufferedRow != null && keyOrdering.compare(
      streamedRowKey,
      bufferedRowKey
    ) == 0)
  }
}
