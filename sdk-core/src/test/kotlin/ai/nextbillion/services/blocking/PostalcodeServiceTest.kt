// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostalcodeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCoordinates() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
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
