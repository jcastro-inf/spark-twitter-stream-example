name := """spark-twitter-stream-example"""

version := "1.0.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "2.1.0",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.1.0",
  "org.twitter4j" % "twitter4j-core" % "4.0.4"
)
