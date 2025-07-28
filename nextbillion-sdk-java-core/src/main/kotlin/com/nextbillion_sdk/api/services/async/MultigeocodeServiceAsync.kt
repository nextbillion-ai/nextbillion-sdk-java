// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchParams
import com.nextbillion_sdk.api.models.multigeocode.MultigeocodeSearchResponse
import com.nextbillion_sdk.api.services.async.multigeocode.PlaceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MultigeocodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultigeocodeServiceAsync

    fun place(): PlaceServiceAsync

    /**
     * The method enables searching for known places from multiple data sources
     *
     * Use this method to find known places in default or your own custom (proprietary) dataset and
     * get a combined search result. It accepts free-form, partially correct or even incomplete
     * search texts. Results would be ranked based on the search score of a place.
     */
    fun search(params: MultigeocodeSearchParams): CompletableFuture<MultigeocodeSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MultigeocodeSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultigeocodeSearchResponse>

    /**
     * A view of [MultigeocodeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultigeocodeServiceAsync.WithRawResponse

        fun place(): PlaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /multigeocode/search`, but is otherwise the same as
         * [MultigeocodeServiceAsync.search].
         */
        fun search(
            params: MultigeocodeSearchParams
        ): CompletableFuture<HttpResponseFor<MultigeocodeSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: MultigeocodeSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultigeocodeSearchResponse>>
    }
}
