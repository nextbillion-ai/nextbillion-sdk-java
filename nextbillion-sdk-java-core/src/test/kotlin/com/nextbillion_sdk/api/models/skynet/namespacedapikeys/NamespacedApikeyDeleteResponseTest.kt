// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.namespacedapikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespacedApikeyDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val namespacedApikeyDeleteResponse =
            NamespacedApikeyDeleteResponse.builder().msg("msg").status(0L).build()

        assertThat(namespacedApikeyDeleteResponse.msg()).contains("msg")
        assertThat(namespacedApikeyDeleteResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namespacedApikeyDeleteResponse =
            NamespacedApikeyDeleteResponse.builder().msg("msg").status(0L).build()

        val roundtrippedNamespacedApikeyDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namespacedApikeyDeleteResponse),
                jacksonTypeRef<NamespacedApikeyDeleteResponse>(),
            )

        assertThat(roundtrippedNamespacedApikeyDeleteResponse)
            .isEqualTo(namespacedApikeyDeleteResponse)
    }
}
