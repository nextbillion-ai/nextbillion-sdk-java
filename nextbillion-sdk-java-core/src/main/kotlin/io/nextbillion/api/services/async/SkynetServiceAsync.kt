// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.SkynetSubscribeParams
import io.nextbillion.api.models.skynet.SkynetSubscribeResponse
import io.nextbillion.api.services.async.skynet.AssetServiceAsync
import io.nextbillion.api.services.async.skynet.ConfigServiceAsync
import io.nextbillion.api.services.async.skynet.MonitorServiceAsync
import io.nextbillion.api.services.async.skynet.NamespacedApikeyServiceAsync
import io.nextbillion.api.services.async.skynet.SearchServiceAsync
import io.nextbillion.api.services.async.skynet.TripServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SkynetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkynetServiceAsync

    fun asset(): AssetServiceAsync

    fun monitor(): MonitorServiceAsync

    fun trip(): TripServiceAsync

    fun namespacedApikeys(): NamespacedApikeyServiceAsync

    fun config(): ConfigServiceAsync

    fun search(): SearchServiceAsync

    /** POST Action */
    fun subscribe(params: SkynetSubscribeParams): CompletableFuture<SkynetSubscribeResponse> =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SkynetSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkynetSubscribeResponse>

    /**
     * A view of [SkynetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkynetServiceAsync.WithRawResponse

        fun asset(): AssetServiceAsync.WithRawResponse

        fun monitor(): MonitorServiceAsync.WithRawResponse

        fun trip(): TripServiceAsync.WithRawResponse

        fun namespacedApikeys(): NamespacedApikeyServiceAsync.WithRawResponse

        fun config(): ConfigServiceAsync.WithRawResponse

        fun search(): SearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/subscribe`, but is otherwise the same as
         * [SkynetServiceAsync.subscribe].
         */
        fun subscribe(
            params: SkynetSubscribeParams
        ): CompletableFuture<HttpResponseFor<SkynetSubscribeResponse>> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            params: SkynetSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkynetSubscribeResponse>>
    }
}
