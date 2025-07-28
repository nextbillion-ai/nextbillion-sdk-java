// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.areas

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AreaListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AreaListParams.builder().key("key=API_KEY").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = AreaListParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
