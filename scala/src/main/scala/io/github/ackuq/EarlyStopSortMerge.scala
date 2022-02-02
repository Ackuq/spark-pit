package io.github.ackuq

import execution.CustomStrategy

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.parser.CustomCatalystSqlParser

object EarlyStopSortMerge {

  def init(conf: SparkConf): SparkSession = {
    val spark = SparkSession
      .builder()
      .config(conf)
      .withExtensions(extensions =>
        extensions.injectParser((_, _) => CustomCatalystSqlParser)
      )
      .getOrCreate()

    spark.experimental.extraStrategies = Seq(CustomStrategy)

    spark
  }
}
