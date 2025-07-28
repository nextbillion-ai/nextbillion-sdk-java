// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.distancematrix.json

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        JsonRetrieveParams.builder()
            .destinations("destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878")
            .key("key=API_KEY")
            .origins("origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878")
            .approaches(JsonRetrieveParams.Approaches.UNRESTRICTED)
            .avoid(JsonRetrieveParams.Avoid.TOLL)
            .bearings("bearings=0,180;0,180")
            .mode(JsonRetrieveParams.Mode.CAR)
            .routeFailedPrompt(true)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            JsonRetrieveParams.builder()
                .destinations(
                    "destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878"
                )
                .key("key=API_KEY")
                .origins("origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878")
                .approaches(JsonRetrieveParams.Approaches.UNRESTRICTED)
                .avoid(JsonRetrieveParams.Avoid.TOLL)
                .bearings("bearings=0,180;0,180")
                .mode(JsonRetrieveParams.Mode.CAR)
                .routeFailedPrompt(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "destinations",
                        "destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878",
                    )
                    .put("key", "key=API_KEY")
                    .put(
                        "origins",
                        "origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878",
                    )
                    .put("approaches", "`unrestricted`")
                    .put("avoid", "toll")
                    .put("bearings", "bearings=0,180;0,180")
                    .put("mode", "`car`")
                    .put("route_failed_prompt", "true")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JsonRetrieveParams.builder()
                .destinations(
                    "destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878"
                )
                .key("key=API_KEY")
                .origins("origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "destinations",
                        "destinations=41.349302,2.136480|41.389925,2.136258|41.357961,2.097878",
                    )
                    .put("key", "key=API_KEY")
                    .put(
                        "origins",
                        "origins:41.349302,2.136480|41.389925,2.136258|41.357961,2.097878",
                    )
                    .build()
            )
    }
}
