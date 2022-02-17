#
# MIT License
#
# Copyright (c) 2022 Axel Pettersson
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#

from pyspark.sql import SparkSession
from pyspark.sql.types import IntegerType, StringType, StructField, StructType


class SmallData:
    fg1_raw = [
        [1, 4, "1z"],
        [1, 5, "1x"],
        [2, 6, "2x"],
        [1, 7, "1y"],
        [2, 8, "2y"],
    ]

    fg2_raw = [
        [1, 4, "1z"],
        [1, 5, "1x"],
        [2, 6, "2x"],
        [1, 7, "1y"],
        [2, 8, "2y"],
    ]

    fg3_raw = [
        [1, 1, "f3-1-1"],
        [2, 2, "f3-2-2"],
        [1, 6, "f3-1-6"],
        [2, 8, "f3-2-8"],
        [1, 10, "f3-1-10"],
    ]

    schema = StructType(
        [
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
        ]
    )

    def __init__(self, spark: SparkSession) -> None:
        self.fg1 = spark.createDataFrame(self.fg1_raw, self.schema)
        self.fg2 = spark.createDataFrame(self.fg2_raw, self.schema)
        self.fg3 = spark.createDataFrame(self.fg3_raw, self.schema)


class SmallDataSortMerge(SmallData):

    PIT_1_2_RAW = [
        [2, 8, "2y", 2, 8, "2y"],
        [2, 6, "2x", 2, 6, "2x"],
        [1, 7, "1y", 1, 7, "1y"],
        [1, 5, "1x", 1, 5, "1x"],
        [1, 4, "1z", 1, 4, "1z"],
    ]
    PIT_1_3_RAW = [
        [2, 8, "2y", 2, 8, "f3-2-8"],
        [2, 6, "2x", 2, 2, "f3-2-2"],
        [1, 7, "1y", 1, 6, "f3-1-6"],
        [1, 5, "1x", 1, 1, "f3-1-1"],
        [1, 4, "1z", 1, 1, "f3-1-1"],
    ]
    PIT_1_2_3_RAW = [
        [2, 8, "2y", 2, 8, "2y", 2, 8, "f3-2-8"],
        [2, 6, "2x", 2, 6, "2x", 2, 2, "f3-2-2"],
        [1, 7, "1y", 1, 7, "1y", 1, 6, "f3-1-6"],
        [1, 5, "1x", 1, 5, "1x", 1, 1, "f3-1-1"],
        [1, 4, "1z", 1, 4, "1z", 1, 1, "f3-1-1"],
    ]

    PIT_2_schema: StructType = StructType(
        [
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
        ]
    )
    PIT_3_schema: StructType = StructType(
        [
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
            StructField("id", IntegerType(), nullable=False),
            StructField("ts", IntegerType(), nullable=False),
            StructField("value", StringType(), nullable=False),
        ]
    )

    def __init__(self, spark: SparkSession) -> None:
        super().__init__(spark)
        self.PIT_1_2 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_2_RAW), self.PIT_2_schema
        )
        self.PIT_1_3 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_3_RAW), self.PIT_2_schema
        )
        self.PIT_1_2_3 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_2_3_RAW), self.PIT_3_schema
        )


class SmallDataUnion(SmallData):

    PIT_1_2_RAW = [
        [1, 4, "1z", 4, "1z"],
        [1, 5, "1x", 5, "1x"],
        [1, 7, "1y", 7, "1y"],
        [2, 6, "2x", 6, "2x"],
        [2, 8, "2y", 8, "2y"],
    ]
    PIT_1_3_RAW = [
        [1, 4, "1z", 1, "f3-1-1"],
        [1, 5, "1x", 1, "f3-1-1"],
        [1, 7, "1y", 6, "f3-1-6"],
        [2, 6, "2x", 2, "f3-2-2"],
        [2, 8, "2y", 8, "f3-2-8"],
    ]
    PIT_1_2_3_RAW = [
        [1, 4, "1z", 4, "1z", 1, "f3-1-1"],
        [1, 5, "1x", 5, "1x", 1, "f3-1-1"],
        [1, 7, "1y", 7, "1y", 6, "f3-1-6"],
        [2, 6, "2x", 6, "2x", 2, "f3-2-2"],
        [2, 8, "2y", 8, "2y", 8, "f3-2-8"],
    ]

    PIT_2_schema: StructType = StructType(
        [
            StructField("id", IntegerType(), nullable=False),
            StructField("fg1_ts", IntegerType(), nullable=False),
            StructField("fg1_value", StringType(), nullable=False),
            StructField("fg2_ts", IntegerType(), nullable=False),
            StructField("fg2_value", StringType(), nullable=False),
        ]
    )
    PIT_3_schema: StructType = StructType(
        [
            StructField("id", IntegerType(), nullable=False),
            StructField("fg1_ts", IntegerType(), nullable=False),
            StructField("fg1_value", StringType(), nullable=False),
            StructField("fg2_ts", IntegerType(), nullable=False),
            StructField("fg2_value", StringType(), nullable=False),
            StructField("fg3_ts", IntegerType(), nullable=False),
            StructField("fg3_value", StringType(), nullable=False),
        ]
    )

    def __init__(self, spark: SparkSession) -> None:
        super().__init__(spark)
        self.PIT_1_2 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_2_RAW), self.PIT_2_schema
        )
        self.PIT_1_3 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_3_RAW), self.PIT_2_schema
        )
        self.PIT_1_2_3 = spark.createDataFrame(
            spark.sparkContext.parallelize(self.PIT_1_2_3_RAW), self.PIT_3_schema
        )
