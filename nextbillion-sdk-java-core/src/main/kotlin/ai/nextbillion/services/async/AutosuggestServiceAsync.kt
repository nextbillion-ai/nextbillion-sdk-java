// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.autosuggest.AutosuggestSuggestParams
import ai.nextbillion.models.autosuggest.AutosuggestSuggestResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutosuggestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutosuggestServiceAsync

    /** Autosuggest */
    fun suggest(params: AutosuggestSuggestParams): CompletableFuture<AutosuggestSuggestResponse> =
        suggest(params, RequestOptions.none())

    /** @see suggest */
    fun suggest(
        params: AutosuggestSuggestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutosuggestSuggestResponse>

    /**
     * A view of [AutosuggestServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutosuggestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /autosuggest`, but is otherwise the same as
         * [AutosuggestServiceAsync.suggest].
         */
        fun suggest(
            params: AutosuggestSuggestParams
        ): CompletableFuture<HttpResponseFor<AutosuggestSuggestResponse>> =
            suggest(params, RequestOptions.none())

        /** @see suggest */
        fun suggest(
            params: AutosuggestSuggestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutosuggestSuggestResponse>>
    }
}
