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

import os
import unittest

from pyspark.sql import SparkSession
from pyspark.sql.types import StructField, StructType


class SparkTests(unittest.TestCase):
    spark: SparkSession

    @classmethod
    def setUpClass(cls) -> None:
        jar_location = os.environ["SCALA_PIT_JAR"]
        print("Loading jar from location: {}".format(jar_location))
        cls.spark = (
            SparkSession.builder.appName("sparkTests")
            .master("local")
            .config("spark.ui.showConsoleProgress", False)
            .config("spark.driver.extraClassPath", jar_location)
            .config("spark.sql.shuffle.partitions", 1)
            .config("spark.sql.extensions", "io.github.ackuq.pit.SparkPIT")
            .getOrCreate()
        )

    @classmethod
    def tearDownClass(cls) -> None:
        cls.spark.stop()

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
