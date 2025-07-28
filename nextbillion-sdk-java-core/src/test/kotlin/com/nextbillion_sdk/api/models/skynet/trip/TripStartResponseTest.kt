// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.trip

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TripStartResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val tripStartResponse =
            TripStartResponse.builder()
                .data(TripStartResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        assertThat(tripStartResponse.data())
            .contains(TripStartResponse.Data.builder().id("id").build())
        assertThat(tripStartResponse.message()).contains("message")
        assertThat(tripStartResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tripStartResponse =
            TripStartResponse.builder()
                .data(TripStartResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        val roundtrippedTripStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tripStartResponse),
                jacksonTypeRef<TripStartResponse>(),
            )

        assertThat(roundtrippedTripStartResponse).isEqualTo(tripStartResponse)
    }
}
