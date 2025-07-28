// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.fleetify

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.handlers.errorBodyHandler
import ai.nextbillion.core.handlers.errorHandler
import ai.nextbillion.core.handlers.jsonHandler
import ai.nextbillion.core.http.HttpMethod
import ai.nextbillion.core.http.HttpRequest
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponse.Handler
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.fleetify.routes.RouteCreateParams
import ai.nextbillion.models.fleetify.routes.RouteCreateResponse
import ai.nextbillion.models.fleetify.routes.RouteRedispatchParams
import ai.nextbillion.models.fleetify.routes.RouteRedispatchResponse
import ai.nextbillion.services.blocking.fleetify.routes.StepService
import ai.nextbillion.services.blocking.fleetify.routes.StepServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RouteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RouteService {

    private val withRawResponse: RouteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val steps: StepService by lazy { StepServiceImpl(clientOptions) }

    override fun withRawResponse(): RouteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteService =
        RouteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun steps(): StepService = steps

    override fun create(
        params: RouteCreateParams,
        requestOptions: RequestOptions,
    ): RouteCreateResponse =
        // post /fleetify/routes
        withRawResponse().create(params, requestOptions).parse()

    override fun redispatch(
        params: RouteRedispatchParams,
        requestOptions: RequestOptions,
    ): RouteRedispatchResponse =
        // post /fleetify/routes/{routeID}/redispatch
        withRawResponse().redispatch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RouteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val steps: StepService.WithRawResponse by lazy {
            StepServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteService.WithRawResponse =
            RouteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun steps(): StepService.WithRawResponse = steps

        private val createHandler: Handler<RouteCreateResponse> =
            jsonHandler<RouteCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RouteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "routes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val redispatchHandler: Handler<RouteRedispatchResponse> =
            jsonHandler<RouteRedispatchResponse>(clientOptions.jsonMapper)

        override fun redispatch(
            params: RouteRedispatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RouteRedispatchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("routeId", params.routeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "routes", params._pathParam(0), "redispatch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { redispatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
