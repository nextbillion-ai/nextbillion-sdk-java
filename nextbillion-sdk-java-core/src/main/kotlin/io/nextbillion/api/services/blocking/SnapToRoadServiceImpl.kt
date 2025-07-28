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
import io.nextbillion.api.models.snaptoroads.SnapToRoadSnapParams
import io.nextbillion.api.models.snaptoroads.SnapToRoadSnapResponse
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
