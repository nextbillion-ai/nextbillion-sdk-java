// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.batch

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder().msg("msg").status("status").trackId("track_id").build()

        assertThat(batchCreateResponse.msg()).contains("msg")
        assertThat(batchCreateResponse.status()).contains("status")
        assertThat(batchCreateResponse.trackId()).contains("track_id")
    }

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
