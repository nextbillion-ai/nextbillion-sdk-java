// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapParams
import ai.nextbillion.models.snaptoroads.SnapToRoadSnapResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SnapToRoadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapToRoadServiceAsync

    /**
     * Nextbillion.ai Snap To Roads API takes a series of locations along a route, and returns the
     * new locations on this route that are snapped to the best-matched roads where the trip took
     * place. You can set various parameters, such as timestamps or radius, to optimize the result.
     */
    fun snap(params: SnapToRoadSnapParams): CompletableFuture<SnapToRoadSnapResponse> =
        snap(params, RequestOptions.none())

    /** @see snap */
    fun snap(
        params: SnapToRoadSnapParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapToRoadSnapResponse>

    /**
     * A view of [SnapToRoadServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapToRoadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /snapToRoads/json`, but is otherwise the same as
         * [SnapToRoadServiceAsync.snap].
         */
        fun snap(
            params: SnapToRoadSnapParams
        ): CompletableFuture<HttpResponseFor<SnapToRoadSnapResponse>> =
            snap(params, RequestOptions.none())

        /** @see snap */
        fun snap(
            params: SnapToRoadSnapParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapToRoadSnapResponse>>
    }
}
