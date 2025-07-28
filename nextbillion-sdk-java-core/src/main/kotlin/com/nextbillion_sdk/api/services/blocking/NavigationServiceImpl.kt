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
import com.nextbillion_sdk.api.models.navigation.NavigationRetrieveRouteParams
import com.nextbillion_sdk.api.models.navigation.NavigationRetrieveRouteResponse
import java.util.function.Consumer

class NavigationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NavigationService {

    private val withRawResponse: NavigationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NavigationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationService =
        NavigationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveRoute(
        params: NavigationRetrieveRouteParams,
        requestOptions: RequestOptions,
    ): NavigationRetrieveRouteResponse =
        // get /navigation/json
        withRawResponse().retrieveRoute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NavigationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationService.WithRawResponse =
            NavigationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveRouteHandler: Handler<NavigationRetrieveRouteResponse> =
            jsonHandler<NavigationRetrieveRouteResponse>(clientOptions.jsonMapper)

        override fun retrieveRoute(
            params: NavigationRetrieveRouteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NavigationRetrieveRouteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("navigation", "json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
