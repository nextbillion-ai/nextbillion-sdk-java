// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
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
