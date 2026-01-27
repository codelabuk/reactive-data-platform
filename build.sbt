

name := "reactive-data-platform"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.18"
ThisBuild / organization := "com.codelabuk.reactive"

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xlint"
  ),
  resolvers += "Akka Library repository".at("https://repo.akka.io/maven"),
//  assembly / assemblyMergeStrategy := {
//    case PathList("META-INF", xs @ _*) => xs match {
//      case "MANIFEST.MF" :: Nil => MergeStrategy.discard
//      case "module-info.class" :: Nil => MergeStrategy.discard  // ← FIX for your error
//      case _ => MergeStrategy.discard
//    }
//    case "application.conf" => MergeStrategy.concat
//    case "reference.conf" => MergeStrategy.concat
//    case PathList("module-info.class") => MergeStrategy.discard  // ← Also this
//    case x if x.endsWith(".proto") => MergeStrategy.first
//    case x if x.endsWith(".class") => MergeStrategy.first
//    case _ => MergeStrategy.first
//  }
)

val akkaVersion = "2.6.20" // Last Apache 2.0 version
val akkaHttpVersion = "10.2.10"
val alpakkaKafkaVersion = "3.0.1" // Compatible with Akka 2.6
val sparkVersion = "3.5.0"
val hadoopVersion = "3.3.4"
val arrowVersion = "14.0.1"
val sprayJsonVersion = "1.3.6"
val logbackVersion = "1.4.11"
val postgresVersion = "42.6.0"


lazy val root = (project in file("."))
  .aggregate(common, dataGenerator)
  .settings(
    commonSettings,
    name := "reactive-data-platform",
    publish / skip := true
  )


lazy val common = (project in file("common-data"))
  .settings(
    commonSettings,
    name := "common-data",
    libraryDependencies ++= Seq(
      "io.spray" %% "spray-json" % sprayJsonVersion,
      "ch.qos.logback" % "logback-classic" % logbackVersion,
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
    )
  )


lazy val dataGenerator = (project in file("data-generator"))
  .settings(
    commonSettings,
    name := "data-generator",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion  //,
     // "com.typesafe.akka" %% "akka-stream-kafka" % alpakkaKafkaVersion
    )
  )