// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentTemplateListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentTemplateListResponse =
            DocumentTemplateListResponse.builder()
                .addData(
                    DocumentTemplateListResponse.Data.builder()
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

        assertThat(documentTemplateListResponse.data().getOrNull())
            .containsExactly(
                DocumentTemplateListResponse.Data.builder()
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
        assertThat(documentTemplateListResponse.msg()).contains("msg")
        assertThat(documentTemplateListResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentTemplateListResponse =
            DocumentTemplateListResponse.builder()
                .addData(
                    DocumentTemplateListResponse.Data.builder()
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

        val roundtrippedDocumentTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentTemplateListResponse),
                jacksonTypeRef<DocumentTemplateListResponse>(),
            )

        assertThat(roundtrippedDocumentTemplateListResponse).isEqualTo(documentTemplateListResponse)
    }
}
