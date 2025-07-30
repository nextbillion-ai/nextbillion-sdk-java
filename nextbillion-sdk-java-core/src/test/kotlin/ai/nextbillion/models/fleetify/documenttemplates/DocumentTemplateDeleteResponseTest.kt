// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTemplateDeleteResponseTest {

    @Test
    fun create() {
        val documentTemplateDeleteResponse =
            DocumentTemplateDeleteResponse.builder().msg("msg").status(0L).build()

        assertThat(documentTemplateDeleteResponse.msg()).contains("msg")
        assertThat(documentTemplateDeleteResponse.status()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateDeleteResponse =
            DocumentTemplateDeleteResponse.builder().msg("msg").status(0L).build()

        val roundtrippedDocumentTemplateDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateDeleteResponse),
                jacksonTypeRef<DocumentTemplateDeleteResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateDeleteResponse)
            .isEqualTo(documentTemplateDeleteResponse)
    }
}
