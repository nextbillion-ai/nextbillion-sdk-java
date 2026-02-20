// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.batch.BatchCreateParams
import ai.nextbillion.models.batch.BatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.batch()

        val batch =
            batchService.retrieve(
                BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()
            )

        batch.validate()
    }
}
