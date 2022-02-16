from typing import Any, List, Optional

from py4j.java_gateway import JavaPackage
from pyspark.sql import Column, DataFrame, SQLContext
from pyspark.sql.column import _to_java_column, _to_seq  # type: ignore


class PitContext(object):
    """
    Entrypoint for all the functionality. Essentially a wrapper for the Scala functions.
    """

    def _init_early_stop_sort_merge(self) -> None:
        # Call the init function in the Scala object, will register the strategies and rules
        self._essm.init(self._sql_context.sparkSession._jsparkSession)  # type: ignore

    CLASSPATH_ERROR_MSG = "Java class {} could not be imported, check that it is included in the JVM classpaths."

    def _check_classpath(self):
        # If the classpath does not exist, then py4j will assume that the references are Java packages instead

        if self._essm is JavaPackage:
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format(
                    "io.github.ackuq.pit.EarlyStopSortMerge"
                )
            )

        if self._union is JavaPackage:
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format("io.github.ackuq.pit.UnionAsOf")
            )

        if self._exploding is JavaPackage:
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format("io.github.ackuq.pit.Exploding")
            )

    def __init__(self, sql_context: SQLContext) -> None:
        self._sql_context = sql_context
        self._sc = self._sql_context._sc  # type: ignore
        self._jsc = self._sc._jsc
        self._jvm = self._sc._jvm

        self._essm = self._jvm.io.github.ackuq.pit.EarlyStopSortMerge
        self._union = self._jvm.io.github.ackuq.pit.UnionAsOf
        self._exploding = self._jvm.io.github.ackuq.pit.Exploding
        self._check_classpath()
        self._init_early_stop_sort_merge()

    def _to_scala_seq(self, list_like: List):
        """
        Converts a list to a Scala sequence.
        """
        return (
            self._jvm.scala.collection.JavaConverters.asScalaBufferConverter(list_like)
            .asScala()
            .toSeq()
        )

    def _scala_none(self):
        return getattr(getattr(self._jvm.scala, "None$"), "MODULE$")

    def _to_scala_option(self, x: Optional[Any]):
        return self._jvm.scala.Some(x) if x is not None else self._scala_none()

    def pit_udf(self, left: Column, right: Column):
        """
        Used for executing an early stop sort merge join by using custom UDF.

        """
        _pit_udf = self._essm.getPit()  # type: ignore
        return Column(
            _pit_udf.apply(_to_seq(self._sc, [left, right], _to_java_column))  # type: ignore
        )

    def union_as_of(
        self,
        left: DataFrame,
        right: DataFrame,
        right_prefix: str,
        left_ts_column: str = "ts",
        right_ts_column: str = "ts",
        left_prefix: Optional[str] = None,
        partition_cols: List[str] = [],
    ):
        """
        Perform a backward asof join using the left table for event times.

        :param left             The left dataframe, will be used as reference
        :param right            The right dataframe, will be used to merge
        :param right_prefix     The prefix for the right columns in result
        :param left_ts_column   The column used for timestamps in left DF
        :param right_ts_column  The column used for timestamps in right DF
        :param left_prefix      Optional, the prefix for the left columns in result
        :param partition_cols   The columns used for partitioning, if used
        """

        return DataFrame(
            self._union.join(
                left._jdf,
                right._jdf,
                left_ts_column,
                right_ts_column,
                self._to_scala_option(left_prefix),
                right_prefix,
                self._to_scala_seq(partition_cols),
            ),
            self._sql_context,
        )

    def exploding(
        self,
        left: DataFrame,
        right: DataFrame,
        left_ts_column: str = "ts",
        right_ts_column: str = "ts",
        partition_cols: List[str] = [],
    ):
        """
        Perform a backward asof join using the left table for event times.

        :param left          The left dataframe, will be used as reference
        :param right         The right dataframe, will be used to merge
        :param left_ts_column  The column used for timestamps in left DF
        :param right_ts_column The column used for timestamps in right DF
        :param partition_cols The columns used for partitioning, if used
        """
        return DataFrame(
            self._exploding.join(
                left._jdf,
                right._jdf,
                left_ts_column,
                right_ts_column,
                self._to_scala_seq(partition_cols),
            ),
            self._sql_context,
        )
