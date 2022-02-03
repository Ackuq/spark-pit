package io.github.ackuq
package logical

import org.apache.spark.sql.catalyst.expressions.{
  Attribute,
  Expression,
  PredicateHelper
}
import org.apache.spark.sql.catalyst.plans.logical.{BinaryNode, LogicalPlan}

object Plans {
  case class AsOfJoin(
      left: LogicalPlan,
      right: LogicalPlan,
      condition: Option[Expression]
  ) extends BinaryNode
      with PredicateHelper {

    override def output: Seq[Attribute] = left.output

    override protected def withNewChildrenInternal(
        newLeft: LogicalPlan,
        newRight: LogicalPlan
    ): LogicalPlan = copy(left = newLeft, right = newRight)
  }

}
