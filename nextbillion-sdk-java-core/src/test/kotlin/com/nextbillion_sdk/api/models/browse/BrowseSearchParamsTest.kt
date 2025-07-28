// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.browse

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrowseSearchParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BrowseSearchParams.builder()
            .key("key=API_KEY")
            .at("at=52.5308,13.3856")
            .categories("categories: schools")
            .in_("in=countryCode:CAN,MEX,USA")
            .lang("lang=en")
            .limit(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            BrowseSearchParams.builder()
                .key("key=API_KEY")
                .at("at=52.5308,13.3856")
                .categories("categories: schools")
                .in_("in=countryCode:CAN,MEX,USA")
                .lang("lang=en")
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("at", "at=52.5308,13.3856")
                    .put("categories", "categories: schools")
                    .put("in", "in=countryCode:CAN,MEX,USA")
                    .put("lang", "lang=en")
                    .put("limit", "0")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrowseSearchParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
