// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

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
import io.nextbillion.api.core.prepareAsync
import io.nextbillion.api.models.geofence.GeofenceContainsParams
import io.nextbillion.api.models.geofence.GeofenceContainsResponse
import io.nextbillion.api.models.geofence.GeofenceCreateParams
import io.nextbillion.api.models.geofence.GeofenceCreateResponse
import io.nextbillion.api.models.geofence.GeofenceDeleteParams
import io.nextbillion.api.models.geofence.GeofenceListParams
import io.nextbillion.api.models.geofence.GeofenceListResponse
import io.nextbillion.api.models.geofence.GeofenceRetrieveParams
import io.nextbillion.api.models.geofence.GeofenceRetrieveResponse
import io.nextbillion.api.models.geofence.GeofenceUpdateParams
import io.nextbillion.api.models.skynet.asset.SimpleResp
import io.nextbillion.api.services.async.geofence.BatchServiceAsync
import io.nextbillion.api.services.async.geofence.BatchServiceAsyncImpl
import io.nextbillion.api.services.async.geofence.ConsoleServiceAsync
import io.nextbillion.api.services.async.geofence.ConsoleServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GeofenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GeofenceServiceAsync {

    private val withRawResponse: GeofenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val console: ConsoleServiceAsync by lazy { ConsoleServiceAsyncImpl(clientOptions) }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GeofenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeofenceServiceAsync =
        GeofenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun console(): ConsoleServiceAsync = console

    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: GeofenceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeofenceCreateResponse> =
        // post /geofence
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeofenceRetrieveResponse> =
        // get /geofence/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: GeofenceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // put /geofence/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GeofenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeofenceListResponse> =
        // get /geofence/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GeofenceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // delete /geofence/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun contains(
        params: GeofenceContainsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeofenceContainsResponse> =
        // get /geofence/contain
        withRawResponse().contains(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeofenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val console: ConsoleServiceAsync.WithRawResponse by lazy {
            ConsoleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeofenceServiceAsync.WithRawResponse =
            GeofenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun console(): ConsoleServiceAsync.WithRawResponse = console

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<GeofenceCreateResponse> =
            jsonHandler<GeofenceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GeofenceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeofenceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence")
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

        private val retrieveHandler: Handler<GeofenceRetrieveResponse> =
            jsonHandler<GeofenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeofenceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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

        private val updateHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun update(
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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

        private val listHandler: Handler<GeofenceListResponse> =
            jsonHandler<GeofenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GeofenceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeofenceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "list")
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

        private val deleteHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun delete(
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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

        private val containsHandler: Handler<GeofenceContainsResponse> =
            jsonHandler<GeofenceContainsResponse>(clientOptions.jsonMapper)

        override fun contains(
            params: GeofenceContainsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeofenceContainsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "contain")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { containsHandler.handle(it) }
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
