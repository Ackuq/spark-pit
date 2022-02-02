package io.github.ackuq
package execution

import org.apache.spark.internal.Logging
import org.apache.spark.sql.catalyst.expressions.{
  And,
  Coalesce,
  EqualNullSafe,
  EqualTo,
  Equality,
  Expression,
  GreaterThan,
  IsNull,
  LessThan,
  LessThanOrEqual,
  Literal,
  PredicateHelper,
  GreaterThanOrEqual
}
import org.apache.spark.sql.catalyst.plans.JoinType
import org.apache.spark.sql.catalyst.plans.logical.{Join, JoinHint, LogicalPlan}

object ExtractPITJoinKeys extends Logging with PredicateHelper {

  /** (joinType, pitLeftKeys, pitRightKeys, equiLeftKeys, equiRightKeys, condition, leftChild, rightChild, joinHint) */
  type ReturnType = (
      JoinType,
      Seq[Expression],
      Seq[Expression],
      Seq[Expression],
      Seq[Expression],
      Option[Expression],
      LogicalPlan,
      LogicalPlan,
      JoinHint
  )

  private def getEquiJoinKeys(
      predicates: Seq[Expression],
      left: LogicalPlan,
      right: LogicalPlan
  ) = {
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
      case other => None

    }
  }

  /** Get the PIT keys, currently only support greater than
    * TODO: Support less than as well
    */
  private def getPitKeys(
      predicates: Seq[Expression],
      left: LogicalPlan,
      right: LogicalPlan
  ) = {
    predicates.flatMap {
      case GreaterThan(l, r) if canEvaluate(l, left) && canEvaluate(r, right) =>
        Some((l, r))
      case GreaterThanOrEqual(l, r)
          if canEvaluate(l, left) && canEvaluate(r, right) =>
        Some((l, r))
      case other => None
    }
  }

  def unapply(join: Join): Option[ReturnType] = join match {
    case Join(left, right, joinType, condition, hint) =>
      logDebug(s"Considering join on: $condition")
      // Find equi-join predicates that can be evaluated before the join, and thus can be used  as join keys.

      val predicates = condition.map(splitConjunctivePredicates).getOrElse(Nil)

      // First get the equi-join keys, if they exists
      val equiJoinKeys = getEquiJoinKeys(predicates, left, right)

      // Get the PIT keys
      val pitJoinKeys = getPitKeys(predicates, left, right)

      val otherPredicates = predicates.filterNot {
        case EqualTo(l, r) if l.references.isEmpty || r.references.isEmpty =>
          false
        case Equality(l, r) =>
          canEvaluate(l, left) && canEvaluate(r, right) ||
            canEvaluate(l, right) && canEvaluate(r, left)
        case LessThan(l, r) => canEvaluate(l, left) && canEvaluate(r, right)
        case LessThanOrEqual(l, r) =>
          canEvaluate(l, left) && canEvaluate(r, right)
        case _ => false
      }
      
      if (pitJoinKeys.nonEmpty && pitJoinKeys.length == 1) {
        val (leftPitKeys, rightPitKeys) = pitJoinKeys.unzip
        val (leftEquiKeys, rightEquiKeys) = equiJoinKeys.unzip

        logDebug(s"leftPitKeys:$leftPitKeys | rightPitKeys:$leftPitKeys")
        Some(
          (
            joinType,
            leftPitKeys,
            rightPitKeys,
            leftEquiKeys,
            rightEquiKeys,
            otherPredicates.reduceOption(And),
            left,
            right,
            hint
          )
        )
      } else {
        None
      }
  }

}
