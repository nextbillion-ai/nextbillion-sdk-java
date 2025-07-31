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
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapParams
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapResponse
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
