// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.autosuggest.AutosuggestSuggestParams
import io.nextbillion.api.models.autosuggest.AutosuggestSuggestResponse
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
