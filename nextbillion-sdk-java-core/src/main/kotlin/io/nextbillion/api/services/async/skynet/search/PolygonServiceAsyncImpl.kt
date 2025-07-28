// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet.search

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
import io.nextbillion.api.models.skynet.search.SearchResponse
import io.nextbillion.api.models.skynet.search.polygon.PolygonCreateParams
import io.nextbillion.api.models.skynet.search.polygon.PolygonGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PolygonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PolygonServiceAsync {

    private val withRawResponse: PolygonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolygonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolygonServiceAsync =
        PolygonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PolygonCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SearchResponse> =
        // post /skynet/search/polygon
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: PolygonGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SearchResponse> =
        // get /skynet/search/polygon
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolygonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolygonServiceAsync.WithRawResponse =
            PolygonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PolygonCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "polygon")
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

        private val getHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PolygonGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "polygon")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
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
