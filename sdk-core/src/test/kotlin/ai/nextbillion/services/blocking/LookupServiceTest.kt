// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.lookup.LookupByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun byId() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val lookupService = client.lookup()

        val response =
            lookupService.byId(LookupByIdParams.builder().id("id").key("key=API_KEY").build())

        response.validate()
    }
}
