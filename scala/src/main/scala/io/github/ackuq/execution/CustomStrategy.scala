package io.github.ackuq
package execution

import org.apache.spark.sql.Strategy
import org.apache.spark.sql.catalyst.expressions.{PredicateHelper, RowOrdering}
import org.apache.spark.sql.catalyst.optimizer.JoinSelectionHelper
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.SparkPlan

object CustomStrategy
    extends Strategy
    with PredicateHelper
    with JoinSelectionHelper {

  def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
    case PITJoinExtractEquality(
          leftPitKey,
          rightPitKey,
          leftEquiKeys,
          rightEquiKeys,
          nonEquiCond,
          left,
          right
        ) =>
      if (
        (leftEquiKeys.isEmpty || RowOrdering.isOrderable(
          leftEquiKeys
        )) && RowOrdering.isOrderable(Seq(leftPitKey))
      ) {
        Seq(
          PITJoinExec(
            Seq(leftPitKey),
            Seq(rightPitKey),
            leftEquiKeys,
            rightEquiKeys,
            nonEquiCond,
            planLater(left),
            planLater(right)
          )
        )
      } else {
        Nil
      }
    case _ => Nil
  }
}
