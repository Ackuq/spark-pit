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
package data

import org.apache.spark.sql.types.{
  IntegerType,
  StringType,
  StructField,
  StructType
}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

class SmallData(spark: SparkSession) {
  private val DATA_RAW = Seq(
    Seq(
      Row(1, 4, "1z"),
      Row(1, 5, "1x"),
      Row(2, 6, "2x"),
      Row(1, 7, "1y"),
      Row(2, 8, "2y")
    ),
    Seq(
      Row(1, 4, "1z"),
      Row(1, 5, "1x"),
      Row(2, 6, "2x"),
      Row(1, 7, "1y"),
      Row(2, 8, "2y")
    ),
    Seq(
      Row(1, 1, "f3-1-1"),
      Row(2, 2, "f3-2-2"),
      Row(1, 6, "f3-1-6"),
      Row(2, 8, "f3-2-8"),
      Row(1, 10, "f3-1-10")
    )
  )
  private val schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )

  val fg1: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(DATA_RAW.head), schema)
  val fg2: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(DATA_RAW(1)), schema)
  val fg3: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(DATA_RAW(2)), schema)
}
