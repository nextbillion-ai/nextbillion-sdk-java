// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.batch

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListParamsTest {

    @Test
    fun create() {
        BatchListParams.builder().ids("ids").key("key=API_KEY").build()
    }

    @Test
    fun queryParams() {
        val params = BatchListParams.builder().ids("ids").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("ids", "ids").put("key", "key=API_KEY").build())
    }
}
