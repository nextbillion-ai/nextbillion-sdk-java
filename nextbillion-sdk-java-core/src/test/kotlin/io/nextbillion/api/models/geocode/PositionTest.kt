// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val position = Position.builder().lat("lat").lng("lng").build()

        assertThat(position.lat()).contains("lat")
        assertThat(position.lng()).contains("lng")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val position = Position.builder().lat("lat").lng("lng").build()

        val roundtrippedPosition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(position),
                jacksonTypeRef<Position>(),
            )

        assertThat(roundtrippedPosition).isEqualTo(position)
    }
}
