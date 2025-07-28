// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.isochrone.IsochroneComputeParams
import ai.nextbillion.models.isochrone.IsochroneComputeResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface IsochroneService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsochroneService

    /**
     * The NextBillion.ai Isochrone API computes areas that are reachable within a specified amount
     * of time from a location, and returns the reachable regions as contours of polygons or lines
     * that you can display on a map.
     */
    fun compute(params: IsochroneComputeParams): IsochroneComputeResponse =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: IsochroneComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IsochroneComputeResponse

    /** A view of [IsochroneService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsochroneService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /isochrone/json`, but is otherwise the same as
         * [IsochroneService.compute].
         */
        @MustBeClosed
        fun compute(params: IsochroneComputeParams): HttpResponseFor<IsochroneComputeResponse> =
            compute(params, RequestOptions.none())

        /** @see compute */
        @MustBeClosed
        fun compute(
            params: IsochroneComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IsochroneComputeResponse>
    }
}
