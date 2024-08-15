lazy val root = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
  .settings(
    name := "cart-ticket-reservation",
    version := "1.0",
    crossScalaVersions := Seq("2.13.12", "3.3.1"),
    scalaVersion := crossScalaVersions.value.head,
    libraryDependencies ++= Seq(
      guice,
      jdbc,
      javaJdbc,
      "com.h2database" % "h2" % "2.2.224",
      "mysql" % "mysql-connector-java" % "8.0.32",

      "org.mindrot" % "jbcrypt" % "0.4",
      "com.auth0" % "java-jwt" % "4.4.0",
      "org.playframework" %% "play-mailer" % "10.0.0",
      "org.playframework" %% "play-mailer-guice" % "10.0.0",

      "org.awaitility" % "awaitility" % "3.1.6" % Test,
      "org.assertj" % "assertj-core" % "3.12.2" % Test,
      "org.mockito" % "mockito-core" % "5.6.0" % Test,
    ),
    (Test / testOptions) += Tests.Argument(TestFrameworks.JUnit, "-a", "-v"),
    javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation", "-Werror")
  )
