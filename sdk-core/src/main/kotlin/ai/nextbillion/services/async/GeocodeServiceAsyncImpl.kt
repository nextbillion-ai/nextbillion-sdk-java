// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
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
import ai.nextbillion.models.geocode.GeocodeBatchCreateParams
import ai.nextbillion.models.geocode.GeocodeBatchCreateResponse
import ai.nextbillion.models.geocode.GeocodeRetrieveParams
import ai.nextbillion.models.geocode.GeocodeRetrieveResponse
import ai.nextbillion.models.geocode.GeocodeStructuredRetrieveParams
import ai.nextbillion.models.geocode.GeocodeStructuredRetrieveResponse
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
