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
import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.expressions.codegen._
import org.apache.spark.sql.catalyst.plans._
import org.apache.spark.sql.catalyst.plans.physical.{
  Partitioning,
  PartitioningCollection
}
import org.apache.spark.sql.execution._
import org.apache.spark.sql.execution.metric.SQLMetrics

/** Performs a PIT join of two child relations.
  */
case class PITJoinExec(
    leftPitKeys: Seq[Expression],
    rightPitKeys: Seq[Expression],
    leftEquiKeys: Seq[Expression],
    rightEquiKeys: Seq[Expression],
    joinType: JoinType,
    condition: Option[Expression],
    left: SparkPlan,
    right: SparkPlan,
    isSkewJoin: Boolean = false
) extends ShuffledJoin {
  override def leftKeys: Seq[Expression] = leftEquiKeys ++ leftPitKeys

  override def rightKeys: Seq[Expression] = rightEquiKeys ++ rightPitKeys

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
    case x =>
      throw new IllegalArgumentException(
        s"${getClass.getSimpleName} not take $x as the JoinType"
      )
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
    // For PIT join, the order should be in descending time order
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

        // Changed to descending
        SortOrder(key, Descending, sameOrderExpressionsSet.toSeq)
      }
    } else {
      requiredOrdering
    }
  }

  override def requiredChildOrdering: Seq[Seq[SortOrder]] =
    requiredOrders(leftKeys) :: requiredOrders(rightKeys) :: Nil

  private def requiredOrders(keys: Seq[Expression]): Seq[SortOrder] = {
    // This must be ascending in order to agree with the `keyOrdering` defined in `doExecute()`.

    // This has been changed to descending
    keys.map(SortOrder(_, Descending))
  }

  /** These generator are for generating for the equi-keys
    */

  private def createLeftEquiKeyGenerator(): Projection =
    UnsafeProjection.create(leftEquiKeys, left.output)

  private def createRightEquiKeyGenerator(): Projection =
    UnsafeProjection.create(rightEquiKeys, right.output)

  /** These generator are for generating the PIT keys
    */

  private def createLeftPITKeyGenerator(): Projection =
    UnsafeProjection.create(leftPitKeys, left.output)

  private def createRightPITKeyGenerator(): Projection =
    UnsafeProjection.create(rightPitKeys, right.output)

  protected override def doExecute(): RDD[InternalRow] = {
    val numOutputRows = longMetric("numOutputRows")

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

      joinType match {
        case PITJoin =>
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
              cleanupResources
            )
            private[this] val joinRow = new JoinedRow

            override def advanceNext(): Boolean = {
              while (smjScanner.findNextInnerJoinRows()) {
                currentRightMatch = smjScanner.getBufferedMatch
                currentLeftRow = smjScanner.getStreamedRow

                joinRow(currentLeftRow, currentRightMatch)
                if (boundCondition(joinRow)) {
                  numOutputRows += 1
                  return true
                }
              }

              currentRightMatch = null
              currentLeftRow = null
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
    (streamedPlan, streamedEquiKeys, streamedPITKeys),
    (bufferedPlan, bufferedEquiKeys, bufferedPITKeys)
  ) = joinType match {
    case PITJoin =>
      ((left, leftEquiKeys, leftPitKeys), (right, rightEquiKeys, rightPitKeys))
    case x =>
      throw new IllegalArgumentException(
        s"PITJoin.streamedPlan/bufferedPlan should not take $x as the JoinType"
      )
  }

  private lazy val streamedOutput = streamedPlan.output
  private lazy val bufferedOutput = bufferedPlan.output

  // Keep codegen support of for the moment
  override def supportCodegen: Boolean = false

  override def inputRDDs(): Seq[RDD[InternalRow]] = {
    streamedPlan.execute() :: bufferedPlan.execute() :: Nil
  }

  override protected def withNewChildrenInternal(
      newLeft: SparkPlan,
      newRight: SparkPlan
  ): PITJoinExec =
    copy(left = newLeft, right = newRight)

  override protected def doProduce(ctx: CodegenContext): String = ???
}

/** Helper class that is used to implement [[PITJoinExec]].
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
  * @param eagerCleanupResources the eager cleanup function to be invoked when no join row found
  */
private[joins] class PITJoinScanner(
    streamedPITKeyGenerator: Projection,
    bufferedPITKeyGenerator: Projection,
    pitKeyOrdering: Ordering[InternalRow],
    streamedEquiKeyGenerator: Projection,
    bufferedEquiKeyGenerator: Projection,
    equiKeyOrdering: Ordering[InternalRow],
    streamedIter: RowIterator,
    bufferedIter: RowIterator,
    eagerCleanupResources: () => Unit
) {
  private[this] var streamedRow: InternalRow = _
  private[this] var streamedRowEquiKey: InternalRow = _
  private[this] var streamedRowPITKey: InternalRow = _
  private[this] var bufferedRow: InternalRow = _
  // Note: this is guaranteed to never have any null columns:
  private[this] var bufferedRowEquiKey: InternalRow = _
  private[this] var bufferedRowPITKey: InternalRow = _

  /** The join key for the rows buffered in `bufferedMatches`, or null if `bufferedMatches` is empty
    */
  private[this] var matchJoinEquiKey: InternalRow = _
  private[this] var matchJoinPITKey: InternalRow = _

  /** Contains the current match */
  private[this] var bufferedMatch: UnsafeRow = null

  // Initialization (note: do _not_ want to advance streamed here).
  advancedBuffered()

  // --- Public methods ---------------------------------------------------------------------------

  def getStreamedRow: InternalRow = streamedRow

  def getBufferedMatch: UnsafeRow = bufferedMatch

  /** Advances both input iterators, stopping when we have found rows with matching join keys. If no
    * join rows found, try to do the eager resources cleanup.
    *
    * @return true if matching rows have been found and false otherwise. If this returns true, then
    *         [[getStreamedRow]] and [[getBufferedMatches]] can be called to construct the join
    *         results.
    */
  final def findNextInnerJoinRows(): Boolean = {
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
        // Streamed row key must be equal or grater than match
      ) >= 0
    ) {
      // The new streamed row has the same join key as the previous row, so return the same matches.
      true
    } else if (bufferedRow == null) {
      // The streamed row's join key does not match the current batch of buffered rows and there are
      // no more rows to read from the buffered iterator, so there can be no more matches.
      matchJoinEquiKey = null
      matchJoinPITKey = null
      bufferedMatch = null
      false
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

          if (equiComp < 0) advancedStreamed()
          else if (equiComp > 0) advancedBuffered()
          else if (pitComp > 0) advancedBuffered()
        }
      } while (streamedRow != null && bufferedRow != null && (equiComp != 0 || pitComp > 0))
      if (streamedRow == null || bufferedRow == null) {
        // We have either hit the end of one of the iterators, so there can be no more matches.
        matchJoinEquiKey = null
        matchJoinPITKey = null
        bufferedMatch = null
        false
      } else {
        // The streamed row's join key matches the current buffered row's join, only take this row
        assert(equiComp == 0 && pitComp <= 0)

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
    * @return true if the streamed iterator returned a row and false otherwise.
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
    * @return true if the buffered iterator returned a row and false otherwise.
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