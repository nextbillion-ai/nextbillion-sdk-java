// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentTemplateRetrieveResponse =
            DocumentTemplateRetrieveResponse.builder()
                .data(
                    DocumentTemplateRetrieveResponse.Data.builder()
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

        assertThat(documentTemplateRetrieveResponse.data())
            .contains(
                DocumentTemplateRetrieveResponse.Data.builder()
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
        assertThat(documentTemplateRetrieveResponse.msg()).contains("msg")
        assertThat(documentTemplateRetrieveResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateRetrieveResponse =
            DocumentTemplateRetrieveResponse.builder()
                .data(
                    DocumentTemplateRetrieveResponse.Data.builder()
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

        val roundtrippedDocumentTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateRetrieveResponse),
                jacksonTypeRef<DocumentTemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateRetrieveResponse)
            .isEqualTo(documentTemplateRetrieveResponse)
    }
}
