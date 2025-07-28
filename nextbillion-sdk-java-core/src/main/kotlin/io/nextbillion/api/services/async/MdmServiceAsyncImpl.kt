// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.handlers.errorBodyHandler
import io.nextbillion.api.core.handlers.errorHandler
import io.nextbillion.api.core.handlers.jsonHandler
import io.nextbillion.api.core.http.HttpMethod
import io.nextbillion.api.core.http.HttpRequest
import io.nextbillion.api.core.http.HttpResponse
import io.nextbillion.api.core.http.HttpResponse.Handler
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.core.http.json
import io.nextbillion.api.core.http.parseable
import io.nextbillion.api.core.prepareAsync
import io.nextbillion.api.models.mdm.MdmCreateDistanceMatrixParams
import io.nextbillion.api.models.mdm.MdmCreateDistanceMatrixResponse
import io.nextbillion.api.models.mdm.MdmGetDistanceMatrixStatusParams
import io.nextbillion.api.models.mdm.MdmGetDistanceMatrixStatusResponse
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
