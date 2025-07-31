// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostResponseTest {

    @Test
    fun create() {
        val postResponse =
            PostResponse.builder()
                .id("id")
                .message("message")
                .status("status")
                .addWarning("string")
                .build()

        assertThat(postResponse.id()).contains("id")
        assertThat(postResponse.message()).contains("message")
        assertThat(postResponse.status()).contains("status")
        assertThat(postResponse.warnings().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postResponse =
            PostResponse.builder()
                .id("id")
                .message("message")
                .status("status")
                .addWarning("string")
                .build()

        val roundtrippedPostResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postResponse),
                jacksonTypeRef<PostResponse>(),
            )

        assertThat(roundtrippedPostResponse).isEqualTo(postResponse)
    }
}
