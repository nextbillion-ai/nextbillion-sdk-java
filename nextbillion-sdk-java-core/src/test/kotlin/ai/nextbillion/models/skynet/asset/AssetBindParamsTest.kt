// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetBindParamsTest {

    @Test
    fun create() {
        AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()

        val body = params._body()

        assertThat(body.deviceId()).isEqualTo("device_id")
    }
}
