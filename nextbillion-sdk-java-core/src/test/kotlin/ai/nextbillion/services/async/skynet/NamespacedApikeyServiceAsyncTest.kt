// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamespacedApikeyServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespacedApikeyServiceAsync = client.skynet().namespacedApikeys()

        val namespacedApikeyFuture =
            namespacedApikeyServiceAsync.create(
                NamespacedApikeyCreateParams.builder()
                    .key("key=API_KEY")
                    .namespace("namespace=test_name")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val namespacedApikey = namespacedApikeyFuture.get()
        namespacedApikey.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespacedApikeyServiceAsync = client.skynet().namespacedApikeys()

        val namespacedApikeyFuture =
            namespacedApikeyServiceAsync.delete(
                NamespacedApikeyDeleteParams.builder()
                    .key("key=API_KEY")
                    .keyToDelete("key_to_delete")
                    .namespace("namespace")
                    .build()
            )

        val namespacedApikey = namespacedApikeyFuture.get()
        namespacedApikey.validate()
    }
}
