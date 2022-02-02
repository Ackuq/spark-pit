package io.github.ackuq

import data.SmallDataSortMerge

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.scalatest.flatspec.AnyFlatSpec

class EarlyStopMergeTests extends AnyFlatSpec {
  val conf: SparkConf = new SparkConf()
  conf.setMaster("local")
  conf.setAppName("Spark PIT Tests")
  val spark: SparkSession = EarlyStopSortMerge.init(conf)
  val smallData = new SmallDataSortMerge(spark)

  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg2

    val pitJoin =
      fg1.join(fg2, fg1("id") === fg2("id") && fg1("ts") >= fg2("ts"), "pit")

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2.collect()))
  }

  it should "Perform a PIT join with two dataframes, misaligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg3

    val pitJoin =
      fg1.join(fg2, fg1("id") === fg2("id") && fg1("ts") >= fg2("ts"), "pit")

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_3.collect()))
  }

  it should "Perform a PIT join with three dataframes, misaligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg2
    val fg3 = smallData.fg3

    val left =
      fg1.join(fg2, fg1("id") === fg2("id") && fg1("ts") >= fg2("ts"), "pit")

    val pitJoin =
      left.join(fg3, fg1("id") === fg3("id") && fg1("ts") >= fg3("ts"), "pit")

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2_3.collect()))
  }
}
