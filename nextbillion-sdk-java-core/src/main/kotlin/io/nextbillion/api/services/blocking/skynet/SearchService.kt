// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.skynet

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.search.SearchAroundParams
import io.nextbillion.api.models.skynet.search.SearchBoundParams
import io.nextbillion.api.models.skynet.search.SearchResponse
import io.nextbillion.api.services.blocking.skynet.search.PolygonService
import java.util.function.Consumer

interface SearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchService

    fun polygon(): PolygonService

    /** Around Search */
    fun around(params: SearchAroundParams): SearchResponse = around(params, RequestOptions.none())

    /** @see around */
    fun around(
        params: SearchAroundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchResponse

    /** Bound Search */
    fun bound(params: SearchBoundParams): SearchResponse = bound(params, RequestOptions.none())

    /** @see bound */
    fun bound(
        params: SearchBoundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchResponse

    /** A view of [SearchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchService.WithRawResponse

        fun polygon(): PolygonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/search/around`, but is otherwise the same as
         * [SearchService.around].
         */
        @MustBeClosed
        fun around(params: SearchAroundParams): HttpResponseFor<SearchResponse> =
            around(params, RequestOptions.none())

        /** @see around */
        @MustBeClosed
        fun around(
            params: SearchAroundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchResponse>

        /**
         * Returns a raw HTTP response for `get /skynet/search/bound`, but is otherwise the same as
         * [SearchService.bound].
         */
        @MustBeClosed
        fun bound(params: SearchBoundParams): HttpResponseFor<SearchResponse> =
            bound(params, RequestOptions.none())

        /** @see bound */
        @MustBeClosed
        fun bound(
            params: SearchBoundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchResponse>
    }
}
