// set the name of the project
name := "Neural Network"

version := "1.0"

// set the Scala version used for the project
scalaVersion := "2.10.2"

// set the main Scala source directory to be <base>/src
scalaSource in Compile := baseDirectory.value / "src/main"

// set the Scala test source directory to be <base>/test
scalaSource in Test := baseDirectory.value / "src/test"

// add a test dependency on ScalaCheck
libraryDependencies += "org.scalatra" %% "scalatra-specs2" % "2.2.2" % "test"

// reduce the maximum number of errors shown by the Scala compiler
maxErrors := 20

// increase the time between polling for file changes when using continuous execution
pollInterval := 1000

// append several options to the list of options passed to the Java compiler
javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"

