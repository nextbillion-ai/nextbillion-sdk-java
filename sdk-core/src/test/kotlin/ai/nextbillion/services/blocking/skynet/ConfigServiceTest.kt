// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.skynet.config.ConfigRetrieveParams
import ai.nextbillion.models.skynet.config.ConfigTestWebhookParams
import ai.nextbillion.models.skynet.config.ConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configService = client.skynet().config()

        val config =
            configService.retrieve(
                ConfigRetrieveParams.builder()
                    .key("key=API_KEY")
                    .cluster(ConfigRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        config.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configService = client.skynet().config()

        val simpleResp =
            configService.update(
                ConfigUpdateParams.builder()
                    .key("key=API_KEY")
                    .cluster(ConfigUpdateParams.Cluster.AMERICA)
                    .addWebhook("string")
                    .build()
            )

        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun testWebhook() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val configService = client.skynet().config()

        val response =
            configService.testWebhook(ConfigTestWebhookParams.builder().key("key=API_KEY").build())

        response.validate()
    }
}
