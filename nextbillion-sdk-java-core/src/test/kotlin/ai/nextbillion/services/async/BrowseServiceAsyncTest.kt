// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.browse.BrowseSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrowseServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun search() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
