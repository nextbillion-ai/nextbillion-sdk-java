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
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapParams
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SnapToRoadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapToRoadServiceAsync {

    private val withRawResponse: SnapToRoadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapToRoadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapToRoadServiceAsync =
        SnapToRoadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun snap(
        params: SnapToRoadSnapParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapToRoadSnapResponse> =
        // get /snapToRoads/json
        withRawResponse().snap(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapToRoadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapToRoadServiceAsync.WithRawResponse =
            SnapToRoadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val snapHandler: Handler<SnapToRoadSnapResponse> =
            jsonHandler<SnapToRoadSnapResponse>(clientOptions.jsonMapper)

        override fun snap(
            params: SnapToRoadSnapParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapToRoadSnapResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("snapToRoads", "json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { snapHandler.handle(it) }
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
