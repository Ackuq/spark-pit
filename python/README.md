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

##### 2.1.2. Adding tolerance

In this implementation, tolerance can be added to not allow matches whose timestamp differ by at most some value. To utilize this, set the third argument of the UDF to the desired integer value of the maximum different between two timestamps.

```py
pit_join = df1.join(df2,  pit_context.pit_udf(df1.ts, df2.ts, 100) & (df1.id == df2.id))
```

##### 2.1.3. Left outer join

Left outer joins are supported in this implementation, the main difference between a regular inner join and a left outer join is that whether or not a left row gets matched with a right row, it will still be a part of the resulting table. In the resulting table, all the left rows that did not find a match have the values of the right columns set to `null`.

```py
pit_join = df1.join(
    df2,
    pit_context.pit_udf(df1.ts, df2.ts, 100) & (df1.id == df2.id),
    "left"
)
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

## Development

### Testing

To run the tests for this package, you must first package the Scala package to a JAR file and export its path as an environment variable:

```bash
export SCALA_PIT_JAR=<PATH_TO_JAR_FILE>
```

To run all the tests, run the following command in the Python directory:

```bash
python -m unittest discover -s tests
```
