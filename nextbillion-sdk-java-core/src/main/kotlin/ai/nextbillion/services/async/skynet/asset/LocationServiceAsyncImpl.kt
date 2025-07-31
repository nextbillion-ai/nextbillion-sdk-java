// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.asset

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
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepareAsync
import ai.nextbillion.models.skynet.asset.location.LocationGetLastParams
import ai.nextbillion.models.skynet.asset.location.LocationGetLastResponse
import ai.nextbillion.models.skynet.asset.location.LocationListParams
import ai.nextbillion.models.skynet.asset.location.LocationListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LocationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LocationServiceAsync {

    private val withRawResponse: LocationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationServiceAsync =
        LocationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LocationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocationListResponse> =
        // get /skynet/asset/{id}/location/list
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getLast(
        params: LocationGetLastParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocationGetLastResponse> =
        // get /skynet/asset/{id}/location/last
        withRawResponse().getLast(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationServiceAsync.WithRawResponse =
            LocationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<LocationListResponse> =
            jsonHandler<LocationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LocationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "location", "list")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLastHandler: Handler<LocationGetLastResponse> =
            jsonHandler<LocationGetLastResponse>(clientOptions.jsonMapper)

        override fun getLast(
            params: LocationGetLastParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocationGetLastResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "location", "last")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLastHandler.handle(it) }
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
