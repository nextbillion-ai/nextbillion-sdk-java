// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.revgeocode.RevgeocodeRetrieveParams
import com.nextbillion_sdk.api.models.revgeocode.RevgeocodeRetrieveResponse
import java.util.function.Consumer

interface RevgeocodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevgeocodeService

    /** Reverse Geocode */
    fun retrieve(params: RevgeocodeRetrieveParams): RevgeocodeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RevgeocodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RevgeocodeRetrieveResponse

    /** A view of [RevgeocodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevgeocodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /revgeocode`, but is otherwise the same as
         * [RevgeocodeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RevgeocodeRetrieveParams
        ): HttpResponseFor<RevgeocodeRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RevgeocodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RevgeocodeRetrieveResponse>
    }
}
