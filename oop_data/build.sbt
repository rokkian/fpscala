val scala3Version = "3.3.0";


lazy val root = project
  .in(file("."))
  .settings(
    name := "oop_data",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.32",  // adjust version if needed
      "ch.qos.logback" % "logback-classic" % "1.2.6"  // adjust version if needed
    ),
    libraryDependencies ++= Seq(
      "org.apache.logging.log4j" % "log4j-api" % "2.17.1", // adjust version if needed
      "org.apache.logging.log4j" % "log4j-core" % "2.17.1", // adjust version if needed
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.17.1" // SLF4J binding for Log4j2
    )
  )
