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
import com.nextbillion_sdk.api.models.postalcode.PostalcodeRetrieveCoordinatesParams
import com.nextbillion_sdk.api.models.postalcode.PostalcodeRetrieveCoordinatesResponse
import java.util.function.Consumer

class PostalcodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PostalcodeService {

    private val withRawResponse: PostalcodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PostalcodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalcodeService =
        PostalcodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams,
        requestOptions: RequestOptions,
    ): PostalcodeRetrieveCoordinatesResponse =
        // post /postalcode
        withRawResponse().retrieveCoordinates(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostalcodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalcodeService.WithRawResponse =
            PostalcodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveCoordinatesHandler: Handler<PostalcodeRetrieveCoordinatesResponse> =
            jsonHandler<PostalcodeRetrieveCoordinatesResponse>(clientOptions.jsonMapper)

        override fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostalcodeRetrieveCoordinatesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("postalcode")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCoordinatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
