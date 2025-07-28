// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.handlers.errorBodyHandler
import ai.nextbillion.core.handlers.errorHandler
import ai.nextbillion.core.handlers.jsonHandler
import ai.nextbillion.core.http.HttpMethod
import ai.nextbillion.core.http.HttpRequest
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponse.Handler
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyCreateResponse
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import ai.nextbillion.models.skynet.namespacedapikeys.NamespacedApikeyDeleteResponse
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
