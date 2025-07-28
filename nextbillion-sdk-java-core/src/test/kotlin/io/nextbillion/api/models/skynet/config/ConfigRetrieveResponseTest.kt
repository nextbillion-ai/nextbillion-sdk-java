// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.config

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val configRetrieveResponse =
            ConfigRetrieveResponse.builder()
                .data(
                    ConfigRetrieveResponse.Data.builder()
                        .config(
                            ConfigRetrieveResponse.Data.Config.builder()
                                .addWebhook("string")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(configRetrieveResponse.data())
            .contains(
                ConfigRetrieveResponse.Data.builder()
                    .config(
                        ConfigRetrieveResponse.Data.Config.builder().addWebhook("string").build()
                    )
                    .build()
            )
        assertThat(configRetrieveResponse.message()).contains("message")
        assertThat(configRetrieveResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configRetrieveResponse =
            ConfigRetrieveResponse.builder()
                .data(
                    ConfigRetrieveResponse.Data.builder()
                        .config(
                            ConfigRetrieveResponse.Data.Config.builder()
                                .addWebhook("string")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedConfigRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configRetrieveResponse),
                jacksonTypeRef<ConfigRetrieveResponse>(),
            )

        assertThat(roundtrippedConfigRetrieveResponse).isEqualTo(configRetrieveResponse)
    }
}
