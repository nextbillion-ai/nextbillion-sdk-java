// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.lookup.LookupByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LookupServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun byId() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lookupService = client.lookup()

        val response =
            lookupService.byId(LookupByIdParams.builder().id("id").key("key=API_KEY").build())

        response.validate()
    }
}
