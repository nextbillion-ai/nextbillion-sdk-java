// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet.asset

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.asset.location.LocationGetLastParams
import ai.nextbillion.models.skynet.asset.location.LocationGetLastResponse
import ai.nextbillion.models.skynet.asset.location.LocationListParams
import ai.nextbillion.models.skynet.asset.location.LocationListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface LocationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService

    /** Track locations of an asset */
    fun list(id: String, params: LocationListParams): LocationListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        params: LocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(params: LocationListParams): LocationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LocationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationListResponse

    /** Track the last location of an asset */
    fun getLast(id: String, params: LocationGetLastParams): LocationGetLastResponse =
        getLast(id, params, RequestOptions.none())

    /** @see getLast */
    fun getLast(
        id: String,
        params: LocationGetLastParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationGetLastResponse = getLast(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLast */
    fun getLast(params: LocationGetLastParams): LocationGetLastResponse =
        getLast(params, RequestOptions.none())

    /** @see getLast */
    fun getLast(
        params: LocationGetLastParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LocationGetLastResponse

    /** A view of [LocationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/location/list`, but is otherwise
         * the same as [LocationService.list].
         */
        @MustBeClosed
        fun list(id: String, params: LocationListParams): HttpResponseFor<LocationListResponse> =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: LocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: LocationListParams): HttpResponseFor<LocationListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LocationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationListResponse>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/location/last`, but is otherwise
         * the same as [LocationService.getLast].
         */
        @MustBeClosed
        fun getLast(
            id: String,
            params: LocationGetLastParams,
        ): HttpResponseFor<LocationGetLastResponse> = getLast(id, params, RequestOptions.none())

        /** @see getLast */
        @MustBeClosed
        fun getLast(
            id: String,
            params: LocationGetLastParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationGetLastResponse> =
            getLast(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLast */
        @MustBeClosed
        fun getLast(params: LocationGetLastParams): HttpResponseFor<LocationGetLastResponse> =
            getLast(params, RequestOptions.none())

        /** @see getLast */
        @MustBeClosed
        fun getLast(
            params: LocationGetLastParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LocationGetLastResponse>
    }
}
