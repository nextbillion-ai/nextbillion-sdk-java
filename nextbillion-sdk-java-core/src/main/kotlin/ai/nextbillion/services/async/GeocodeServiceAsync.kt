// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.geocode.GeocodeBatchCreateParams
import ai.nextbillion.models.geocode.GeocodeBatchCreateResponse
import ai.nextbillion.models.geocode.GeocodeRetrieveParams
import ai.nextbillion.models.geocode.GeocodeRetrieveResponse
import ai.nextbillion.models.geocode.GeocodeStructuredRetrieveParams
import ai.nextbillion.models.geocode.GeocodeStructuredRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GeocodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeocodeServiceAsync

    /** Geocode */
    fun retrieve(params: GeocodeRetrieveParams): CompletableFuture<GeocodeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeocodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeocodeRetrieveResponse>

    /** Batch Geocode */
    fun batchCreate(
        params: GeocodeBatchCreateParams
    ): CompletableFuture<GeocodeBatchCreateResponse> = batchCreate(params, RequestOptions.none())

    /** @see batchCreate */
    fun batchCreate(
        params: GeocodeBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeocodeBatchCreateResponse>

    /** Structured Geocode */
    fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams
    ): CompletableFuture<GeocodeStructuredRetrieveResponse> =
        structuredRetrieve(params, RequestOptions.none())

    /** @see structuredRetrieve */
    fun structuredRetrieve(
        params: GeocodeStructuredRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeocodeStructuredRetrieveResponse>

    /**
     * A view of [GeocodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeocodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /geocode`, but is otherwise the same as
         * [GeocodeServiceAsync.retrieve].
         */
        fun retrieve(
            params: GeocodeRetrieveParams
        ): CompletableFuture<HttpResponseFor<GeocodeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GeocodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeocodeRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /geocode/batch`, but is otherwise the same as
         * [GeocodeServiceAsync.batchCreate].
         */
        fun batchCreate(
            params: GeocodeBatchCreateParams
        ): CompletableFuture<HttpResponseFor<GeocodeBatchCreateResponse>> =
            batchCreate(params, RequestOptions.none())

        /** @see batchCreate */
        fun batchCreate(
            params: GeocodeBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeocodeBatchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /geocode/structured`, but is otherwise the same as
         * [GeocodeServiceAsync.structuredRetrieve].
         */
        fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams
        ): CompletableFuture<HttpResponseFor<GeocodeStructuredRetrieveResponse>> =
            structuredRetrieve(params, RequestOptions.none())

        /** @see structuredRetrieve */
        fun structuredRetrieve(
            params: GeocodeStructuredRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeocodeStructuredRetrieveResponse>>
    }
}
