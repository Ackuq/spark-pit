package io.github.ackuq
package logical

import EarlyStopSortMerge.PIT_UDF_NAME

import org.apache.spark.sql.catalyst.expressions.{
  And,
  Expression,
  GreaterThanOrEqual,
  PredicateHelper,
  ScalaUDF
}
import org.apache.spark.sql.catalyst.plans.logical.{Join, LogicalPlan}
import org.apache.spark.sql.catalyst.rules.Rule

object PITRule extends Rule[LogicalPlan] with PredicateHelper {
  private def getPITExpression(predicates: Seq[Expression]) = {
    predicates.flatMap {
      // TODO: Identifying by name is unsafe, maybe could be improved
      case f: ScalaUDF if f.udfName.getOrElse("") == PIT_UDF_NAME =>
        Some(f)
      case _ => None
    }
  }

  def apply(logicalPlan: LogicalPlan): LogicalPlan =
    logicalPlan.transform { case j @ Join(left, right, _, condition, _) =>
      val predicates = {
        condition.map(splitConjunctivePredicates).getOrElse(Nil)
      }

      val pitExpressions = getPITExpression(predicates)
      if (pitExpressions.nonEmpty && pitExpressions.length == 1) {
        val pitExpression: ScalaUDF = pitExpressions.head
        val otherPredicates = predicates.filterNot {
          case f: ScalaUDF if f.udfName.getOrElse("") == PIT_UDF_NAME => true
          case _                                                      => false
        }
        val pitCondition =
          GreaterThanOrEqual(
            pitExpression.children.head,
            pitExpression.children(1)
          )

        PITJoin(left, right, pitCondition, otherPredicates.reduceOption(And))
      } else {
        j
      }
    }
}
