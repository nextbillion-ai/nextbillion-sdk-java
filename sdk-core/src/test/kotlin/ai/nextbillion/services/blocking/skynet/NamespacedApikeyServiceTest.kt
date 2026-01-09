// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamespacedApikeyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespacedApikeyService = client.skynet().namespacedApikeys()

        val namespacedApikey =
            namespacedApikeyService.create(
                NamespacedApikeyCreateParams.builder()
                    .key("key=API_KEY")
                    .namespace("namespace=test_name")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        namespacedApikey.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespacedApikeyService = client.skynet().namespacedApikeys()

        val namespacedApikey =
            namespacedApikeyService.delete(
                NamespacedApikeyDeleteParams.builder()
                    .key("key=API_KEY")
                    .keyToDelete("key_to_delete")
                    .namespace("namespace")
                    .build()
            )

        namespacedApikey.validate()
    }
}
