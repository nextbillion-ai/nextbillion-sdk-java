// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.discover.DiscoverRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DiscoverServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val discoverServiceAsync = client.discover()

        val discoverFuture =
            discoverServiceAsync.retrieve(
                DiscoverRetrieveParams.builder()
                    .key("key=API_KEY")
                    .q("q=125, Berliner, berlin")
                    .at("at=52.5308,13.3856")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        val discover = discoverFuture.get()
        discover.validate()
    }
}
