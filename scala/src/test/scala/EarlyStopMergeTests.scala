package io.github.ackuq.pit

import EarlyStopSortMerge.pit
import data.SmallDataSortMerge
import utils.SparkSessionTestWrapper

import org.scalatest.flatspec.AnyFlatSpec

class EarlyStopMergeTests extends AnyFlatSpec with SparkSessionTestWrapper {
  EarlyStopSortMerge.init(spark)
  val smallData = new SmallDataSortMerge(spark)

  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg2

    val pitJoin =
      fg1.join(fg2, pit(fg1("ts"), fg2("ts")) && fg1("id") === fg2("id"))

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
      fg1.join(fg2, pit(fg1("ts"), fg2("ts")) && fg1("id") === fg2("id"))

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
      fg1.join(fg2, pit(fg1("ts"), fg2("ts")) && fg1("id") === fg2("id"))

    val pitJoin =
      left.join(
        fg3,
        pit(fg1("ts"), fg3("ts")) && fg1("id") === fg3("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2_3.collect()))
  }
}
