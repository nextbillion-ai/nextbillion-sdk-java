// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.skynet

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.handlers.errorBodyHandler
import com.nextbillion_sdk.api.core.handlers.errorHandler
import com.nextbillion_sdk.api.core.handlers.jsonHandler
import com.nextbillion_sdk.api.core.http.HttpMethod
import com.nextbillion_sdk.api.core.http.HttpRequest
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.core.http.HttpResponse.Handler
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.skynet.search.SearchAroundParams
import com.nextbillion_sdk.api.models.skynet.search.SearchBoundParams
import com.nextbillion_sdk.api.models.skynet.search.SearchResponse
import com.nextbillion_sdk.api.services.async.skynet.search.PolygonServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.search.PolygonServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SearchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchServiceAsync {

    private val withRawResponse: SearchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val polygon: PolygonServiceAsync by lazy { PolygonServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SearchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchServiceAsync =
        SearchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun polygon(): PolygonServiceAsync = polygon

    override fun around(
        params: SearchAroundParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SearchResponse> =
        // get /skynet/search/around
        withRawResponse().around(params, requestOptions).thenApply { it.parse() }

    override fun bound(
        params: SearchBoundParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SearchResponse> =
        // get /skynet/search/bound
        withRawResponse().bound(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val polygon: PolygonServiceAsync.WithRawResponse by lazy {
            PolygonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SearchServiceAsync.WithRawResponse =
            SearchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun polygon(): PolygonServiceAsync.WithRawResponse = polygon

        private val aroundHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun around(
            params: SearchAroundParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "around")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { aroundHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val boundHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun bound(
            params: SearchBoundParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "bound")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { boundHandler.handle(it) }
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
