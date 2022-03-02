/*
 * MIT License
 *
 * Copyright (c) 2022 Axel Pettersson
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.ackuq.pit

import data.SmallDataUnion

import org.scalatest.flatspec.AnyFlatSpec

class Union extends AnyFlatSpec with SparkSessionTestWrapper {
  val smallData = new SmallDataUnion(spark)

  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val pitJoin =
      Union.join(
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
      Union.join(
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
      Union.join(
        smallData.fg1,
        smallData.fg2,
        leftPrefix = Some("fg1_"),
        rightPrefix = "fg2_",
        partitionCols = Seq("id")
      )

    val pitJoin = Union.join(
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
