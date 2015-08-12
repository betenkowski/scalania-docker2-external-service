logLevel := Level.Warn

resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Flyway" at "http://flywaydb.org/repo"

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")