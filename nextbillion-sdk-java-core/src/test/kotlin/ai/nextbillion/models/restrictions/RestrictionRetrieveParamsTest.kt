// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RestrictionRetrieveParamsTest {

    @Test
    fun create() {
        RestrictionRetrieveParams.builder().id(0L).key("key=API_KEY").transform(true).build()
    }

    @Test
    fun pathParams() {
        val params = RestrictionRetrieveParams.builder().id(0L).key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RestrictionRetrieveParams.builder().id(0L).key("key=API_KEY").transform(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("transform", "true").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RestrictionRetrieveParams.builder().id(0L).key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
