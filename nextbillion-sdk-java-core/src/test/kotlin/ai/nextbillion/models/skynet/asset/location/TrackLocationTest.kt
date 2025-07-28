// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset.location

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TrackLocationTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val trackLocation =
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

        assertThat(trackLocation.accuracy()).contains(0.0)
        assertThat(trackLocation.altitude()).contains(0.0)
        assertThat(trackLocation.batteryLevel()).contains(0L)
        assertThat(trackLocation.bearing()).contains(0.0)
        assertThat(trackLocation.location())
            .contains(TrackLocation.Location.builder().lat(0.0).lon(0.0).build())
        assertThat(trackLocation._metaData())
            .isEqualTo(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
        assertThat(trackLocation.speed()).contains(0.0)
        assertThat(trackLocation.timestamp()).contains(0L)
        assertThat(trackLocation.trackingMode()).contains("tracking_mode")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trackLocation =
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

        val roundtrippedTrackLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trackLocation),
                jacksonTypeRef<TrackLocation>(),
            )

        assertThat(roundtrippedTrackLocation).isEqualTo(trackLocation)
    }
}
