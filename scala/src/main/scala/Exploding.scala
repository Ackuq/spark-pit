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

import utils.ColumnUtils.assertColumnsInDF

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{col, row_number}

object Exploding {

  /** Perform a backward asof join using the left table for event times.
    *
    * @param left
    *   The left dataframe, will be used as reference
    * @param right
    *   The right dataframe, will be used to merge
    * @param leftTSColumn
    *   The column used for timestamps in left DF
    * @param rightTSColumn
    *   The column used for timestamps in right DF
    * @param partitionCols
    *   The columns used for partitioning, if used
    * @return
    *   The PIT-correct view of the joined dataframes
    */
  def join(
      left: DataFrame,
      right: DataFrame,
      leftTSColumn: String = "ts",
      rightTSColumn: String = "ts",
      partitionCols: Seq[String] = Seq()
  ): DataFrame = {
    if (partitionCols.nonEmpty) {
      assertColumnsInDF(partitionCols, left, right)
    }

    val partitionConditions =
      partitionCols.map(colName => left(colName) === right(colName))

    val joinConditions =
      partitionConditions :+ (left(leftTSColumn) >= right(rightTSColumn))

    val joinCondition =
      joinConditions.reduce((current, previous) => current.and(previous))

    // Join on conditions that left.ts >= right.ts and belongs to same partition
    val combined = left.join(
      right,
      joinCondition
    )

    val windowPartitionCols = partitionCols.map(left(_)) :+ left(leftTSColumn)

    val windowSpec =
      Window
        .partitionBy(windowPartitionCols: _*)
        .orderBy(left(leftTSColumn).desc, right(rightTSColumn).desc)

    combined
      .withColumn("rn", row_number().over(windowSpec))
      .where(col("rn") === 1)
      .drop("rn")
  }
}
