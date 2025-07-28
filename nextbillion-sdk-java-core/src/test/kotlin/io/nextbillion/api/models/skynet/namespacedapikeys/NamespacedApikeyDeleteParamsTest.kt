// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.namespacedapikeys

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespacedApikeyDeleteParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        NamespacedApikeyDeleteParams.builder()
            .key("key=API_KEY")
            .keyToDelete("key_to_delete")
            .namespace("namespace")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            NamespacedApikeyDeleteParams.builder()
                .key("key=API_KEY")
                .keyToDelete("key_to_delete")
                .namespace("namespace")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("key_to_delete", "key_to_delete")
                    .put("namespace", "namespace")
                    .build()
            )
    }
}
