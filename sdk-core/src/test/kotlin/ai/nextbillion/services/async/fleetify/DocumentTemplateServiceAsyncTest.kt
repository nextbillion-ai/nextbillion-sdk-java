// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.fleetify

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateContentRequest
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateListParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentTemplateServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateServiceAsync = client.fleetify().documentTemplates()

        val documentTemplateFuture =
            documentTemplateServiceAsync.create(
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
            )

        val documentTemplate = documentTemplateFuture.get()
        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateServiceAsync = client.fleetify().documentTemplates()

        val documentTemplateFuture =
            documentTemplateServiceAsync.retrieve(
                DocumentTemplateRetrieveParams.builder().id("id").key("key").build()
            )

        val documentTemplate = documentTemplateFuture.get()
        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateServiceAsync = client.fleetify().documentTemplates()

        val documentTemplateFuture =
            documentTemplateServiceAsync.update(
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
            )

        val documentTemplate = documentTemplateFuture.get()
        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateServiceAsync = client.fleetify().documentTemplates()

        val documentTemplatesFuture =
            documentTemplateServiceAsync.list(
                DocumentTemplateListParams.builder().key("key").build()
            )

        val documentTemplates = documentTemplatesFuture.get()
        documentTemplates.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateServiceAsync = client.fleetify().documentTemplates()

        val documentTemplateFuture =
            documentTemplateServiceAsync.delete(
                DocumentTemplateDeleteParams.builder().id("id").key("key").build()
            )

        val documentTemplate = documentTemplateFuture.get()
        documentTemplate.validate()
    }
}
