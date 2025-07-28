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
import com.nextbillion_sdk.api.models.autocomplete.AutocompleteSuggestParams
import com.nextbillion_sdk.api.models.autocomplete.AutocompleteSuggestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AutocompleteServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutocompleteServiceAsync {

    private val withRawResponse: AutocompleteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutocompleteServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutocompleteServiceAsync =
        AutocompleteServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun suggest(
        params: AutocompleteSuggestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutocompleteSuggestResponse> =
        // get /autocomplete
        withRawResponse().suggest(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutocompleteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutocompleteServiceAsync.WithRawResponse =
            AutocompleteServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val suggestHandler: Handler<AutocompleteSuggestResponse> =
            jsonHandler<AutocompleteSuggestResponse>(clientOptions.jsonMapper)

        override fun suggest(
            params: AutocompleteSuggestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutocompleteSuggestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("autocomplete")
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
