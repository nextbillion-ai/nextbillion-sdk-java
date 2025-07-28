// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.postalcode.PostalcodeRetrieveCoordinatesParams
import com.nextbillion_sdk.api.models.postalcode.PostalcodeRetrieveCoordinatesResponse
import java.util.function.Consumer

interface PostalcodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalcodeService

    /** Retrieve coordinates by postal code */
    fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams
    ): PostalcodeRetrieveCoordinatesResponse = retrieveCoordinates(params, RequestOptions.none())

    /** @see retrieveCoordinates */
    fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostalcodeRetrieveCoordinatesResponse

    /** A view of [PostalcodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostalcodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /postalcode`, but is otherwise the same as
         * [PostalcodeService.retrieveCoordinates].
         */
        @MustBeClosed
        fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams
        ): HttpResponseFor<PostalcodeRetrieveCoordinatesResponse> =
            retrieveCoordinates(params, RequestOptions.none())

        /** @see retrieveCoordinates */
        @MustBeClosed
        fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostalcodeRetrieveCoordinatesResponse>
    }
}
