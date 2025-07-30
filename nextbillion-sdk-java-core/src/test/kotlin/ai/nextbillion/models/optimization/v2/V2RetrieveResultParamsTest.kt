// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2RetrieveResultParamsTest {

    @Test
    fun create() {
        V2RetrieveResultParams.builder().id("id").key("key=API_KEY").build()
    }

    @Test
    fun queryParams() {
        val params = V2RetrieveResultParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("id", "id").put("key", "key=API_KEY").build())
    }
}
