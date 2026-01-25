package com.codelabuk.reactive.data.platform.model

case class UserEvent(evemtId: String,
                     userId: String,
                     eventType: String,
                     timestamp: Long,
                     productId: Option[String] = None,
                     amount: Option[Double] = None)
