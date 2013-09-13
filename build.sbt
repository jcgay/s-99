scalaVersion := "2.10.2"

name := "s-99"

version := "1.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"
