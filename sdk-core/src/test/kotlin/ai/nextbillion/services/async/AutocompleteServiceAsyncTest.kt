// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.autocomplete.AutocompleteSuggestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutocompleteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun suggest() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val autocompleteServiceAsync = client.autocomplete()

        val responseFuture =
            autocompleteServiceAsync.suggest(
                AutocompleteSuggestParams.builder()
                    .key("key=API_KEY")
                    .q("q=125, Berliner, berlin")
                    .at("at=52.5308,13.3856")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
