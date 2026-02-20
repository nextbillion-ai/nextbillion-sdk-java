// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.batch.BatchCreateParams
import ai.nextbillion.models.batch.BatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.batch()

        val batchFuture =
            batchServiceAsync.retrieve(
                BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }
}
