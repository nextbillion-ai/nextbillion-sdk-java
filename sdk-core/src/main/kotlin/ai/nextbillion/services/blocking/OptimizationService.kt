// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.optimization.OptimizationComputeParams
import ai.nextbillion.models.optimization.OptimizationComputeResponse
import ai.nextbillion.models.optimization.OptimizationReOptimizeParams
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.services.blocking.optimization.DriverAssignmentService
import ai.nextbillion.services.blocking.optimization.V2Service
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface OptimizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationService

    fun driverAssignment(): DriverAssignmentService

    fun v2(): V2Service

    /**
     * Nextbillion.ai Optimization API computes and returns an optimized route between an origin and
     * destination which have multiple stop points in between. With NextBillion.ai's Route
     * Optimization API you get.
     *
     * Optimized routing between way points
     *
     * Highly accurate ETAs with customized routes
     *
     * Roundtrip optimization with customized destinations
     *
     * A list of all parameters is specified in the next section.
     */
    fun compute(params: OptimizationComputeParams): OptimizationComputeResponse =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: OptimizationComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptimizationComputeResponse

    /** Re-optimization */
    fun reOptimize(params: OptimizationReOptimizeParams): PostResponse =
        reOptimize(params, RequestOptions.none())

    /** @see reOptimize */
    fun reOptimize(
        params: OptimizationReOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostResponse

    /**
     * A view of [OptimizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptimizationService.WithRawResponse

        fun driverAssignment(): DriverAssignmentService.WithRawResponse

        fun v2(): V2Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /optimization/json`, but is otherwise the same as
         * [OptimizationService.compute].
         */
        @MustBeClosed
        fun compute(
            params: OptimizationComputeParams
        ): HttpResponseFor<OptimizationComputeResponse> = compute(params, RequestOptions.none())

        /** @see compute */
        @MustBeClosed
        fun compute(
            params: OptimizationComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptimizationComputeResponse>

        /**
         * Returns a raw HTTP response for `post /optimization/re_optimization`, but is otherwise
         * the same as [OptimizationService.reOptimize].
         */
        @MustBeClosed
        fun reOptimize(params: OptimizationReOptimizeParams): HttpResponseFor<PostResponse> =
            reOptimize(params, RequestOptions.none())

        /** @see reOptimize */
        @MustBeClosed
        fun reOptimize(
            params: OptimizationReOptimizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostResponse>
    }
}
