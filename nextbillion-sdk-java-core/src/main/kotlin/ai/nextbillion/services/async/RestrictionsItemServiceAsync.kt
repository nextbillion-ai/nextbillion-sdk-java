// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.restrictionsitems.RestrictionsItemListParams
import ai.nextbillion.models.restrictionsitems.RestrictionsItemListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RestrictionsItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionsItemServiceAsync

    /** Get restriction items by bbox */
    fun list(
        params: RestrictionsItemListParams
    ): CompletableFuture<List<RestrictionsItemListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RestrictionsItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RestrictionsItemListResponse>>

    /**
     * A view of [RestrictionsItemServiceAsync] that provides access to raw HTTP responses for each
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
        ): RestrictionsItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /restrictions_items`, but is otherwise the same as
         * [RestrictionsItemServiceAsync.list].
         */
        fun list(
            params: RestrictionsItemListParams
        ): CompletableFuture<HttpResponseFor<List<RestrictionsItemListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RestrictionsItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RestrictionsItemListResponse>>>
    }
}
