// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.batch

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchRetrieveResponse =
            BatchRetrieveResponse.builder()
                .msg("msg")
                .addResponse(
                    BatchRetrieveResponse.Response.builder()
                        .response(JsonValue.from(mapOf<String, Any>()))
                        .statusCode(0L)
                        .build()
                )
                .status("status")
                .trackId("track_id")
                .build()

        assertThat(batchRetrieveResponse.msg()).contains("msg")
        assertThat(batchRetrieveResponse.responses().getOrNull())
            .containsExactly(
                BatchRetrieveResponse.Response.builder()
                    .response(JsonValue.from(mapOf<String, Any>()))
                    .statusCode(0L)
                    .build()
            )
        assertThat(batchRetrieveResponse.status()).contains("status")
        assertThat(batchRetrieveResponse.trackId()).contains("track_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchRetrieveResponse =
            BatchRetrieveResponse.builder()
                .msg("msg")
                .addResponse(
                    BatchRetrieveResponse.Response.builder()
                        .response(JsonValue.from(mapOf<String, Any>()))
                        .statusCode(0L)
                        .build()
                )
                .status("status")
                .trackId("track_id")
                .build()

        val roundtrippedBatchRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchRetrieveResponse),
                jacksonTypeRef<BatchRetrieveResponse>(),
            )

        assertThat(roundtrippedBatchRetrieveResponse).isEqualTo(batchRetrieveResponse)
    }
}
