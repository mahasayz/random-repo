package com.lunatech.interviews.web

import spray.caching.{Cache, LruCache}

trait Caching {
  import spray.routing.directives.CachingDirectives._
  
  val responseCache: Cache[RouteResponse] = LruCache(maxCapacity = 1000)
}