// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.distancematrix

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.distancematrix.json.JsonRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JsonServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonServiceAsync = client.distanceMatrix().json()

        val future = jsonServiceAsync.create()

        val response = future.get()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonServiceAsync = client.distanceMatrix().json()

        val jsonFuture =
            jsonServiceAsync.retrieve(
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

        val json = jsonFuture.get()
        json.validate()
    }
}
