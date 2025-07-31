// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.optimization

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
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.models.optimization.v2.V2RetrieveResultParams
import ai.nextbillion.models.optimization.v2.V2RetrieveResultResponse
import ai.nextbillion.models.optimization.v2.V2SubmitParams
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveResult(
        params: V2RetrieveResultParams,
        requestOptions: RequestOptions,
    ): V2RetrieveResultResponse =
        // get /optimization/v2/result
        withRawResponse().retrieveResult(params, requestOptions).parse()

    override fun submit(params: V2SubmitParams, requestOptions: RequestOptions): PostResponse =
        // post /optimization/v2
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveResultHandler: Handler<V2RetrieveResultResponse> =
            jsonHandler<V2RetrieveResultResponse>(clientOptions.jsonMapper)

        override fun retrieveResult(
            params: V2RetrieveResultParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveResultResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "v2", "result")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveResultHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitHandler: Handler<PostResponse> =
            jsonHandler<PostResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: V2SubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("optimization", "v2")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
