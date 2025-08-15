// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.revgeocode.RevgeocodeRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RevgeocodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val revgeocodeService = client.revgeocode()

        val revgeocode =
            revgeocodeService.retrieve(
                RevgeocodeRetrieveParams.builder()
                    .at("at=52.5308,13.3856")
                    .key("key=API_KEY")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .build()
            )

        revgeocode.validate()
    }
}
