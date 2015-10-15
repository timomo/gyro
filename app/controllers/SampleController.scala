package controllers

/**
  * Created by timomo on 2015/10/15.
  */

import play.api._
import play.api.libs.iteratee.Enumerator
import play.api.mvc._
import play.api.mvc.Result

object SampleController extends Controller {
  /**
  def sample1 = Action {
    Ok(views.html.index("Sample Controller#sample1"))
  }
    */

  def sample1 = Action {
    Result(
      header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/html")),
      body = Enumerator.empty
    )
  }

  def sample2 = Action {
    Ok(views.html.index("Sample Controller#sample2"))
  }
  def say = Action { implicit request =>
    Ok(greeting("Hello"))
  }
  private def greeting(say: String)(implicit req: RequestHeader) =
    say + "," + req.remoteAddress
}
