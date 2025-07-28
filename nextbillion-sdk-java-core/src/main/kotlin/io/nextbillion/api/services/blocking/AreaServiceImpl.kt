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
import io.nextbillion.api.models.areas.AreaListParams
import io.nextbillion.api.models.areas.AreaListResponse
import java.util.function.Consumer

class AreaServiceImpl internal constructor(private val clientOptions: ClientOptions) : AreaService {

    private val withRawResponse: AreaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AreaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AreaService =
        AreaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AreaListParams,
        requestOptions: RequestOptions,
    ): List<AreaListResponse> =
        // get /areas
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AreaService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AreaService.WithRawResponse =
            AreaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<AreaListResponse>> =
            jsonHandler<List<AreaListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: AreaListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AreaListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("areas")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
