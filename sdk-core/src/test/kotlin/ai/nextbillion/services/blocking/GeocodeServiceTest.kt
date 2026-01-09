// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.geocode.GeocodeBatchCreateParams
import ai.nextbillion.models.geocode.GeocodeRetrieveParams
import ai.nextbillion.models.geocode.GeocodeStructuredRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeocodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geocodeService = client.geocode()

        val geocode =
            geocodeService.retrieve(
                GeocodeRetrieveParams.builder()
                    .key("key=API_KEY")
                    .q("q=125, Berliner, berlin")
                    .at("at=52.5308,13.3856")
                    .in_("in=countryCode:CAN,MEX,USA")
                    .lang("lang=en")
                    .limit(0L)
                    .build()
            )

        geocode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchCreate() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geocodeService = client.geocode()

        val response =
            geocodeService.batchCreate(
                GeocodeBatchCreateParams.builder()
                    .key("key=API_KEY")
                    .addBody(
                        GeocodeBatchCreateParams.Body.builder()
                            .q("\"q\":\"125, Berliner, berlin\"")
                            .at("\"at\": \"52.5308,13.3856\"")
                            .in_("\"in\":\"countryCode:CAN,MEX,USA\"")
                            .lang("\"lang\":\"en\"")
                            .limit(0L)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun structuredRetrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geocodeService = client.geocode()

        val response =
            geocodeService.structuredRetrieve(
                GeocodeStructuredRetrieveParams.builder()
                    .countryCode("countryCode")
                    .key("key=API_KEY")
                    .at("at=52.5308,13.3856")
                    .city("city")
                    .county("county")
                    .houseNumber("houseNumber")
                    .in_("in=circle:52.53,13.38;r=10000")
                    .limit(0L)
                    .postalCode("postalCode")
                    .state("state")
                    .street("street")
                    .build()
            )

        response.validate()
    }
}
