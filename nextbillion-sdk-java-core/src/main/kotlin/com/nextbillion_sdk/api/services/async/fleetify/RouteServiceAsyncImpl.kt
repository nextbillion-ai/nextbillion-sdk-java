// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.fleetify

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.checkRequired
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
import com.nextbillion_sdk.api.models.fleetify.routes.RouteCreateParams
import com.nextbillion_sdk.api.models.fleetify.routes.RouteCreateResponse
import com.nextbillion_sdk.api.models.fleetify.routes.RouteRedispatchParams
import com.nextbillion_sdk.api.models.fleetify.routes.RouteRedispatchResponse
import com.nextbillion_sdk.api.services.async.fleetify.routes.StepServiceAsync
import com.nextbillion_sdk.api.services.async.fleetify.routes.StepServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RouteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RouteServiceAsync {

    private val withRawResponse: RouteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val steps: StepServiceAsync by lazy { StepServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RouteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteServiceAsync =
        RouteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun steps(): StepServiceAsync = steps

    override fun create(
        params: RouteCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RouteCreateResponse> =
        // post /fleetify/routes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun redispatch(
        params: RouteRedispatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RouteRedispatchResponse> =
        // post /fleetify/routes/{routeID}/redispatch
        withRawResponse().redispatch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RouteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val steps: StepServiceAsync.WithRawResponse by lazy {
            StepServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteServiceAsync.WithRawResponse =
            RouteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun steps(): StepServiceAsync.WithRawResponse = steps

        private val createHandler: Handler<RouteCreateResponse> =
            jsonHandler<RouteCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RouteCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RouteCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "routes")
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

        private val redispatchHandler: Handler<RouteRedispatchResponse> =
            jsonHandler<RouteRedispatchResponse>(clientOptions.jsonMapper)

        override fun redispatch(
            params: RouteRedispatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RouteRedispatchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("routeId", params.routeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "routes", params._pathParam(0), "redispatch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { redispatchHandler.handle(it) }
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
