// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

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
import ai.nextbillion.core.prepare
import ai.nextbillion.models.autocomplete.AutocompleteSuggestParams
import ai.nextbillion.models.autocomplete.AutocompleteSuggestResponse
import java.util.function.Consumer

class AutocompleteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutocompleteService {

    private val withRawResponse: AutocompleteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutocompleteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutocompleteService =
        AutocompleteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun suggest(
        params: AutocompleteSuggestParams,
        requestOptions: RequestOptions,
    ): AutocompleteSuggestResponse =
        // get /autocomplete
        withRawResponse().suggest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutocompleteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutocompleteService.WithRawResponse =
            AutocompleteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val suggestHandler: Handler<AutocompleteSuggestResponse> =
            jsonHandler<AutocompleteSuggestResponse>(clientOptions.jsonMapper)

        override fun suggest(
            params: AutocompleteSuggestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutocompleteSuggestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("autocomplete")
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
