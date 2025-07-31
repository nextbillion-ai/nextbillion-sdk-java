// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.geofence

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
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.geofence.console.ConsolePreviewParams
import ai.nextbillion.models.geofence.console.ConsolePreviewResponse
import ai.nextbillion.models.geofence.console.ConsoleSearchParams
import ai.nextbillion.models.geofence.console.ConsoleSearchResponse
import java.util.function.Consumer

class ConsoleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConsoleService {

    private val withRawResponse: ConsoleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConsoleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsoleService =
        ConsoleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preview(
        params: ConsolePreviewParams,
        requestOptions: RequestOptions,
    ): ConsolePreviewResponse =
        // post /geofence/console/preview
        withRawResponse().preview(params, requestOptions).parse()

    override fun search(
        params: ConsoleSearchParams,
        requestOptions: RequestOptions,
    ): ConsoleSearchResponse =
        // get /geofence/console/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConsoleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConsoleService.WithRawResponse =
            ConsoleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val previewHandler: Handler<ConsolePreviewResponse> =
            jsonHandler<ConsolePreviewResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: ConsolePreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConsolePreviewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "console", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<ConsoleSearchResponse> =
            jsonHandler<ConsoleSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: ConsoleSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConsoleSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "console", "search")
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
