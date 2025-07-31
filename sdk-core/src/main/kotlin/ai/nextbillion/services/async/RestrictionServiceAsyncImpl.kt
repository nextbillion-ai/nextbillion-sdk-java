// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.handlers.errorBodyHandler
import ai.nextbillion.core.handlers.errorHandler
import ai.nextbillion.core.handlers.jsonHandler
import ai.nextbillion.core.http.HttpMethod
import ai.nextbillion.core.http.HttpRequest
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponse.Handler
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepareAsync
import ai.nextbillion.models.restrictions.RestrictionCreateParams
import ai.nextbillion.models.restrictions.RestrictionDeleteParams
import ai.nextbillion.models.restrictions.RestrictionDeleteResponse
import ai.nextbillion.models.restrictions.RestrictionListByBboxParams
import ai.nextbillion.models.restrictions.RestrictionListParams
import ai.nextbillion.models.restrictions.RestrictionListResponse
import ai.nextbillion.models.restrictions.RestrictionRetrieveParams
import ai.nextbillion.models.restrictions.RestrictionSetStateParams
import ai.nextbillion.models.restrictions.RestrictionUpdateParams
import ai.nextbillion.models.restrictions.RichGroupResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RestrictionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RestrictionServiceAsync {

    private val withRawResponse: RestrictionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RestrictionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionServiceAsync =
        RestrictionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RestrictionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RichGroupResponse> =
        // post /restrictions/{restriction_type}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RichGroupResponse> =
        // get /restrictions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RichGroupResponse> =
        // patch /restrictions/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RestrictionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RestrictionListResponse> =
        // get /restrictions/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RestrictionDeleteResponse> =
        // delete /restrictions/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listByBbox(
        params: RestrictionListByBboxParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RichGroupResponse>> =
        // get /restrictions
        withRawResponse().listByBbox(params, requestOptions).thenApply { it.parse() }

    override fun setState(
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RichGroupResponse> =
        // put /restrictions/{id}/state
        withRawResponse().setState(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RestrictionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RestrictionServiceAsync.WithRawResponse =
            RestrictionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RestrictionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> {
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

        private val retrieveHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", params._pathParam(0))
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

        private val updateHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> {
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

        private val listHandler: Handler<RestrictionListResponse> =
            jsonHandler<RestrictionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RestrictionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RestrictionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions", "list")
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

        private val deleteHandler: Handler<RestrictionDeleteResponse> =
            jsonHandler<RestrictionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RestrictionDeleteResponse>> {
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

        private val listByBboxHandler: Handler<List<RichGroupResponse>> =
            jsonHandler<List<RichGroupResponse>>(clientOptions.jsonMapper)

        override fun listByBbox(
            params: RestrictionListByBboxParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RichGroupResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("restrictions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listByBboxHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val setStateHandler: Handler<RichGroupResponse> =
            jsonHandler<RichGroupResponse>(clientOptions.jsonMapper)

        override fun setState(
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
