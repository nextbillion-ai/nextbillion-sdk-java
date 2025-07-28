// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.services.async.distancematrix.JsonServiceAsync
import java.util.function.Consumer

interface DistanceMatrixServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistanceMatrixServiceAsync

    fun json(): JsonServiceAsync

    /**
     * A view of [DistanceMatrixServiceAsync] that provides access to raw HTTP responses for each
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
        ): DistanceMatrixServiceAsync.WithRawResponse

        fun json(): JsonServiceAsync.WithRawResponse
    }
}
