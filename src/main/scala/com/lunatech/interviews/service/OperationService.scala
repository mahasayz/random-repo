package com.lunatech.interviews.service

import com.lunatech.interviews.model.Record

/**
  * Created by malam on 12/20/16.
  */
class OperationService {

  def getQuery(country: String): Record = {
    val record = Record()
    record.copy(country :: record.list)
  }
  def fetchReports: Record = Record()

}
