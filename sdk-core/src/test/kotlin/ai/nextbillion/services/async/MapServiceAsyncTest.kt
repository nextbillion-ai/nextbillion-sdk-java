// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MapServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSegment() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mapServiceAsync = client.map()

        val future = mapServiceAsync.createSegment()

        val response = future.get()
    }
}
