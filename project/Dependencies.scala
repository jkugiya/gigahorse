import sbt._

object Dependencies {
  val scala210 = "2.10.7"
  val scala211 = "2.11.12"
  val scala212 = "2.12.4"
  val slf4jApi = "org.slf4j" % "slf4j-api" % "1.7.25"
  val scalaBoth = Seq(scala211, scala212)
  val ahc = "org.asynchttpclient" % "async-http-client" % "2.0.33"
  val scalatest = "org.scalatest" %% "scalatest" % "3.0.3"
  val sslConfig = "com.typesafe" %% "ssl-config-core" % "0.2.2"
  val reactiveStreams = "org.reactivestreams" % "reactive-streams" % "1.0.0"
  val akkaVersion = "2.5.11"
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaTypedInTest = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion % Test
  val akkaHttpVersion = "10.1.0"
  val akkaHttpCore = "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
  val sbtIo = "org.scala-sbt" %% "io" % "1.0.3"
  val okHttp = "com.squareup.okhttp3" % "okhttp" % "3.8.1"
  val unfilteredVersion = "0.9.1"
  val ufDirectives = "ws.unfiltered" %% "unfiltered-directives" % unfilteredVersion
  val ufFilter = "ws.unfiltered" %% "unfiltered-filter" % unfilteredVersion
  val ufScalatest = "ws.unfiltered" %% "unfiltered-scalatest" % unfilteredVersion
  val ufWebsockets = "ws.unfiltered" %% "unfiltered-netty-websockets" % unfilteredVersion
}
