import sbt._
import sbt.Keys._
import scala._

name := "interface-rural-house"

organization := "com.rural.house.lg"

version := "0.1.0"

scalaVersion := "2.11.6"

lazy val root = (project in file("."))

libraryDependencies ++= Seq(
  "org.codehaus.jettison" % "jettison" % "1.1"
)