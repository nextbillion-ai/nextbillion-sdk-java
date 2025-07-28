// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.areas.AreaListParams
import com.nextbillion_sdk.api.models.areas.AreaListResponse
import java.util.function.Consumer

interface AreaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AreaService

    /** Get available areas */
    fun list(params: AreaListParams): List<AreaListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AreaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AreaListResponse>

    /** A view of [AreaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AreaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /areas`, but is otherwise the same as
         * [AreaService.list].
         */
        @MustBeClosed
        fun list(params: AreaListParams): HttpResponseFor<List<AreaListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AreaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AreaListResponse>>
    }
}
