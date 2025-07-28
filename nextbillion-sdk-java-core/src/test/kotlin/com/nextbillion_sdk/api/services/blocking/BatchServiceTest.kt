// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.batch.BatchCreateParams
import com.nextbillion_sdk.api.models.batch.BatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batch()

        val batch =
            batchService.create(
                BatchCreateParams.builder()
                    .key("key=API_KEY")
                    .addRequest(BatchCreateParams.Request.builder().query("query").build())
                    .build()
            )

        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.batch()

        val batch =
            batchService.retrieve(
                BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()
            )

        batch.validate()
    }
}
