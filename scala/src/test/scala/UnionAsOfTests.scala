package io.github.ackuq

import utils.SparkSessionTestWrapper

import org.scalatest.flatspec.AnyFlatSpec

class UnionAsOfTests extends AnyFlatSpec with SparkSessionTestWrapper {

  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val left = testData.head
    val right = testData(1)
    val pitJoin =
      UnionAsOf.join(
        left,
        right,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(testDataPIT2Groups1.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(testDataPIT2Groups1.collect()))
  }

  it should "Perform a PIT join with two dataframes, misaligned timestamps" in {
    val left = testData.head
    val right = testData(2)
    val pitJoin =
      UnionAsOf.join(
        left,
        right,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(testDataPIT2Groups2.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(testDataPIT2Groups2.collect()))
  }
}
