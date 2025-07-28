// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.handlers.errorBodyHandler
import io.nextbillion.api.core.handlers.errorHandler
import io.nextbillion.api.core.handlers.jsonHandler
import io.nextbillion.api.core.http.HttpMethod
import io.nextbillion.api.core.http.HttpRequest
import io.nextbillion.api.core.http.HttpResponse
import io.nextbillion.api.core.http.HttpResponse.Handler
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.core.http.parseable
import io.nextbillion.api.core.prepareAsync
import io.nextbillion.api.models.isochrone.IsochroneComputeParams
import io.nextbillion.api.models.isochrone.IsochroneComputeResponse
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
