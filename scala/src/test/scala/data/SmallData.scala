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

class SmallData(spark: SparkSession) {
  val RAW_1 = Seq(
    Row(1, 4, "1z"),
    Row(1, 5, "1x"),
    Row(2, 6, "2x"),
    Row(1, 7, "1y"),
    Row(2, 8, "2y")
  )
  val RAW_1_DUPLICTES = Seq(
    Row(1, 4, "1z"),
    Row(1, 4, "1z"),
    Row(1, 5, "1x"),
    Row(1, 5, "1x"),
    Row(2, 6, "2x"),
    Row(2, 6, "2x"),
    Row(1, 7, "1y"),
    Row(1, 7, "1y"),
    Row(2, 8, "2y"),
    Row(2, 8, "2y")
  )
  val RAW_1_WITH_VALUE_NULLS = Seq(
    Row(1, 4, "1z"),
    Row(1, 5, null),
    Row(2, 6, "2x"),
    Row(1, 7, "1y"),
    Row(2, 8, "2y")
  )
  val RAW_1_WITH_KEY_NULLS = Seq(
    Row(1, 4, "1z"),
    Row(1, null, "1x"),
    Row(2, 6, "2x"),
    Row(1, 7, "1y"),
    Row(null, 8, "2y")
  )
  val RAW_3 = Seq(
    Row(1, 1, "f3-1-1"),
    Row(2, 2, "f3-2-2"),
    Row(1, 6, "f3-1-6"),
    Row(2, 8, "f3-2-8"),
    Row(1, 10, "f3-1-10")
  )
  val RAW_3_DUPLICATES = Seq(
    Row(1, 1, "f3-1-1"),
    Row(1, 1, "f3-1-1"),
    Row(2, 2, "f3-2-2"),
    Row(2, 2, "f3-2-2"),
    Row(1, 6, "f3-1-6"),
    Row(1, 6, "f3-1-6"),
    Row(2, 8, "f3-2-8"),
    Row(2, 8, "f3-2-8"),
    Row(1, 10, "f3-1-10"),
    Row(1, 10, "f3-1-10")
  )
  val RAW_3_WITH_VALUE_NULLS = Seq(
    Row(1, 1, "f3-1-1"),
    Row(2, 2, "f3-2-2"),
    Row(1, 6, "f3-1-6"),
    Row(2, 8, null),
    Row(1, 10, "f3-1-10")
  )
  val RAW_3_WITH_KEY_NULLS = Seq(
    Row(1, 1, "f3-1-1"),
    Row(2, null, "f3-2-2"),
    Row(null, 6, "f3-1-6"),
    Row(2, 8, "f3-2-8"),
    Row(1, 10, "f3-1-10")
  )
  val schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )
  val schema_value_nullable: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = true)
    )
  )

  val schema_keys_nullable: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("ts", IntegerType, nullable = true),
      StructField("value", StringType, nullable = false)
    )
  )

  val fg1: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(RAW_1), schema)
  val fg1_duplicates: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(RAW_1_DUPLICTES), schema)
  val fg1_with_value_nulls: DataFrame =
    spark.createDataFrame(
      spark.sparkContext.parallelize(RAW_1_WITH_VALUE_NULLS),
      schema_value_nullable
    )
  val fg1_with_key_nulls: DataFrame =
    spark.createDataFrame(
      spark.sparkContext.parallelize(RAW_1_WITH_KEY_NULLS),
      schema_keys_nullable
    )
  val fg2: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(RAW_1), schema)
  val fg3: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(RAW_3), schema)
  val fg3_duplicates: DataFrame =
    spark.createDataFrame(spark.sparkContext.parallelize(RAW_3_DUPLICATES), schema)
  val fg3_with_value_nulls: DataFrame =
    spark.createDataFrame(
      spark.sparkContext.parallelize(RAW_3_WITH_VALUE_NULLS),
      schema_value_nullable
    )
  val fg3_with_key_nulls: DataFrame =
    spark.createDataFrame(
      spark.sparkContext.parallelize(RAW_3_WITH_KEY_NULLS),
      schema_keys_nullable
    )

  val empty: DataFrame =
    spark.createDataFrame(spark.sparkContext.emptyRDD[Row], schema)

  val empty2: DataFrame =
    spark.createDataFrame(spark.sparkContext.emptyRDD[Row], schema)
}
