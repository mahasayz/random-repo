package com.lunatech.interviews

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import com.lunatech.interviews.web.RestService
import spray.can.Http

/**
  * Created by malam on 12/20/16.
  */
object Boot extends App {
  implicit val system = ActorSystem("spray-app")

  val listener = system.actorOf(Props(new RestService()), "rest-service")
  IO(Http) ! Http.Bind(listener, interface = "localhost", port = 9001)

}
