import os
import unittest

from pyspark import SQLContext
from pyspark.sql import SparkSession
from pyspark.sql.types import StructField, StructType

from pit.context import PitContext


class SparkTests(unittest.TestCase):
    def setUp(self) -> None:
        self.jar_location = os.environ["SCALA_PIT_JAR"]
        print("Loading jar from location: {}".format(self.jar_location))
        self.spark = (
            SparkSession.builder.appName("sparkTests")
            .master("local")
            .config("spark.ui.showConsoleProgress", False)
            .config("spark.driver.extraClassPath", self.jar_location)
            .config("spark.sql.shuffle.partitions", 1)
            .getOrCreate()
        )
        self.sql_context = SQLContext(self.spark.sparkContext)
        self.pit_context = PitContext(self.sql_context)

    def tearDown(self) -> None:
        return super().tearDown()

    def _assertFieldsEqual(self, a: StructField, b: StructField):
        self.assertEqual(a.name.lower(), b.name.lower())
        self.assertEqual(a.dataType, b.dataType)

    def _assertSchemaContainsField(self, schema: StructType, field: StructField):
        self.assertTrue(field.name.lower() in schema.fieldNames())
        self._assertFieldsEqual(field, schema[field.name])

    def assertSchemaEqual(self, a: StructType, b: StructType):
        self.assertEqual(len(a), len(b))
        for field in b.fields:
            self._assertSchemaContainsField(a, field)
