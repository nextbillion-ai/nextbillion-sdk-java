// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.batch

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .data(BatchCreateResponse.Data.builder().addId("string").build())
                .status("status")
                .build()

        assertThat(batchCreateResponse.data())
            .contains(BatchCreateResponse.Data.builder().addId("string").build())
        assertThat(batchCreateResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .data(BatchCreateResponse.Data.builder().addId("string").build())
                .status("status")
                .build()

        val roundtrippedBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateResponse),
                jacksonTypeRef<BatchCreateResponse>(),
            )

        assertThat(roundtrippedBatchCreateResponse).isEqualTo(batchCreateResponse)
    }
}
