import scala.io

name := "pyspark-cassandra"

version := io.Source.fromFile("version.txt").mkString

organization := "TargetHolding"

scalaVersion := "2.11.7"

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

libraryDependencies ++= Seq(
	"com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0"
)

spName := "TargetHolding/pyspark-cassandra"

sparkVersion := "1.6.0"

sparkComponents += "streaming"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

assemblyOption in assembly := (assemblyOption in assembly).value.copy(
	includeScala = false
)

EclipseKeys.withSource := true
