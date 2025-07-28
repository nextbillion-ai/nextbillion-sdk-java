// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.isochrone.IsochroneComputeParams
import com.nextbillion_sdk.api.models.isochrone.IsochroneComputeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IsochroneServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsochroneServiceAsync

    /**
     * The NextBillion.ai Isochrone API computes areas that are reachable within a specified amount
     * of time from a location, and returns the reachable regions as contours of polygons or lines
     * that you can display on a map.
     */
    fun compute(params: IsochroneComputeParams): CompletableFuture<IsochroneComputeResponse> =
        compute(params, RequestOptions.none())

    /** @see compute */
    fun compute(
        params: IsochroneComputeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IsochroneComputeResponse>

    /**
     * A view of [IsochroneServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IsochroneServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /isochrone/json`, but is otherwise the same as
         * [IsochroneServiceAsync.compute].
         */
        fun compute(
            params: IsochroneComputeParams
        ): CompletableFuture<HttpResponseFor<IsochroneComputeResponse>> =
            compute(params, RequestOptions.none())

        /** @see compute */
        fun compute(
            params: IsochroneComputeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IsochroneComputeResponse>>
    }
}
