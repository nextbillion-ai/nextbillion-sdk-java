// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTemplateUpdateResponseTest {

    @Test
    fun create() {
        val documentTemplateUpdateResponse =
            DocumentTemplateUpdateResponse.builder()
                .data(
                    DocumentTemplateUpdateResponse.Data.builder()
                        .id("id")
                        .addContent(
                            DocumentTemplateContentResponse.builder()
                                .label("label")
                                .meta(
                                    DocumentTemplateContentResponse.Meta.builder()
                                        .addOption(
                                            DocumentTemplateContentResponse.Meta.Option.builder()
                                                .label("label")
                                                .value("value")
                                                .build()
                                        )
                                        .build()
                                )
                                .name("name")
                                .required(true)
                                .type("type")
                                .validation(
                                    DocumentTemplateContentResponse.Validation.builder()
                                        .max(0L)
                                        .maxItems("max_items")
                                        .min(0L)
                                        .minItems("min_items")
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .msg("msg")
                .status(0L)
                .build()

        assertThat(documentTemplateUpdateResponse.data())
            .contains(
                DocumentTemplateUpdateResponse.Data.builder()
                    .id("id")
                    .addContent(
                        DocumentTemplateContentResponse.builder()
                            .label("label")
                            .meta(
                                DocumentTemplateContentResponse.Meta.builder()
                                    .addOption(
                                        DocumentTemplateContentResponse.Meta.Option.builder()
                                            .label("label")
                                            .value("value")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("name")
                            .required(true)
                            .type("type")
                            .validation(
                                DocumentTemplateContentResponse.Validation.builder()
                                    .max(0L)
                                    .maxItems("max_items")
                                    .min(0L)
                                    .minItems("min_items")
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(documentTemplateUpdateResponse.msg()).contains("msg")
        assertThat(documentTemplateUpdateResponse.status()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateUpdateResponse =
            DocumentTemplateUpdateResponse.builder()
                .data(
                    DocumentTemplateUpdateResponse.Data.builder()
                        .id("id")
                        .addContent(
                            DocumentTemplateContentResponse.builder()
                                .label("label")
                                .meta(
                                    DocumentTemplateContentResponse.Meta.builder()
                                        .addOption(
                                            DocumentTemplateContentResponse.Meta.Option.builder()
                                                .label("label")
                                                .value("value")
                                                .build()
                                        )
                                        .build()
                                )
                                .name("name")
                                .required(true)
                                .type("type")
                                .validation(
                                    DocumentTemplateContentResponse.Validation.builder()
                                        .max(0L)
                                        .maxItems("max_items")
                                        .min(0L)
                                        .minItems("min_items")
                                        .build()
                                )
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .msg("msg")
                .status(0L)
                .build()

        val roundtrippedDocumentTemplateUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateUpdateResponse),
                jacksonTypeRef<DocumentTemplateUpdateResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateUpdateResponse)
            .isEqualTo(documentTemplateUpdateResponse)
    }
}
