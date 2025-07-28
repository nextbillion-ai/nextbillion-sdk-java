// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.multigeocode.place

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaceUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val placeUpdateResponse = PlaceUpdateResponse.builder().msg("msg").status("status").build()

        assertThat(placeUpdateResponse.msg()).contains("msg")
        assertThat(placeUpdateResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
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
