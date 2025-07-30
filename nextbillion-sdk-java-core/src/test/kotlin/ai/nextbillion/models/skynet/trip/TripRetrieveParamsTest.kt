// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripRetrieveParamsTest {

    @Test
    fun create() {
        TripRetrieveParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(TripRetrieveParams.Cluster.AMERICA)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TripRetrieveParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TripRetrieveParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(TripRetrieveParams.Cluster.AMERICA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripRetrieveParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
