// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

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
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.autosuggest.AutosuggestSuggestParams
import com.nextbillion_sdk.api.models.autosuggest.AutosuggestSuggestResponse
import java.util.function.Consumer

class AutosuggestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutosuggestService {

    private val withRawResponse: AutosuggestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutosuggestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutosuggestService =
        AutosuggestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun suggest(
        params: AutosuggestSuggestParams,
        requestOptions: RequestOptions,
    ): AutosuggestSuggestResponse =
        // get /autosuggest
        withRawResponse().suggest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutosuggestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutosuggestService.WithRawResponse =
            AutosuggestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val suggestHandler: Handler<AutosuggestSuggestResponse> =
            jsonHandler<AutosuggestSuggestResponse>(clientOptions.jsonMapper)

        override fun suggest(
            params: AutosuggestSuggestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutosuggestSuggestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("autosuggest")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
