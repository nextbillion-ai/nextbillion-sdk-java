// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.browse.BrowseSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowseServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val browseServiceAsync = client.browse()

        val responseFuture =
            browseServiceAsync.search(
                BrowseSearchParams.builder()
                    .key("key=API_KEY")
                    .at("at=52.5308,13.3856")
                    .categories("categories: schools")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
