// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.autocomplete.AutocompleteSuggestParams
import io.nextbillion.api.models.autocomplete.AutocompleteSuggestResponse
import java.util.function.Consumer

interface AutocompleteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutocompleteService

    /** Autocomplete */
    fun suggest(params: AutocompleteSuggestParams): AutocompleteSuggestResponse =
        suggest(params, RequestOptions.none())

    /** @see suggest */
    fun suggest(
        params: AutocompleteSuggestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutocompleteSuggestResponse

    /**
     * A view of [AutocompleteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutocompleteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /autocomplete`, but is otherwise the same as
         * [AutocompleteService.suggest].
         */
        @MustBeClosed
        fun suggest(
            params: AutocompleteSuggestParams
        ): HttpResponseFor<AutocompleteSuggestResponse> = suggest(params, RequestOptions.none())

        /** @see suggest */
        @MustBeClosed
        fun suggest(
            params: AutocompleteSuggestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutocompleteSuggestResponse>
    }
}
