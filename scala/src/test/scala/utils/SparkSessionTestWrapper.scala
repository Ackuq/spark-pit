package io.github.ackuq
package utils

import org.apache.spark.sql.types.{
  IntegerType,
  StringType,
  StructField,
  StructType
}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

trait SparkSessionTestWrapper {
  val spark: SparkSession = SparkSession
    .builder()
    .master("local")
    .appName("Spark PIT Tests")
    .getOrCreate()

  import spark.implicits._

  val testDataSchema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = false),
      StructField("ts", IntegerType, nullable = false),
      StructField("value", StringType, nullable = false)
    )
  )

  val testDataRaw = Seq(
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

  val testDataPIT2GroupsSchema: StructType = StructType(
    Seq(
      StructField("id", IntegerType, nullable = true),
      StructField("fg1_ts", IntegerType, nullable = true),
      StructField("fg1_value", StringType, nullable = true),
      StructField("fg2_ts", IntegerType, nullable = true),
      StructField("fg2_value", StringType, nullable = true)
    )
  )
  val testDataPIT2GroupsRaw1 = Seq(
    Row(1, 4, "1z", 4, "1z"),
    Row(1, 5, "1x", 5, "1x"),
    Row(1, 7, "1y", 7, "1y"),
    Row(2, 6, "2x", 6, "2x"),
    Row(2, 8, "2y", 8, "2y")
  )

  val testDataPIT2Groups1: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(testDataPIT2GroupsRaw1),
    testDataPIT2GroupsSchema
  )

  val testDataPIT2GroupsRaw2 = Seq(
    Row(1, 4, "1z", 1, "f3-1-1"),
    Row(1, 5, "1x", 1, "f3-1-1"),
    Row(1, 7, "1y", 6, "f3-1-6"),
    Row(2, 6, "2x", 2, "f3-2-2"),
    Row(2, 8, "2y", 8, "f3-2-8")
  )

  val testDataPIT2Groups2: DataFrame = spark.createDataFrame(
    spark.sparkContext.parallelize(testDataPIT2GroupsRaw2),
    testDataPIT2GroupsSchema
  )

  val testData = Seq(
    spark.createDataFrame(
      spark.sparkContext.parallelize(testDataRaw.head),
      testDataSchema
    ),
    spark.createDataFrame(
      spark.sparkContext.parallelize(testDataRaw(1)),
      testDataSchema
    ),
    spark.createDataFrame(
      spark.sparkContext.parallelize(testDataRaw(2)),
      testDataSchema
    )
  )
}
