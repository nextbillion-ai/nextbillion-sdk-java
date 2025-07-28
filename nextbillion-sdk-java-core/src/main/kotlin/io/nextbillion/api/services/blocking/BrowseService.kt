// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.browse.BrowseSearchParams
import io.nextbillion.api.models.browse.BrowseSearchResponse
import java.util.function.Consumer

interface BrowseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseService

    /** Browse a search area using a free text query */
    fun search(params: BrowseSearchParams): BrowseSearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: BrowseSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrowseSearchResponse

    /** A view of [BrowseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /browse`, but is otherwise the same as
         * [BrowseService.search].
         */
        @MustBeClosed
        fun search(params: BrowseSearchParams): HttpResponseFor<BrowseSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: BrowseSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrowseSearchResponse>
    }
}
