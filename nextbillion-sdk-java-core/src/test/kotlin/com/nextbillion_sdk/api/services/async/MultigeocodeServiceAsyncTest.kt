// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultigeocodeServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun search() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multigeocodeServiceAsync = client.multigeocode()

        val responseFuture =
            multigeocodeServiceAsync.search(
                MultigeocodeSearchParams.builder()
                    .key("key=API_KEY")
                    .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
                    .query("“query”: “Taj Mahal”")
                    .city("“city”: “Glendale”")
                    .country("“country”:”IND”")
                    .district("“district”: “City Center”")
                    .limit(0L)
                    .radius("“radius”: “10m”")
                    .state("“state”: “California”")
                    .street("“street”: “Americana Way”")
                    .subDistrict("“subDistrict”: “Golkonda”")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
