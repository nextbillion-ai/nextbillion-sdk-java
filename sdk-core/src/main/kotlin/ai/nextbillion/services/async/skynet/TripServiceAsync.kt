// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.models.skynet.trip.TripDeleteParams
import ai.nextbillion.models.skynet.trip.TripEndParams
import ai.nextbillion.models.skynet.trip.TripGetSummaryParams
import ai.nextbillion.models.skynet.trip.TripGetSummaryResponse
import ai.nextbillion.models.skynet.trip.TripRetrieveParams
import ai.nextbillion.models.skynet.trip.TripRetrieveResponse
import ai.nextbillion.models.skynet.trip.TripStartParams
import ai.nextbillion.models.skynet.trip.TripStartResponse
import ai.nextbillion.models.skynet.trip.TripUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TripServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripServiceAsync

    /** Retrieves detailed information about a specific trip. */
    fun retrieve(id: String, params: TripRetrieveParams): CompletableFuture<TripRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TripRetrieveParams): CompletableFuture<TripRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripRetrieveResponse>

    /** Updates the data of a specified trip with the provided data. */
    fun update(id: String, params: TripUpdateParams): CompletableFuture<SimpleResp> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TripUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TripUpdateParams): CompletableFuture<SimpleResp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TripUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Deletes a specified trip from the system. */
    fun delete(id: String, params: TripDeleteParams): CompletableFuture<SimpleResp> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TripDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TripDeleteParams): CompletableFuture<SimpleResp> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TripDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** End a trip */
    fun end(params: TripEndParams): CompletableFuture<SimpleResp> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: TripEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Get summary of an ended trip */
    fun getSummary(
        id: String,
        params: TripGetSummaryParams,
    ): CompletableFuture<TripGetSummaryResponse> = getSummary(id, params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        id: String,
        params: TripGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripGetSummaryResponse> =
        getSummary(params.toBuilder().id(id).build(), requestOptions)

    /** @see getSummary */
    fun getSummary(params: TripGetSummaryParams): CompletableFuture<TripGetSummaryResponse> =
        getSummary(params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        params: TripGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripGetSummaryResponse>

    /** Add a new trip to the system with the provided data. */
    fun start(params: TripStartParams): CompletableFuture<TripStartResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: TripStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TripStartResponse>

    /** A view of [TripServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/trip/{id}`, but is otherwise the same as
         * [TripServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: TripRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TripRetrieveParams
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /skynet/trip/{id}`, but is otherwise the same as
         * [TripServiceAsync.update].
         */
        fun update(
            id: String,
            params: TripUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: TripUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: TripUpdateParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TripUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `delete /skynet/trip/{id}`, but is otherwise the same as
         * [TripServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: TripDeleteParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TripDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: TripDeleteParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TripDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `post /skynet/trip/end`, but is otherwise the same as
         * [TripServiceAsync.end].
         */
        fun end(params: TripEndParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            end(params, RequestOptions.none())

        /** @see end */
        fun end(
            params: TripEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `get /skynet/trip/{id}/summary`, but is otherwise the
         * same as [TripServiceAsync.getSummary].
         */
        fun getSummary(
            id: String,
            params: TripGetSummaryParams,
        ): CompletableFuture<HttpResponseFor<TripGetSummaryResponse>> =
            getSummary(id, params, RequestOptions.none())

        /** @see getSummary */
        fun getSummary(
            id: String,
            params: TripGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripGetSummaryResponse>> =
            getSummary(params.toBuilder().id(id).build(), requestOptions)

        /** @see getSummary */
        fun getSummary(
            params: TripGetSummaryParams
        ): CompletableFuture<HttpResponseFor<TripGetSummaryResponse>> =
            getSummary(params, RequestOptions.none())

        /** @see getSummary */
        fun getSummary(
            params: TripGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripGetSummaryResponse>>

        /**
         * Returns a raw HTTP response for `post /skynet/trip/start`, but is otherwise the same as
         * [TripServiceAsync.start].
         */
        fun start(params: TripStartParams): CompletableFuture<HttpResponseFor<TripStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            params: TripStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TripStartResponse>>
    }
}
