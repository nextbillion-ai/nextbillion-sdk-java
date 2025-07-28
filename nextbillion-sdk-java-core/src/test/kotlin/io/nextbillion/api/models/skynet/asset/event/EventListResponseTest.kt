// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset.event

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.jsonMapper
import io.nextbillion.api.models.skynet.monitor.Pagination
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .data(
                    EventListResponse.Data.builder()
                        .addList(
                            EventListResponse.Data.List.builder()
                                .assetId("asset_id")
                                .eventType(EventListResponse.Data.List.EventType.ENTER)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .geofenceId("geofence_id")
                                .monitorId("monitor_id")
                                .addMonitorTag("string")
                                .prevLocation(
                                    EventListResponse.Data.List.PrevLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.List.PrevLocation.Location
                                                .builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .build()
                                )
                                .timestamp(0L)
                                .triggeredLocation(
                                    EventListResponse.Data.List.TriggeredLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.List.TriggeredLocation.Location
                                                .builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .build()
                                )
                                .triggeredTimestamp(0L)
                                .build()
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(eventListResponse.data())
            .contains(
                EventListResponse.Data.builder()
                    .addList(
                        EventListResponse.Data.List.builder()
                            .assetId("asset_id")
                            .eventType(EventListResponse.Data.List.EventType.ENTER)
                            .extra(JsonValue.from(mapOf<String, Any>()))
                            .geofenceId("geofence_id")
                            .monitorId("monitor_id")
                            .addMonitorTag("string")
                            .prevLocation(
                                EventListResponse.Data.List.PrevLocation.builder()
                                    .bearing(0.0)
                                    .location(
                                        EventListResponse.Data.List.PrevLocation.Location.builder()
                                            .lat(0.0)
                                            .lon(0.0)
                                            .build()
                                    )
                                    .metaData(JsonValue.from(mapOf<String, Any>()))
                                    .speed(0.0)
                                    .timestamp(0L)
                                    .build()
                            )
                            .timestamp(0L)
                            .triggeredLocation(
                                EventListResponse.Data.List.TriggeredLocation.builder()
                                    .bearing(0.0)
                                    .location(
                                        EventListResponse.Data.List.TriggeredLocation.Location
                                            .builder()
                                            .lat(0.0)
                                            .lon(0.0)
                                            .build()
                                    )
                                    .metaData(JsonValue.from(mapOf<String, Any>()))
                                    .speed(0.0)
                                    .timestamp(0L)
                                    .build()
                            )
                            .triggeredTimestamp(0L)
                            .build()
                    )
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .build()
            )
        assertThat(eventListResponse.message()).contains("message")
        assertThat(eventListResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .data(
                    EventListResponse.Data.builder()
                        .addList(
                            EventListResponse.Data.List.builder()
                                .assetId("asset_id")
                                .eventType(EventListResponse.Data.List.EventType.ENTER)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .geofenceId("geofence_id")
                                .monitorId("monitor_id")
                                .addMonitorTag("string")
                                .prevLocation(
                                    EventListResponse.Data.List.PrevLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.List.PrevLocation.Location
                                                .builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .build()
                                )
                                .timestamp(0L)
                                .triggeredLocation(
                                    EventListResponse.Data.List.TriggeredLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.List.TriggeredLocation.Location
                                                .builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .build()
                                )
                                .triggeredTimestamp(0L)
                                .build()
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }
}
