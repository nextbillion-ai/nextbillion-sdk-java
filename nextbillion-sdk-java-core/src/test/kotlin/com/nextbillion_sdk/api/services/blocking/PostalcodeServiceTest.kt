// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.postalcode.PostalcodeRetrieveCoordinatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PostalcodeServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveCoordinates() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val postalcodeService = client.postalcode()

        val response =
            postalcodeService.retrieveCoordinates(
                PostalcodeRetrieveCoordinatesParams.builder()
                    .key("key=API_KEY")
                    .at(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
                    .country("country")
                    .format(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
                    .postalcode("postalcode")
                    .build()
            )

        response.validate()
    }
}
