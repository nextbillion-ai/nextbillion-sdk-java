// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.multigeocode

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
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceCreateParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceCreateResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceDeleteParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceDeleteResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceRetrieveParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceRetrieveResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceUpdateParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaceService {

    private val withRawResponse: PlaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaceService =
        PlaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PlaceCreateParams,
        requestOptions: RequestOptions,
    ): PlaceCreateResponse =
        // post /multigeocode/place
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlaceRetrieveParams,
        requestOptions: RequestOptions,
    ): PlaceRetrieveResponse =
        // get /multigeocode/place/{docId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PlaceUpdateParams,
        requestOptions: RequestOptions,
    ): PlaceUpdateResponse =
        // put /multigeocode/place/{docId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: PlaceDeleteParams,
        requestOptions: RequestOptions,
    ): PlaceDeleteResponse =
        // delete /multigeocode/place/{docId}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaceService.WithRawResponse =
            PlaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PlaceCreateResponse> =
            jsonHandler<PlaceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PlaceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place")
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

        private val retrieveHandler: Handler<PlaceRetrieveResponse> =
            jsonHandler<PlaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PlaceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
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

        private val updateHandler: Handler<PlaceUpdateResponse> =
            jsonHandler<PlaceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PlaceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaceUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
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

        private val deleteHandler: Handler<PlaceDeleteResponse> =
            jsonHandler<PlaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PlaceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaceDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
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
    }
}
