val versionNumberFile = "VERSION"
val versionNumber = IO.readLines(new File(versionNumberFile))

ThisBuild / version := versionNumber.head

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "spark-pit",
    idePackagePrefix := Some("io.github.ackuq.pit")
  )

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided",
  "org.scalactic" %% "scalactic" % "3.2.12",
  "org.scalatest" %% "scalatest" % "3.2.12" % "test"
)
