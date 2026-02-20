// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.lookup.LookupByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun byId() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val lookupServiceAsync = client.lookup()

        val responseFuture =
            lookupServiceAsync.byId(LookupByIdParams.builder().id("id").key("key=API_KEY").build())

        val response = responseFuture.get()
        response.validate()
    }
}
