lazy val Benchmark = config("bench") extend Test

lazy val x = (project in file("."))
  .settings(
    name := "project-euler-math-lib",
    organization := "com.thyndman",
    version := "0.0.2-SNAPSHOT",
    scalaVersion := "2.12.7",
    scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint"),
    publishArtifact := false,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.2" % "test",
      
      "com.storm-enroute" %% "scalameter" % "0.18" % "bench"
    ),
    resolvers ++= Seq(
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
    ),
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
    parallelExecution in Benchmark := false,
    scalaSource in Benchmark := baseDirectory.value / "src/bench/scala",
    logBuffered := false
  )
  .configs(Benchmark)
  .settings(inConfig(Benchmark)(Defaults.testSettings): _*)
