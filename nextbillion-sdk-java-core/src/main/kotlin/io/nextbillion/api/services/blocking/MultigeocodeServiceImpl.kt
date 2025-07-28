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
import io.nextbillion.api.models.multigeocode.MultigeocodeSearchParams
import io.nextbillion.api.models.multigeocode.MultigeocodeSearchResponse
import io.nextbillion.api.services.blocking.multigeocode.PlaceService
import io.nextbillion.api.services.blocking.multigeocode.PlaceServiceImpl
import java.util.function.Consumer

class MultigeocodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MultigeocodeService {

    private val withRawResponse: MultigeocodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val place: PlaceService by lazy { PlaceServiceImpl(clientOptions) }

    override fun withRawResponse(): MultigeocodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultigeocodeService =
        MultigeocodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun place(): PlaceService = place

    override fun search(
        params: MultigeocodeSearchParams,
        requestOptions: RequestOptions,
    ): MultigeocodeSearchResponse =
        // post /multigeocode/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultigeocodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val place: PlaceService.WithRawResponse by lazy {
            PlaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultigeocodeService.WithRawResponse =
            MultigeocodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun place(): PlaceService.WithRawResponse = place

        private val searchHandler: Handler<MultigeocodeSearchResponse> =
            jsonHandler<MultigeocodeSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: MultigeocodeSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MultigeocodeSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
