// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.areas.AreaListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AreaServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val areaServiceAsync = client.areas()

        val areasFuture = areaServiceAsync.list(AreaListParams.builder().key("key=API_KEY").build())

        val areas = areasFuture.get()
        areas.forEach { it.validate() }
    }
}
