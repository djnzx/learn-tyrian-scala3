import org.scalajs.linker.interface.ModuleKind
import sbt.Keys.scalaVersion
import scala.collection.Seq

Global / onChangedBuildSource := ReloadOnSourceChanges

ThisBuild / scalaVersion := "3.8.3"

lazy val tyrian = (project in file("tyrian"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scala-tyrian",
    version := "0.0.1",
    scalacOptions ++= Seq(),
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    libraryDependencies ++= Seq(
      "io.indigoengine" %%% "tyrian-io" % "0.14.0",
    )
  )
