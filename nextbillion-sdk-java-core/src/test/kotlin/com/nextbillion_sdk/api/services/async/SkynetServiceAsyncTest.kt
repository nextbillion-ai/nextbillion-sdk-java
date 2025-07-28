// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.skynet.SkynetSubscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkynetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun subscribe() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skynetServiceAsync = client.skynet()

        val responseFuture =
            skynetServiceAsync.subscribe(
                SkynetSubscribeParams.builder()
                    .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
                    .id("id")
                    .params(SkynetSubscribeParams.Params.builder().id("id").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
