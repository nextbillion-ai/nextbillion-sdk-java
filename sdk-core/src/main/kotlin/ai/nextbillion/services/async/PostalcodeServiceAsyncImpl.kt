// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

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
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesParams
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PostalcodeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PostalcodeServiceAsync {

    private val withRawResponse: PostalcodeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PostalcodeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalcodeServiceAsync =
        PostalcodeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostalcodeRetrieveCoordinatesResponse> =
        // post /postalcode
        withRawResponse().retrieveCoordinates(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostalcodeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalcodeServiceAsync.WithRawResponse =
            PostalcodeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveCoordinatesHandler: Handler<PostalcodeRetrieveCoordinatesResponse> =
            jsonHandler<PostalcodeRetrieveCoordinatesResponse>(clientOptions.jsonMapper)

        override fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostalcodeRetrieveCoordinatesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("postalcode")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
