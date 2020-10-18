scalaVersion := "2.12.8"

lazy val root = project
  .in(file("."))
  .settings(name := "scala-steward-test-project")
  .aggregate(scalatest_v3_0_x, scalatest_v3_1_x, project1)

val circeVersion = "0.11.2"
lazy val project1 = project
  .in(file("projects/project1"))
  .settings(
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser"
    ).map(_ % circeVersion),
    libraryDependencies ++= Seq(
      "io.monix" %%% "minitest" % "2.8.2" % "test",
      "org.codehaus.groovy" % "groovy-all" % "2.4.17",
      "org.scalaz" %% "scalaz-core" % "7.3.2"
    )
  )

lazy val scalatest_v3_0_x = project
  .in(file("projects/scalatest_v_3_0_x"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.9" % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.0" % Test
    )
  )

lazy val scalatest_v3_1_x = project
  .in(file("projects/scalatest_v_3_1_x"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.4" % Test
    )
  )
