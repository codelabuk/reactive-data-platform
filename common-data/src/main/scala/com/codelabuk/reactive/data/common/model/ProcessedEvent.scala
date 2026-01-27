package com.codelabuk.reactive.data.common.model

case class ProcessedEvent(eventId: String,
                          userId: String,
                          eventType: String,
                          timestamp : Long,
                         )
