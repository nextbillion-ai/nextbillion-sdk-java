// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

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
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.optimization.OptimizationComputeParams
import com.nextbillion_sdk.api.models.optimization.OptimizationComputeResponse
import com.nextbillion_sdk.api.models.optimization.OptimizationReOptimizeParams
import com.nextbillion_sdk.api.models.optimization.PostResponse
import com.nextbillion_sdk.api.services.blocking.optimization.DriverAssignmentService
import com.nextbillion_sdk.api.services.blocking.optimization.DriverAssignmentServiceImpl
import com.nextbillion_sdk.api.services.blocking.optimization.V2Service
import com.nextbillion_sdk.api.services.blocking.optimization.V2ServiceImpl
import java.util.function.Consumer

class OptimizationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OptimizationService {

    private val withRawResponse: OptimizationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val driverAssignment: DriverAssignmentService by lazy {
        DriverAssignmentServiceImpl(clientOptions)
    }

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptions) }

    override fun withRawResponse(): OptimizationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationService =
        OptimizationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun driverAssignment(): DriverAssignmentService = driverAssignment

    override fun v2(): V2Service = v2

    override fun compute(
        params: OptimizationComputeParams,
        requestOptions: RequestOptions,
    ): OptimizationComputeResponse =
        // get /optimization/json
        withRawResponse().compute(params, requestOptions).parse()

    override fun reOptimize(
        params: OptimizationReOptimizeParams,
        requestOptions: RequestOptions,
    ): PostResponse =
        // post /optimization/re_optimization
        withRawResponse().reOptimize(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptimizationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val driverAssignment: DriverAssignmentService.WithRawResponse by lazy {
            DriverAssignmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2Service.WithRawResponse by lazy {
            V2ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptimizationService.WithRawResponse =
            OptimizationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun driverAssignment(): DriverAssignmentService.WithRawResponse = driverAssignment

        override fun v2(): V2Service.WithRawResponse = v2

        private val computeHandler: Handler<OptimizationComputeResponse> =
            jsonHandler<OptimizationComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: OptimizationComputeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OptimizationComputeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { computeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reOptimizeHandler: Handler<PostResponse> =
            jsonHandler<PostResponse>(clientOptions.jsonMapper)

        override fun reOptimize(
            params: OptimizationReOptimizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "re_optimization")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
