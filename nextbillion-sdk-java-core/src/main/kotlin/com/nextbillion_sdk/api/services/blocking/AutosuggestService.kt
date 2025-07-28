// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.autosuggest.AutosuggestSuggestParams
import com.nextbillion_sdk.api.models.autosuggest.AutosuggestSuggestResponse
import java.util.function.Consumer

interface AutosuggestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutosuggestService

    /** Autosuggest */
    fun suggest(params: AutosuggestSuggestParams): AutosuggestSuggestResponse =
        suggest(params, RequestOptions.none())

    /** @see suggest */
    fun suggest(
        params: AutosuggestSuggestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutosuggestSuggestResponse

    /**
     * A view of [AutosuggestService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutosuggestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /autosuggest`, but is otherwise the same as
         * [AutosuggestService.suggest].
         */
        @MustBeClosed
        fun suggest(params: AutosuggestSuggestParams): HttpResponseFor<AutosuggestSuggestResponse> =
            suggest(params, RequestOptions.none())

        /** @see suggest */
        @MustBeClosed
        fun suggest(
            params: AutosuggestSuggestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutosuggestSuggestResponse>
    }
}
