// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.fleetify

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.handlers.errorBodyHandler
import com.nextbillion_sdk.api.core.handlers.errorHandler
import com.nextbillion_sdk.api.core.handlers.jsonHandler
import com.nextbillion_sdk.api.core.http.HttpMethod
import com.nextbillion_sdk.api.core.http.HttpRequest
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.core.http.HttpResponse.Handler
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateCreateResponse
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateDeleteResponse
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateListParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateListResponse
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveResponse
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import com.nextbillion_sdk.api.models.fleetify.documenttemplates.DocumentTemplateUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentTemplateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DocumentTemplateServiceAsync {

    private val withRawResponse: DocumentTemplateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentTemplateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DocumentTemplateServiceAsync =
        DocumentTemplateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DocumentTemplateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentTemplateCreateResponse> =
        // post /fleetify/document_templates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentTemplateRetrieveResponse> =
        // get /fleetify/document_templates/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentTemplateUpdateResponse> =
        // put /fleetify/document_templates/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DocumentTemplateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentTemplateListResponse> =
        // get /fleetify/document_templates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentTemplateDeleteResponse> =
        // delete /fleetify/document_templates/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentTemplateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentTemplateServiceAsync.WithRawResponse =
            DocumentTemplateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DocumentTemplateCreateResponse> =
            jsonHandler<DocumentTemplateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DocumentTemplateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<DocumentTemplateRetrieveResponse> =
            jsonHandler<DocumentTemplateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<DocumentTemplateUpdateResponse> =
            jsonHandler<DocumentTemplateUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DocumentTemplateListResponse> =
            jsonHandler<DocumentTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentTemplateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<DocumentTemplateDeleteResponse> =
            jsonHandler<DocumentTemplateDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
