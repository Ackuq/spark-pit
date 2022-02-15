from pyspark import SQLContext
from pyspark.sql.types import StructType, StructField
from pyspark.sql import SparkSession
import unittest
from pit.context import PitContext
import os

# SCALA_PIT_JAR='/Users/axel/Projects/spark-pit/scala/target/scala-2.12/spark-pit_2.12-0.1.0.jar' python -m unittest discover -s tests


class SparkTests(unittest.TestCase):
    def setUp(self) -> None:
        self.jar_location = os.environ["SCALA_PIT_JAR"]
        self.spark = (
            SparkSession.builder.appName("sparkTests")
            .master("local")
            .config("spark.driver.extraClassPath", self.jar_location)
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
