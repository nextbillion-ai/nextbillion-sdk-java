// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceCreateResponseTest {

    @Test
    fun create() {
        val placeCreateResponse = PlaceCreateResponse.builder().docId("docId").build()

        assertThat(placeCreateResponse.docId()).contains("docId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placeCreateResponse = PlaceCreateResponse.builder().docId("docId").build()

        val roundtrippedPlaceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placeCreateResponse),
                jacksonTypeRef<PlaceCreateResponse>(),
            )

        assertThat(roundtrippedPlaceCreateResponse).isEqualTo(placeCreateResponse)
    }
}
