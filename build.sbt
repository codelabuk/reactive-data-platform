ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.18"

lazy val dataGenerator = project
  .in(file("data-generator"))

lazy val root = (project in file("."))
  .aggregate(dataGenerator)
  .dependsOn(dataGenerator)
  .settings(
    name := "reactive-data-platform"
  )
