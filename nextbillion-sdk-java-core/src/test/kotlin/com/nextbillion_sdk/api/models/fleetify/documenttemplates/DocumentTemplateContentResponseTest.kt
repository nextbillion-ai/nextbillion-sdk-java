// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.fleetify.documenttemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateContentResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentTemplateContentResponse =
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

        assertThat(documentTemplateContentResponse.label()).contains("label")
        assertThat(documentTemplateContentResponse.meta())
            .contains(
                DocumentTemplateContentResponse.Meta.builder()
                    .addOption(
                        DocumentTemplateContentResponse.Meta.Option.builder()
                            .label("label")
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(documentTemplateContentResponse.name()).contains("name")
        assertThat(documentTemplateContentResponse.required()).contains(true)
        assertThat(documentTemplateContentResponse.type()).contains("type")
        assertThat(documentTemplateContentResponse.validation())
            .contains(
                DocumentTemplateContentResponse.Validation.builder()
                    .max(0L)
                    .maxItems("max_items")
                    .min(0L)
                    .minItems("min_items")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateContentResponse =
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

        val roundtrippedDocumentTemplateContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateContentResponse),
                jacksonTypeRef<DocumentTemplateContentResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateContentResponse)
            .isEqualTo(documentTemplateContentResponse)
    }
}
