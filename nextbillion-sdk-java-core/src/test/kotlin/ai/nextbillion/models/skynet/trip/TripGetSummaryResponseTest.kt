// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.asset.MetaData
import ai.nextbillion.models.skynet.asset.location.TrackLocation
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripGetSummaryResponseTest {

    @Test
    fun create() {
        val tripGetSummaryResponse =
            TripGetSummaryResponse.builder()
                .data(
                    TripGetSummaryResponse.Data.builder()
                        .trip(
                            TripGetSummaryResponse.Data.Trip.builder()
                                .id("id")
                                .asset(
                                    AssetDetails.builder()
                                        .id("id")
                                        .attributes(
                                            JsonValue.from(
                                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                                            )
                                        )
                                        .createdAt(0L)
                                        .description("description")
                                        .deviceId("device_id")
                                        .latestLocation(
                                            AssetDetails.LatestLocation.builder()
                                                .accuracy(0.0)
                                                .altitude(0.0)
                                                .bearing(0.0)
                                                .location(
                                                    AssetDetails.LatestLocation.Location.builder()
                                                        .lat(0.0)
                                                        .lon(0.0)
                                                        .build()
                                                )
                                                .speed(0.0)
                                                .timestamp(0L)
                                                .build()
                                        )
                                        .metaData(MetaData.builder().build())
                                        .name("name")
                                        .state("state")
                                        .addTag("string")
                                        .trackedAt(0L)
                                        .updatedAt(0L)
                                        .build()
                                )
                                .assetId("asset_id")
                                .attributes(JsonValue.from(mapOf<String, Any>()))
                                .createdAt(0L)
                                .description("description")
                                .distance(0.0)
                                .duration(0.0)
                                .endedAt(0L)
                                .addGeometry("string")
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

        assertThat(tripGetSummaryResponse.data())
            .contains(
                TripGetSummaryResponse.Data.builder()
                    .trip(
                        TripGetSummaryResponse.Data.Trip.builder()
                            .id("id")
                            .asset(
                                AssetDetails.builder()
                                    .id("id")
                                    .attributes(
                                        JsonValue.from(
                                            "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                                        )
                                    )
                                    .createdAt(0L)
                                    .description("description")
                                    .deviceId("device_id")
                                    .latestLocation(
                                        AssetDetails.LatestLocation.builder()
                                            .accuracy(0.0)
                                            .altitude(0.0)
                                            .bearing(0.0)
                                            .location(
                                                AssetDetails.LatestLocation.Location.builder()
                                                    .lat(0.0)
                                                    .lon(0.0)
                                                    .build()
                                            )
                                            .speed(0.0)
                                            .timestamp(0L)
                                            .build()
                                    )
                                    .metaData(MetaData.builder().build())
                                    .name("name")
                                    .state("state")
                                    .addTag("string")
                                    .trackedAt(0L)
                                    .updatedAt(0L)
                                    .build()
                            )
                            .assetId("asset_id")
                            .attributes(JsonValue.from(mapOf<String, Any>()))
                            .createdAt(0L)
                            .description("description")
                            .distance(0.0)
                            .duration(0.0)
                            .endedAt(0L)
                            .addGeometry("string")
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
        assertThat(tripGetSummaryResponse.message()).contains("message")
        assertThat(tripGetSummaryResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tripGetSummaryResponse =
            TripGetSummaryResponse.builder()
                .data(
                    TripGetSummaryResponse.Data.builder()
                        .trip(
                            TripGetSummaryResponse.Data.Trip.builder()
                                .id("id")
                                .asset(
                                    AssetDetails.builder()
                                        .id("id")
                                        .attributes(
                                            JsonValue.from(
                                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                                            )
                                        )
                                        .createdAt(0L)
                                        .description("description")
                                        .deviceId("device_id")
                                        .latestLocation(
                                            AssetDetails.LatestLocation.builder()
                                                .accuracy(0.0)
                                                .altitude(0.0)
                                                .bearing(0.0)
                                                .location(
                                                    AssetDetails.LatestLocation.Location.builder()
                                                        .lat(0.0)
                                                        .lon(0.0)
                                                        .build()
                                                )
                                                .speed(0.0)
                                                .timestamp(0L)
                                                .build()
                                        )
                                        .metaData(MetaData.builder().build())
                                        .name("name")
                                        .state("state")
                                        .addTag("string")
                                        .trackedAt(0L)
                                        .updatedAt(0L)
                                        .build()
                                )
                                .assetId("asset_id")
                                .attributes(JsonValue.from(mapOf<String, Any>()))
                                .createdAt(0L)
                                .description("description")
                                .distance(0.0)
                                .duration(0.0)
                                .endedAt(0L)
                                .addGeometry("string")
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

        val roundtrippedTripGetSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tripGetSummaryResponse),
                jacksonTypeRef<TripGetSummaryResponse>(),
            )

        assertThat(roundtrippedTripGetSummaryResponse).isEqualTo(tripGetSummaryResponse)
    }
}
