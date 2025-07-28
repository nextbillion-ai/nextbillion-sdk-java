// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.browse.BrowseSearchParams
import com.nextbillion_sdk.api.models.browse.BrowseSearchResponse
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
