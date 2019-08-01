scalaVersion := "2.12.8"

lazy val root = project
  .in(file("."))
  .settings(name := "scala-steward-test-project")
  .aggregate(scalatest_v3_0_x, scalatest_v3_1_x)

lazy val scalatest_v3_0_x = project
  .in(file("projects/scalatest_v_3_0_x"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.8" % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.0"  % Test
    )
  )

lazy val scalatest_v3_1_x = project
  .in(file("projects/scalatest_v_3_0x"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.0-SNAP12" % Test
    )
  )
