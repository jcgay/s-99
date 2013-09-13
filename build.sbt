scalaVersion := "2.10.2"

name := "s-99"

version := "1.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
	"junit" % "junit" % "4.11" % "test",
	"com.novocode" % "junit-interface" % "0.10" % "test",
	"org.scalatest" % "scalatest_2.10" % "2.0.M7" % "test"
)
