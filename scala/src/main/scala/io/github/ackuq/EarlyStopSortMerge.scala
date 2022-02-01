package io.github.ackuq

import org.apache.spark.SparkConf
import org.apache.spark.sql.{SparkSession, Strategy}
import org.apache.spark.sql.catalyst.parser.CustomCatalystSqlParser
import io.github.ackuq.execution.CustomStrategy
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
