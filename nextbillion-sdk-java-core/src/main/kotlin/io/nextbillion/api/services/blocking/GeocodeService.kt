// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.geocode.GeocodeBatchCreateParams
import io.nextbillion.api.models.geocode.GeocodeBatchCreateResponse
import io.nextbillion.api.models.geocode.GeocodeRetrieveParams
import io.nextbillion.api.models.geocode.GeocodeRetrieveResponse
import io.nextbillion.api.models.geocode.GeocodeStructuredRetrieveParams
import io.nextbillion.api.models.geocode.GeocodeStructuredRetrieveResponse
import java.util.function.Consumer

interface GeocodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeocodeService

    /** Geocode */
    fun retrieve(params: GeocodeRetrieveParams): GeocodeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeocodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeocodeRetrieveResponse

    /** Batch Geocode */
    fun batchCreate(params: GeocodeBatchCreateParams): GeocodeBatchCreateResponse =
        batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: GeocodeBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeocodeBatchCreateResponse

    /** Structured Geocode */
    fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams
    ): GeocodeStructuredRetrieveResponse = structuredRetrieve(params, RequestOptions.none())

    /** @see structuredRetrieve */
    fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeocodeStructuredRetrieveResponse

    /** A view of [GeocodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeocodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /geocode`, but is otherwise the same as
         * [GeocodeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: GeocodeRetrieveParams): HttpResponseFor<GeocodeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GeocodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeocodeRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post /geocode/batch`, but is otherwise the same as
         * [GeocodeService.batchCreate].
         */
        @MustBeClosed
        fun batchCreate(
            params: GeocodeBatchCreateParams
        ): HttpResponseFor<GeocodeBatchCreateResponse> = batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        @MustBeClosed
        fun batchCreate(
            params: GeocodeBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeocodeBatchCreateResponse>

        /**
         * Returns a raw HTTP response for `get /geocode/structured`, but is otherwise the same as
         * [GeocodeService.structuredRetrieve].
         */
        @MustBeClosed
        fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams
        ): HttpResponseFor<GeocodeStructuredRetrieveResponse> =
            structuredRetrieve(params, RequestOptions.none())

        /** @see structuredRetrieve */
        @MustBeClosed
        fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeocodeStructuredRetrieveResponse>
    }
}
