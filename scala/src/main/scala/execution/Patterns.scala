/*
 * MIT License
 *
 * Copyright (c) 2022 Axel Pettersson
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.ackuq.pit
package execution

import logical.PITJoin

import org.apache.spark.internal.Logging
import org.apache.spark.sql.catalyst.expressions.{
  And,
  Coalesce,
  EqualNullSafe,
  EqualTo,
  Equality,
  Expression,
  IsNull,
  Literal,
  PredicateHelper
}
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan

protected[pit] trait ExtractEqualityKeys extends PredicateHelper with Logging {
  def getEquiJoinKeys(
      predicates: Seq[Expression],
      left: LogicalPlan,
      right: LogicalPlan
  ): Seq[(Expression, Expression)] = {
    predicates.flatMap {
      case EqualTo(l, r) if l.references.isEmpty || r.references.isEmpty =>
        None
      case EqualTo(l, r) if canEvaluate(l, left) && canEvaluate(r, right) =>
        Some((l, r))
      case EqualTo(l, r) if canEvaluate(l, right) && canEvaluate(r, left) =>
        Some((r, l))
      // Replace null with default value for joining key, then those rows with null in it could
      // be joined together
      case EqualNullSafe(l, r)
          if canEvaluate(l, left) && canEvaluate(r, right) =>
        Seq(
          (
            Coalesce(Seq(l, Literal.default(l.dataType))),
            Coalesce(Seq(r, Literal.default(r.dataType)))
          ),
          (IsNull(l), IsNull(r))
        )
      case EqualNullSafe(l, r)
          if canEvaluate(l, right) && canEvaluate(r, left) =>
        Seq(
          (
            Coalesce(Seq(r, Literal.default(r.dataType))),
            Coalesce(Seq(l, Literal.default(l.dataType)))
          ),
          (IsNull(r), IsNull(l))
        )
      case _ => None

    }

  }
}

object PITJoinExtractEquality extends ExtractEqualityKeys {

  /** (pitLeftKey, pitRightKey, equiLeftKeys, equiRightKeys, condition,
    * otherPredicates, leftChild, rightChild)
    */
  type ReturnType = (
      Expression,
      Expression,
      Seq[Expression],
      Seq[Expression],
      Option[Expression],
      Boolean,
      Long,
      LogicalPlan,
      LogicalPlan
  )

  def unapply(join: PITJoin): Option[ReturnType] = {
    logDebug(s"Considering join on: ${join.condition}")

    val predicates =
      join.condition.map(splitConjunctivePredicates).getOrElse(Nil)

    // First get the equi-join keys, if they exists
    // These need to be sortable in order to make the algorithm work optimized
    val equiJoinKeys = getEquiJoinKeys(predicates, join.left, join.right)

    if (predicates.length != equiJoinKeys.length) {
      throw new IllegalArgumentException(
        "Besides the PIT key, only equi-conditions are supported for PIT joins"
      )
    }
    val leftPitKey =
      if (canEvaluate(join.pitCondition.children.head, join.left))
        join.pitCondition.children.head
      else join.pitCondition.children(1)

    val rightPitKey =
      if (canEvaluate(join.pitCondition.children.head, join.right))
        join.pitCondition.children.head
      else join.pitCondition.children(1)

    val (leftEquiKeys, rightEquiKeys) = equiJoinKeys.unzip

    logDebug(s"leftPitKey:$leftPitKey | rightPitKey:$rightPitKey")
    Some(
      (
        leftPitKey,
        rightPitKey,
        leftEquiKeys,
        rightEquiKeys,
        None,
        join.returnNulls,
        join.tolerance,
        join.left,
        join.right
      )
    )

  }
}
