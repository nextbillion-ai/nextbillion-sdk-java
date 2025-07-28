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
import ai.nextbillion.models.navigation.NavigationRetrieveRouteParams
import ai.nextbillion.models.navigation.NavigationRetrieveRouteResponse
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
