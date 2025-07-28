// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet.asset

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.asset.location.LocationGetLastParams
import io.nextbillion.api.models.skynet.asset.location.LocationGetLastResponse
import io.nextbillion.api.models.skynet.asset.location.LocationListParams
import io.nextbillion.api.models.skynet.asset.location.LocationListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LocationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationServiceAsync

    /** Track locations of an asset */
    fun list(id: String, params: LocationListParams): CompletableFuture<LocationListResponse> =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        params: LocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(params: LocationListParams): CompletableFuture<LocationListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationListResponse>

    /** Track the last location of an asset */
    fun getLast(
        id: String,
        params: LocationGetLastParams,
    ): CompletableFuture<LocationGetLastResponse> = getLast(id, params, RequestOptions.none())

    /** @see getLast */
    fun getLast(
        id: String,
        params: LocationGetLastParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationGetLastResponse> =
        getLast(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLast */
    fun getLast(params: LocationGetLastParams): CompletableFuture<LocationGetLastResponse> =
        getLast(params, RequestOptions.none())

    /** @see getLast */
    fun getLast(
        params: LocationGetLastParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LocationGetLastResponse>

    /**
     * A view of [LocationServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/location/list`, but is otherwise
         * the same as [LocationServiceAsync.list].
         */
        fun list(
            id: String,
            params: LocationListParams,
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            params: LocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            params: LocationListParams
        ): CompletableFuture<HttpResponseFor<LocationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationListResponse>>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/location/last`, but is otherwise
         * the same as [LocationServiceAsync.getLast].
         */
        fun getLast(
            id: String,
            params: LocationGetLastParams,
        ): CompletableFuture<HttpResponseFor<LocationGetLastResponse>> =
            getLast(id, params, RequestOptions.none())

        /** @see getLast */
        fun getLast(
            id: String,
            params: LocationGetLastParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationGetLastResponse>> =
            getLast(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLast */
        fun getLast(
            params: LocationGetLastParams
        ): CompletableFuture<HttpResponseFor<LocationGetLastResponse>> =
            getLast(params, RequestOptions.none())

        /** @see getLast */
        fun getLast(
            params: LocationGetLastParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LocationGetLastResponse>>
    }
}
