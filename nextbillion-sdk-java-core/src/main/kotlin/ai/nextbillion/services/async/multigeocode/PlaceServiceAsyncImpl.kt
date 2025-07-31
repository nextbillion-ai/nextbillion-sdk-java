// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.multigeocode

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.checkRequired
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
import ai.nextbillion.models.multigeocode.place.PlaceCreateParams
import ai.nextbillion.models.multigeocode.place.PlaceCreateResponse
import ai.nextbillion.models.multigeocode.place.PlaceDeleteParams
import ai.nextbillion.models.multigeocode.place.PlaceDeleteResponse
import ai.nextbillion.models.multigeocode.place.PlaceRetrieveParams
import ai.nextbillion.models.multigeocode.place.PlaceRetrieveResponse
import ai.nextbillion.models.multigeocode.place.PlaceUpdateParams
import ai.nextbillion.models.multigeocode.place.PlaceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaceServiceAsync {

    private val withRawResponse: PlaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaceServiceAsync =
        PlaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PlaceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaceCreateResponse> =
        // post /multigeocode/place
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PlaceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaceRetrieveResponse> =
        // get /multigeocode/place/{docId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PlaceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaceUpdateResponse> =
        // put /multigeocode/place/{docId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PlaceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaceDeleteResponse> =
        // delete /multigeocode/place/{docId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaceServiceAsync.WithRawResponse =
            PlaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PlaceCreateResponse> =
            jsonHandler<PlaceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PlaceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place")
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

        private val retrieveHandler: Handler<PlaceRetrieveResponse> =
            jsonHandler<PlaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PlaceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PlaceUpdateResponse> =
            jsonHandler<PlaceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PlaceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PlaceDeleteResponse> =
            jsonHandler<PlaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PlaceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaceDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("docId", params.docId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("multigeocode", "place", params._pathParam(0))
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
