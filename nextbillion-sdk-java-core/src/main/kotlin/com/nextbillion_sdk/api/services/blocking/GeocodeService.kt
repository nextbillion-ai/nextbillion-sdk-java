// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.geocode.GeocodeBatchCreateParams
import com.nextbillion_sdk.api.models.geocode.GeocodeBatchCreateResponse
import com.nextbillion_sdk.api.models.geocode.GeocodeRetrieveParams
import com.nextbillion_sdk.api.models.geocode.GeocodeRetrieveResponse
import com.nextbillion_sdk.api.models.geocode.GeocodeStructuredRetrieveParams
import com.nextbillion_sdk.api.models.geocode.GeocodeStructuredRetrieveResponse
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
