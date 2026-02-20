// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.SkynetSubscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SkynetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun subscribe() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
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
