// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapParams
import com.nextbillion_sdk.api.models.snaptoroads.SnapToRoadSnapResponse
import java.util.function.Consumer

interface SnapToRoadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapToRoadService

    /**
     * Nextbillion.ai Snap To Roads API takes a series of locations along a route, and returns the
     * new locations on this route that are snapped to the best-matched roads where the trip took
     * place. You can set various parameters, such as timestamps or radius, to optimize the result.
     */
    fun snap(params: SnapToRoadSnapParams): SnapToRoadSnapResponse =
        snap(params, RequestOptions.none())

    /** @see snap */
    fun snap(
        params: SnapToRoadSnapParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapToRoadSnapResponse

    /** A view of [SnapToRoadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapToRoadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /snapToRoads/json`, but is otherwise the same as
         * [SnapToRoadService.snap].
         */
        @MustBeClosed
        fun snap(params: SnapToRoadSnapParams): HttpResponseFor<SnapToRoadSnapResponse> =
            snap(params, RequestOptions.none())

        /** @see snap */
        @MustBeClosed
        fun snap(
            params: SnapToRoadSnapParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapToRoadSnapResponse>
    }
}
