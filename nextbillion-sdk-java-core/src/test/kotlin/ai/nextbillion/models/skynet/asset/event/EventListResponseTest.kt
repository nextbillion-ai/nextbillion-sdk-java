// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset.event

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.monitor.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .data(
                    EventListResponse.Data.builder()
                        .addList(
                            EventListResponse.Data.AssetEvent.builder()
                                .assetId("asset_id")
                                .eventType(EventListResponse.Data.AssetEvent.EventType.ENTER)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .geofenceId("geofence_id")
                                .monitorId("monitor_id")
                                .addMonitorTag("string")
                                .prevLocation(
                                    EventListResponse.Data.AssetEvent.PrevLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.AssetEvent.PrevLocation.Location
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
                                    EventListResponse.Data.AssetEvent.TriggeredLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.AssetEvent.TriggeredLocation
                                                .Location
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
                        EventListResponse.Data.AssetEvent.builder()
                            .assetId("asset_id")
                            .eventType(EventListResponse.Data.AssetEvent.EventType.ENTER)
                            .extra(JsonValue.from(mapOf<String, Any>()))
                            .geofenceId("geofence_id")
                            .monitorId("monitor_id")
                            .addMonitorTag("string")
                            .prevLocation(
                                EventListResponse.Data.AssetEvent.PrevLocation.builder()
                                    .bearing(0.0)
                                    .location(
                                        EventListResponse.Data.AssetEvent.PrevLocation.Location
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
                                EventListResponse.Data.AssetEvent.TriggeredLocation.builder()
                                    .bearing(0.0)
                                    .location(
                                        EventListResponse.Data.AssetEvent.TriggeredLocation.Location
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .data(
                    EventListResponse.Data.builder()
                        .addList(
                            EventListResponse.Data.AssetEvent.builder()
                                .assetId("asset_id")
                                .eventType(EventListResponse.Data.AssetEvent.EventType.ENTER)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .geofenceId("geofence_id")
                                .monitorId("monitor_id")
                                .addMonitorTag("string")
                                .prevLocation(
                                    EventListResponse.Data.AssetEvent.PrevLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.AssetEvent.PrevLocation.Location
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
                                    EventListResponse.Data.AssetEvent.TriggeredLocation.builder()
                                        .bearing(0.0)
                                        .location(
                                            EventListResponse.Data.AssetEvent.TriggeredLocation
                                                .Location
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
