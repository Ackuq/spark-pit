# Spark-PIT - Utility library for PIT-joins in PySpark

## Description

This projects aims to expose different ways of executing PIT-joins, also called ASOF-joins, in PySpark. This project is created as a part of a research project to evaluate different ways of executing Spark PIT joins.

## Prerequisite

In order to run this project in PySpark, you will need to have the JAR file of the Scala implementation be available inside you Spark Session.

## Quickstart

### 1. Creating the context

The object `PitContext` is the entrypoint for all of the functionality of the lirary. You can initialize this context with the following code:

```py
from pyspark import SQLContext
from ackuq.pit import PitContext

sql_context = SQLContext(spark.sparkContext)
pit_context = PitContext(sql_context)
```

### 2. Performing a PIT join

There are currently 3 ways of executing a PIT join, using an early stop sort merge, union asof algorithm, or with exploding intermediate tables.

#### 2.1. Early stop sort merge

```py
pit_join = df1.join(df2,  pit_context.pit_udf(df1.ts, df2.ts) & (df1.id == df2.id))
```

#### 2.2. Union ASOF merge

```py
pit_join = pit_context.union_as_of(
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
