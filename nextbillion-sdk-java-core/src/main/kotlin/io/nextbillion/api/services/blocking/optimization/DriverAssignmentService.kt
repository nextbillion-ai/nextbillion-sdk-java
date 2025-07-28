// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.optimization

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.optimization.driverassignment.DriverAssignmentAssignParams
import io.nextbillion.api.models.optimization.driverassignment.DriverAssignmentAssignResponse
import java.util.function.Consumer

interface DriverAssignmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DriverAssignmentService

    /**
     * Assigns available drivers (vehicles) to open orders based on specified criteria and
     * constraints.
     */
    fun assign(params: DriverAssignmentAssignParams): DriverAssignmentAssignResponse =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: DriverAssignmentAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DriverAssignmentAssignResponse

    /**
     * A view of [DriverAssignmentService] that provides access to raw HTTP responses for each
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
        ): DriverAssignmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /optimization/driver-assignment/v1`, but is
         * otherwise the same as [DriverAssignmentService.assign].
         */
        @MustBeClosed
        fun assign(
            params: DriverAssignmentAssignParams
        ): HttpResponseFor<DriverAssignmentAssignResponse> = assign(params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            params: DriverAssignmentAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DriverAssignmentAssignResponse>
    }
}
