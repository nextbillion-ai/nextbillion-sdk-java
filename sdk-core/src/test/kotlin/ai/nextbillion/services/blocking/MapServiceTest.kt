// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MapServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSegment() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val mapService = client.map()

        mapService.createSegment()
    }
}
