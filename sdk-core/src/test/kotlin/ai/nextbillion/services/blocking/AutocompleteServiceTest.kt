// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.autocomplete.AutocompleteSuggestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutocompleteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun suggest() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.suggest(
                AutocompleteSuggestParams.builder()
                    .key("key=API_KEY")
                    .q("q=125, Berliner, berlin")
                    .at("at=52.5308,13.3856")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        response.validate()
    }
}
