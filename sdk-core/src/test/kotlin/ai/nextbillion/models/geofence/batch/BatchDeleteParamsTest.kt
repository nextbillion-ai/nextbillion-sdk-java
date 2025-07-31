// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.batch

import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder().key("key=API_KEY").addId("string").build()
    }

    @Test
    fun queryParams() {
        val params = BatchDeleteParams.builder().key("key=API_KEY").addId("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BatchDeleteParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params = BatchDeleteParams.builder().key("key=API_KEY").addId("string").build()

        val body = params._body()

        assertThat(body.ids().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchDeleteParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
