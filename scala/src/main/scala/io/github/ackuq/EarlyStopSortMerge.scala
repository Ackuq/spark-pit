package io.github.ackuq

import execution.CustomStrategy
import logical.PITRule

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.{Column, SparkSession}

object EarlyStopSortMerge {

  val PIT_UDF_NAME = "PIT"

  private val pitFunction = (_: Column, _: Column) => true

  val pit: UserDefinedFunction = udf(pitFunction).withName(PIT_UDF_NAME)

  def init(spark: SparkSession): Unit = {
    spark.udf.register(PIT_UDF_NAME, pit)
    spark.experimental.extraStrategies = Seq(CustomStrategy)
    spark.experimental.extraOptimizations = Seq(PITRule)
  }
}
