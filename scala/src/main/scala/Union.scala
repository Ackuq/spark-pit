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

import utils.ColumnUtils.{assertColumnsInDF, prefixDF}

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{coalesce, col, last, lit}

object Union {

  /** Intermediate column names
    */
  private val DF_INDEX_COLUMN = "df_index"
  private val COMBINED_TS_COLUMN = "df_combined_ts"

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
    * @param leftPrefix
    *   Optional, the prefix for the left columns in result
    * @param rightPrefix
    *   The prefix for the right columns in result
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
      leftPrefix: Option[String] = None,
      rightPrefix: String,
      partitionCols: Seq[String] = Seq()
  ): DataFrame = {
    // Assert both dataframes have the partition columns
    assertColumnsInDF(partitionCols, left, right)

    // Rename the columns in left and right dataframes
    val leftPrefixed = leftPrefix match {
      case Some(lp) => prefixDF(left, lp, partitionCols)
      case None     => left
    }

    val rightPrefixed =
      prefixDF(right, rightPrefix, partitionCols)

    // Timestamp columns
    val leftTS = leftPrefix match {
      case Some(p) => p ++ leftTSColumn
      case None    => leftTSColumn
    }
    val rightTS = rightPrefix ++ rightTSColumn

    // Add all the column to both dataframes
    val leftPrefixedAllColumns = addColumns(
      leftPrefixed.withColumn(DF_INDEX_COLUMN, lit(1)),
      rightPrefixed.columns.filter(!partitionCols.contains(_))
    )
    val rightPrefixedAllColumns =
      addColumns(
        rightPrefixed.withColumn(DF_INDEX_COLUMN, lit(0)),
        leftPrefixed.columns.filter(!partitionCols.contains(_))
      )

    // Combine the dataframes
    val combined = leftPrefixedAllColumns.unionByName(rightPrefixedAllColumns)

    // Get the combined TS from the dataframes, this will be used for ordering
    val combinedTS = combined.withColumn(
      COMBINED_TS_COLUMN,
      coalesce(combined(leftTS), combined(rightTS))
    )

    val windowSpec = Window
      .orderBy(COMBINED_TS_COLUMN, DF_INDEX_COLUMN)
      .partitionBy(
        partitionCols.map(col): _*
      )
      .rowsBetween(Window.unboundedPreceding, Window.currentRow)

    // Get all non-partitioning columns
    val rightColumns = rightPrefixed.columns.filter(!partitionCols.contains(_))

    // To perform the join, a window is slides through all the rows and merges each row with the last right values
    val asOfDF =
      rightColumns
        .foldLeft(combinedTS)((df, col) =>
          df.withColumn(col, last(df(col), ignoreNulls = true).over(windowSpec))
        )
        // Invalid candidates are those where the left values are not existing
        .filter(col(leftTS).isNotNull)
        .filter(col(rightTS).isNotNull)
        .drop(DF_INDEX_COLUMN)
        .drop(COMBINED_TS_COLUMN)

    asOfDF
  }

  /** Add all the columns and fill them with null
    *
    * @param df
    *   The dataframe we want to add the columns to
    * @param columns
    *   A sequence of columns
    * @return
    */
  private def addColumns(df: DataFrame, columns: Seq[String]) = {
    columns.foldLeft(df)(_.withColumn(_, lit(null)))
  }
}
