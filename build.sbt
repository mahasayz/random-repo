
name := "random-repo"

version := "1.0-SNAPSHOT"

organization := "com.lunatech.interviews"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val AKKA_VERSION = "2.3.9"
  val SPRAY_VERSION = "1.3.3"
  val LOGBACK_VERSION = "1.1.3"
  
  Seq(
    "org.slf4j" % "slf4j-api" % "1.7.7",
    "ch.qos.logback" % "logback-core" % LOGBACK_VERSION,
    "ch.qos.logback" % "logback-classic" % LOGBACK_VERSION,
    "io.spray" %% "spray-can" % SPRAY_VERSION,
    "io.spray" %% "spray-routing-shapeless2" % SPRAY_VERSION,
    "io.spray" %% "spray-caching" % SPRAY_VERSION,
    "io.spray" %% "spray-client" % SPRAY_VERSION,
    "io.spray" %% "spray-json" % "1.3.1",
    "com.typesafe.akka" %% "akka-actor" % AKKA_VERSION,
    "com.typesafe.akka" %% "akka-slf4j" % AKKA_VERSION,
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "com.chuusai" %% "shapeless" % "2.3.2",
    "io.spray" %% "spray-testkit" % SPRAY_VERSION  % "test",
    "org.scalatest" %% "scalatest" % "2.2.5" % "test",
    "org.specs2" %% "specs2" % "2.3.11" % "test"
  )
}