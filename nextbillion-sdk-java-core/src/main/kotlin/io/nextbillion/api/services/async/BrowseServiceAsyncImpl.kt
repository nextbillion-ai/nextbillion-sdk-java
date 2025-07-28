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
import io.nextbillion.api.models.browse.BrowseSearchParams
import io.nextbillion.api.models.browse.BrowseSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class BrowseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrowseServiceAsync {

    private val withRawResponse: BrowseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BrowseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseServiceAsync =
        BrowseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun search(
        params: BrowseSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrowseSearchResponse> =
        // get /browse
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowseServiceAsync.WithRawResponse =
            BrowseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val searchHandler: Handler<BrowseSearchResponse> =
            jsonHandler<BrowseSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: BrowseSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrowseSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("browse")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
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
