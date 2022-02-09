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

  private def getPITExpression(predicates: Seq[Expression]) = {
    predicates.flatMap {
      // TODO: Identifying by name is unsafe, maybe could be improved
      case f: ScalaUDF if f.udfName.getOrElse("") == PIT_UDF_NAME =>
        Some(f)
      case _ => None
    }
  }
}
