// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.distancematrix

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.distancematrix.json.JsonRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.distanceMatrix().json()

        jsonService.create()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val jsonService = client.distanceMatrix().json()

        val json =
            jsonService.retrieve(
                JsonRetrieveParams.builder()
                    .destinations(
                        "destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878"
                    )
                    .key("key=API_KEY")
                    .origins("origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878")
                    .approaches(JsonRetrieveParams.Approaches.UNRESTRICTED)
                    .avoid(JsonRetrieveParams.Avoid.TOLL)
                    .bearings("bearings=0,180;0,180")
                    .mode(JsonRetrieveParams.Mode.CAR)
                    .routeFailedPrompt(true)
                    .build()
            )

        json.validate()
    }
}
