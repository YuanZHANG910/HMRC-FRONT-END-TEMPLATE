package $mainPackage$$name$

import $mainPackage$play.audit.http.config.LoadAuditingConfig
import $mainPackage$play.audit.http.connector.{AuditConnector => Auditing}
import $mainPackage$play.config.{AppName, RunMode, ServicesConfig}
import $mainPackage$play.frontend.auth.connectors.AuthConnector
import $mainPackage$play.http.ws.{WSDelete, WSGet, WSPost, WSPut}

object FrontendAuditConnector extends Auditing with AppName {
  override lazy val auditingConfig = LoadAuditingConfig(s"auditing")
}

object WSHttp extends WSGet with WSPut with WSPost with WSDelete with AppName with RunMode {
  override val hooks = NoneRequired
}

object FrontendAuthConnector extends AuthConnector with ServicesConfig {
  val serviceUrl = baseUrl("auth")
  lazy val http = WSHttp
}
