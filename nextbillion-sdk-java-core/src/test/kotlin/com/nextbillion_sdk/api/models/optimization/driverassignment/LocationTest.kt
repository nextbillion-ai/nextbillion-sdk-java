// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization.driverassignment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val location = Location.builder().lat(-90.0).lon(-180.0).build()

        assertThat(location.lat()).isEqualTo(-90.0)
        assertThat(location.lon()).isEqualTo(-180.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val location = Location.builder().lat(-90.0).lon(-180.0).build()

        val roundtrippedLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(location),
                jacksonTypeRef<Location>(),
            )

        assertThat(roundtrippedLocation).isEqualTo(location)
    }
}
