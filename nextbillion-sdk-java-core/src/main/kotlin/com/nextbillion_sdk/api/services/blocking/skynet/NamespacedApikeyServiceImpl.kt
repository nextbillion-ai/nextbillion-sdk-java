// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet

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
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateResponse
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteResponse
import java.util.function.Consumer

class NamespacedApikeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NamespacedApikeyService {

    private val withRawResponse: NamespacedApikeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NamespacedApikeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespacedApikeyService =
        NamespacedApikeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NamespacedApikeyCreateParams,
        requestOptions: RequestOptions,
    ): NamespacedApikeyCreateResponse =
        // post /skynet/namespaced-apikeys
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: NamespacedApikeyDeleteParams,
        requestOptions: RequestOptions,
    ): NamespacedApikeyDeleteResponse =
        // delete /skynet/namespaced-apikeys
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamespacedApikeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespacedApikeyService.WithRawResponse =
            NamespacedApikeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NamespacedApikeyCreateResponse> =
            jsonHandler<NamespacedApikeyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NamespacedApikeyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamespacedApikeyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "namespaced-apikeys")
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

        private val deleteHandler: Handler<NamespacedApikeyDeleteResponse> =
            jsonHandler<NamespacedApikeyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NamespacedApikeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamespacedApikeyDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "namespaced-apikeys")
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
