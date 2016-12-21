package com.lunatech.interviews.web

import com.lunatech.interviews.service.OperationService
import spray.routing.HttpServiceActor
import akka.actor.ActorLogging
import spray.routing._

/**
  * Created by malam on 12/20/16.
  */
class RestService
  extends HttpServiceActor
  with ActorLogging
  with RestApiRoutes {

  override val operationService = new OperationService()

  def receive = runRoute {
    routes
  }

}


trait RestApiRoutes extends OperationServiceRoutes {
  this: HttpService =>

  val routes = pathPrefix("api" / "v1") {
    operationServiceRoutes
  }
}

trait OperationServiceRoutes extends Caching {
  this: HttpService =>

  val operationService: OperationService

  import spray.httpx.SprayJsonSupport._
  import RecordJsonFormatter._

  def getQuery(country: String) = get {
    complete {
      operationService.getQuery(country)
    }
  }

  def getReports = get {
    complete {
      operationService.fetchReports
    }
  }

  val operationServiceRoutes = pathPrefix("operations") {
    pathEndOrSingleSlash {
      parameters('query) { country =>
        pathEnd {
          getQuery(country)
        }
      }
    } ~ path("reports") {
      pathEnd {
        getReports
      }
    }
  }
}
