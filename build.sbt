lazy val root = (project in file(".")).
  settings(
    name := "scrala-worker",
    version := "0.1",
    scalaVersion := "2.11.7",
    resolvers += "jitpack" at "https://jitpack.io",

    libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.4-M1",
    libraryDependencies += "com.codacy" %% "scala-consul" % "1.1.0",
    libraryDependencies += "com.github.gaocegege" % "scrala" % "0.1.5"
  )