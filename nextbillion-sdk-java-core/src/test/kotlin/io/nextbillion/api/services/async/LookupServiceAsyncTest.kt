// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.lookup.LookupByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun byId() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lookupServiceAsync = client.lookup()

        val responseFuture =
            lookupServiceAsync.byId(LookupByIdParams.builder().id("id").key("key=API_KEY").build())

        val response = responseFuture.get()
        response.validate()
    }
}
