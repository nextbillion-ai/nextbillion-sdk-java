// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.geofence

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.geofence.console.ConsolePreviewParams
import ai.nextbillion.models.geofence.console.ConsolePreviewResponse
import ai.nextbillion.models.geofence.console.ConsoleSearchParams
import ai.nextbillion.models.geofence.console.ConsoleSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConsoleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsoleServiceAsync

    /** preview geofence geojson */
    fun preview(params: ConsolePreviewParams): CompletableFuture<ConsolePreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ConsolePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConsolePreviewResponse>

    /** Console Geofence Search API */
    fun search(params: ConsoleSearchParams): CompletableFuture<ConsoleSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ConsoleSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConsoleSearchResponse>

    /**
     * A view of [ConsoleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConsoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence/console/preview`, but is otherwise the
         * same as [ConsoleServiceAsync.preview].
         */
        fun preview(
            params: ConsolePreviewParams
        ): CompletableFuture<HttpResponseFor<ConsolePreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: ConsolePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConsolePreviewResponse>>

        /**
         * Returns a raw HTTP response for `get /geofence/console/search`, but is otherwise the same
         * as [ConsoleServiceAsync.search].
         */
        fun search(
            params: ConsoleSearchParams
        ): CompletableFuture<HttpResponseFor<ConsoleSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: ConsoleSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConsoleSearchResponse>>
    }
}
