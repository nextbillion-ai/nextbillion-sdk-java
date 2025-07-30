// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RestrictionDeleteParamsTest {

    @Test
    fun create() {
        RestrictionDeleteParams.builder().id(0L).key("key=API_KEY").build()
    }

    @Test
    fun pathParams() {
        val params = RestrictionDeleteParams.builder().id(0L).key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = RestrictionDeleteParams.builder().id(0L).key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
