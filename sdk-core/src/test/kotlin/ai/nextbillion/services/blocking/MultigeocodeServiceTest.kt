// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.multigeocode.MultigeocodeSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultigeocodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multigeocodeService = client.multigeocode()

        val response =
            multigeocodeService.search(
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

        response.validate()
    }
}
