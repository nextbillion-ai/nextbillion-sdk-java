// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.fleetify

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.handlers.errorBodyHandler
import io.nextbillion.api.core.handlers.errorHandler
import io.nextbillion.api.core.handlers.jsonHandler
import io.nextbillion.api.core.http.HttpMethod
import io.nextbillion.api.core.http.HttpRequest
import io.nextbillion.api.core.http.HttpResponse
import io.nextbillion.api.core.http.HttpResponse.Handler
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.core.http.json
import io.nextbillion.api.core.http.parseable
import io.nextbillion.api.core.prepare
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateCreateResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateDeleteResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateListParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateListResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentTemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentTemplateService {

    private val withRawResponse: DocumentTemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentTemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentTemplateService =
        DocumentTemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DocumentTemplateCreateParams,
        requestOptions: RequestOptions,
    ): DocumentTemplateCreateResponse =
        // post /fleetify/document_templates
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): DocumentTemplateRetrieveResponse =
        // get /fleetify/document_templates/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): DocumentTemplateUpdateResponse =
        // put /fleetify/document_templates/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DocumentTemplateListParams,
        requestOptions: RequestOptions,
    ): DocumentTemplateListResponse =
        // get /fleetify/document_templates
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions,
    ): DocumentTemplateDeleteResponse =
        // delete /fleetify/document_templates/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentTemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentTemplateService.WithRawResponse =
            DocumentTemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DocumentTemplateCreateResponse> =
            jsonHandler<DocumentTemplateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DocumentTemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentTemplateCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<DocumentTemplateRetrieveResponse> =
            jsonHandler<DocumentTemplateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentTemplateRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DocumentTemplateUpdateResponse> =
            jsonHandler<DocumentTemplateUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentTemplateUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DocumentTemplateListResponse> =
            jsonHandler<DocumentTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentTemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentTemplateListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "document_templates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DocumentTemplateDeleteResponse> =
            jsonHandler<DocumentTemplateDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentTemplateDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
