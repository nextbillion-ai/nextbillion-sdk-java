// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

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
import io.nextbillion.api.core.prepareAsync
import io.nextbillion.api.models.navigation.NavigationRetrieveRouteParams
import io.nextbillion.api.models.navigation.NavigationRetrieveRouteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class NavigationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NavigationServiceAsync {

    private val withRawResponse: NavigationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NavigationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationServiceAsync =
        NavigationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveRoute(
        params: NavigationRetrieveRouteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NavigationRetrieveRouteResponse> =
        // get /navigation/json
        withRawResponse().retrieveRoute(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NavigationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationServiceAsync.WithRawResponse =
            NavigationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveRouteHandler: Handler<NavigationRetrieveRouteResponse> =
            jsonHandler<NavigationRetrieveRouteResponse>(clientOptions.jsonMapper)

        override fun retrieveRoute(
            params: NavigationRetrieveRouteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NavigationRetrieveRouteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("navigation", "json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRouteHandler.handle(it) }
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
