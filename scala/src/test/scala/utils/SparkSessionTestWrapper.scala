package io.github.ackuq
package utils

import data.SmallData

import org.apache.spark.sql.SparkSession

trait SparkSessionTestWrapper {
  val spark: SparkSession = SparkSession
    .builder()
    .master("local")
    .appName("Spark PIT Tests")
    .getOrCreate()

  val smallData = new SmallData(spark)
}
