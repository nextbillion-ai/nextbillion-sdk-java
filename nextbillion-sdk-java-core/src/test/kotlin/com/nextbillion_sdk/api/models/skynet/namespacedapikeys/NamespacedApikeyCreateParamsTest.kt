// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.namespacedapikeys

import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NamespacedApikeyCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        NamespacedApikeyCreateParams.builder()
            .key("key=API_KEY")
            .namespace("namespace=test_name")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            NamespacedApikeyCreateParams.builder()
                .key("key=API_KEY")
                .namespace("namespace=test_name")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("namespace", "namespace=test_name")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            NamespacedApikeyCreateParams.builder()
                .key("key=API_KEY")
                .namespace("namespace=test_name")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
