// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.optimization

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.optimization.driverassignment.DriverAssignmentAssignParams
import io.nextbillion.api.models.optimization.driverassignment.DriverAssignmentAssignResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DriverAssignmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriverAssignmentServiceAsync

    /**
     * Assigns available drivers (vehicles) to open orders based on specified criteria and
     * constraints.
     */
    fun assign(
        params: DriverAssignmentAssignParams
    ): CompletableFuture<DriverAssignmentAssignResponse> = assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: DriverAssignmentAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DriverAssignmentAssignResponse>

    /**
     * A view of [DriverAssignmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): DriverAssignmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /optimization/driver-assignment/v1`, but is
         * otherwise the same as [DriverAssignmentServiceAsync.assign].
         */
        fun assign(
            params: DriverAssignmentAssignParams
        ): CompletableFuture<HttpResponseFor<DriverAssignmentAssignResponse>> =
            assign(params, RequestOptions.none())

        /** @see assign */
        fun assign(
            params: DriverAssignmentAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DriverAssignmentAssignResponse>>
    }
}
