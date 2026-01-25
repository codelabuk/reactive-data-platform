package com.codelabuk.reactive.data.platform.model

import spray.json.DefaultJsonProtocol

object UserEventJsonProtocol extends DefaultJsonProtocol {
  implicit val userEventFormat = jsonFormat6(UserEvent)
}
