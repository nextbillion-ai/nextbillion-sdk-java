// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.browse.BrowseSearchParams
import ai.nextbillion.models.browse.BrowseSearchResponse
import com.google.errorprone.annotations.MustBeClosed
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
