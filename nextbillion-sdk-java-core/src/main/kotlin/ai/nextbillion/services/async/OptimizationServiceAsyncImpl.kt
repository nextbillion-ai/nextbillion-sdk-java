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
import ai.nextbillion.models.optimization.OptimizationComputeParams
import ai.nextbillion.models.optimization.OptimizationComputeResponse
import ai.nextbillion.models.optimization.OptimizationReOptimizeParams
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.services.async.optimization.DriverAssignmentServiceAsync
import ai.nextbillion.services.async.optimization.DriverAssignmentServiceAsyncImpl
import ai.nextbillion.services.async.optimization.V2ServiceAsync
import ai.nextbillion.services.async.optimization.V2ServiceAsyncImpl
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
