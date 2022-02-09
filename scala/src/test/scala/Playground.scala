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
import data.SmallData

import org.apache.spark.sql.SparkSession

object Playground {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession
      .builder()
      .master("local")
      .appName("Spark PIT Tests")
      // .config("spark.sql.adaptive.enabled", true)
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

    //joinedData.explain()
    joinedData.queryExecution.debug.codegen()
    spark.time(joinedData.show())

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
