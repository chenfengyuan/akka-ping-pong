name := """minimal-akka-scala-seed"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.11" withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-testkit" % "2.3.11" % "test" withSources() withJavadoc(),
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc())
