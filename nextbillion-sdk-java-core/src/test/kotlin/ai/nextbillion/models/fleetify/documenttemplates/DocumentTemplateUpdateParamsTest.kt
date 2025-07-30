// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentTemplateUpdateParamsTest {

    @Test
    fun create() {
        DocumentTemplateUpdateParams.builder()
            .id("id")
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
    fun pathParams() {
        val params = DocumentTemplateUpdateParams.builder().id("id").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DocumentTemplateUpdateParams.builder()
                .id("id")
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
        val params = DocumentTemplateUpdateParams.builder().id("id").key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun body() {
        val params =
            DocumentTemplateUpdateParams.builder()
                .id("id")
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

        assertThat(body.content().getOrNull())
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
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DocumentTemplateUpdateParams.builder().id("id").key("key").build()

        val body = params._body()
    }
}
