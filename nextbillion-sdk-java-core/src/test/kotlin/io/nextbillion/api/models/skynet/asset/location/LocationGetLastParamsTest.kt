// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset.location

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationGetLastParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        LocationGetLastParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(LocationGetLastParams.Cluster.AMERICA)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = LocationGetLastParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            LocationGetLastParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(LocationGetLastParams.Cluster.AMERICA)
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
        val params = LocationGetLastParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
