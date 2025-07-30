// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset.location

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationGetLastResponseTest {

    @Test
    fun create() {
        val locationGetLastResponse =
            LocationGetLastResponse.builder()
                .data(
                    LocationGetLastResponse.Data.builder()
                        .location(
                            TrackLocation.builder()
                                .accuracy(0.0)
                                .altitude(0.0)
                                .batteryLevel(0L)
                                .bearing(0.0)
                                .location(
                                    TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                )
                                .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                                .speed(0.0)
                                .timestamp(0L)
                                .trackingMode("tracking_mode")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(locationGetLastResponse.data())
            .contains(
                LocationGetLastResponse.Data.builder()
                    .location(
                        TrackLocation.builder()
                            .accuracy(0.0)
                            .altitude(0.0)
                            .batteryLevel(0L)
                            .bearing(0.0)
                            .location(TrackLocation.Location.builder().lat(0.0).lon(0.0).build())
                            .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                            .speed(0.0)
                            .timestamp(0L)
                            .trackingMode("tracking_mode")
                            .build()
                    )
                    .build()
            )
        assertThat(locationGetLastResponse.message()).contains("message")
        assertThat(locationGetLastResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationGetLastResponse =
            LocationGetLastResponse.builder()
                .data(
                    LocationGetLastResponse.Data.builder()
                        .location(
                            TrackLocation.builder()
                                .accuracy(0.0)
                                .altitude(0.0)
                                .batteryLevel(0L)
                                .bearing(0.0)
                                .location(
                                    TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                )
                                .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                                .speed(0.0)
                                .timestamp(0L)
                                .trackingMode("tracking_mode")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedLocationGetLastResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationGetLastResponse),
                jacksonTypeRef<LocationGetLastResponse>(),
            )

        assertThat(roundtrippedLocationGetLastResponse).isEqualTo(locationGetLastResponse)
    }
}
