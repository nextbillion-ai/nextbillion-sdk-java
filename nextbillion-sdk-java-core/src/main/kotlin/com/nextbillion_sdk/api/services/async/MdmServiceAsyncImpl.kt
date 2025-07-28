// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

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
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixParams
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixResponse
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusParams
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MdmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MdmServiceAsync {

    private val withRawResponse: MdmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MdmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmServiceAsync =
        MdmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MdmCreateDistanceMatrixResponse> =
        // post /mdm/create
        withRawResponse().createDistanceMatrix(params, requestOptions).thenApply { it.parse() }

    override fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MdmGetDistanceMatrixStatusResponse> =
        // get /mdm/status
        withRawResponse().getDistanceMatrixStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MdmServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MdmServiceAsync.WithRawResponse =
            MdmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createDistanceMatrixHandler: Handler<MdmCreateDistanceMatrixResponse> =
            jsonHandler<MdmCreateDistanceMatrixResponse>(clientOptions.jsonMapper)

        override fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MdmCreateDistanceMatrixResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mdm", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createDistanceMatrixHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDistanceMatrixStatusHandler: Handler<MdmGetDistanceMatrixStatusResponse> =
            jsonHandler<MdmGetDistanceMatrixStatusResponse>(clientOptions.jsonMapper)

        override fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MdmGetDistanceMatrixStatusResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mdm", "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDistanceMatrixStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
