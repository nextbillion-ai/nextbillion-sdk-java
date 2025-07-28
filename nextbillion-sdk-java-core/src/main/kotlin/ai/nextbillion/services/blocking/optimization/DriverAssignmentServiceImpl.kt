// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.optimization

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
import ai.nextbillion.models.optimization.driverassignment.DriverAssignmentAssignParams
import ai.nextbillion.models.optimization.driverassignment.DriverAssignmentAssignResponse
import java.util.function.Consumer

class DriverAssignmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DriverAssignmentService {

    private val withRawResponse: DriverAssignmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DriverAssignmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriverAssignmentService =
        DriverAssignmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assign(
        params: DriverAssignmentAssignParams,
        requestOptions: RequestOptions,
    ): DriverAssignmentAssignResponse =
        // post /optimization/driver-assignment/v1
        withRawResponse().assign(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DriverAssignmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DriverAssignmentService.WithRawResponse =
            DriverAssignmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val assignHandler: Handler<DriverAssignmentAssignResponse> =
            jsonHandler<DriverAssignmentAssignResponse>(clientOptions.jsonMapper)

        override fun assign(
            params: DriverAssignmentAssignParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DriverAssignmentAssignResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "driver-assignment", "v1")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { assignHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
