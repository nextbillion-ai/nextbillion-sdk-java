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
import com.nextbillion_sdk.api.models.optimization.OptimizationComputeParams
import com.nextbillion_sdk.api.models.optimization.OptimizationComputeResponse
import com.nextbillion_sdk.api.models.optimization.OptimizationReOptimizeParams
import com.nextbillion_sdk.api.models.optimization.PostResponse
import com.nextbillion_sdk.api.services.async.optimization.DriverAssignmentServiceAsync
import com.nextbillion_sdk.api.services.async.optimization.DriverAssignmentServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.optimization.V2ServiceAsync
import com.nextbillion_sdk.api.services.async.optimization.V2ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OptimizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OptimizationServiceAsync {

    private val withRawResponse: OptimizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val driverAssignment: DriverAssignmentServiceAsync by lazy {
        DriverAssignmentServiceAsyncImpl(clientOptions)
    }

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OptimizationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationServiceAsync =
        OptimizationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun driverAssignment(): DriverAssignmentServiceAsync = driverAssignment

    override fun v2(): V2ServiceAsync = v2

    override fun compute(
        params: OptimizationComputeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OptimizationComputeResponse> =
        // get /optimization/json
        withRawResponse().compute(params, requestOptions).thenApply { it.parse() }

    override fun reOptimize(
        params: OptimizationReOptimizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostResponse> =
        // post /optimization/re_optimization
        withRawResponse().reOptimize(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptimizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val driverAssignment: DriverAssignmentServiceAsync.WithRawResponse by lazy {
            DriverAssignmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptimizationServiceAsync.WithRawResponse =
            OptimizationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun driverAssignment(): DriverAssignmentServiceAsync.WithRawResponse =
            driverAssignment

        override fun v2(): V2ServiceAsync.WithRawResponse = v2

        private val computeHandler: Handler<OptimizationComputeResponse> =
            jsonHandler<OptimizationComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: OptimizationComputeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OptimizationComputeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { computeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reOptimizeHandler: Handler<PostResponse> =
            jsonHandler<PostResponse>(clientOptions.jsonMapper)

        override fun reOptimize(
            params: OptimizationReOptimizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "re_optimization")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { reOptimizeHandler.handle(it) }
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
