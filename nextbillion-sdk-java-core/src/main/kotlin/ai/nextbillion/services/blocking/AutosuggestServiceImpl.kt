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
import ai.nextbillion.models.autosuggest.AutosuggestSuggestParams
import ai.nextbillion.models.autosuggest.AutosuggestSuggestResponse
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
