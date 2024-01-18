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

import org.apache.spark.sql.catalyst.expressions.{
  Attribute,
  Expression,
  ExpressionSet,
  PredicateHelper
}
import org.apache.spark.sql.catalyst.plans.logical.{BinaryNode, LogicalPlan}
import org.apache.spark.sql.types.BooleanType

protected[pit] sealed abstract class CustomJoinType {
  def sql: String
}

protected[pit] case object PITJoinType extends CustomJoinType {
  override def sql: String = "PIT"
}

protected[pit] case class PITJoin(
    left: LogicalPlan,
    right: LogicalPlan,
    leftPitKey: Expression,
    rightPitKey: Expression,
    returnNulls: Boolean,
    tolerance: Long,
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
    if (returnNulls) {
      left.output ++ right.output.map(_.withNullability(true))
    } else {
      left.output ++ right.output
    }
  }

  override def metadataOutput: Seq[Attribute] = {
    children.flatMap(_.metadataOutput)
  }

  def duplicateResolved: Boolean =
    left.outputSet.intersect(right.outputSet).isEmpty

  override protected def withNewChildrenInternal(
      newLeft: LogicalPlan,
      newRight: LogicalPlan
  ): PITJoin = copy(left = newLeft, right = newRight)
}
