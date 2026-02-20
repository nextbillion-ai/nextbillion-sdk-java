// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.config.ConfigRetrieveParams
import ai.nextbillion.models.skynet.config.ConfigTestWebhookParams
import ai.nextbillion.models.skynet.config.ConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configServiceAsync = client.skynet().config()

        val configFuture =
            configServiceAsync.retrieve(
                ConfigRetrieveParams.builder()
                    .key("key=API_KEY")
                    .cluster(ConfigRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        val config = configFuture.get()
        config.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configServiceAsync = client.skynet().config()

        val simpleRespFuture =
            configServiceAsync.update(
                ConfigUpdateParams.builder()
                    .key("key=API_KEY")
                    .cluster(ConfigUpdateParams.Cluster.AMERICA)
                    .addWebhook("string")
                    .build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun testWebhook() {
        val client = NextbillionSdkOkHttpClientAsync.builder().apiKey("My API Key").build()
        val configServiceAsync = client.skynet().config()

        val responseFuture =
            configServiceAsync.testWebhook(
                ConfigTestWebhookParams.builder().key("key=API_KEY").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
