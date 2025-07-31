// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.optimization

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
import ai.nextbillion.core.prepareAsync
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.models.optimization.v2.V2RetrieveResultParams
import ai.nextbillion.models.optimization.v2.V2RetrieveResultResponse
import ai.nextbillion.models.optimization.v2.V2SubmitParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveResult(
        params: V2RetrieveResultParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveResultResponse> =
        // get /optimization/v2/result
        withRawResponse().retrieveResult(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: V2SubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostResponse> =
        // post /optimization/v2
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveResultHandler: Handler<V2RetrieveResultResponse> =
            jsonHandler<V2RetrieveResultResponse>(clientOptions.jsonMapper)

        override fun retrieveResult(
            params: V2RetrieveResultParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveResultResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "v2", "result")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveResultHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitHandler: Handler<PostResponse> =
            jsonHandler<PostResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: V2SubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "v2")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitHandler.handle(it) }
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
