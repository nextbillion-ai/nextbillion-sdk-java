// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.skynet.config.ConfigRetrieveParams
import com.nextbillion_sdk.api.models.skynet.config.ConfigTestWebhookParams
import com.nextbillion_sdk.api.models.skynet.config.ConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
