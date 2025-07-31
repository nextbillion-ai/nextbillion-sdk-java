// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet.search

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
import ai.nextbillion.core.prepare
import ai.nextbillion.models.skynet.search.SearchResponse
import ai.nextbillion.models.skynet.search.polygon.PolygonCreateParams
import ai.nextbillion.models.skynet.search.polygon.PolygonGetParams
import java.util.function.Consumer

class PolygonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PolygonService {

    private val withRawResponse: PolygonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PolygonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolygonService =
        PolygonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PolygonCreateParams,
        requestOptions: RequestOptions,
    ): SearchResponse =
        // post /skynet/search/polygon
        withRawResponse().create(params, requestOptions).parse()

    override fun get(params: PolygonGetParams, requestOptions: RequestOptions): SearchResponse =
        // get /skynet/search/polygon
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PolygonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolygonService.WithRawResponse =
            PolygonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PolygonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "polygon")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<SearchResponse> =
            jsonHandler<SearchResponse>(clientOptions.jsonMapper)

        override fun get(
            params: PolygonGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "search", "polygon")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
