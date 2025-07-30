// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.asset.location.TrackLocation
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripRetrieveResponseTest {

    @Test
    fun create() {
        val tripRetrieveResponse =
            TripRetrieveResponse.builder()
                .data(
                    TripRetrieveResponse.Data.builder()
                        .trip(
                            TripRetrieveResponse.Data.Trip.builder()
                                .id("id")
                                .assetId("asset_id")
                                .attributes(JsonValue.from(mapOf<String, Any>()))
                                .createdAt(0L)
                                .description("description")
                                .endedAt(0L)
                                .metaData(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .addRoute(
                                    TrackLocation.builder()
                                        .accuracy(0.0)
                                        .altitude(0.0)
                                        .batteryLevel(0L)
                                        .bearing(0.0)
                                        .location(
                                            TrackLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(
                                            JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                        )
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .trackingMode("tracking_mode")
                                        .build()
                                )
                                .startedAt(0L)
                                .state("state")
                                .addStop(
                                    TripStop.builder()
                                        .geofenceId("geofence_id")
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .name("name")
                                        .build()
                                )
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(tripRetrieveResponse.data())
            .contains(
                TripRetrieveResponse.Data.builder()
                    .trip(
                        TripRetrieveResponse.Data.Trip.builder()
                            .id("id")
                            .assetId("asset_id")
                            .attributes(JsonValue.from(mapOf<String, Any>()))
                            .createdAt(0L)
                            .description("description")
                            .endedAt(0L)
                            .metaData(JsonValue.from(mapOf<String, Any>()))
                            .name("name")
                            .addRoute(
                                TrackLocation.builder()
                                    .accuracy(0.0)
                                    .altitude(0.0)
                                    .batteryLevel(0L)
                                    .bearing(0.0)
                                    .location(
                                        TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                    )
                                    .metaData(
                                        JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                    )
                                    .speed(0.0)
                                    .timestamp(0L)
                                    .trackingMode("tracking_mode")
                                    .build()
                            )
                            .startedAt(0L)
                            .state("state")
                            .addStop(
                                TripStop.builder()
                                    .geofenceId("geofence_id")
                                    .metaData(JsonValue.from(mapOf<String, Any>()))
                                    .name("name")
                                    .build()
                            )
                            .updatedAt(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(tripRetrieveResponse.message()).contains("message")
        assertThat(tripRetrieveResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tripRetrieveResponse =
            TripRetrieveResponse.builder()
                .data(
                    TripRetrieveResponse.Data.builder()
                        .trip(
                            TripRetrieveResponse.Data.Trip.builder()
                                .id("id")
                                .assetId("asset_id")
                                .attributes(JsonValue.from(mapOf<String, Any>()))
                                .createdAt(0L)
                                .description("description")
                                .endedAt(0L)
                                .metaData(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .addRoute(
                                    TrackLocation.builder()
                                        .accuracy(0.0)
                                        .altitude(0.0)
                                        .batteryLevel(0L)
                                        .bearing(0.0)
                                        .location(
                                            TrackLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(
                                            JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                        )
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .trackingMode("tracking_mode")
                                        .build()
                                )
                                .startedAt(0L)
                                .state("state")
                                .addStop(
                                    TripStop.builder()
                                        .geofenceId("geofence_id")
                                        .metaData(JsonValue.from(mapOf<String, Any>()))
                                        .name("name")
                                        .build()
                                )
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedTripRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tripRetrieveResponse),
                jacksonTypeRef<TripRetrieveResponse>(),
            )

        assertThat(roundtrippedTripRetrieveResponse).isEqualTo(tripRetrieveResponse)
    }
}
