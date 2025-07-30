// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeofenceCreateResponseTest {

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
