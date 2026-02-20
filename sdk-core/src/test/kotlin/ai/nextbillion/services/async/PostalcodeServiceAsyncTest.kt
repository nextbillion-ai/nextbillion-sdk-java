// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostalcodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCoordinates() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val postalcodeServiceAsync = client.postalcode()

        val responseFuture =
            postalcodeServiceAsync.retrieveCoordinates(
                PostalcodeRetrieveCoordinatesParams.builder()
                    .key("key=API_KEY")
                    .at(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
                    .country("country")
                    .format(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
                    .postalcode("postalcode")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
