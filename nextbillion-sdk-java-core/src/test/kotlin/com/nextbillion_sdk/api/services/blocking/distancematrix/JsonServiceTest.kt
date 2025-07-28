// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.distancematrix

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.distancematrix.json.JsonRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JsonServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonService = client.distancematrix().json()

        jsonService.create()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jsonService = client.distancematrix().json()

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
