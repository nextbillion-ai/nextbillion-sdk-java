// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization.v2

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V2RetrieveResultParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        V2RetrieveResultParams.builder().id("id").key("key=API_KEY").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = V2RetrieveResultParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("id", "id").put("key", "key=API_KEY").build())
    }
}
