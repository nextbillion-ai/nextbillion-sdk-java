// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TripDeleteParamsTest {

    @Test
    fun create() {
        TripDeleteParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(TripDeleteParams.Cluster.AMERICA)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TripDeleteParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TripDeleteParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(TripDeleteParams.Cluster.AMERICA)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripDeleteParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
