// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder().msg("msg").status("status").trackId("track_id").build()

        assertThat(batchCreateResponse.msg()).contains("msg")
        assertThat(batchCreateResponse.status()).contains("status")
        assertThat(batchCreateResponse.trackId()).contains("track_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateResponse =
            BatchCreateResponse.builder().msg("msg").status("status").trackId("track_id").build()

        val roundtrippedBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateResponse),
                jacksonTypeRef<BatchCreateResponse>(),
            )

        assertThat(roundtrippedBatchCreateResponse).isEqualTo(batchCreateResponse)
    }
}
