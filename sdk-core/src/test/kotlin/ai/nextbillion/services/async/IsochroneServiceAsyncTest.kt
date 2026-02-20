// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.isochrone.IsochroneComputeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IsochroneServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun compute() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val isochroneServiceAsync = client.isochrone()

        val responseFuture =
            isochroneServiceAsync.compute(
                IsochroneComputeParams.builder()
                    .contoursMeters(0L)
                    .contoursMinutes(0L)
                    .coordinates("coordinates=1.29363713,103.8383112")
                    .key("key=API_KEY")
                    .contoursColors("contours_colors=ff0000,bf4040")
                    .denoise(0.0)
                    .departureTime(0L)
                    .generalize(0.0)
                    .mode(IsochroneComputeParams.Mode.CAR)
                    .polygons(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
