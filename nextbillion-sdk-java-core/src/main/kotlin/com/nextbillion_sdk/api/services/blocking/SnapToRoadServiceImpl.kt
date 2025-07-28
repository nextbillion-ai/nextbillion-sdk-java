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
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapParams
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapResponse
import java.util.function.Consumer

class SnapToRoadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapToRoadService {

    private val withRawResponse: SnapToRoadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapToRoadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapToRoadService =
        SnapToRoadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun snap(
        params: SnapToRoadSnapParams,
        requestOptions: RequestOptions,
    ): SnapToRoadSnapResponse =
        // get /snapToRoads/json
        withRawResponse().snap(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapToRoadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapToRoadService.WithRawResponse =
            SnapToRoadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val snapHandler: Handler<SnapToRoadSnapResponse> =
            jsonHandler<SnapToRoadSnapResponse>(clientOptions.jsonMapper)

        override fun snap(
            params: SnapToRoadSnapParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SnapToRoadSnapResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("snapToRoads", "json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { snapHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
