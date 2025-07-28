// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

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
import io.nextbillion.api.models.skynet.SkynetSubscribeParams
import io.nextbillion.api.models.skynet.SkynetSubscribeResponse
import io.nextbillion.api.services.async.skynet.AssetServiceAsync
import io.nextbillion.api.services.async.skynet.AssetServiceAsyncImpl
import io.nextbillion.api.services.async.skynet.ConfigServiceAsync
import io.nextbillion.api.services.async.skynet.ConfigServiceAsyncImpl
import io.nextbillion.api.services.async.skynet.MonitorServiceAsync
import io.nextbillion.api.services.async.skynet.MonitorServiceAsyncImpl
import io.nextbillion.api.services.async.skynet.NamespacedApikeyServiceAsync
import io.nextbillion.api.services.async.skynet.NamespacedApikeyServiceAsyncImpl
import io.nextbillion.api.services.async.skynet.SearchServiceAsync
import io.nextbillion.api.services.async.skynet.SearchServiceAsyncImpl
import io.nextbillion.api.services.async.skynet.TripServiceAsync
import io.nextbillion.api.services.async.skynet.TripServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SkynetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SkynetServiceAsync {

    private val withRawResponse: SkynetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val asset: AssetServiceAsync by lazy { AssetServiceAsyncImpl(clientOptions) }

    private val monitor: MonitorServiceAsync by lazy { MonitorServiceAsyncImpl(clientOptions) }

    private val trip: TripServiceAsync by lazy { TripServiceAsyncImpl(clientOptions) }

    private val namespacedApikeys: NamespacedApikeyServiceAsync by lazy {
        NamespacedApikeyServiceAsyncImpl(clientOptions)
    }

    private val config: ConfigServiceAsync by lazy { ConfigServiceAsyncImpl(clientOptions) }

    private val search: SearchServiceAsync by lazy { SearchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SkynetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkynetServiceAsync =
        SkynetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun asset(): AssetServiceAsync = asset

    override fun monitor(): MonitorServiceAsync = monitor

    override fun trip(): TripServiceAsync = trip

    override fun namespacedApikeys(): NamespacedApikeyServiceAsync = namespacedApikeys

    override fun config(): ConfigServiceAsync = config

    override fun search(): SearchServiceAsync = search

    override fun subscribe(
        params: SkynetSubscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SkynetSubscribeResponse> =
        // post /skynet/subscribe
        withRawResponse().subscribe(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkynetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val asset: AssetServiceAsync.WithRawResponse by lazy {
            AssetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val monitor: MonitorServiceAsync.WithRawResponse by lazy {
            MonitorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val trip: TripServiceAsync.WithRawResponse by lazy {
            TripServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val namespacedApikeys: NamespacedApikeyServiceAsync.WithRawResponse by lazy {
            NamespacedApikeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigServiceAsync.WithRawResponse by lazy {
            ConfigServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchServiceAsync.WithRawResponse by lazy {
            SearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkynetServiceAsync.WithRawResponse =
            SkynetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun asset(): AssetServiceAsync.WithRawResponse = asset

        override fun monitor(): MonitorServiceAsync.WithRawResponse = monitor

        override fun trip(): TripServiceAsync.WithRawResponse = trip

        override fun namespacedApikeys(): NamespacedApikeyServiceAsync.WithRawResponse =
            namespacedApikeys

        override fun config(): ConfigServiceAsync.WithRawResponse = config

        override fun search(): SearchServiceAsync.WithRawResponse = search

        private val subscribeHandler: Handler<SkynetSubscribeResponse> =
            jsonHandler<SkynetSubscribeResponse>(clientOptions.jsonMapper)

        override fun subscribe(
            params: SkynetSubscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkynetSubscribeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "subscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { subscribeHandler.handle(it) }
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
