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
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixParams
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixResponse
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusParams
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusResponse
import java.util.function.Consumer

class MdmServiceImpl internal constructor(private val clientOptions: ClientOptions) : MdmService {

    private val withRawResponse: MdmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MdmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmService =
        MdmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams,
        requestOptions: RequestOptions,
    ): MdmCreateDistanceMatrixResponse =
        // post /mdm/create
        withRawResponse().createDistanceMatrix(params, requestOptions).parse()

    override fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams,
        requestOptions: RequestOptions,
    ): MdmGetDistanceMatrixStatusResponse =
        // get /mdm/status
        withRawResponse().getDistanceMatrixStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MdmService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MdmService.WithRawResponse =
            MdmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createDistanceMatrixHandler: Handler<MdmCreateDistanceMatrixResponse> =
            jsonHandler<MdmCreateDistanceMatrixResponse>(clientOptions.jsonMapper)

        override fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdmCreateDistanceMatrixResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mdm", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createDistanceMatrixHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDistanceMatrixStatusHandler: Handler<MdmGetDistanceMatrixStatusResponse> =
            jsonHandler<MdmGetDistanceMatrixStatusResponse>(clientOptions.jsonMapper)

        override fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MdmGetDistanceMatrixStatusResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mdm", "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
