// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.directions.DirectionComputeRouteParams
import io.nextbillion.api.models.directions.DirectionComputeRouteResponse
import java.util.function.Consumer

interface DirectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectionService

    /** Directions API is a service that computes a route with given coordinates. */
    fun computeRoute(params: DirectionComputeRouteParams): DirectionComputeRouteResponse =
        computeRoute(params, RequestOptions.none())

    /** @see computeRoute */
    fun computeRoute(
        params: DirectionComputeRouteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectionComputeRouteResponse

    /** A view of [DirectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /directions/json`, but is otherwise the same as
         * [DirectionService.computeRoute].
         */
        @MustBeClosed
        fun computeRoute(
            params: DirectionComputeRouteParams
        ): HttpResponseFor<DirectionComputeRouteResponse> =
            computeRoute(params, RequestOptions.none())

        /** @see computeRoute */
        @MustBeClosed
        fun computeRoute(
            params: DirectionComputeRouteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectionComputeRouteResponse>
    }
}
