ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "akka-iot-project",
    version := "1.0",

    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "2.8.8",
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.8.8" % Test,
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
    )
  )