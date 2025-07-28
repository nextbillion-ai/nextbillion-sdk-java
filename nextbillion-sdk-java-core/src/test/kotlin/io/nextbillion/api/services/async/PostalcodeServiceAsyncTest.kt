// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.postalcode.PostalcodeRetrieveCoordinatesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PostalcodeServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveCoordinates() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
