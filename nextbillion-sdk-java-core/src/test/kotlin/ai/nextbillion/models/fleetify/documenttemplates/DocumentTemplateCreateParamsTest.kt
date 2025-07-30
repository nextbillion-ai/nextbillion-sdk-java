// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTemplateCreateParamsTest {

    @Test
    fun create() {
        DocumentTemplateCreateParams.builder()
            .key("key")
            .addContent(
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
            )
            .name("name")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentTemplateCreateParams.builder()
                .key("key")
                .addContent(
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
                )
                .name("name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DocumentTemplateCreateParams.builder()
                .key("key")
                .addContent(
                    DocumentTemplateContentRequest.builder()
                        .label("\"label\": \"Specify Completion Time\"")
                        .type(DocumentTemplateContentRequest.Type.STRING)
                        .build()
                )
                .name("name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun body() {
        val params =
            DocumentTemplateCreateParams.builder()
                .key("key")
                .addContent(
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
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.content())
            .containsExactly(
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
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentTemplateCreateParams.builder()
                .key("key")
                .addContent(
                    DocumentTemplateContentRequest.builder()
                        .label("\"label\": \"Specify Completion Time\"")
                        .type(DocumentTemplateContentRequest.Type.STRING)
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.content())
            .containsExactly(
                DocumentTemplateContentRequest.builder()
                    .label("\"label\": \"Specify Completion Time\"")
                    .type(DocumentTemplateContentRequest.Type.STRING)
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }
}
