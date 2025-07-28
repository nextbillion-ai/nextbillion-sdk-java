// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

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
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.skynet.SkynetSubscribeParams
import com.nextbillion_sdk.api.models.skynet.SkynetSubscribeResponse
import com.nextbillion_sdk.api.services.async.skynet.AssetServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.AssetServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.skynet.ConfigServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.ConfigServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.skynet.MonitorServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.MonitorServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.skynet.NamespacedApikeyServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.NamespacedApikeyServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.skynet.SearchServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.SearchServiceAsyncImpl
import com.nextbillion_sdk.api.services.async.skynet.TripServiceAsync
import com.nextbillion_sdk.api.services.async.skynet.TripServiceAsyncImpl
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
