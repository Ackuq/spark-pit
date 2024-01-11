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

import org.apache.spark.sql.catalyst.expressions.CodegenObjectFactoryMode
import org.apache.spark.sql.functions.lit
import org.apache.spark.sql.types.StructType
import org.scalatest.flatspec.AnyFlatSpec
import org.apache.spark.sql.DataFrame
import EarlyStopSortMerge.pit
import data.SmallDataSortMerge

class EarlyStopMergeTests extends AnyFlatSpec with SparkSessionTestWrapper {
  EarlyStopSortMerge.init(spark)
  val smallData = new SmallDataSortMerge(spark)

  def testBothCodegenAndInterpreted(name: String)(f: => Unit): Unit = {
    it should (s"codegen__$name") in {
      spark.conf.set("spark.sql.codegen.wholeStage", "true")
      spark.conf.set("spark.sql.codegen.factoryMode", "CODEGEN_ONLY")
      f
    }

    it should (s"interpreted__$name") in {
      spark.conf.set("spark.sql.codegen.wholeStage", "false")
      spark.conf.set("spark.sql.codegen.factoryMode", "NO_CODEGEN")
      f
    }
  }

  def testSearchingBackwardForMatches(
      joinType: String,
      leftDataFrame: DataFrame,
      rightDataFrame: DataFrame,
      expectedDataFrame: DataFrame,
      expectedSchema: StructType,
      tolerance: Int
  ): Unit = {

    val pitJoin =
      leftDataFrame.join(
        rightDataFrame,
        pit(
          leftDataFrame("ts"),
          rightDataFrame("ts"),
          lit(tolerance)
        ) && leftDataFrame("id") === rightDataFrame("id"),
        joinType
      )

    assert(pitJoin.schema.equals(expectedSchema))
    assert(pitJoin.collect().sameElements(expectedDataFrame.collect()))
  }

  testBothCodegenAndInterpreted(
    "inner_join_with_aligned_timestamps_no_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.fg2,
      smallData.PIT_1_2,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_with_aligned_timestamps_no_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg1,
      smallData.fg2,
      smallData.PIT_1_2,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_with_aligned_timestamps_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.fg2,
      smallData.PIT_1_2,
      smallData.PIT_2_schema,
      1
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_with_aligned_timestamps_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg1,
      smallData.fg2,
      smallData.PIT_1_2,
      smallData.PIT_2_OUTER_schema,
      1
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_searching_backward_for_matches_no_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.fg3,
      smallData.PIT_1_3,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_searching_backward_for_matches_no_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg1,
      smallData.fg3,
      smallData.PIT_1_3,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_searching_backward_for_matches_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.fg3,
      smallData.PIT_1_3_T1,
      smallData.PIT_2_schema,
      1
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_searching_backward_for_matches_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg1,
      smallData.fg3,
      smallData.PIT_1_3_T1_OUTER,
      smallData.PIT_2_OUTER_schema,
      1
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_some_rows_have_no_backwards_match"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg3,
      smallData.fg1,
      smallData.PIT_3_1,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_some_rows_have_no_backwards_match"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg3,
      smallData.fg1,
      smallData.PIT_3_1_OUTER,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_right_dataframe_is_empty"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.empty,
      smallData.PIT_EMPTY,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_right_dataframe_is_empty"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg1,
      smallData.empty,
      smallData.PIT_1_EMPTY_OUTER,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_left_dataframe_is_empty"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg1,
      smallData.empty,
      smallData.PIT_EMPTY,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_left_dataframe_is_empty"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.empty,
      smallData.fg1,
      smallData.PIT_EMPTY,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_both_dataframes_are_empty"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.empty,
      smallData.empty2, // Don't want to test self join
      smallData.PIT_EMPTY,
      smallData.PIT_2_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_both_dataframes_are_empty"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.empty,
      smallData.empty2, // Don't want to test self join
      smallData.PIT_EMPTY,
      smallData.PIT_2_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_preserves_input_nulls"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg3_with_nulls,
      smallData.fg1_with_nulls,
      smallData.PIT_3_1_WITH_NULLS,
      smallData.PIT_2_NULLABLE_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_preserves_input_nulls"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg3_with_nulls,
      smallData.fg1_with_nulls,
      smallData.PIT_3_1_WITH_NULLS_OUTER,
      smallData.PIT_2_NULLABLE_OUTER_schema,
      0
    )
  }

  testBothCodegenAndInterpreted(
    "inner_join_preserves_input_nulls_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "inner",
      smallData.fg3_with_nulls,
      smallData.fg1_with_nulls,
      smallData.PIT_3_1_T1_WITH_NULLS,
      smallData.PIT_2_NULLABLE_schema,
      1
    )
  }

  testBothCodegenAndInterpreted(
    "left_join_preserves_input_nulls_with_tolerance"
  ) {
    testSearchingBackwardForMatches(
      "left",
      smallData.fg3_with_nulls,
      smallData.fg1_with_nulls,
      smallData.PIT_3_1_T1_WITH_NULLS_OUTER,
      smallData.PIT_2_NULLABLE_OUTER_schema,
      1
    )
  }

  def testJoiningThreeDataframes(
      joinType: String,
      expectedSchema: StructType
  ): Unit = {
    val fg1 = smallData.fg1
    val fg2 = smallData.fg2
    val fg3 = smallData.fg3

    val left =
      fg1.join(
        fg2,
        pit(fg1("ts"), fg2("ts"), lit(0)) && fg1("id") === fg2("id"),
        joinType
      )

    val pitJoin =
      left.join(
        fg3,
        pit(fg1("ts"), fg3("ts"), lit(0)) && fg1("id") === fg3("id"),
        joinType
      )

    assert(pitJoin.schema.equals(expectedSchema))
    assert(pitJoin.collect().sameElements(smallData.PIT_1_2_3.collect()))
  }

  testBothCodegenAndInterpreted("inner_join_three_dataframes") {
    testJoiningThreeDataframes("inner", smallData.PIT_3_schema)
  }
  testBothCodegenAndInterpreted("left_join_three_dataframes") {
    testJoiningThreeDataframes("left", smallData.PIT_3_OUTER_schema)
  }
}
