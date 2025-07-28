// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.isochrone.IsochroneComputeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IsochroneServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun compute() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
