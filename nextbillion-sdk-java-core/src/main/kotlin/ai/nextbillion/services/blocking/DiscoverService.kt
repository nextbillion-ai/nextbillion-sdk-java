// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.discover.DiscoverRetrieveParams
import ai.nextbillion.models.discover.DiscoverRetrieveResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DiscoverService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscoverService

    /** Discover matching places */
    fun retrieve(params: DiscoverRetrieveParams): DiscoverRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DiscoverRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscoverRetrieveResponse

    /** A view of [DiscoverService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscoverService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /discover`, but is otherwise the same as
         * [DiscoverService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DiscoverRetrieveParams): HttpResponseFor<DiscoverRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DiscoverRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscoverRetrieveResponse>
    }
}
