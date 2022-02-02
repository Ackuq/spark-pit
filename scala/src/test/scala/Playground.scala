package io.github.ackuq

import utils.SparkSessionTestWrapper

import io.github.ackuq.data.SmallData
import org.apache.spark.SparkConf
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{col, desc, rank}

object Playground {
  def main(args: Array[String]) = {
    val conf: SparkConf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Spark PIT Tests")
    val spark = EarlyStopSortMerge.init(conf)
    spark.sparkContext.setLogLevel("WARN")

    val smallData = new SmallData(spark)

    val fg1 = smallData.fg1
    val fg2 = smallData.fg3

    val joinedData = fg1
      .join(fg2, fg1("ts") >= fg2("ts") && fg1("id") === fg2("id"), "pit")

    //    fg1.createOrReplaceTempView("fg1")
    //    fg2.createOrReplaceTempView("fg2")
    //
    //    val query = "SELECT * FROM fg1 PIT JOIN fg2 ASOF fg1.ts >= fg2.ts"
    //
    //    val joinedData =
    //      spark.sql(query)

    // println(joinedData.queryExecution.sparkPlan)

    joinedData.show()
  }

}
