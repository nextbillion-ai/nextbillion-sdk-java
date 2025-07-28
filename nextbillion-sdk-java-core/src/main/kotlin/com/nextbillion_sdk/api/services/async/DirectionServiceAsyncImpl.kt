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
import com.nextbillion_sdk.api.models.directions.DirectionComputeRouteParams
import com.nextbillion_sdk.api.models.directions.DirectionComputeRouteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DirectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectionServiceAsync {

    private val withRawResponse: DirectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DirectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectionServiceAsync =
        DirectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun computeRoute(
        params: DirectionComputeRouteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectionComputeRouteResponse> =
        // post /directions/json
        withRawResponse().computeRoute(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectionServiceAsync.WithRawResponse =
            DirectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val computeRouteHandler: Handler<DirectionComputeRouteResponse> =
            jsonHandler<DirectionComputeRouteResponse>(clientOptions.jsonMapper)

        override fun computeRoute(
            params: DirectionComputeRouteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectionComputeRouteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("directions", "json")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { computeRouteHandler.handle(it) }
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
