// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.autocomplete.AutocompleteSuggestParams
import com.nextbillion_sdk.api.models.autocomplete.AutocompleteSuggestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutocompleteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutocompleteServiceAsync

    /** Autocomplete */
    fun suggest(params: AutocompleteSuggestParams): CompletableFuture<AutocompleteSuggestResponse> =
        suggest(params, RequestOptions.none())

    /** @see suggest */
    fun suggest(
        params: AutocompleteSuggestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutocompleteSuggestResponse>

    /**
     * A view of [AutocompleteServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutocompleteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /autocomplete`, but is otherwise the same as
         * [AutocompleteServiceAsync.suggest].
         */
        fun suggest(
            params: AutocompleteSuggestParams
        ): CompletableFuture<HttpResponseFor<AutocompleteSuggestResponse>> =
            suggest(params, RequestOptions.none())

        /** @see suggest */
        fun suggest(
            params: AutocompleteSuggestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutocompleteSuggestResponse>>
    }
}
