// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun create() {
        val position = Position.builder().lat("lat").lng("lng").build()

        assertThat(position.lat()).contains("lat")
        assertThat(position.lng()).contains("lng")
    }

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
