import sbt._
import sbt.Keys._
import scala._

name := "interface-rural-house"

organization := "com.rural.house.lg"

version := "0.1.0"

scalaVersion := "2.11.6"

crossPaths := false

lazy val root = (project in file("."))

libraryDependencies ++= Seq(
  "io.dropwizard" % "dropwizard-core" % "0.7.1"
)

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)