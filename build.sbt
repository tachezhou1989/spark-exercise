lazy val commonSettings = Seq(
  organization := "tachezhou.exercise.sparkExercise",
  version := "0.1.0",
  scalaVersion := "2.11.7",
  libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.4.1",
  "org.apache.spark" %% "spark-mllib" % "1.4.1")
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(name := "spark-exercise").aggregate(scalaBasic,sparkBasic)

lazy val scalaBasic = (project in file("scala-basic")).
  settings(commonSettings: _*).
  settings(name := "scala-basic")

lazy val sparkBasic = (project in file("spark-basic")).
  settings(commonSettings: _*).
  settings(name := "scala-basic")