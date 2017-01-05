package $mainPackage$$name$.controllers

import $mainPackage$play.frontend.controller.FrontendController
import play.api.mvc._
import scala.concurrent.Future
import play.api.Play.current
import play.api.i18n.Messages.Implicits._


object HelloWorld extends HelloWorld

trait HelloWorld extends FrontendController {
  val helloWorld = Action.async { implicit request =>
		Future.successful(Ok($mainPackage$$name$.views.html.helloworld.hello_world()))
  }
}
