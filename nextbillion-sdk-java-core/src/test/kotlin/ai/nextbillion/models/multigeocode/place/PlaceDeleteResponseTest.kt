// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaceDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val placeDeleteResponse = PlaceDeleteResponse.builder().msg("msg").status("status").build()

        assertThat(placeDeleteResponse.msg()).contains("msg")
        assertThat(placeDeleteResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
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
