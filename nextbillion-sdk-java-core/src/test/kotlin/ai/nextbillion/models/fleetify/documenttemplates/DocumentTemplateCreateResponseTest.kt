// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentTemplateCreateResponse =
            DocumentTemplateCreateResponse.builder()
                .data(
                    DocumentTemplateCreateResponse.Data.builder()
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

        assertThat(documentTemplateCreateResponse.data())
            .contains(
                DocumentTemplateCreateResponse.Data.builder()
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
        assertThat(documentTemplateCreateResponse.msg()).contains("msg")
        assertThat(documentTemplateCreateResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateCreateResponse =
            DocumentTemplateCreateResponse.builder()
                .data(
                    DocumentTemplateCreateResponse.Data.builder()
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

        val roundtrippedDocumentTemplateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateCreateResponse),
                jacksonTypeRef<DocumentTemplateCreateResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateCreateResponse)
            .isEqualTo(documentTemplateCreateResponse)
    }
}
