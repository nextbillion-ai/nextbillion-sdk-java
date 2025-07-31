// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.config

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigRetrieveParamsTest {

    @Test
    fun create() {
        ConfigRetrieveParams.builder()
            .key("key=API_KEY")
            .cluster(ConfigRetrieveParams.Cluster.AMERICA)
            .build()
    }

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

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConfigRetrieveParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
