// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
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
import io.nextbillion.api.models.geocode.GeocodeBatchCreateParams
import io.nextbillion.api.models.geocode.GeocodeBatchCreateResponse
import io.nextbillion.api.models.geocode.GeocodeRetrieveParams
import io.nextbillion.api.models.geocode.GeocodeRetrieveResponse
import io.nextbillion.api.models.geocode.GeocodeStructuredRetrieveParams
import io.nextbillion.api.models.geocode.GeocodeStructuredRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class GeocodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GeocodeServiceAsync {

    private val withRawResponse: GeocodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GeocodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeocodeServiceAsync =
        GeocodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: GeocodeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeocodeRetrieveResponse> =
        // get /geocode
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun batchCreate(
        params: GeocodeBatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeocodeBatchCreateResponse> =
        // post /geocode/batch
        withRawResponse().batchCreate(params, requestOptions).thenApply { it.parse() }

    override fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GeocodeStructuredRetrieveResponse> =
        // get /geocode/structured
        withRawResponse().structuredRetrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeocodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeocodeServiceAsync.WithRawResponse =
            GeocodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GeocodeRetrieveResponse> =
            jsonHandler<GeocodeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GeocodeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeocodeRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode")
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

        private val batchCreateHandler: Handler<GeocodeBatchCreateResponse> =
            jsonHandler<GeocodeBatchCreateResponse>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: GeocodeBatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeocodeBatchCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { batchCreateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val structuredRetrieveHandler: Handler<GeocodeStructuredRetrieveResponse> =
            jsonHandler<GeocodeStructuredRetrieveResponse>(clientOptions.jsonMapper)

        override fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GeocodeStructuredRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode", "structured")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { structuredRetrieveHandler.handle(it) }
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
