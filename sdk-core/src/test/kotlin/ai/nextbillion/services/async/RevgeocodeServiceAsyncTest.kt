// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.revgeocode.RevgeocodeRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevgeocodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val revgeocodeServiceAsync = client.revgeocode()

        val revgeocodeFuture =
            revgeocodeServiceAsync.retrieve(
                RevgeocodeRetrieveParams.builder()
                    .at("at=52.5308,13.3856")
                    .key("key=API_KEY")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .build()
            )

        val revgeocode = revgeocodeFuture.get()
        revgeocode.validate()
    }
}
