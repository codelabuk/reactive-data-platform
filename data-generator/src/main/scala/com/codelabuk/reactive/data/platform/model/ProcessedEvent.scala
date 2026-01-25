package com.codelabuk.reactive.data.platform.model

case class ProcessedEvent(eventId: String,
                          userId: String,
                          eventType: String,
                          timestamp : Long,
                         )
