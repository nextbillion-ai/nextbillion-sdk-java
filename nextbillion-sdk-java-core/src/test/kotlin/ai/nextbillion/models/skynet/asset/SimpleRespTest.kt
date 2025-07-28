// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimpleRespTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val simpleResp = SimpleResp.builder().message("message").status("status").build()

        assertThat(simpleResp.message()).contains("message")
        assertThat(simpleResp.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simpleResp = SimpleResp.builder().message("message").status("status").build()

        val roundtrippedSimpleResp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simpleResp),
                jacksonTypeRef<SimpleResp>(),
            )

        assertThat(roundtrippedSimpleResp).isEqualTo(simpleResp)
    }
}
