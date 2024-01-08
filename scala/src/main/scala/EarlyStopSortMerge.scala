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

import execution.CustomStrategy
import logical.PITRule

import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.{Column, SparkSession}

object EarlyStopSortMerge {
  private final val PIT_FUNCTION = (
      _: Column,
      _: Column,
      _: Long
  ) => true
  final val PIT_UDF_NAME = "PIT"
  final val pit: UserDefinedFunction = udf(PIT_FUNCTION).withName(PIT_UDF_NAME)

  def init(spark: SparkSession): Unit = {
    if (!spark.catalog.functionExists(PIT_UDF_NAME)) {
      spark.udf.register(PIT_UDF_NAME, pit)
    }
    if (!spark.experimental.extraStrategies.contains(CustomStrategy)) {
      spark.experimental.extraStrategies =
        spark.experimental.extraStrategies :+ CustomStrategy
    }
    if (!spark.experimental.extraOptimizations.contains(PITRule)) {
      spark.experimental.extraOptimizations =
        spark.experimental.extraOptimizations :+ PITRule
    }
  }

  // For the PySpark API
  def getPit: UserDefinedFunction = pit
}
