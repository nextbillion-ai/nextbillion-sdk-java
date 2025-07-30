// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.driverassignment

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Test
    fun create() {
        val location = Location.builder().lat(-90.0).lon(-180.0).build()

        assertThat(location.lat()).isEqualTo(-90.0)
        assertThat(location.lon()).isEqualTo(-180.0)
    }

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
