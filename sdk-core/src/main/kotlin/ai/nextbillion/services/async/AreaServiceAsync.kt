// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.areas.AreaListParams
import ai.nextbillion.models.areas.AreaListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AreaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AreaServiceAsync

    /** Get available areas */
    fun list(params: AreaListParams): CompletableFuture<List<AreaListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AreaListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AreaListResponse>>

    /** A view of [AreaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AreaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /areas`, but is otherwise the same as
         * [AreaServiceAsync.list].
         */
        fun list(
            params: AreaListParams
        ): CompletableFuture<HttpResponseFor<List<AreaListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AreaListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AreaListResponse>>>
    }
}
