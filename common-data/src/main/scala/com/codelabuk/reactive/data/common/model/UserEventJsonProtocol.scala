package com.codelabuk.reactive.data.common.model

import spray.json.DefaultJsonProtocol

object UserEventJsonProtocol extends DefaultJsonProtocol {
  implicit val userEventFormat = jsonFormat6(UserEvent)
}
