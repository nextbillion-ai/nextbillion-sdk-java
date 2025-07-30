// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceDeleteResponseTest {

    @Test
    fun create() {
        val placeDeleteResponse = PlaceDeleteResponse.builder().msg("msg").status("status").build()

        assertThat(placeDeleteResponse.msg()).contains("msg")
        assertThat(placeDeleteResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placeDeleteResponse = PlaceDeleteResponse.builder().msg("msg").status("status").build()

        val roundtrippedPlaceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placeDeleteResponse),
                jacksonTypeRef<PlaceDeleteResponse>(),
            )

        assertThat(roundtrippedPlaceDeleteResponse).isEqualTo(placeDeleteResponse)
    }
}
