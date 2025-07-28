// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet.asset

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.checkRequired
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
import com.nextbillion_sdk.api.models.skynet.asset.location.LocationGetLastParams
import com.nextbillion_sdk.api.models.skynet.asset.location.LocationGetLastResponse
import com.nextbillion_sdk.api.models.skynet.asset.location.LocationListParams
import com.nextbillion_sdk.api.models.skynet.asset.location.LocationListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LocationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocationService {

    private val withRawResponse: LocationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService =
        LocationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LocationListParams,
        requestOptions: RequestOptions,
    ): LocationListResponse =
        // get /skynet/asset/{id}/location/list
        withRawResponse().list(params, requestOptions).parse()

    override fun getLast(
        params: LocationGetLastParams,
        requestOptions: RequestOptions,
    ): LocationGetLastResponse =
        // get /skynet/asset/{id}/location/last
        withRawResponse().getLast(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationService.WithRawResponse =
            LocationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<LocationListResponse> =
            jsonHandler<LocationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LocationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocationListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "location", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getLastHandler: Handler<LocationGetLastResponse> =
            jsonHandler<LocationGetLastResponse>(clientOptions.jsonMapper)

        override fun getLast(
            params: LocationGetLastParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LocationGetLastResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "location", "last")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getLastHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
