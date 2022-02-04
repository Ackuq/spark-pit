package io.github.ackuq
package data

import org.apache.spark.sql.types.{
  IntegerType,
  StringType,
  StructField,
  StructType
}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

class SmallDataSortMerge(spark: SparkSession) extends SmallData(spark) {

  private val PIT_1_2_RAW = Seq(
    Row(1, 7, "1y", 1, 7, "1y"),
    Row(1, 5, "1x", 1, 5, "1x"),
    Row(1, 4, "1z", 1, 4, "1z"),
    Row(2, 8, "2y", 2, 8, "2y"),
    Row(2, 6, "2x", 2, 6, "2x")
  )
  private val PIT_1_3_RAW = Seq(
    Row(1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 1, "f3-1-1"),
    Row(2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", 2, 2, "f3-2-2")
  )
  private val PIT_1_2_3_RAW = Seq(
    Row(1, 7, "1y", 1, 7, "1y", 1, 6, "f3-1-6"),
    Row(1, 5, "1x", 1, 5, "1x", 1, 1, "f3-1-1"),
    Row(1, 4, "1z", 1, 4, "1z", 1, 1, "f3-1-1"),
    Row(2, 8, "2y", 2, 8, "2y", 2, 8, "f3-2-8"),
    Row(2, 6, "2x", 2, 6, "2x", 2, 2, "f3-2-2")
  )
  private val PIT_2_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false),
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )
  private val PIT_3_schema: StructType = StructType(
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
  val PIT_1_2: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_2_RAW),
    PIT_2_schema
  )
  val PIT_1_3: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_3_RAW),
    PIT_2_schema
  )
  val PIT_1_2_3: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(PIT_1_2_3_RAW),
    PIT_3_schema
  )
}
