// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.restrictions

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionSetStateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        RestrictionSetStateParams.builder()
            .id(0L)
            .key("key=API_KEY")
            .state(RestrictionSetStateParams.State.ENABLED)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            RestrictionSetStateParams.builder()
                .id(0L)
                .key("key=API_KEY")
                .state(RestrictionSetStateParams.State.ENABLED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            RestrictionSetStateParams.builder()
                .id(0L)
                .key("key=API_KEY")
                .state(RestrictionSetStateParams.State.ENABLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            RestrictionSetStateParams.builder()
                .id(0L)
                .key("key=API_KEY")
                .state(RestrictionSetStateParams.State.ENABLED)
                .build()

        val body = params._body()

        assertThat(body.state()).isEqualTo(RestrictionSetStateParams.State.ENABLED)
    }
}
