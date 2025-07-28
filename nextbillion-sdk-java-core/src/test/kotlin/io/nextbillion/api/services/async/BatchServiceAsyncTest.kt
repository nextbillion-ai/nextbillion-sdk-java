// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.batch.BatchCreateParams
import io.nextbillion.api.models.batch.BatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batch()

        val batchFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .key("key=API_KEY")
                    .addRequest(BatchCreateParams.Request.builder().query("query").build())
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.batch()

        val batchFuture =
            batchServiceAsync.retrieve(
                BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }
}
