// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateContentRequestTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentTemplateContentRequest =
            DocumentTemplateContentRequest.builder()
                .label("\"label\": \"Specify Completion Time\"")
                .type(DocumentTemplateContentRequest.Type.STRING)
                .meta(
                    DocumentTemplateContentRequest.Meta.builder()
                        .addOption(
                            DocumentTemplateContentRequest.Meta.Option.builder()
                                .label("\"label\": \"Option 1\"")
                                .value("\"value\": \"Car\"")
                                .build()
                        )
                        .build()
                )
                .name("\"name\" : \"Completion DateTime\"")
                .required(true)
                .validation(
                    DocumentTemplateContentRequest.Validation.builder()
                        .max(0L)
                        .maxItems(0L)
                        .min(0L)
                        .minItems(0L)
                        .build()
                )
                .build()

        assertThat(documentTemplateContentRequest.label())
            .isEqualTo("\"label\": \"Specify Completion Time\"")
        assertThat(documentTemplateContentRequest.type())
            .isEqualTo(DocumentTemplateContentRequest.Type.STRING)
        assertThat(documentTemplateContentRequest.meta())
            .contains(
                DocumentTemplateContentRequest.Meta.builder()
                    .addOption(
                        DocumentTemplateContentRequest.Meta.Option.builder()
                            .label("\"label\": \"Option 1\"")
                            .value("\"value\": \"Car\"")
                            .build()
                    )
                    .build()
            )
        assertThat(documentTemplateContentRequest.name())
            .contains("\"name\" : \"Completion DateTime\"")
        assertThat(documentTemplateContentRequest.required()).contains(true)
        assertThat(documentTemplateContentRequest.validation())
            .contains(
                DocumentTemplateContentRequest.Validation.builder()
                    .max(0L)
                    .maxItems(0L)
                    .min(0L)
                    .minItems(0L)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateContentRequest =
            DocumentTemplateContentRequest.builder()
                .label("\"label\": \"Specify Completion Time\"")
                .type(DocumentTemplateContentRequest.Type.STRING)
                .meta(
                    DocumentTemplateContentRequest.Meta.builder()
                        .addOption(
                            DocumentTemplateContentRequest.Meta.Option.builder()
                                .label("\"label\": \"Option 1\"")
                                .value("\"value\": \"Car\"")
                                .build()
                        )
                        .build()
                )
                .name("\"name\" : \"Completion DateTime\"")
                .required(true)
                .validation(
                    DocumentTemplateContentRequest.Validation.builder()
                        .max(0L)
                        .maxItems(0L)
                        .min(0L)
                        .minItems(0L)
                        .build()
                )
                .build()

        val roundtrippedDocumentTemplateContentRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateContentRequest),
                jacksonTypeRef<DocumentTemplateContentRequest>(),
            )

        assertThat(roundtrippedDocumentTemplateContentRequest)
            .isEqualTo(documentTemplateContentRequest)
    }
}
