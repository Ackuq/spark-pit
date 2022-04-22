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

import EarlyStopSortMerge.pit
import data.SmallDataSortMerge

import org.apache.spark.sql.functions.lit
import org.scalatest.flatspec.AnyFlatSpec

class EarlyStopMergeTests extends AnyFlatSpec with SparkSessionTestWrapper {
  EarlyStopSortMerge.init(spark)
  val smallData = new SmallDataSortMerge(spark)

  it should "Perform a PIT join with two dataframes, aligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg2

    val pitJoin =
      fg1.join(
        fg2,
        pit(fg1("ts"), fg2("ts"), lit(0)) && fg1("id") === fg2("id")
      )

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
      fg1.join(
        fg2,
        pit(fg1("ts"), fg2("ts"), lit(0)) && fg1("id") === fg2("id")
      )

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
      fg1.join(
        fg2,
        pit(fg1("ts"), fg2("ts"), lit(0)) && fg1("id") === fg2("id")
      )

    val pitJoin =
      left.join(
        fg3,
        pit(fg1("ts"), fg3("ts"), lit(0)) && fg1("id") === fg3("id")
      )

    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_2_3.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2_3.collect()))
  }

  it should "Be able to perform a PIT join with tolerance, misaligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg3

    val pitJoin = fg1.join(
      fg2,
      pit(fg1("ts"), fg2("ts"), lit(1)) && fg1("id") === fg2("id")
    )
    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_3_T1.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_3_T1.collect()))
  }

  it should "Be able to perform a left outer PIT join with tolerance, misaligned timestamps" in {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg3

    val pitJoin = fg1.join(
      fg2,
      pit(fg1("ts"), fg2("ts"), lit(1)) && fg1("id") === fg2("id"),
      "left"
    )
    assert(!pitJoin.isEmpty)
    // Assert same schema
    assert(pitJoin.schema.equals(smallData.PIT_1_3_T1_OUTER.schema))
    // Assert same elements
    assert(pitJoin.collect().sameElements(smallData.PIT_1_3_T1_OUTER.collect()))
  }
}
