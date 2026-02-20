// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.restrictionsitems.RestrictionsItemListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionsItemServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val restrictionsItemService = client.restrictionsItems()

        val restrictionsItems =
            restrictionsItemService.list(
                RestrictionsItemListParams.builder()
                    .maxLat(0.0)
                    .maxLon(0.0)
                    .minLat(0.0)
                    .minLon(0.0)
                    .groupId(0.0)
                    .mode(RestrictionsItemListParams.Mode._0W)
                    .restrictionType(RestrictionsItemListParams.RestrictionType.TURN)
                    .source("source")
                    .state(RestrictionsItemListParams.State.ENABLED)
                    .status(RestrictionsItemListParams.Status.ACTIVE)
                    .build()
            )

        restrictionsItems.forEach { it.validate() }
    }
}
