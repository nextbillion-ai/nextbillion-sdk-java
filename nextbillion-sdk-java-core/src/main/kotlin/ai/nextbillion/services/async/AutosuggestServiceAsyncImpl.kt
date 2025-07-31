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
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepareAsync
import ai.nextbillion.models.autosuggest.AutosuggestSuggestParams
import ai.nextbillion.models.autosuggest.AutosuggestSuggestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AutosuggestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutosuggestServiceAsync {

    private val withRawResponse: AutosuggestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutosuggestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutosuggestServiceAsync =
        AutosuggestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun suggest(
        params: AutosuggestSuggestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutosuggestSuggestResponse> =
        // get /autosuggest
        withRawResponse().suggest(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutosuggestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutosuggestServiceAsync.WithRawResponse =
            AutosuggestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val suggestHandler: Handler<AutosuggestSuggestResponse> =
            jsonHandler<AutosuggestSuggestResponse>(clientOptions.jsonMapper)

        override fun suggest(
            params: AutosuggestSuggestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutosuggestSuggestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("autosuggest")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { suggestHandler.handle(it) }
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
