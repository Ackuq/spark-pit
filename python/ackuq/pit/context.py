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

from typing import Any, List, Optional, Tuple

from py4j.java_gateway import JavaPackage
from pyspark.sql import Column, DataFrame, SQLContext
from pyspark.sql.column import _to_java_column, _to_seq  # type: ignore
from pyspark.sql.functions import lit


class PitContext(object):
    """
    Entrypoint for all the functionality.
    Essentially a wrapper for the Scala functions.
    """

    def _init_early_stop_sort_merge(self) -> None:
        # Call the init function in the Scala object,
        # will register the strategies and rules
        self._essm.init(self._sql_context.sparkSession._jsparkSession)  # type: ignore

    CLASSPATH_ERROR_MSG = (
        "Java class {} could not be imported, check that it is included in the JVM"
        " classpaths."
    )

    def _check_classpath(self):
        # If the classpath does not exist py4j will assume
        # that the references are Java packages instead

        if isinstance(self._essm, JavaPackage):
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format(
                    "io.github.ackuq.pit.EarlyStopSortMerge"
                )
            )

        if isinstance(self._union, JavaPackage):
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format("io.github.ackuq.pit.Union")
            )

        if isinstance(self._exploding, JavaPackage):
            raise ImportError(
                self.CLASSPATH_ERROR_MSG.format("io.github.ackuq.pit.Exploding")
            )

    def __init__(self, sql_context: SQLContext) -> None:
        self._sql_context = sql_context
        self._sc = self._sql_context._sc  # type: ignore
        self._jsc = self._sc._jsc
        self._jvm = self._sc._jvm

        self._essm = self._jvm.io.github.ackuq.pit.EarlyStopSortMerge
        self._union = self._jvm.io.github.ackuq.pit.Union
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

    def _to_scala_tuple(self, tuple: Tuple):
        """
        Converts a Python tuple to Scala tuple
        """
        return self._jvm.__getattr__("scala.Tuple" + str(len(tuple)))(*tuple)

    def _scala_none(self):
        return self._jvm.scala.__getattr__("None$").__getattr__("MODULE$")

    def _to_scala_option(self, x: Optional[Any]):
        return self._jvm.scala.Some(x) if x is not None else self._scala_none()

    def pit_udf(self, left: Column, right: Column, tolerance: int = 0):
        """
        Used for executing an early stop sort merge join by using custom UDF.

        :param left         The timestamp column of left table
        :param right        The timestamp column of right table
        :param tolerance    Optional, The tolerance of the PIT result
        """
        _pit_udf = self._essm.getPit()
        return Column(
            _pit_udf.apply(
                _to_seq(
                    self._sc,
                    [left, right, lit(tolerance)],
                    _to_java_column,
                )
            )
        )

    def union(
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
        left_ts_column: Column,
        right_ts_column: Column,
        partition_cols: List[Tuple[Column, Column]] = [],
    ):
        """
        Perform a backward asof join using the left table for event times.

        :param left             The left dataframe, will be used as reference
        :param right            The right dataframe, will be used to merge
        :param left_ts_column   The column used for timestamps in left DF
        :param right_ts_column  The column used for timestamps in right DF
        :param partition_cols   The columns used for partitioning, if used
        """
        _partition_cols = map(
            lambda p: self._to_scala_tuple((p[0]._jc, p[1]._jc)), partition_cols
        )
        return DataFrame(
            self._exploding.join(
                left._jdf,
                right._jdf,
                left_ts_column._jc,  # type: ignore
                right_ts_column._jc,  # type: ignore
                self._to_scala_seq(list(_partition_cols)),
            ),
            self._sql_context,
        )
