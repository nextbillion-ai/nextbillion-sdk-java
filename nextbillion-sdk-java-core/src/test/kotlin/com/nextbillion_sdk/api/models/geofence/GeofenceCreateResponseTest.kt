// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geofence

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val geofenceCreateResponse =
            GeofenceCreateResponse.builder()
                .data(GeofenceCreateResponse.Data.builder().id("id").build())
                .status("status")
                .build()

        assertThat(geofenceCreateResponse.data())
            .contains(GeofenceCreateResponse.Data.builder().id("id").build())
        assertThat(geofenceCreateResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofenceCreateResponse =
            GeofenceCreateResponse.builder()
                .data(GeofenceCreateResponse.Data.builder().id("id").build())
                .status("status")
                .build()

        val roundtrippedGeofenceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofenceCreateResponse),
                jacksonTypeRef<GeofenceCreateResponse>(),
            )

        assertThat(roundtrippedGeofenceCreateResponse).isEqualTo(geofenceCreateResponse)
    }
}
