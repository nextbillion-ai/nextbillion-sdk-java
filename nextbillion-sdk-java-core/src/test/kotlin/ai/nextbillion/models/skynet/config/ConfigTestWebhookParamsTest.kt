// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.config

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigTestWebhookParamsTest {

    @Test
    fun create() {
        ConfigTestWebhookParams.builder().key("key=API_KEY").build()
    }

    @Test
    fun queryParams() {
        val params = ConfigTestWebhookParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
