// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.documenttemplates

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DocumentTemplateListParams.builder().key("key").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params = DocumentTemplateListParams.builder().key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }
}
