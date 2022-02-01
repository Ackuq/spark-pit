package io.github.ackuq
package execution

import org.apache.spark.sql.Strategy
import org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression
import org.apache.spark.sql.catalyst.expressions.{
  Alias,
  NamedExpression,
  PredicateHelper,
  PythonUDF,
  RowOrdering,
  SessionWindow
}
import org.apache.spark.sql.catalyst.optimizer.{
  BuildLeft,
  BuildRight,
  BuildSide,
  JoinSelectionHelper,
  NormalizeFloatingNumbers
}
import org.apache.spark.sql.catalyst.planning.{
  ExtractEquiJoinKeys,
  ExtractSingleColumnNullAwareAntiJoin,
  PhysicalAggregation
}
import org.apache.spark.sql.catalyst.plans.logical.{
  EventTimeWatermark,
  HintInfo,
  JoinHint,
  LogicalPlan
}
import org.apache.spark.sql.catalyst.plans.{
  InnerLike,
  JoinType,
  LeftAnti,
  PITJoin,
  logical
}
import org.apache.spark.sql.errors.QueryCompilationErrors
import org.apache.spark.sql.execution.aggregate.AggUtils
import org.apache.spark.sql.execution.streaming.EventTimeWatermarkExec
import org.apache.spark.sql.execution.{SparkPlan, joins}
import org.apache.spark.sql.internal.SQLConf

import java.util.Locale

object CustomStrategy
    extends Strategy
    with PredicateHelper
    with JoinSelectionHelper {

  def apply(plan: LogicalPlan): Seq[SparkPlan] = plan match {
    case j @ ExtractEquiJoinKeys(
          joinType,
          leftKeys,
          rightKeys,
          nonEquiCond,
          left,
          right,
          hint
        ) =>
      def createPITJoin() = {
        if (RowOrdering.isOrderable(leftKeys)) {
          Some(
            Seq(
              joins.PITJoinExec(
                leftKeys,
                rightKeys,
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
