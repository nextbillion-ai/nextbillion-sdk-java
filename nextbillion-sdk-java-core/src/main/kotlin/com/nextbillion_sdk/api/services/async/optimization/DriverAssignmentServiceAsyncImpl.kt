// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.optimization

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
import com.nextbillion_sdk.api.models.optimization.driverassignment.DriverAssignmentAssignParams
import com.nextbillion_sdk.api.models.optimization.driverassignment.DriverAssignmentAssignResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DriverAssignmentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DriverAssignmentServiceAsync {

    private val withRawResponse: DriverAssignmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DriverAssignmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DriverAssignmentServiceAsync =
        DriverAssignmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assign(
        params: DriverAssignmentAssignParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DriverAssignmentAssignResponse> =
        // post /optimization/driver-assignment/v1
        withRawResponse().assign(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DriverAssignmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DriverAssignmentServiceAsync.WithRawResponse =
            DriverAssignmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val assignHandler: Handler<DriverAssignmentAssignResponse> =
            jsonHandler<DriverAssignmentAssignResponse>(clientOptions.jsonMapper)

        override fun assign(
            params: DriverAssignmentAssignParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DriverAssignmentAssignResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "driver-assignment", "v1")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
