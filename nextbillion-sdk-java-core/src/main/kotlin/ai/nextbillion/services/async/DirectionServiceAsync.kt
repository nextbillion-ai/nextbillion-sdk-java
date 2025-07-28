// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.directions.DirectionComputeRouteParams
import ai.nextbillion.models.directions.DirectionComputeRouteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DirectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectionServiceAsync

    /** Directions API is a service that computes a route with given coordinates. */
    fun computeRoute(
        params: DirectionComputeRouteParams
    ): CompletableFuture<DirectionComputeRouteResponse> =
        computeRoute(params, RequestOptions.none())

    /** @see computeRoute */
    fun computeRoute(
        params: DirectionComputeRouteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectionComputeRouteResponse>

    /**
     * A view of [DirectionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /directions/json`, but is otherwise the same as
         * [DirectionServiceAsync.computeRoute].
         */
        fun computeRoute(
            params: DirectionComputeRouteParams
        ): CompletableFuture<HttpResponseFor<DirectionComputeRouteResponse>> =
            computeRoute(params, RequestOptions.none())

        /** @see computeRoute */
        fun computeRoute(
            params: DirectionComputeRouteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectionComputeRouteResponse>>
    }
}
