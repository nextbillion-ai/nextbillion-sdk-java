// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTemplateListParamsTest {

    @Test
    fun create() {
        DocumentTemplateListParams.builder().key("key").build()
    }

    @Test
    fun queryParams() {
        val params = DocumentTemplateListParams.builder().key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }
}
