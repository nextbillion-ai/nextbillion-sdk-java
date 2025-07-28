// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.config

import io.nextbillion.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConfigUpdateParams.builder()
            .key("key=API_KEY")
            .cluster(ConfigUpdateParams.Cluster.AMERICA)
            .addWebhook("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ConfigUpdateParams.builder()
                .key("key=API_KEY")
                .cluster(ConfigUpdateParams.Cluster.AMERICA)
                .addWebhook("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConfigUpdateParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            ConfigUpdateParams.builder()
                .key("key=API_KEY")
                .cluster(ConfigUpdateParams.Cluster.AMERICA)
                .addWebhook("string")
                .build()

        val body = params._body()

        assertThat(body.webhook().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = ConfigUpdateParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
