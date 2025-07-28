// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet

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
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateResponse
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class NamespacedApikeyServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : NamespacedApikeyServiceAsync {

    private val withRawResponse: NamespacedApikeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NamespacedApikeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NamespacedApikeyServiceAsync =
        NamespacedApikeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NamespacedApikeyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespacedApikeyCreateResponse> =
        // post /skynet/namespaced-apikeys
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: NamespacedApikeyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespacedApikeyDeleteResponse> =
        // delete /skynet/namespaced-apikeys
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamespacedApikeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespacedApikeyServiceAsync.WithRawResponse =
            NamespacedApikeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NamespacedApikeyCreateResponse> =
            jsonHandler<NamespacedApikeyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NamespacedApikeyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "namespaced-apikeys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<NamespacedApikeyDeleteResponse> =
            jsonHandler<NamespacedApikeyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NamespacedApikeyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyDeleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "namespaced-apikeys")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
