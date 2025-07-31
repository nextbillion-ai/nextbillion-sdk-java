// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

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
import ai.nextbillion.core.prepareAsync
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapParams
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SnapToRoadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapToRoadServiceAsync {

    private val withRawResponse: SnapToRoadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapToRoadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapToRoadServiceAsync =
        SnapToRoadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun snap(
        params: SnapToRoadSnapParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapToRoadSnapResponse> =
        // get /snapToRoads/json
        withRawResponse().snap(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapToRoadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapToRoadServiceAsync.WithRawResponse =
            SnapToRoadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val snapHandler: Handler<SnapToRoadSnapResponse> =
            jsonHandler<SnapToRoadSnapResponse>(clientOptions.jsonMapper)

        override fun snap(
            params: SnapToRoadSnapParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapToRoadSnapResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("snapToRoads", "json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
