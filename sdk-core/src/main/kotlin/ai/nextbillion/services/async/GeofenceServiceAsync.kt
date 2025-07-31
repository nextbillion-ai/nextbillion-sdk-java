// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.geofence.GeofenceContainsParams
import ai.nextbillion.models.geofence.GeofenceContainsResponse
import ai.nextbillion.models.geofence.GeofenceCreateParams
import ai.nextbillion.models.geofence.GeofenceCreateResponse
import ai.nextbillion.models.geofence.GeofenceDeleteParams
import ai.nextbillion.models.geofence.GeofenceListParams
import ai.nextbillion.models.geofence.GeofenceListResponse
import ai.nextbillion.models.geofence.GeofenceRetrieveParams
import ai.nextbillion.models.geofence.GeofenceRetrieveResponse
import ai.nextbillion.models.geofence.GeofenceUpdateParams
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.services.async.geofence.BatchServiceAsync
import ai.nextbillion.services.async.geofence.ConsoleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GeofenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeofenceServiceAsync

    fun console(): ConsoleServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a geofence */
    fun create(params: GeofenceCreateParams): CompletableFuture<GeofenceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GeofenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeofenceCreateResponse>

    /** Get a Geofence */
    fun retrieve(
        id: String,
        params: GeofenceRetrieveParams,
    ): CompletableFuture<GeofenceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeofenceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: GeofenceRetrieveParams): CompletableFuture<GeofenceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeofenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeofenceRetrieveResponse>

    /** Update a Geofence */
    fun update(id: String, params: GeofenceUpdateParams): CompletableFuture<SimpleResp> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: GeofenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: GeofenceUpdateParams): CompletableFuture<SimpleResp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GeofenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Get Geofence List */
    fun list(params: GeofenceListParams): CompletableFuture<GeofenceListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GeofenceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeofenceListResponse>

    /** Delete a Geofence */
    fun delete(id: String, params: GeofenceDeleteParams): CompletableFuture<SimpleResp> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GeofenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: GeofenceDeleteParams): CompletableFuture<SimpleResp> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GeofenceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Geofence Contains */
    fun contains(params: GeofenceContainsParams): CompletableFuture<GeofenceContainsResponse> =
        contains(params, RequestOptions.none())

    /** @see contains */
    fun contains(
        params: GeofenceContainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GeofenceContainsResponse>

    /**
     * A view of [GeofenceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeofenceServiceAsync.WithRawResponse

        fun console(): ConsoleServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence`, but is otherwise the same as
         * [GeofenceServiceAsync.create].
         */
        fun create(
            params: GeofenceCreateParams
        ): CompletableFuture<HttpResponseFor<GeofenceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GeofenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeofenceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /geofence/{id}`, but is otherwise the same as
         * [GeofenceServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: GeofenceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<GeofenceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeofenceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: GeofenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<GeofenceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GeofenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeofenceRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /geofence/{id}`, but is otherwise the same as
         * [GeofenceServiceAsync.update].
         */
        fun update(
            id: String,
            params: GeofenceUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: GeofenceUpdateParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GeofenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `get /geofence/list`, but is otherwise the same as
         * [GeofenceServiceAsync.list].
         */
        fun list(
            params: GeofenceListParams
        ): CompletableFuture<HttpResponseFor<GeofenceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GeofenceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeofenceListResponse>>

        /**
         * Returns a raw HTTP response for `delete /geofence/{id}`, but is otherwise the same as
         * [GeofenceServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: GeofenceDeleteParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: GeofenceDeleteParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GeofenceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `get /geofence/contain`, but is otherwise the same as
         * [GeofenceServiceAsync.contains].
         */
        fun contains(
            params: GeofenceContainsParams
        ): CompletableFuture<HttpResponseFor<GeofenceContainsResponse>> =
            contains(params, RequestOptions.none())

        /** @see contains */
        fun contains(
            params: GeofenceContainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GeofenceContainsResponse>>
    }
}
