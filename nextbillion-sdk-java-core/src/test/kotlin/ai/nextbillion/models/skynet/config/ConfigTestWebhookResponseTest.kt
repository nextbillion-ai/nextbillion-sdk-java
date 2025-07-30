// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.config

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigTestWebhookResponseTest {

    @Test
    fun create() {
        val configTestWebhookResponse = ConfigTestWebhookResponse.builder().status("status").build()

        assertThat(configTestWebhookResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configTestWebhookResponse = ConfigTestWebhookResponse.builder().status("status").build()

        val roundtrippedConfigTestWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configTestWebhookResponse),
                jacksonTypeRef<ConfigTestWebhookResponse>(),
            )

        assertThat(roundtrippedConfigTestWebhookResponse).isEqualTo(configTestWebhookResponse)
    }
}
