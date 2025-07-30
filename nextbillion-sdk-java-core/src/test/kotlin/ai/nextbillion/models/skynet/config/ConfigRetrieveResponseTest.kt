// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.config

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigRetrieveResponseTest {

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
