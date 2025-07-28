// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet

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
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepare
import com.nextbillion_sdk.api.models.skynet.asset.SimpleResp
import com.nextbillion_sdk.api.models.skynet.trip.TripDeleteParams
import com.nextbillion_sdk.api.models.skynet.trip.TripEndParams
import com.nextbillion_sdk.api.models.skynet.trip.TripGetSummaryParams
import com.nextbillion_sdk.api.models.skynet.trip.TripGetSummaryResponse
import com.nextbillion_sdk.api.models.skynet.trip.TripRetrieveParams
import com.nextbillion_sdk.api.models.skynet.trip.TripRetrieveResponse
import com.nextbillion_sdk.api.models.skynet.trip.TripStartParams
import com.nextbillion_sdk.api.models.skynet.trip.TripStartResponse
import com.nextbillion_sdk.api.models.skynet.trip.TripUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TripServiceImpl internal constructor(private val clientOptions: ClientOptions) : TripService {

    private val withRawResponse: TripService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TripService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripService =
        TripServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions,
    ): TripRetrieveResponse =
        // get /skynet/trip/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TripUpdateParams, requestOptions: RequestOptions): SimpleResp =
        // put /skynet/trip/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: TripDeleteParams, requestOptions: RequestOptions): SimpleResp =
        // delete /skynet/trip/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun end(params: TripEndParams, requestOptions: RequestOptions): SimpleResp =
        // post /skynet/trip/end
        withRawResponse().end(params, requestOptions).parse()

    override fun getSummary(
        params: TripGetSummaryParams,
        requestOptions: RequestOptions,
    ): TripGetSummaryResponse =
        // get /skynet/trip/{id}/summary
        withRawResponse().getSummary(params, requestOptions).parse()

    override fun start(params: TripStartParams, requestOptions: RequestOptions): TripStartResponse =
        // post /skynet/trip/start
        withRawResponse().start(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TripService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TripService.WithRawResponse =
            TripServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TripRetrieveResponse> =
            jsonHandler<TripRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", params._pathParam(0))
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

        private val updateHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun update(
            params: TripUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun delete(
            params: TripDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val endHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun end(
            params: TripEndParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { endHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSummaryHandler: Handler<TripGetSummaryResponse> =
            jsonHandler<TripGetSummaryResponse>(clientOptions.jsonMapper)

        override fun getSummary(
            params: TripGetSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripGetSummaryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", params._pathParam(0), "summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSummaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startHandler: Handler<TripStartResponse> =
            jsonHandler<TripStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: TripStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TripStartResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "trip", "start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
