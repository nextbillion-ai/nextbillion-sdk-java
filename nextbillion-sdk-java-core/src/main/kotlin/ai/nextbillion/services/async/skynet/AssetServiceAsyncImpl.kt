// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

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
import ai.nextbillion.models.skynet.asset.AssetBindParams
import ai.nextbillion.models.skynet.asset.AssetCreateParams
import ai.nextbillion.models.skynet.asset.AssetCreateResponse
import ai.nextbillion.models.skynet.asset.AssetDeleteParams
import ai.nextbillion.models.skynet.asset.AssetListParams
import ai.nextbillion.models.skynet.asset.AssetListResponse
import ai.nextbillion.models.skynet.asset.AssetRetrieveParams
import ai.nextbillion.models.skynet.asset.AssetRetrieveResponse
import ai.nextbillion.models.skynet.asset.AssetTrackParams
import ai.nextbillion.models.skynet.asset.AssetUpdateAttributesParams
import ai.nextbillion.models.skynet.asset.AssetUpdateParams
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.services.async.skynet.asset.EventServiceAsync
import ai.nextbillion.services.async.skynet.asset.EventServiceAsyncImpl
import ai.nextbillion.services.async.skynet.asset.LocationServiceAsync
import ai.nextbillion.services.async.skynet.asset.LocationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssetServiceAsync {

    private val withRawResponse: AssetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val event: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val location: LocationServiceAsync by lazy { LocationServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetServiceAsync =
        AssetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun event(): EventServiceAsync = event

    override fun location(): LocationServiceAsync = location

    override fun create(
        params: AssetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssetCreateResponse> =
        // post /skynet/asset
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AssetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssetRetrieveResponse> =
        // get /skynet/asset/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AssetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // put /skynet/asset/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AssetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssetListResponse> =
        // get /skynet/asset/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // delete /skynet/asset/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun bind(
        params: AssetBindParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // post /skynet/asset/{id}/bind
        withRawResponse().bind(params, requestOptions).thenApply { it.parse() }

    override fun track(
        params: AssetTrackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // post /skynet/asset/{id}/track
        withRawResponse().track(params, requestOptions).thenApply { it.parse() }

    override fun updateAttributes(
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimpleResp> =
        // put /skynet/asset/{id}/attributes
        withRawResponse().updateAttributes(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val event: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationServiceAsync.WithRawResponse by lazy {
            LocationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetServiceAsync.WithRawResponse =
            AssetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun event(): EventServiceAsync.WithRawResponse = event

        override fun location(): LocationServiceAsync.WithRawResponse = location

        private val createHandler: Handler<AssetCreateResponse> =
            jsonHandler<AssetCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AssetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssetCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset")
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

        private val retrieveHandler: Handler<AssetRetrieveResponse> =
            jsonHandler<AssetRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AssetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssetRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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
            params: AssetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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

        private val listHandler: Handler<AssetListResponse> =
            jsonHandler<AssetListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AssetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssetListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", "list")
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
            params: AssetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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

        private val bindHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun bind(
            params: AssetBindParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "bind")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { bindHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val trackHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun track(
            params: AssetTrackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "track")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { trackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateAttributesHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun updateAttributes(
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "attributes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateAttributesHandler.handle(it) }
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
