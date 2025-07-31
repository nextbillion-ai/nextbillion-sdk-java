// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet.search

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.search.SearchResponse
import ai.nextbillion.models.skynet.search.polygon.PolygonCreateParams
import ai.nextbillion.models.skynet.search.polygon.PolygonGetParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface PolygonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolygonService

    /** Polygon Search */
    fun create(params: PolygonCreateParams): SearchResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolygonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchResponse

    /** Polygon Search */
    fun get(params: PolygonGetParams): SearchResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PolygonGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SearchResponse

    /** A view of [PolygonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolygonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/search/polygon`, but is otherwise the same
         * as [PolygonService.create].
         */
        @MustBeClosed
        fun create(params: PolygonCreateParams): HttpResponseFor<SearchResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PolygonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchResponse>

        /**
         * Returns a raw HTTP response for `get /skynet/search/polygon`, but is otherwise the same
         * as [PolygonService.get].
         */
        @MustBeClosed
        fun get(params: PolygonGetParams): HttpResponseFor<SearchResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PolygonGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SearchResponse>
    }
}
