// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.models.map.MapCreateSegmentParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MapServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MapServiceAsync

    /** Road Segments */
    fun createSegment(): CompletableFuture<Void?> = createSegment(MapCreateSegmentParams.none())

    /** @see createSegment */
    fun createSegment(
        params: MapCreateSegmentParams = MapCreateSegmentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createSegment */
    fun createSegment(
        params: MapCreateSegmentParams = MapCreateSegmentParams.none()
    ): CompletableFuture<Void?> = createSegment(params, RequestOptions.none())

    /** @see createSegment */
    fun createSegment(requestOptions: RequestOptions): CompletableFuture<Void?> =
        createSegment(MapCreateSegmentParams.none(), requestOptions)

    /** A view of [MapServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MapServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /map/segments`, but is otherwise the same as
         * [MapServiceAsync.createSegment].
         */
        fun createSegment(): CompletableFuture<HttpResponse> =
            createSegment(MapCreateSegmentParams.none())

        /** @see createSegment */
        fun createSegment(
            params: MapCreateSegmentParams = MapCreateSegmentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createSegment */
        fun createSegment(
            params: MapCreateSegmentParams = MapCreateSegmentParams.none()
        ): CompletableFuture<HttpResponse> = createSegment(params, RequestOptions.none())

        /** @see createSegment */
        fun createSegment(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            createSegment(MapCreateSegmentParams.none(), requestOptions)
    }
}
