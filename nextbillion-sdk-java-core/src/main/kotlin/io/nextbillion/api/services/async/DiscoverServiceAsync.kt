// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.discover.DiscoverRetrieveParams
import io.nextbillion.api.models.discover.DiscoverRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DiscoverServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DiscoverServiceAsync

    /** Discover matching places */
    fun retrieve(params: DiscoverRetrieveParams): CompletableFuture<DiscoverRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DiscoverRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DiscoverRetrieveResponse>

    /**
     * A view of [DiscoverServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DiscoverServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /discover`, but is otherwise the same as
         * [DiscoverServiceAsync.retrieve].
         */
        fun retrieve(
            params: DiscoverRetrieveParams
        ): CompletableFuture<HttpResponseFor<DiscoverRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DiscoverRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DiscoverRetrieveResponse>>
    }
}
