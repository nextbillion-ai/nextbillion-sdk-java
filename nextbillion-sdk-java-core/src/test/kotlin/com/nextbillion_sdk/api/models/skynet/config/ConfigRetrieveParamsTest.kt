// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.config

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ConfigRetrieveParams.builder()
            .key("key=API_KEY")
            .cluster(ConfigRetrieveParams.Cluster.AMERICA)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            ConfigRetrieveParams.builder()
                .key("key=API_KEY")
                .cluster(ConfigRetrieveParams.Cluster.AMERICA)
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
        val params = ConfigRetrieveParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
