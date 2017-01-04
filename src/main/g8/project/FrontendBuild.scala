
import sbt._
import play.sbt.PlayImport._
import play.core.PlayVersion
import uk.gov.hmrc.SbtAutoBuildPlugin
import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin
import uk.gov.hmrc.versioning.SbtGitVersioning

object FrontendBuild extends Build with MicroService {

  val appName = "$name$"

  override lazy val appDependencies: Seq[ModuleID] = compile ++ test()

  val compile = Seq(
    ws,
    "com.typesafe.play" %% "play" % PlayVersion.current,
    "uk.gov.hmrc" %% "frontend-bootstrap" % "6.7.0",
    "uk.gov.hmrc" %% "play-partials" % "4.6.0",
    "uk.gov.hmrc" %% "play-authorised-frontend" % "5.7.0",
    "uk.gov.hmrc" %% "play-config" % "2.1.0",
    "uk.gov.hmrc" %% "logback-json-logger" % "2.1.1",
    "uk.gov.hmrc" %% "govuk-template" % "4.0.0",
    "uk.gov.hmrc" %% "play-ui" % "4.17.2"
  )

  def test(scope: String = "test") = Seq(
    "uk.gov.hmrc" %% "hmrctest" % "1.8.0" % scope,
    "org.scalatest" %% "scalatest" % "2.2.6" % scope,
    "org.pegdown" % "pegdown" % "1.6.0" % scope,
    "org.jsoup" % "jsoup" % "1.8.1" % scope,
    "com.typesafe.play" %% "play-test" % PlayVersion.current % scope
  )

}
