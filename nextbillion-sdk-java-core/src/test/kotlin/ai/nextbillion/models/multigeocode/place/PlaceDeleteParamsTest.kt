// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceDeleteParamsTest {

    @Test
    fun create() {
        PlaceDeleteParams.builder().docId("docId").key("key=API_KEY").build()
    }

    @Test
    fun pathParams() {
        val params = PlaceDeleteParams.builder().docId("docId").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("docId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = PlaceDeleteParams.builder().docId("docId").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
