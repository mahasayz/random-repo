package com.lunatech.interviews.web

import com.lunatech.interviews.model.Record
import spray.json.DefaultJsonProtocol

/**
  * Created by malam on 12/20/16.
  */
object RecordJsonFormatter extends DefaultJsonProtocol {

  implicit def recordFormat = jsonFormat1(Record.apply)

}
