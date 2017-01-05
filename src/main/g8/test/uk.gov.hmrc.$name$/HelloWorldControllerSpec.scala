
package $mainPackage$$name$.controllers

import play.api.http.Status
import play.api.test.FakeRequest
import play.api.test.Helpers._
import play.api.http._
import play.api.test.FakeRequest
import play.api.test.Helpers._
import $mainPackage$play.test.UnitSpec
import $mainPackage$play.test.{WithFakeApplication, UnitSpec}


class HelloWorldControllerSpec extends UnitSpec with WithFakeApplication{

  val fakeRequest = FakeRequest("GET", "/")


  "GET /" should {
    "return 200" in {
      val result = HelloWorld.helloWorld(fakeRequest)
      status(result) shouldBe Status.OK
    }

    "return HTML" in {
      val result = HelloWorld.helloWorld(fakeRequest)
      contentType(result) shouldBe Some("text/html")
      charset(result) shouldBe Some("utf-8")
    }


  }


}
