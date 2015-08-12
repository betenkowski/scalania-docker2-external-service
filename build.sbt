name := "external-api-service"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val sprayVersion = "1.3.3"
  val akkaVersion = "2.3.9"
  Seq(
    "io.spray" %% "spray-can" % sprayVersion,
    "io.spray" %% "spray-routing" % sprayVersion,
    "io.spray" %% "spray-json" % "1.3.2",
    "io.spray" %% "spray-client" % sprayVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "com.typesafe" % "config" % "1.3.0",
    "mysql" % "mysql-connector-java" % "5.1.36",
    "org.scalaj" %% "scalaj-http" % "1.1.4"
  )
}

Revolver.settings.settings

flywaySettings

flywayUrl := "jdbc:mysql://localhost:13306"
flywaySchemas := Seq("external")
flywayUser := "root"
flywayPassword := "foobar"
flywayLocations := Seq("filesystem:migrations")