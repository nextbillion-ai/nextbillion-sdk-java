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
import com.nextbillion_sdk.api.models.isochrone.IsochroneComputeParams
import com.nextbillion_sdk.api.models.isochrone.IsochroneComputeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class IsochroneServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IsochroneServiceAsync {

    private val withRawResponse: IsochroneServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IsochroneServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsochroneServiceAsync =
        IsochroneServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun compute(
        params: IsochroneComputeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IsochroneComputeResponse> =
        // get /isochrone/json
        withRawResponse().compute(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IsochroneServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IsochroneServiceAsync.WithRawResponse =
            IsochroneServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val computeHandler: Handler<IsochroneComputeResponse> =
            jsonHandler<IsochroneComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: IsochroneComputeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IsochroneComputeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("isochrone", "json")
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
    }
}
