package io.github.ackuq
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

trait ExtractEqualityKeys extends PredicateHelper with Logging {
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

  /** (pitLeftKey, pitRightKey, equiLeftKeys, equiRightKeys, condition, otherPredicates, leftChild, rightChild) */
  type ReturnType = (
      Expression,
      Expression,
      Seq[Expression],
      Seq[Expression],
      Option[Expression],
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

    val otherPredicates = predicates.filterNot {
      case EqualTo(l, r) if l.references.isEmpty || r.references.isEmpty =>
        false
      case Equality(l, r) =>
        canEvaluate(l, join.left) && canEvaluate(r, join.right) ||
          canEvaluate(l, join.right) && canEvaluate(r, join.left)
      case _ => false
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
        otherPredicates.reduceOption(And),
        join.left,
        join.right
      )
    )

  }
}
