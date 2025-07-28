// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

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
import com.nextbillion_sdk.api.models.geofence.GeofenceContainsParams
import com.nextbillion_sdk.api.models.geofence.GeofenceContainsResponse
import com.nextbillion_sdk.api.models.geofence.GeofenceCreateParams
import com.nextbillion_sdk.api.models.geofence.GeofenceCreateResponse
import com.nextbillion_sdk.api.models.geofence.GeofenceDeleteParams
import com.nextbillion_sdk.api.models.geofence.GeofenceListParams
import com.nextbillion_sdk.api.models.geofence.GeofenceListResponse
import com.nextbillion_sdk.api.models.geofence.GeofenceRetrieveParams
import com.nextbillion_sdk.api.models.geofence.GeofenceRetrieveResponse
import com.nextbillion_sdk.api.models.geofence.GeofenceUpdateParams
import com.nextbillion_sdk.api.models.skynet.asset.SimpleResp
import com.nextbillion_sdk.api.services.blocking.geofence.BatchService
import com.nextbillion_sdk.api.services.blocking.geofence.BatchServiceImpl
import com.nextbillion_sdk.api.services.blocking.geofence.ConsoleService
import com.nextbillion_sdk.api.services.blocking.geofence.ConsoleServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GeofenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GeofenceService {

    private val withRawResponse: GeofenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val console: ConsoleService by lazy { ConsoleServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): GeofenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeofenceService =
        GeofenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun console(): ConsoleService = console

    override fun batch(): BatchService = batch

    override fun create(
        params: GeofenceCreateParams,
        requestOptions: RequestOptions,
    ): GeofenceCreateResponse =
        // post /geofence
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions,
    ): GeofenceRetrieveResponse =
        // get /geofence/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: GeofenceUpdateParams, requestOptions: RequestOptions): SimpleResp =
        // put /geofence/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: GeofenceListParams,
        requestOptions: RequestOptions,
    ): GeofenceListResponse =
        // get /geofence/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: GeofenceDeleteParams, requestOptions: RequestOptions): SimpleResp =
        // delete /geofence/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun contains(
        params: GeofenceContainsParams,
        requestOptions: RequestOptions,
    ): GeofenceContainsResponse =
        // get /geofence/contain
        withRawResponse().contains(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeofenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val console: ConsoleService.WithRawResponse by lazy {
            ConsoleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeofenceService.WithRawResponse =
            GeofenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun console(): ConsoleService.WithRawResponse = console

        override fun batch(): BatchService.WithRawResponse = batch

        private val createHandler: Handler<GeofenceCreateResponse> =
            jsonHandler<GeofenceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GeofenceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeofenceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence")
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

        private val retrieveHandler: Handler<GeofenceRetrieveResponse> =
            jsonHandler<GeofenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeofenceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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

        private val listHandler: Handler<GeofenceListResponse> =
            jsonHandler<GeofenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GeofenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeofenceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "list")
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

        private val deleteHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun delete(
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", params._pathParam(0))
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

        private val containsHandler: Handler<GeofenceContainsResponse> =
            jsonHandler<GeofenceContainsResponse>(clientOptions.jsonMapper)

        override fun contains(
            params: GeofenceContainsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GeofenceContainsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("geofence", "contain")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { containsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
