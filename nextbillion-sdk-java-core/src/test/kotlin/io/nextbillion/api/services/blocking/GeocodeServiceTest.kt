// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.models.geocode.GeocodeBatchCreateParams
import io.nextbillion.api.models.geocode.GeocodeRetrieveParams
import io.nextbillion.api.models.geocode.GeocodeStructuredRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeocodeServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
