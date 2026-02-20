// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.areas.AreaListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AreaServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val areaService = client.areas()

        val areas = areaService.list(AreaListParams.builder().key("key=API_KEY").build())

        areas.forEach { it.validate() }
    }
}
