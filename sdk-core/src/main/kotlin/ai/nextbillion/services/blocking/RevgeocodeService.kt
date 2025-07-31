// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.revgeocode.RevgeocodeRetrieveParams
import ai.nextbillion.models.revgeocode.RevgeocodeRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
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
