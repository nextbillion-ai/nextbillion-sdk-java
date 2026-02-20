// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.browse.BrowseSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowseServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val browseService = client.browse()

        val response =
            browseService.search(
                BrowseSearchParams.builder()
                    .key("key=API_KEY")
                    .at("at=52.5308,13.3856")
                    .categories("categories: schools")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        response.validate()
    }
}
