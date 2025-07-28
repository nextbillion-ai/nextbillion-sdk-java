// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.multigeocode.MultigeocodeSearchParams
import io.nextbillion.api.models.multigeocode.MultigeocodeSearchResponse
import io.nextbillion.api.services.blocking.multigeocode.PlaceService
import java.util.function.Consumer

interface MultigeocodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultigeocodeService

    fun place(): PlaceService

    /**
     * The method enables searching for known places from multiple data sources
     *
     * Use this method to find known places in default or your own custom (proprietary) dataset and
     * get a combined search result. It accepts free-form, partially correct or even incomplete
     * search texts. Results would be ranked based on the search score of a place.
     */
    fun search(params: MultigeocodeSearchParams): MultigeocodeSearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MultigeocodeSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MultigeocodeSearchResponse

    /**
     * A view of [MultigeocodeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultigeocodeService.WithRawResponse

        fun place(): PlaceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /multigeocode/search`, but is otherwise the same as
         * [MultigeocodeService.search].
         */
        @MustBeClosed
        fun search(params: MultigeocodeSearchParams): HttpResponseFor<MultigeocodeSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: MultigeocodeSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MultigeocodeSearchResponse>
    }
}
