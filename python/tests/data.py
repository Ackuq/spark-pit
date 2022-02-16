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
