from tests.data import SmallDataUnion
from tests.utils import SparkTests


class UnionAsOfTest(SparkTests):
    def setUp(self) -> None:
        super().setUp()
        self.small_data = SmallDataUnion(self.spark)

    def test_two_aligned(self):
        pit_join = self.pit_context.union_as_of(
            self.small_data.fg1,
            self.small_data.fg2,
            left_prefix="fg1_",
            right_prefix="fg2_",
            partition_cols=["id"],
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2.collect())

    def test_two_misaligned(self):
        pit_join = self.pit_context.union_as_of(
            self.small_data.fg1,
            self.small_data.fg3,
            left_prefix="fg1_",
            right_prefix="fg2_",
            partition_cols=["id"],
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_3.collect())

    def test_three_misaligned(self):
        left = self.pit_context.union_as_of(
            self.small_data.fg1,
            self.small_data.fg2,
            left_prefix="fg1_",
            right_prefix="fg2_",
            partition_cols=["id"],
        )

        pit_join = self.pit_context.union_as_of(
            left,
            self.small_data.fg3,
            left_ts_column="fg1_ts",
            right_prefix="fg3_",
            partition_cols=["id"],
        )

        self.assertSchemaEqual(pit_join.schema, self.small_data.PIT_1_2_3.schema)
        self.assertEqual(pit_join.collect(), self.small_data.PIT_1_2_3.collect())
