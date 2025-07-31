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
import ai.nextbillion.models.multigeocode.MultigeocodeSearchParams
import ai.nextbillion.models.multigeocode.MultigeocodeSearchResponse
import ai.nextbillion.services.async.multigeocode.PlaceServiceAsync
import ai.nextbillion.services.async.multigeocode.PlaceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MultigeocodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MultigeocodeServiceAsync {

    private val withRawResponse: MultigeocodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val place: PlaceServiceAsync by lazy { PlaceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MultigeocodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultigeocodeServiceAsync =
        MultigeocodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun place(): PlaceServiceAsync = place

    override fun search(
        params: MultigeocodeSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MultigeocodeSearchResponse> =
        // post /multigeocode/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultigeocodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val place: PlaceServiceAsync.WithRawResponse by lazy {
            PlaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultigeocodeServiceAsync.WithRawResponse =
            MultigeocodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun place(): PlaceServiceAsync.WithRawResponse = place

        private val searchHandler: Handler<MultigeocodeSearchResponse> =
            jsonHandler<MultigeocodeSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: MultigeocodeSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MultigeocodeSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
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
