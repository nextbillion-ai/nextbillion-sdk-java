// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.optimization

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
import com.nextbillion_sdk.api.models.optimization.driverassignment.DriverAssignmentAssignParams
import com.nextbillion_sdk.api.models.optimization.driverassignment.DriverAssignmentAssignResponse
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
