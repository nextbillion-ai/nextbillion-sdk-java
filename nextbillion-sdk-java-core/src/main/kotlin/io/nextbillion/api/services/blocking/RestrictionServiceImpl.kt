// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

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
import io.nextbillion.api.models.restrictions.RestrictionCreateParams
import io.nextbillion.api.models.restrictions.RestrictionDeleteParams
import io.nextbillion.api.models.restrictions.RestrictionDeleteResponse
import io.nextbillion.api.models.restrictions.RestrictionListByBboxParams
import io.nextbillion.api.models.restrictions.RestrictionListParams
import io.nextbillion.api.models.restrictions.RestrictionListResponse
import io.nextbillion.api.models.restrictions.RestrictionRetrieveParams
import io.nextbillion.api.models.restrictions.RestrictionSetStateParams
import io.nextbillion.api.models.restrictions.RestrictionUpdateParams
import io.nextbillion.api.models.restrictions.RichGroupResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RestrictionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RestrictionService {

    private val withRawResponse: RestrictionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RestrictionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionService =
        RestrictionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RestrictionCreateParams,
        requestOptions: RequestOptions,
    ): RichGroupResponse =
        // post /restrictions/{restriction_type}
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions,
    ): RichGroupResponse =
        // get /restrictions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions,
    ): RichGroupResponse =
        // patch /restrictions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RestrictionListParams,
        requestOptions: RequestOptions,
    ): RestrictionListResponse =
        // get /restrictions/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions,
    ): RestrictionDeleteResponse =
        // delete /restrictions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun listByBbox(
        params: RestrictionListByBboxParams,
        requestOptions: RequestOptions,
    ): List<RichGroupResponse> =
        // get /restrictions
        withRawResponse().listByBbox(params, requestOptions).parse()

    override fun setState(
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions,
    ): RichGroupResponse =
        // put /restrictions/{id}/state
        withRawResponse().setState(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RestrictionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RestrictionService.WithRawResponse =
            RestrictionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RestrictionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RichGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("restrictionType", params.restrictionType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0))
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

        private val retrieveHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RichGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0))
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

        private val updateHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RichGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0))
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

        private val listHandler: Handler<RestrictionListResponse> =
            jsonHandler<RestrictionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RestrictionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RestrictionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", "list")
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

        private val deleteHandler: Handler<RestrictionDeleteResponse> =
            jsonHandler<RestrictionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RestrictionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0))
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

        private val listByBboxHandler: Handler<List<RichGroupResponse>> =
            jsonHandler<List<RichGroupResponse>>(clientOptions.jsonMapper)

        override fun listByBbox(
            params: RestrictionListByBboxParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RichGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByBboxHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val setStateHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun setState(
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RichGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0), "state")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setStateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
