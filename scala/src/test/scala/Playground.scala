package io.github.ackuq

import EarlyStopSortMerge.pit
import data.SmallData

import org.apache.spark.sql.SparkSession

object Playground {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession
      .builder()
      .master("local")
      .appName("Spark PIT Tests")
      .config("spark.sql.adaptive.enabled", true)
      .getOrCreate()

    EarlyStopSortMerge.init(spark)
    spark.sparkContext.setLogLevel("WARN")

    val smallData = new SmallData(spark)

    val fg1 = smallData.fg1
    val fg2 = smallData.fg3

    val joinedData = fg1
      .join(
        fg2,
        fg1("id") === fg2("id") && pit(fg1("ts"), fg2("ts"))
      )

    joinedData.explain()
    spark.time(joinedData.show())
    spark.time(UnionAsOf.join(fg1, fg2, rightPrefix = "fg2"))

//    val sortMerge = fg1.hint("MERGE").join(fg2, fg1("id") === fg2("id"))
//    sortMerge.explain()
//    sortMerge.show
    //    fg1.createOrReplaceTempView("fg1")
    //    fg2.createOrReplaceTempView("fg2")
    //
    //    val query =
    //      "SELECT * FROM fg1 JOIN fg2 ON PIT(fg1.ts, fg2.ts) AND fg1.id = fg2.id"
    //
    //    val joinedDataSQL =
    //      spark.sql(query)
    //
    //    println(joinedDataSQL.queryExecution.sparkPlan)
    //    joinedDataSQL.explain()
    //    joinedDataSQL.show()
  }

}
