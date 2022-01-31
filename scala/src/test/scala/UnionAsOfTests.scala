package io.github.ackuq

import utils.SparkSessionTestWrapper

import org.scalatest.flatspec.AnyFlatSpec

class UnionAsOfTests extends AnyFlatSpec with SparkSessionTestWrapper {
  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val pitJoin =
      UnionAsOf.join(
        smallData.fg1,
        smallData.fg2,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2.collect()))
  }

  it should "Perform a PIT join with two dataframes, misaligned timestamps" in {
    val pitJoin =
      UnionAsOf.join(
        smallData.fg1,
        smallData.fg3,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_3.collect()))
  }

  it should "Perform a PIT join with three dataframes, misaligned timestamps" in {
    val left =
      UnionAsOf.join(
        smallData.fg1,
        smallData.fg2,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    val pitJoin = UnionAsOf.join(
      left,
      smallData.fg3,
      leftTSColumn = "fg1_ts",
      rightPrefix = "fg3_",
      partitionCols = Seq("id")
    )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2_3.collect()))
  }
}
