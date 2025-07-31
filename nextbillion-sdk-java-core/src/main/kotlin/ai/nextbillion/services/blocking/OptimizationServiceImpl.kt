// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

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
import ai.nextbillion.core.prepare
import ai.nextbillion.models.optimization.OptimizationComputeParams
import ai.nextbillion.models.optimization.OptimizationComputeResponse
import ai.nextbillion.models.optimization.OptimizationReOptimizeParams
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.services.blocking.optimization.DriverAssignmentService
import ai.nextbillion.services.blocking.optimization.DriverAssignmentServiceImpl
import ai.nextbillion.services.blocking.optimization.V2Service
import ai.nextbillion.services.blocking.optimization.V2ServiceImpl
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
