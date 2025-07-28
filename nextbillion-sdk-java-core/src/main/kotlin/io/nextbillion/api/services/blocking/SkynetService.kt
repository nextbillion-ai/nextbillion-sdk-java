// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.SkynetSubscribeParams
import io.nextbillion.api.models.skynet.SkynetSubscribeResponse
import io.nextbillion.api.services.blocking.skynet.AssetService
import io.nextbillion.api.services.blocking.skynet.ConfigService
import io.nextbillion.api.services.blocking.skynet.MonitorService
import io.nextbillion.api.services.blocking.skynet.NamespacedApikeyService
import io.nextbillion.api.services.blocking.skynet.SearchService
import io.nextbillion.api.services.blocking.skynet.TripService
import java.util.function.Consumer

interface SkynetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkynetService

    fun asset(): AssetService

    fun monitor(): MonitorService

    fun trip(): TripService

    fun namespacedApikeys(): NamespacedApikeyService

    fun config(): ConfigService

    fun search(): SearchService

    /** POST Action */
    fun subscribe(params: SkynetSubscribeParams): SkynetSubscribeResponse =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SkynetSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkynetSubscribeResponse

    /** A view of [SkynetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkynetService.WithRawResponse

        fun asset(): AssetService.WithRawResponse

        fun monitor(): MonitorService.WithRawResponse

        fun trip(): TripService.WithRawResponse

        fun namespacedApikeys(): NamespacedApikeyService.WithRawResponse

        fun config(): ConfigService.WithRawResponse

        fun search(): SearchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/subscribe`, but is otherwise the same as
         * [SkynetService.subscribe].
         */
        @MustBeClosed
        fun subscribe(params: SkynetSubscribeParams): HttpResponseFor<SkynetSubscribeResponse> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            params: SkynetSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkynetSubscribeResponse>
    }
}
