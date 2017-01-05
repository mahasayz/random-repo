package com.lunatech.interviews.model

/**
  * Created by malam on 12/20/16.
  */

case class Record(list: List[String] = List("Bangladesh"))

case class Airport(id: Option[Long],
                   ident: String,
                   `type`: String,
                   name: String,
                   latitudeDeg: Option[Double],
                   longitudeDeg: Option[Double],
                   elevationFt: Option[Int],
                   continent: Option[String],
                   isoCountry: Option[String],
                   isoRegion: Option[String],
                   municipality: Option[String],
                   scheduledService: Option[String],
                   gpsCode: Option[String],
                   iataCode: Option[String],
                   localCode: Option[String],
                   homeLink: Option[String],
                   wikipediaLink: Option[String],
                   keywords: Option[String])

case class Runway(id: Option[Long],
                  airportRef: Int,
                  airportIdent: String,
                  lengthFt: Int,
                  widthFt: Int,
                  surface: String,
                  lighted: Boolean,
                  closed: Boolean,
                  leIdent: Option[String],
                  leLatitudeDeg: Option[Double],
                  leLongitudeDeg: Option[Double],
                  leElevationFt: Option[Int],
                  leHeadingDegT: Option[Double],
                  leDisplacedThresholdFt: Option[Int],
                  heIdent: Option[String],
                  heLatitudeDeg: Option[Double],
                  heLongitudeDeg: Option[Double],
                  heElevationFt: Option[Int],
                  heHeadingDegT: Option[Double],
                  heDisplacedThresholdFt: Option[Int])

case class Country(id: Int,
                   code: String,
                   name: String,
                   continent: String,
                   wikipediaLink: String,
                   keywords: String)