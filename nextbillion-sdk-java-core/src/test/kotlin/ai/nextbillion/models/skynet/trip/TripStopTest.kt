// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripStopTest {

    @Test
    fun create() {
        val tripStop =
            TripStop.builder()
                .geofenceId("geofence_id")
                .metaData(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        assertThat(tripStop.geofenceId()).contains("geofence_id")
        assertThat(tripStop._metaData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tripStop.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tripStop =
            TripStop.builder()
                .geofenceId("geofence_id")
                .metaData(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        val roundtrippedTripStop =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tripStop),
                jacksonTypeRef<TripStop>(),
            )

        assertThat(roundtrippedTripStop).isEqualTo(tripStop)
    }
}
