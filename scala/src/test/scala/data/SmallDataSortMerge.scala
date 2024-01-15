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

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.Row
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StructType

class SmallDataSortMerge(spark: SparkSession) extends SmallData(spark) {
  val PIT_1_2_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "2y"),
    Row(2, 6, "2x", 2, 6, "2x"),
    Row(1, 7, "1y", 1, 7, "1y"),
    Row(1, 5, "1x", 1, 5, "1x"),
    Row(1, 4, "1z", 1, 4, "1z")
  )
  val PIT_1_EMPTY_RAW = Seq(
    Row(2, 8, "2y", null, null, null),
    Row(2, 6, "2x", null, null, null),
    Row(1, 7, "1y", null, null, null),
    Row(1, 5, "1x", null, null, null),
    Row(1, 4, "1z", null, null, null)
  )
  val PIT_1_3_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", 2, 2, "f3-2-2"),
    Row(1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1")
  )
  val PIT_1_3_DUPLICATES_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", 2, 2, "f3-2-2"),
    Row(2, 6, "2x", 2, 2, "f3-2-2"),
    Row(1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1")
  )
  val PIT_1_3_WITH_KEY_NULLS_RAW = Seq(
    Row(1, 7, "1y", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1")
  )
  val PIT_1_3_WITH_KEY_NULLS_OUTER_RAW = Seq(
    Row(2, 6, "2x", null, null, null),
    Row(1, 7, "1y", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1"),
    Row(1, null, "1x", null, null, null),
    Row(null, 8, "2y", null, null, null)
  )
  val PIT_3_1_RAW = Seq(
    Row(2, 8, "f3-2-8", 2, 8, "2y"),
    Row(1, 10, "f3-1-10", 1, 7, "1y"),
    Row(1, 6, "f3-1-6", 1, 5, "1x")
  )
  val PIT_3_1_WITH_VALUE_NULLS_RAW = Seq(
    Row(2, 8, null, 2, 8, "2y"),
    Row(1, 10, "f3-1-10", 1, 7, "1y"),
    Row(1, 6, "f3-1-6", 1, 5, null)
  )
  val PIT_3_1_T1_WITH_VALUE_NULLS_RAW = Seq(
    Row(2, 8, null, 2, 8, "2y"),
    Row(1, 6, "f3-1-6", 1, 5, null)
  )
  val PIT_3_1_OUTER_RAW = Seq(
    Row(2, 8, "f3-2-8", 2, 8, "2y"),
    Row(2, 2, "f3-2-2", null, null, null),
    Row(1, 10, "f3-1-10", 1, 7, "1y"),
    Row(1, 6, "f3-1-6", 1, 5, "1x"),
    Row(1, 1, "f3-1-1", null, null, null)
  )
  val PIT_3_1_T1_WITH_VALUE_NULLS_OUTER_RAW = Seq(
    Row(2, 8, null, 2, 8, "2y"),
    Row(2, 2, "f3-2-2", null, null, null),
    Row(1, 10, "f3-1-10", null, null, null),
    Row(1, 6, "f3-1-6", 1, 5, null),
    Row(1, 1, "f3-1-1", null, null, null)
  )
  val PIT_3_1_WITH_VALUE_NULLS_OUTER_RAW = Seq(
    Row(2, 8, null, 2, 8, "2y"),
    Row(2, 2, "f3-2-2", null, null, null),
    Row(1, 10, "f3-1-10", 1, 7, "1y"),
    Row(1, 6, "f3-1-6", 1, 5, null),
    Row(1, 1, "f3-1-1", null, null, null)
  )
  val PIT_1_3_T1_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(1, 7, "1y", 1, 6, "f3-1-6")
  )
  val PIT_1_3_T1_OUTER_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", null, null, null),
    Row(1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", null, null, null),
    Row(1, 4, "1z", null, null, null)
  )
  val PIT_1_2_3_RAW = Seq(
    Row(2, 8, "2y", 2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", 2, 6, "2x", 2, 2, "f3-2-2"),
    Row(1, 7, "1y", 1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", 1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 4, "1z", 1, 1, "f3-1-1")
  )
  val PIT_2_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )
  val PIT_2_NULLABLE_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = true),
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = true)
    )
  )

  val PIT_2_NULLABLE_KEYS_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = false)
    )
  )

  val PIT_2_OUTER_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = true)
    )
  )
  val PIT_2_NULLABLE_OUTER_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = true),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = true)
    )
  )

  val PIT_2_NULLABLE_KEYS_OUTER_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = true)
    )
  )

  val PIT_3_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )
  val PIT_3_OUTER_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = true),
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = true)
    )
  )
  val PIT_1_2: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_2_RAW),
    PIT_2_schema
  )
  val PIT_1_3: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_RAW),
    PIT_2_schema
  )
  val PIT_1_3_DUPLICATES: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_DUPLICATES_RAW),
    PIT_2_schema
  )

  val PIT_1_3_WITH_KEY_NULLS: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_WITH_KEY_NULLS_RAW),
    PIT_2_schema
  )

  val PIT_1_3_WITH_KEY_NULLS_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_WITH_KEY_NULLS_OUTER_RAW),
    PIT_2_NULLABLE_KEYS_OUTER_schema
  )

  val PIT_1_3_T1: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_T1_RAW),
    PIT_2_schema
  )

  val PIT_1_3_T1_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_T1_OUTER_RAW),
    PIT_2_OUTER_schema
  )

  val PIT_3_1_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_OUTER_RAW),
    PIT_2_OUTER_schema
  )

  val PIT_3_1: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_RAW),
    PIT_2_OUTER_schema
  )

  val PIT_3_1_WITH_NULLS: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_WITH_VALUE_NULLS_RAW),
    PIT_2_NULLABLE_schema
  )

  val PIT_3_1_T1_WITH_NULLS: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_T1_WITH_VALUE_NULLS_RAW),
    PIT_2_NULLABLE_schema
  )

  val PIT_3_1_WITH_NULLS_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_WITH_VALUE_NULLS_OUTER_RAW),
    PIT_2_NULLABLE_OUTER_schema
  )

  val PIT_3_1_T1_WITH_NULLS_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_3_1_T1_WITH_VALUE_NULLS_OUTER_RAW),
    PIT_2_NULLABLE_OUTER_schema
  )

  val PIT_1_2_3: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_2_3_RAW),
    PIT_3_schema
  )

  val PIT_EMPTY: DataFrame = spark.createDataFrame(
    spark.sparkContext.emptyRDD[Row],
    PIT_2_schema
  )

  val PIT_1_EMPTY_OUTER: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_EMPTY_RAW),
    PIT_2_OUTER_schema
  )
}
