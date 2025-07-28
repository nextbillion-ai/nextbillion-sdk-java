// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.geofence

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
import io.nextbillion.api.core.prepareAsync
import io.nextbillion.api.models.geofence.console.ConsolePreviewParams
import io.nextbillion.api.models.geofence.console.ConsolePreviewResponse
import io.nextbillion.api.models.geofence.console.ConsoleSearchParams
import io.nextbillion.api.models.geofence.console.ConsoleSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ConsoleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConsoleServiceAsync {

    private val withRawResponse: ConsoleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConsoleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsoleServiceAsync =
        ConsoleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preview(
        params: ConsolePreviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConsolePreviewResponse> =
        // post /geofence/console/preview
        withRawResponse().preview(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: ConsoleSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConsoleSearchResponse> =
        // get /geofence/console/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConsoleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConsoleServiceAsync.WithRawResponse =
            ConsoleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val previewHandler: Handler<ConsolePreviewResponse> =
            jsonHandler<ConsolePreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: ConsolePreviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConsolePreviewResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "console", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { previewHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<ConsoleSearchResponse> =
            jsonHandler<ConsoleSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: ConsoleSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConsoleSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "console", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
