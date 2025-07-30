// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceUpdateResponseTest {

    @Test
    fun create() {
        val placeUpdateResponse = PlaceUpdateResponse.builder().msg("msg").status("status").build()

        assertThat(placeUpdateResponse.msg()).contains("msg")
        assertThat(placeUpdateResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placeUpdateResponse = PlaceUpdateResponse.builder().msg("msg").status("status").build()

        val roundtrippedPlaceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placeUpdateResponse),
                jacksonTypeRef<PlaceUpdateResponse>(),
            )

        assertThat(roundtrippedPlaceUpdateResponse).isEqualTo(placeUpdateResponse)
    }
}
