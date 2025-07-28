// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.trip

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TripEndParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        TripEndParams.builder()
            .key("key=API_KEY")
            .cluster(TripEndParams.Cluster.AMERICA)
            .id("id")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            TripEndParams.builder()
                .key("key=API_KEY")
                .cluster(TripEndParams.Cluster.AMERICA)
                .id("id")
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
        val params = TripEndParams.builder().key("key=API_KEY").id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            TripEndParams.builder()
                .key("key=API_KEY")
                .cluster(TripEndParams.Cluster.AMERICA)
                .id("id")
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = TripEndParams.builder().key("key=API_KEY").id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
