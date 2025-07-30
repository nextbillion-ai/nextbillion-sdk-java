// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.mdm

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdmGetDistanceMatrixStatusParamsTest {

    @Test
    fun create() {
        MdmGetDistanceMatrixStatusParams.builder().id("id").key("key=API_KEY").build()
    }

    @Test
    fun queryParams() {
        val params = MdmGetDistanceMatrixStatusParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("id", "id").put("key", "key=API_KEY").build())
    }
}
