// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.skynet.SkynetSubscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkynetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribe() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skynetService = client.skynet()

        val response =
            skynetService.subscribe(
                SkynetSubscribeParams.builder()
                    .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
                    .id("id")
                    .params(SkynetSubscribeParams.Params.builder().id("id").build())
                    .build()
            )

        response.validate()
    }
}
