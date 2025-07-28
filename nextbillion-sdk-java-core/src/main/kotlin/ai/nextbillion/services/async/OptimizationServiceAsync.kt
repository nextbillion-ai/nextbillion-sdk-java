// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.optimization.OptimizationComputeParams
import ai.nextbillion.models.optimization.OptimizationComputeResponse
import ai.nextbillion.models.optimization.OptimizationReOptimizeParams
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.services.async.optimization.DriverAssignmentServiceAsync
import ai.nextbillion.services.async.optimization.V2ServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OptimizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationServiceAsync

    fun driverAssignment(): DriverAssignmentServiceAsync

    fun v2(): V2ServiceAsync

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
    fun compute(params: OptimizationComputeParams): CompletableFuture<OptimizationComputeResponse> =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: OptimizationComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OptimizationComputeResponse>

    /** Re-optimization */
    fun reOptimize(params: OptimizationReOptimizeParams): CompletableFuture<PostResponse> =
        reOptimize(params, RequestOptions.none())

    /** @see reOptimize */
    fun reOptimize(
        params: OptimizationReOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostResponse>

    /**
     * A view of [OptimizationServiceAsync] that provides access to raw HTTP responses for each
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
        ): OptimizationServiceAsync.WithRawResponse

        fun driverAssignment(): DriverAssignmentServiceAsync.WithRawResponse

        fun v2(): V2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /optimization/json`, but is otherwise the same as
         * [OptimizationServiceAsync.compute].
         */
        fun compute(
            params: OptimizationComputeParams
        ): CompletableFuture<HttpResponseFor<OptimizationComputeResponse>> =
            compute(params, RequestOptions.none())

        /** @see compute */
        fun compute(
            params: OptimizationComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OptimizationComputeResponse>>

        /**
         * Returns a raw HTTP response for `post /optimization/re_optimization`, but is otherwise
         * the same as [OptimizationServiceAsync.reOptimize].
         */
        fun reOptimize(
            params: OptimizationReOptimizeParams
        ): CompletableFuture<HttpResponseFor<PostResponse>> =
            reOptimize(params, RequestOptions.none())

        /** @see reOptimize */
        fun reOptimize(
            params: OptimizationReOptimizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostResponse>>
    }
}
