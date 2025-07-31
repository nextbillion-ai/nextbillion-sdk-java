// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.search

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.search.SearchResponse
import ai.nextbillion.models.skynet.search.polygon.PolygonCreateParams
import ai.nextbillion.models.skynet.search.polygon.PolygonGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PolygonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolygonServiceAsync

    /** Polygon Search */
    fun create(params: PolygonCreateParams): CompletableFuture<SearchResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolygonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchResponse>

    /** Polygon Search */
    fun get(params: PolygonGetParams): CompletableFuture<SearchResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PolygonGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SearchResponse>

    /**
     * A view of [PolygonServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolygonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/search/polygon`, but is otherwise the same
         * as [PolygonServiceAsync.create].
         */
        fun create(
            params: PolygonCreateParams
        ): CompletableFuture<HttpResponseFor<SearchResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PolygonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchResponse>>

        /**
         * Returns a raw HTTP response for `get /skynet/search/polygon`, but is otherwise the same
         * as [PolygonServiceAsync.get].
         */
        fun get(params: PolygonGetParams): CompletableFuture<HttpResponseFor<SearchResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PolygonGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SearchResponse>>
    }
}
