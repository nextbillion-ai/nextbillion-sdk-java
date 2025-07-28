// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

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
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchParams
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchResponse
import com.nextbillion_sdk.api.services.async.multigeocode.PlaceServiceAsync
import com.nextbillion_sdk.api.services.async.multigeocode.PlaceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MultigeocodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MultigeocodeServiceAsync {

    private val withRawResponse: MultigeocodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val place: PlaceServiceAsync by lazy { PlaceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MultigeocodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultigeocodeServiceAsync =
        MultigeocodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun place(): PlaceServiceAsync = place

    override fun search(
        params: MultigeocodeSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MultigeocodeSearchResponse> =
        // post /multigeocode/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultigeocodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val place: PlaceServiceAsync.WithRawResponse by lazy {
            PlaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultigeocodeServiceAsync.WithRawResponse =
            MultigeocodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun place(): PlaceServiceAsync.WithRawResponse = place

        private val searchHandler: Handler<MultigeocodeSearchResponse> =
            jsonHandler<MultigeocodeSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: MultigeocodeSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MultigeocodeSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
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
