package io.github.ackuq
package execution

import org.apache.spark.sql.Strategy
import org.apache.spark.sql.catalyst.expressions.{PredicateHelper, RowOrdering}
import org.apache.spark.sql.catalyst.optimizer.JoinSelectionHelper
import org.apache.spark.sql.catalyst.plans.{PITJoin, logical}
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.execution.{SparkPlan, joins}

object CustomStrategy
    extends Strategy
    with PredicateHelper
    with JoinSelectionHelper {

  def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
    case ExtractPITJoinKeys(
          joinType,
          leftPitKeys,
          rightPitKeys,
          leftEquiKeys,
          rightEquiKeys,
          nonEquiCond,
          left,
          right,
          hint
        ) =>
      def createPITJoin() = joinType match {
        case PITJoin =>
          if (
            (leftEquiKeys.isEmpty || RowOrdering
              .isOrderable(
                leftEquiKeys
              )) && RowOrdering.isOrderable(leftPitKeys)
          ) {
            Some(
              Seq(
                joins.PITJoinExec(
                  leftPitKeys,
                  rightPitKeys,
                  leftEquiKeys,
                  rightEquiKeys,
                  joinType,
                  nonEquiCond,
                  planLater(left),
                  planLater(right)
                )
              )
            )
          } else {
            None
          }
        case _ => None
      }

      createPITJoin().getOrElse {
        Nil
      }

    case logical.Join(left, right, joinType, condition, hint) =>
      println("LOGICAL JOIN")
      joinType match {
        //        case PITJoin =>
        //          Seq(
        //            joins.PITJoinExec(
        //              planLater(left),
        //              planLater(right)
        //              condition
        //            )
        //          )
        case _ => Nil
      }
    case _ => Nil
  }
}
