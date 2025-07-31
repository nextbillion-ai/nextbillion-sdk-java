// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.namespacedapikeys

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespacedApikeyDeleteResponseTest {

    @Test
    fun create() {
        val namespacedApikeyDeleteResponse =
            NamespacedApikeyDeleteResponse.builder().msg("msg").status(0L).build()

        assertThat(namespacedApikeyDeleteResponse.msg()).contains("msg")
        assertThat(namespacedApikeyDeleteResponse.status()).contains(0L)
    }

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
