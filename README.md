# Spark PIT: Utility library for Point-in-Time joins in Apache Spark

This projects aims to expose different ways of executing PIT (Point-in-Time) joins, also called ASOF joins, in PySpark. This is created as a part of a research project to evaluate different ways of executing Spark PIT joins.

Apart from utilising existing high-level implementations, a couple of implementations has been made to the Spark internals, specifically the join algorithms for executing a PIT-join.

The thesis that this project laid the foundation for can be found here: http://www.diva-portal.org/smash/get/diva2:1695672/FULLTEXT01.pdf.


## Table of contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
  - [Scala (Spark)](#scala-spark)
  - [Python (PySpark)](#python-pyspark)
- [Quickstart (Python)](#quickstart-python)
  - [Early stop sort merge](#early-stop-sort-merge)
- [QuickStart (Scala)](#quickstart-scala)
  - [Early stop sort merge](#early-stop-sort-merge)
  - [Union ASOF merge](#union-asof-merge)
  - [Exploding PIT join](#exploding-pit-join)

## Prerequisites

| Dependency      | Version |
| --------------- | ------- |
| Spark & PySpark | 3.5.0   |
| Scala           | 2.12    |
| Python          | >=3.6   |

## Installation

### Scala (Spark)

The jar artifacts are published to [releases tab on GitHub](https://github.com/Ackuq/spark-pit/releases). The artifacts needs to be available in classpath of both the Spark driver as well as the executors.

For adding the jar to the Spark driver, simply set the configuration property `spark.driver.extraClassPath` to include the path to the jar-file.

To make the artifacts available for the executors, set the configuration property `spark.executor.extraClassPath` to include the path to the jar-file.

Alternatively, set the configuration property `spark.jars` to include the path to the jar-file to make it available for both the driver and executors.

Additionally set `spark.sql.extensions` to include `io.github.ackuq.pit.SparkPIT`. This config
is a comma separated string.

### Python (PySpark)

Configure Spark using the instructions as observed in [the previous section](#scala-spark).

Install the Python wrappers by running:

```
pip install spark-pit
```

## Quickstart (Python)

### Early stop sort merge

```py
from ackuq.pit.joinPIT import joinPIT

pit_join = joinPIT(spark, df1, df2, df1.ts, df2.ts, (df1.id == df2.id))
```

## Quickstart (Scala)

### Early stop sort merge

```scala
import io.github.ackuq.pit.EarlyStopSortMerge.joinPIT


val pitJoin = joinPIT(df1, df2, df1("ts"), df2("ts"), df1("id") === df2("id"), "inner", 0)
```

#### Adding tolerance

The final argument is the tolerance, when this argument is set to a non-zero value, the PIT join does not return matches where the timestamps differ by more than the specific value. E.g. setting tolerance to `3` would only accept PIT matches that differ by at most 3 time units.

#### Left outer join

The default join type for PIT joins are inner joins, but if you'd like to keep all of the values from the left table in the resulting table you may use a left outer join.

Usage:

```scala
val pitJoin = joinPIT(df1, df2, df1("ts"), df2("ts"), df1("id") === df2("id"), "left")
```
