// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geocode

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeocodeRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        GeocodeRetrieveParams.builder()
            .key("key=API_KEY")
            .q("q=125, Berliner, berlin")
            .at("at=52.5308,13.3856")
            .in_("in=countryCode:CAN,MEX,USA")
            .lang("lang=en")
            .limit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            GeocodeRetrieveParams.builder()
                .key("key=API_KEY")
                .q("q=125, Berliner, berlin")
                .at("at=52.5308,13.3856")
                .in_("in=countryCode:CAN,MEX,USA")
                .lang("lang=en")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("q", "q=125, Berliner, berlin")
                    .put("at", "at=52.5308,13.3856")
                    .put("in", "in=countryCode:CAN,MEX,USA")
                    .put("lang", "lang=en")
                    .put("limit", "0")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GeocodeRetrieveParams.builder().key("key=API_KEY").q("q=125, Berliner, berlin").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("q", "q=125, Berliner, berlin")
                    .build()
            )
    }
}
