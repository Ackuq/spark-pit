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

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{coalesce, col, last, lit}

object UnionAsOf {

  /** Intermediate column names
    */
  private val dfIndexCol = "df_index"
  private val combinedTSCol = "df_combined_ts"

  /** Perform a backward asof join using the left table for event times.
    *
    * @param left          The left dataframe, will be used as reference
    * @param right         The right dataframe, will be used to merge
    * @param leftTSColumn  The column used for timestamps in left DF
    * @param rightTSColumn The column used for timestamps in right DF
    * @param leftPrefix    Optional, the prefix for the left columns in result
    * @param rightPrefix   The prefix for the right columns in result
    * @param partitionCols The columns used for partitioning, if used
    * @return The PIT-correct view of the joined dataframes
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
    partitionCols.foreach { col =>
      try {
        left(col)
      } catch {
        case _: Throwable =>
          throw new IllegalArgumentException(
            s"Partition column $col does not exist on left DataFrame"
          )
      }
      try {
        right(col)
      } catch {
        case _: Throwable =>
          throw new IllegalArgumentException(
            s"Partition column $col does not exist on right DataFrame"
          )
      }

    }

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
      leftPrefixed.withColumn(dfIndexCol, lit(1)),
      rightPrefixed.columns.filter(!partitionCols.contains(_))
    )
    val rightPrefixedAllColumns =
      addColumns(
        rightPrefixed.withColumn(dfIndexCol, lit(0)),
        leftPrefixed.columns.filter(!partitionCols.contains(_))
      )

    // Combine the dataframes
    val combined = leftPrefixedAllColumns.unionByName(rightPrefixedAllColumns)

    // Get the combined TS from the dataframes, this will be used for ordering
    val combinedTS = combined.withColumn(
      combinedTSCol,
      coalesce(combined(leftTS), combined(rightTS))
    )

    val orderedCombined =
      combinedTS.orderBy(combinedTSCol, dfIndexCol)

    val windowSpec = Window
      .orderBy(combinedTSCol, dfIndexCol)
      .partitionBy(
        partitionCols.map(col): _*
      )
      // TODO: Could we bound the start value?
      .rowsBetween(Window.unboundedPreceding, Window.currentRow)

    // To perform the join, a window is slides through all the rows and merges each row with the last right values
    // TODO: Could we be able to not slide through all of the rows?
    val asOfDF =
      rightPrefixed.columns
        .foldLeft(orderedCombined)((df, col) =>
          df.withColumn(col, last(df(col), ignoreNulls = true).over(windowSpec))
        )
        // Invalid candidates are those where the left values are not existing
        .filter(col(leftTS).isNotNull)
        .drop(dfIndexCol)
        .drop(combinedTSCol)

    asOfDF
  }

  /** Prefix all the columns in a dataframe.
    *
    * @param df               A dataframe
    * @param prefix           The prefix for the column names
    * @param partitionColumns The partitions columns, these will be ignored
    * @return The prefixed version of the dataframe
    */
  private def prefixDF(
      df: DataFrame,
      prefix: String,
      partitionColumns: Seq[String]
  ) = {
    val newColumnsQuery = df.columns.map(col =>
      if (partitionColumns.contains(col)) df(col) else df(col).as(prefix ++ col)
    )
    df.select(newColumnsQuery: _*)
  }

  /** Add all the columns and fill them with null
    *
    * @param df      The dataframe we want to add the columns to
    * @param columns A sequence of columns
    * @return
    */
  private def addColumns(df: DataFrame, columns: Seq[String]) = {
    columns.foldLeft(df)(_.withColumn(_, lit(null)))
  }
}
