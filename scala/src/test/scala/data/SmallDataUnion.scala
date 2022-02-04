package io.github.ackuq
package data

import org.apache.spark.sql.types.{
  IntegerType,
  StringType,
  StructField,
  StructType
}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

class SmallDataUnion(spark: SparkSession) extends SmallData(spark) {
  private val PIT_1_2_RAW = Seq(
    Row(1, 4, "1z", 4, "1z"),
    Row(1, 5, "1x", 5, "1x"),
    Row(1, 7, "1y", 7, "1y"),
    Row(2, 6, "2x", 6, "2x"),
    Row(2, 8, "2y", 8, "2y")
  )
  private val PIT_1_3_RAW = Seq(
    Row(1, 4, "1z", 1, "f3-1-1"),
    Row(1, 5, "1x", 1, "f3-1-1"),
    Row(1, 7, "1y", 6, "f3-1-6"),
    Row(2, 6, "2x", 2, "f3-2-2"),
    Row(2, 8, "2y", 8, "f3-2-8")
  )
  private val PIT_1_2_3_RAW = Seq(
    Row(1, 4, "1z", 4, "1z", 1, "f3-1-1"),
    Row(1, 5, "1x", 5, "1x", 1, "f3-1-1"),
    Row(1, 7, "1y", 7, "1y", 6, "f3-1-6"),
    Row(2, 6, "2x", 6, "2x", 2, "f3-2-2"),
    Row(2, 8, "2y", 8, "2y", 8, "f3-2-8")
  )
  private val PIT_2_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("fg1_ts", IntegerType, nullable = true),
      StructField("fg1_value", StringType, nullable = true),
      StructField("fg2_ts", IntegerType, nullable = true),
      StructField("fg2_value", StringType, nullable = true)
    )
  )
  private val PIT_3_schema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("fg1_ts", IntegerType, nullable = true),
      StructField("fg1_value", StringType, nullable = true),
      StructField("fg2_ts", IntegerType, nullable = true),
      StructField("fg2_value", StringType, nullable = true),
      StructField("fg3_ts", IntegerType, nullable = true),
      StructField("fg3_value", StringType, nullable = true)
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
