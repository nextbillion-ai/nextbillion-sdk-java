// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripEndParamsTest {

    @Test
    fun create() {
        TripEndParams.builder()
            .key("key=API_KEY")
            .cluster(TripEndParams.Cluster.AMERICA)
            .id("id")
            .build()
    }

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

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripEndParams.builder().key("key=API_KEY").id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

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

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TripEndParams.builder().key("key=API_KEY").id("id").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("id")
    }
}
