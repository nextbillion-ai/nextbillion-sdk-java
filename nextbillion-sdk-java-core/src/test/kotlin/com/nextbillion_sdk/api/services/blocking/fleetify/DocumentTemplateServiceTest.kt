// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.fleetify

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateContentRequest
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateListParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DocumentTemplateServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateService = client.fleetify().documentTemplates()

        val documentTemplate =
            documentTemplateService.create(
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

        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateService = client.fleetify().documentTemplates()

        val documentTemplate =
            documentTemplateService.retrieve(
                DocumentTemplateRetrieveParams.builder().id("id").key("key").build()
            )

        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateService = client.fleetify().documentTemplates()

        val documentTemplate =
            documentTemplateService.update(
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

        documentTemplate.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateService = client.fleetify().documentTemplates()

        val documentTemplates =
            documentTemplateService.list(DocumentTemplateListParams.builder().key("key").build())

        documentTemplates.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentTemplateService = client.fleetify().documentTemplates()

        val documentTemplate =
            documentTemplateService.delete(
                DocumentTemplateDeleteParams.builder().id("id").key("key").build()
            )

        documentTemplate.validate()
    }
}
