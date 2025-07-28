// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.search.SearchAroundParams
import io.nextbillion.api.models.skynet.search.SearchBoundParams
import io.nextbillion.api.models.skynet.search.SearchResponse
import io.nextbillion.api.services.async.skynet.search.PolygonServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchServiceAsync

    fun polygon(): PolygonServiceAsync

    /** Around Search */
    fun around(params: SearchAroundParams): CompletableFuture<SearchResponse> =
        around(params, RequestOptions.none())

    /** @see around */
    fun around(
        params: SearchAroundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchResponse>

    /** Bound Search */
    fun bound(params: SearchBoundParams): CompletableFuture<SearchResponse> =
        bound(params, RequestOptions.none())

    /** @see bound */
    fun bound(
        params: SearchBoundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchResponse>

    /**
     * A view of [SearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SearchServiceAsync.WithRawResponse

        fun polygon(): PolygonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/search/around`, but is otherwise the same as
         * [SearchServiceAsync.around].
         */
        fun around(params: SearchAroundParams): CompletableFuture<HttpResponseFor<SearchResponse>> =
            around(params, RequestOptions.none())

        /** @see around */
        fun around(
            params: SearchAroundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchResponse>>

        /**
         * Returns a raw HTTP response for `get /skynet/search/bound`, but is otherwise the same as
         * [SearchServiceAsync.bound].
         */
        fun bound(params: SearchBoundParams): CompletableFuture<HttpResponseFor<SearchResponse>> =
            bound(params, RequestOptions.none())

        /** @see bound */
        fun bound(
            params: SearchBoundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchResponse>>
    }
}
