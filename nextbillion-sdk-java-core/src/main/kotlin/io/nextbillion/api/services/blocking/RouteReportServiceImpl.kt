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
import io.nextbillion.api.core.http.json
import io.nextbillion.api.core.http.parseable
import io.nextbillion.api.core.prepare
import io.nextbillion.api.models.routereport.RouteReportCreateParams
import io.nextbillion.api.models.routereport.RouteReportCreateResponse
import java.util.function.Consumer

class RouteReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RouteReportService {

    private val withRawResponse: RouteReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RouteReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteReportService =
        RouteReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RouteReportCreateParams,
        requestOptions: RequestOptions,
    ): RouteReportCreateResponse =
        // post /route_report
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RouteReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteReportService.WithRawResponse =
            RouteReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RouteReportCreateResponse> =
            jsonHandler<RouteReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RouteReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("route_report")
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
    }
}
