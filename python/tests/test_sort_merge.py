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

from ackuq.pit.joinPIT import joinPIT
from tests.data import SmallDataSortMerge
from tests.utils import SparkTests


class SortMergeUnionAsOfTest(SparkTests):
    @classmethod
    def setUpClass(cls) -> None:
        super().setUpClass()
        cls.small_data = SmallDataSortMerge(cls.spark)

    def test_two_aligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg2

        pit_join = joinPIT(
            self.spark, fg1, fg2, fg1["ts"], fg2["ts"], (fg1["id"] == fg2["id"])
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2.collect())

    def test_two_misaligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg3

        pit_join = joinPIT(
            self.spark, fg1, fg2, fg1["ts"], fg2["ts"], (fg1["id"] == fg2["id"])
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_3.collect())

    def test_three_misaligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg2
        fg3 = self.small_data.fg3

        left = joinPIT(
            self.spark,
            fg1,
            fg2,
            fg1["ts"],
            fg2["ts"],
            (fg1["id"] == fg2["id"]),
        )

        pit_join = joinPIT(
            self.spark, left, fg3, fg1["ts"], fg3["ts"], (fg1["id"] == fg3["id"])
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2_3.collect())

    def test_two_tolerance(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg3

        pit_join = joinPIT(
            self.spark,
            fg1,
            fg2,
            fg1["ts"],
            fg2["ts"],
            (fg1["id"] == fg2["id"]),
            tolerance=1,
        )
        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_3_T1.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_3_T1.collect())

    def test_two_tolerance_outer(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg3

        pit_join = joinPIT(
            self.spark,
            fg1,
            fg2,
            fg1["ts"],
            fg2["ts"],
            (fg1["id"] == fg2["id"]),
            "left",
            1,
        )
        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_3_T1_OUTER.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_3_T1_OUTER.collect())
