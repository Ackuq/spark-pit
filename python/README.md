# Spark-PIT - Utility library for PIT-joins in PySpark

## Description

This projects aims to expose different ways of executing PIT-joins, also called ASOF-joins, in PySpark. This project is created as a part of a research project to evaluate different ways of executing Spark PIT joins.

## Prerequisite

In order to run this project in PySpark, you will need to have the JAR file of the Scala implementation be available inside you Spark Session.

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
