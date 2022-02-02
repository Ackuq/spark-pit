package io.github.ackuq
package utils

import org.apache.spark.sql.SparkSession

trait SparkSessionTestWrapper {
  val spark: SparkSession = SparkSession
    .builder()
    .master("local")
    .appName("Spark PIT Tests")
    .getOrCreate()

}
