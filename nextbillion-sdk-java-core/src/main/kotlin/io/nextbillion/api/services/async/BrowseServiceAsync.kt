// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.browse.BrowseSearchParams
import io.nextbillion.api.models.browse.BrowseSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrowseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseServiceAsync

    /** Browse a search area using a free text query */
    fun search(params: BrowseSearchParams): CompletableFuture<BrowseSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: BrowseSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrowseSearchResponse>

    /**
     * A view of [BrowseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse`, but is otherwise the same as
         * [BrowseServiceAsync.search].
         */
        fun search(
            params: BrowseSearchParams
        ): CompletableFuture<HttpResponseFor<BrowseSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: BrowseSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrowseSearchResponse>>
    }
}
