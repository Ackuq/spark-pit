from tests.data import SmallDataSortMerge
from tests.utils import SparkTests


class SortMergeUnionAsOfTest(SparkTests):
    def setUp(self) -> None:
        super().setUp()
        self.small_data = SmallDataSortMerge(self.spark)

    def test_two_aligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg2

        pit_join = fg1.join(
            fg2,
            self.pit_context.pit_udf(fg1["ts"], fg2["ts"]) & (fg1["id"] == fg2["id"]),
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2.collect())

    def test_two_misaligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg3

        pit_join = fg1.join(
            fg2,
            self.pit_context.pit_udf(fg1["ts"], fg2["ts"]) & (fg1["id"] == fg2["id"]),
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_3.collect())

    def test_three_misaligned(self):
        fg1 = self.small_data.fg1
        fg2 = self.small_data.fg2
        fg3 = self.small_data.fg3

        left = fg1.join(
            fg2,
            self.pit_context.pit_udf(fg1["ts"], fg2["ts"]) & (fg1["id"] == fg2["id"]),
        )

        pit_join = left.join(
            fg3,
            self.pit_context.pit_udf(fg1["ts"], fg3["ts"]) & (fg1["id"] == fg3["id"]),
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2_3.collect())
