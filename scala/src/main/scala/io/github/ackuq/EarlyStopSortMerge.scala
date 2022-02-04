package io.github.ackuq

import execution.CustomStrategy
import logical.PITRule

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.{Column, SparkSession}

object EarlyStopSortMerge {

  final val PIT_UDF_NAME = "PIT"
  final val PIT_FUNCTION = (_: Column, _: Column) => true
  final val pit: UserDefinedFunction = udf(PIT_FUNCTION).withName(PIT_UDF_NAME)


  def init(spark: SparkSession): Unit = {
    spark.udf.register(PIT_UDF_NAME, pit)
    spark.experimental.extraStrategies = Seq(CustomStrategy)
    spark.experimental.extraOptimizations = Seq(PITRule)
  }
}
