// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

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
import io.nextbillion.api.core.prepare
import io.nextbillion.api.models.lookup.LookupByIdParams
import io.nextbillion.api.models.lookup.LookupByIdResponse
import java.util.function.Consumer

class LookupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LookupService {

    private val withRawResponse: LookupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LookupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService =
        LookupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun byId(
        params: LookupByIdParams,
        requestOptions: RequestOptions,
    ): LookupByIdResponse =
        // get /lookup
        withRawResponse().byId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupService.WithRawResponse =
            LookupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val byIdHandler: Handler<LookupByIdResponse> =
            jsonHandler<LookupByIdResponse>(clientOptions.jsonMapper)

        override fun byId(
            params: LookupByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupByIdResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lookup")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { byIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
