package org.apache.spark.sql.catalyst.plans.logical

import org.apache.spark.sql.catalyst.expressions._
import org.apache.spark.sql.catalyst.plans.logical.statsEstimation.JoinEstimation
import org.apache.spark.sql.internal.SQLConf
import org.apache.spark.util.Utils
import org.apache.spark.sql.catalyst.plans._
import org.apache.spark.sql.types.{BooleanType, DataType}

//adapted from Simba: https://github.com/InitialDLab/Simba

case class AsOfJoin(
    left: LogicalPlan,
    right: LogicalPlan,
    joinType: AsOfJoinType,
    condition: Option[Expression]
) extends BinaryNode
    with PredicateHelper {
  override def output: Seq[Attribute] = {
    joinType match {
      case PITJoin =>
        left.output ++ right.output
      case _ =>
        left.output ++ right.output
    }
  }

  def selfJoinResolved: Boolean =
    left.outputSet.intersect(right.outputSet).isEmpty

  // Joins are only resolved if they don't introduce ambiguous expression ids.
  override lazy val resolved: Boolean = {
    childrenResolved &&
    expressions.forall(_.resolved) &&
    selfJoinResolved &&
    condition.forall(_.dataType == BooleanType)
  }

  override protected def withNewChildrenInternal(
      newLeft: LogicalPlan,
      newRight: LogicalPlan
  ): LogicalPlan = copy(left = newLeft, right = newRight)
}
