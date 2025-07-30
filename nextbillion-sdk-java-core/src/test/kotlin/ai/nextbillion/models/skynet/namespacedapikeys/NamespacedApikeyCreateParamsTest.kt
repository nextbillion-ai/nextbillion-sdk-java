// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.namespacedapikeys

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespacedApikeyCreateParamsTest {

    @Test
    fun create() {
        NamespacedApikeyCreateParams.builder()
            .key("key=API_KEY")
            .namespace("namespace=test_name")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

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
