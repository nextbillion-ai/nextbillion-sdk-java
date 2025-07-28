// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.geofence

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
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.geofence.console.ConsolePreviewParams
import com.nextbillion_sdk.api.models.geofence.console.ConsolePreviewResponse
import com.nextbillion_sdk.api.models.geofence.console.ConsoleSearchParams
import com.nextbillion_sdk.api.models.geofence.console.ConsoleSearchResponse
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
