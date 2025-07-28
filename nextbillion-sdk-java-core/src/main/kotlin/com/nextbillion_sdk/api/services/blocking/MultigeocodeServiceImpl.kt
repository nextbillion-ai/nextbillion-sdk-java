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
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchParams
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchResponse
import com.nextbillion_sdk.api.services.blocking.multigeocode.PlaceService
import com.nextbillion_sdk.api.services.blocking.multigeocode.PlaceServiceImpl
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
