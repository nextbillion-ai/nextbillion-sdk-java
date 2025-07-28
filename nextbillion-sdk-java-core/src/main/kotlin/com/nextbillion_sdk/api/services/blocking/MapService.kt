// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.models.map.MapCreateSegmentParams
import java.util.function.Consumer

interface MapService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MapService

    /** Road Segments */
    fun createSegment() = createSegment(MapCreateSegmentParams.none())

    /** @see createSegment */
    fun createSegment(
        params: MapCreateSegmentParams = MapCreateSegmentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createSegment */
    fun createSegment(params: MapCreateSegmentParams = MapCreateSegmentParams.none()) =
        createSegment(params, RequestOptions.none())

    /** @see createSegment */
    fun createSegment(requestOptions: RequestOptions) =
        createSegment(MapCreateSegmentParams.none(), requestOptions)

    /** A view of [MapService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MapService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /map/segments`, but is otherwise the same as
         * [MapService.createSegment].
         */
        @MustBeClosed
        fun createSegment(): HttpResponse = createSegment(MapCreateSegmentParams.none())

        /** @see createSegment */
        @MustBeClosed
        fun createSegment(
            params: MapCreateSegmentParams = MapCreateSegmentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createSegment */
        @MustBeClosed
        fun createSegment(
            params: MapCreateSegmentParams = MapCreateSegmentParams.none()
        ): HttpResponse = createSegment(params, RequestOptions.none())

        /** @see createSegment */
        @MustBeClosed
        fun createSegment(requestOptions: RequestOptions): HttpResponse =
            createSegment(MapCreateSegmentParams.none(), requestOptions)
    }
}
