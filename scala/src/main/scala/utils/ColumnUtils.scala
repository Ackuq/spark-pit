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
package utils

import org.apache.spark.sql.DataFrame

private[pit] object ColumnUtils {
  def assertColumnsInDF(columns: Seq[String], dataFrames: DataFrame*): Unit = {
    columns.foreach { column =>
      {
        dataFrames.foreach(df => {
          try {
            df(column)
          } catch {
            case _: Throwable =>
              throw new IllegalArgumentException(
                s"Partition column $column does not exist in DataFrame"
              )
          }
        })
      }
    }
  }

  /** Prefix all the columns in a dataframe.
    *
    * @param df               A dataframe
    * @param prefix           The prefix for the column names
    * @param ignoreColumns    Columns that are not prefixed
    * @return The prefixed version of the dataframe
    */
  def prefixDF(
      df: DataFrame,
      prefix: String,
      ignoreColumns: Seq[String]
  ): DataFrame = {
    val newColumnsQuery = df.columns.map(col =>
      if (ignoreColumns.contains(col)) df(col) else df(col).as(prefix ++ col)
    )
    df.select(newColumnsQuery: _*)
  }
}