// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.trip

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TripStopTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
