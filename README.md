# Spark PIT: Utility library for Point-in-Time joins in Apache Spark

This projects aims to expose different ways of executing PIT (Point-in-Time) joins, also called ASOF joins, in PySpark. This is created as a part of a research project to evaluate different ways of executing Spark PIT joins.

Apart from utilising existing high-level implementations, a couple of implementations has been made to the Spark internals, specifically the join algorithms for executing a PIT-join.

The thesis that this project laid the foundation for can be found here: http://www.diva-portal.org/smash/get/diva2:1695672/FULLTEXT01.pdf.

# This project is not being actively developed or maintained. If you wish to continue development on this project, feel free to make a fork!

## Table of contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
  - [Scala (Spark)](#scala-spark)
  - [Python (PySpark)](#python-pyspark)
- [Quickstart (Python)](#quickstart-python)
  1. [Creating the context](#1-creating-the-context)
  2. [Performing a PIT join](#2-performing-a-pit-join)
     1. [Early stop sort merge](#21-early-stop-sort-merge)
     2. [Union merge](#22-union-merge)
     3. [Exploding PIT join](#23-exploding-pit-join)
- [QuickStart (Scala)](#quickstart-scala)
  - [Early stop sort merge](#early-stop-sort-merge)
  - [Union ASOF merge](#union-asof-merge)
  - [Exploding PIT join](#exploding-pit-join)

## Prerequisites

| Dependency      | Version |
| --------------- | ------- |
| Spark & PySpark | 3.2     |
| Scala           | 2.12    |
| Python          | >=3.6   |

## Installation

### Scala (Spark)

The jar artifacts are published to [releases tab on GitHub](https://github.com/Ackuq/spark-pit/releases). The artifacts needs to be available in classpath of both the Spark driver as well as the executors.

For adding the jar to the Spark driver, simply set the configuration property `spark.driver.extraClassPath` to include the path to the jar-file.

To make the artifacts available for the executors, set the configuration property `spark.executor.extraClassPath` to include the path to the jar-file.

Alternatively, set the configuration property `spark.jars` to include the path to the jar-file to make it available for both the driver and executors.

### Python (PySpark)

Configure Spark using the instructions as observed in [the previous section](#scala-spark).

Install the Python wrappers by running:

```
pip install spark-pit
```

## Quickstart (Python)

### 1. Creating the context

The object `PitContext` is the entrypoint for all of the functionality of the lirary. You can initialize this context with the following code:

```py
from ackuq.pit import PitContext

spark = <your spark session>
pit_context = PitContext(spark)
```

### 2. Performing a PIT join

There are currently 3 ways of executing a PIT join, using an early stop sort merge, union merge algorithm, or with exploding intermediate tables.

#### 2.1. Early stop sort merge

```py
pit_join = df1.join(df2,  pit_context.pit_udf(df1.ts, df2.ts) & (df1.id == df2.id))
```

#### 2.2. Union merge

```py
pit_join = pit_context.union(
        left=df1,
        right=df2,
        left_prefix="df1_",
        right_prefix="df2_",
        left_ts_column = "ts",
        right_ts_column = "ts",
        partition_cols=["id"],
)
```

#### 2.3. Exploding PIT join

```py
pit_join = pit_context.exploding(
    left=df1,
    right=df2,
    left_ts_column=df1["ts"],
    right_ts_column=df2["ts"],
    partition_cols = [df1["id"], df2["id"]],
)
```

## Quickstart (Scala)

Instead of using a context, which is done in the Python implementation, all of the functionality is divided into objects.

### Early stop sort merge

```scala
import io.github.ackuq.pit.EarlyStopSortMerge.{pit, init}
import org.apache.spark.sql.functions.lit

// Pass the spark session, this will register the required stratergies and optimizer rules.
init(spark)

val pitJoin = df1.join(df2, pit(df1("ts"), df2("ts"), lit(0)) && df1("id") === df2("id"))
```

#### Adding tolerance

The UDF takes a third argument (required) for tolerance, when this argument is set to a non-null value, the PIT join does not return matches where the timestamp differ by a specific value. E.g. setting the third argument to `lit(3)` would only accept PIT matches that differ by at most 3 time units.

#### Left outer join

The default join type for PIT joins are inner joins, but if you'd like to keep all of the values from the left table in the resulting table you may use a left outer join.

Usage:

```scala
val pitJoin = df1.join(
  df2, pit(df1("ts"), df2("ts"), lit(0)) && df1("id") === df2("id"),
  "left"
)
```

### Union merge

```scala
import io.github.ackuq.pit.Union

val pitJoin = Union.join(
    df1,
    df2,
    leftPrefix = Some("df1_"),
    rightPrefix = "df2_",
    partitionCols = Seq("id")
)
```

### Exploding PIT join

```scala
import io.github.ackuq.pit.Exploding

val pitJoin = Exploding.join(
    df1,
    df2,
    leftTSColumn = df1("ts"),
    rightTSColumn = df2("ts"),
    partitionCols = Seq((df1("id"), df2("id")))
)
```
