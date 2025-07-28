// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.skynet.config.ConfigRetrieveParams
import io.nextbillion.api.models.skynet.config.ConfigTestWebhookParams
import io.nextbillion.api.models.skynet.config.ConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun testWebhook() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configServiceAsync = client.skynet().config()

        val responseFuture =
            configServiceAsync.testWebhook(
                ConfigTestWebhookParams.builder().key("key=API_KEY").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
