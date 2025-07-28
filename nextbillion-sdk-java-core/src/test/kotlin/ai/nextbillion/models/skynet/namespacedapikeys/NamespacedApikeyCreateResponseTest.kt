// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.namespacedapikeys

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespacedApikeyCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val namespacedApikeyCreateResponse =
            NamespacedApikeyCreateResponse.builder()
                .error("error")
                .message("message")
                .result(
                    NamespacedApikeyCreateResponse.Result.builder()
                        .apikey("apikey")
                        .createdAt(0L)
                        .expiresAt(0L)
                        .namespace("namespace")
                        .subId("sub_id")
                        .build()
                )
                .status(0L)
                .build()

        assertThat(namespacedApikeyCreateResponse.error()).contains("error")
        assertThat(namespacedApikeyCreateResponse.message()).contains("message")
        assertThat(namespacedApikeyCreateResponse.result())
            .contains(
                NamespacedApikeyCreateResponse.Result.builder()
                    .apikey("apikey")
                    .createdAt(0L)
                    .expiresAt(0L)
                    .namespace("namespace")
                    .subId("sub_id")
                    .build()
            )
        assertThat(namespacedApikeyCreateResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespacedApikeyCreateResponse =
            NamespacedApikeyCreateResponse.builder()
                .error("error")
                .message("message")
                .result(
                    NamespacedApikeyCreateResponse.Result.builder()
                        .apikey("apikey")
                        .createdAt(0L)
                        .expiresAt(0L)
                        .namespace("namespace")
                        .subId("sub_id")
                        .build()
                )
                .status(0L)
                .build()

        val roundtrippedNamespacedApikeyCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespacedApikeyCreateResponse),
                jacksonTypeRef<NamespacedApikeyCreateResponse>(),
            )

        assertThat(roundtrippedNamespacedApikeyCreateResponse)
            .isEqualTo(namespacedApikeyCreateResponse)
    }
}
