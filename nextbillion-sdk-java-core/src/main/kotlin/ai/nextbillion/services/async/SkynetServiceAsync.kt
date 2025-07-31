// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.SkynetSubscribeParams
import ai.nextbillion.models.skynet.SkynetSubscribeResponse
import ai.nextbillion.services.async.skynet.AssetServiceAsync
import ai.nextbillion.services.async.skynet.ConfigServiceAsync
import ai.nextbillion.services.async.skynet.MonitorServiceAsync
import ai.nextbillion.services.async.skynet.NamespacedApikeyServiceAsync
import ai.nextbillion.services.async.skynet.SearchServiceAsync
import ai.nextbillion.services.async.skynet.TripServiceAsync
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
