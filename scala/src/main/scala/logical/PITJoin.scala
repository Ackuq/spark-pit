package io.github.ackuq.pit
package logical

import org.apache.spark.sql.catalyst.expressions.{
  Attribute,
  Expression,
  ExpressionSet,
  PredicateHelper
}
import org.apache.spark.sql.catalyst.plans.logical.{BinaryNode, LogicalPlan}
import org.apache.spark.sql.types.BooleanType

sealed abstract class CustomJoinType {
  def sql: String
}

case object PITJoinType extends CustomJoinType {
  override def sql: String = "PIT"
}

case class PITJoin(
    left: LogicalPlan,
    right: LogicalPlan,
    pitCondition: Expression,
    condition: Option[Expression]
) extends BinaryNode
    with PredicateHelper {

  // Joins are only resolved if they don't introduce ambiguous expression ids.
  override lazy val resolved: Boolean = {
    childrenResolved &&
    expressions.forall(_.resolved) &&
    duplicateResolved &&
    condition.forall(_.dataType == BooleanType)
  }
  override protected lazy val validConstraints: ExpressionSet = {
    left.constraints
  }

  override def maxRows: Option[Long] = {
    left.maxRows
  }

  override def output: Seq[Attribute] = {
    left.output ++ right.output
  }

  override def metadataOutput: Seq[Attribute] = {
    children.flatMap(_.metadataOutput)
  }

  def duplicateResolved: Boolean =
    left.outputSet.intersect(right.outputSet).isEmpty

}
