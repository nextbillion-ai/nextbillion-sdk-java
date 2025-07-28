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
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.geocode.GeocodeBatchCreateParams
import com.nextbillion_sdk.api.models.geocode.GeocodeBatchCreateResponse
import com.nextbillion_sdk.api.models.geocode.GeocodeRetrieveParams
import com.nextbillion_sdk.api.models.geocode.GeocodeRetrieveResponse
import com.nextbillion_sdk.api.models.geocode.GeocodeStructuredRetrieveParams
import com.nextbillion_sdk.api.models.geocode.GeocodeStructuredRetrieveResponse
import java.util.function.Consumer

class GeocodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GeocodeService {

    private val withRawResponse: GeocodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GeocodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeocodeService =
        GeocodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: GeocodeRetrieveParams,
        requestOptions: RequestOptions,
    ): GeocodeRetrieveResponse =
        // get /geocode
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun batchCreate(
        params: GeocodeBatchCreateParams,
        requestOptions: RequestOptions,
    ): GeocodeBatchCreateResponse =
        // post /geocode/batch
        withRawResponse().batchCreate(params, requestOptions).parse()

    override fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams,
        requestOptions: RequestOptions,
    ): GeocodeStructuredRetrieveResponse =
        // get /geocode/structured
        withRawResponse().structuredRetrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeocodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeocodeService.WithRawResponse =
            GeocodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<GeocodeRetrieveResponse> =
            jsonHandler<GeocodeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GeocodeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeocodeRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchCreateHandler: Handler<GeocodeBatchCreateResponse> =
            jsonHandler<GeocodeBatchCreateResponse>(clientOptions.jsonMapper)

        override fun batchCreate(
            params: GeocodeBatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeocodeBatchCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { batchCreateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val structuredRetrieveHandler: Handler<GeocodeStructuredRetrieveResponse> =
            jsonHandler<GeocodeStructuredRetrieveResponse>(clientOptions.jsonMapper)

        override fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeocodeStructuredRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geocode", "structured")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { structuredRetrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
