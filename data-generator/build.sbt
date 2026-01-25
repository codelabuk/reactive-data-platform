lazy val dataGenerator = (project in file("."))
  .settings(
    name := "data-generator",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "2.6.20",
      "com.typesafe.akka" %% "akka-stream" % "2.6.20",
      "com.typesafe.akka" %% "akka-stream-kafka" % "2.1.1",
      "io.spray" %% "spray-json" % "1.3.6",
      "ch.qos.logback" % "logback-classic" % "1.4.11"
    )
  )
