scalaVersion := "2.12.8"

lazy val root = project
  .in(file("."))
  .settings(name := "scala-steward-test-project")
  .aggregate(scalatest_v3_0_x, scalatest_v3_1_x, project1)

val circeVersion = "0.11.1"
lazy val project1 = project
  .in(file("projects/project1"))
  .settings(
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.10"),
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser"
    ).map(_ % circeVersion)
  )

lazy val scalatest_v3_0_x = project
  .in(file("projects/scalatest_v_3_0_x"))
  .settings(
    addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.8" % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.0" % Test
    )
  )

lazy val scalatest_v3_1_x = project
  .in(file("projects/scalatest_v_3_1_x"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.0-SNAP12" % Test
    )
  )
