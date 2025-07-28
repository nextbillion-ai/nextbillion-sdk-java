// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.geofence.GeofenceContainsParams
import io.nextbillion.api.models.geofence.GeofenceContainsResponse
import io.nextbillion.api.models.geofence.GeofenceCreateParams
import io.nextbillion.api.models.geofence.GeofenceCreateResponse
import io.nextbillion.api.models.geofence.GeofenceDeleteParams
import io.nextbillion.api.models.geofence.GeofenceListParams
import io.nextbillion.api.models.geofence.GeofenceListResponse
import io.nextbillion.api.models.geofence.GeofenceRetrieveParams
import io.nextbillion.api.models.geofence.GeofenceRetrieveResponse
import io.nextbillion.api.models.geofence.GeofenceUpdateParams
import io.nextbillion.api.models.skynet.asset.SimpleResp
import io.nextbillion.api.services.blocking.geofence.BatchService
import io.nextbillion.api.services.blocking.geofence.ConsoleService
import java.util.function.Consumer

interface GeofenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeofenceService

    fun console(): ConsoleService

    fun batch(): BatchService

    /** Create a geofence */
    fun create(params: GeofenceCreateParams): GeofenceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GeofenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeofenceCreateResponse

    /** Get a Geofence */
    fun retrieve(id: String, params: GeofenceRetrieveParams): GeofenceRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeofenceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: GeofenceRetrieveParams): GeofenceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeofenceRetrieveResponse

    /** Update a Geofence */
    fun update(id: String, params: GeofenceUpdateParams): SimpleResp =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: GeofenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: GeofenceUpdateParams): SimpleResp = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GeofenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Get Geofence List */
    fun list(params: GeofenceListParams): GeofenceListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GeofenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeofenceListResponse

    /** Delete a Geofence */
    fun delete(id: String, params: GeofenceDeleteParams): SimpleResp =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GeofenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: GeofenceDeleteParams): SimpleResp = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GeofenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Geofence Contains */
    fun contains(params: GeofenceContainsParams): GeofenceContainsResponse =
        contains(params, RequestOptions.none())

    /** @see contains */
    fun contains(
        params: GeofenceContainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GeofenceContainsResponse

    /** A view of [GeofenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeofenceService.WithRawResponse

        fun console(): ConsoleService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence`, but is otherwise the same as
         * [GeofenceService.create].
         */
        @MustBeClosed
        fun create(params: GeofenceCreateParams): HttpResponseFor<GeofenceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GeofenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeofenceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /geofence/{id}`, but is otherwise the same as
         * [GeofenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GeofenceRetrieveParams,
        ): HttpResponseFor<GeofenceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeofenceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GeofenceRetrieveParams): HttpResponseFor<GeofenceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeofenceRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /geofence/{id}`, but is otherwise the same as
         * [GeofenceService.update].
         */
        @MustBeClosed
        fun update(id: String, params: GeofenceUpdateParams): HttpResponseFor<SimpleResp> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: GeofenceUpdateParams): HttpResponseFor<SimpleResp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `get /geofence/list`, but is otherwise the same as
         * [GeofenceService.list].
         */
        @MustBeClosed
        fun list(params: GeofenceListParams): HttpResponseFor<GeofenceListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GeofenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeofenceListResponse>

        /**
         * Returns a raw HTTP response for `delete /geofence/{id}`, but is otherwise the same as
         * [GeofenceService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: GeofenceDeleteParams): HttpResponseFor<SimpleResp> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: GeofenceDeleteParams): HttpResponseFor<SimpleResp> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `get /geofence/contain`, but is otherwise the same as
         * [GeofenceService.contains].
         */
        @MustBeClosed
        fun contains(params: GeofenceContainsParams): HttpResponseFor<GeofenceContainsResponse> =
            contains(params, RequestOptions.none())

        /** @see contains */
        @MustBeClosed
        fun contains(
            params: GeofenceContainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GeofenceContainsResponse>
    }
}
