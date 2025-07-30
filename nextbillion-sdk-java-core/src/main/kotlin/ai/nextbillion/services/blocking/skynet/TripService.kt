// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TripService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripService

    /** Retrieves detailed information about a specific trip. */
    fun retrieve(id: String, params: TripRetrieveParams): TripRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TripRetrieveParams): TripRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TripRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripRetrieveResponse

    /** Updates the data of a specified trip with the provided data. */
    fun update(id: String, params: TripUpdateParams): SimpleResp =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TripUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TripUpdateParams): SimpleResp = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TripUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Deletes a specified trip from the system. */
    fun delete(id: String, params: TripDeleteParams): SimpleResp =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TripDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: TripDeleteParams): SimpleResp = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TripDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** End a trip */
    fun end(params: TripEndParams): SimpleResp = end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: TripEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Get summary of an ended trip */
    fun getSummary(id: String, params: TripGetSummaryParams): TripGetSummaryResponse =
        getSummary(id, params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        id: String,
        params: TripGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripGetSummaryResponse = getSummary(params.toBuilder().id(id).build(), requestOptions)

    /** @see getSummary */
    fun getSummary(params: TripGetSummaryParams): TripGetSummaryResponse =
        getSummary(params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        params: TripGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripGetSummaryResponse

    /** Add a new trip to the system with the provided data. */
    fun start(params: TripStartParams): TripStartResponse = start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: TripStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TripStartResponse

    /** A view of [TripService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TripService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/trip/{id}`, but is otherwise the same as
         * [TripService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TripRetrieveParams,
        ): HttpResponseFor<TripRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TripRetrieveParams): HttpResponseFor<TripRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TripRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /skynet/trip/{id}`, but is otherwise the same as
         * [TripService.update].
         */
        @MustBeClosed
        fun update(id: String, params: TripUpdateParams): HttpResponseFor<SimpleResp> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TripUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TripUpdateParams): HttpResponseFor<SimpleResp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TripUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `delete /skynet/trip/{id}`, but is otherwise the same as
         * [TripService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: TripDeleteParams): HttpResponseFor<SimpleResp> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TripDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TripDeleteParams): HttpResponseFor<SimpleResp> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TripDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `post /skynet/trip/end`, but is otherwise the same as
         * [TripService.end].
         */
        @MustBeClosed
        fun end(params: TripEndParams): HttpResponseFor<SimpleResp> =
            end(params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            params: TripEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `get /skynet/trip/{id}/summary`, but is otherwise the
         * same as [TripService.getSummary].
         */
        @MustBeClosed
        fun getSummary(
            id: String,
            params: TripGetSummaryParams,
        ): HttpResponseFor<TripGetSummaryResponse> = getSummary(id, params, RequestOptions.none())

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            id: String,
            params: TripGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripGetSummaryResponse> =
            getSummary(params.toBuilder().id(id).build(), requestOptions)

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(params: TripGetSummaryParams): HttpResponseFor<TripGetSummaryResponse> =
            getSummary(params, RequestOptions.none())

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            params: TripGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripGetSummaryResponse>

        /**
         * Returns a raw HTTP response for `post /skynet/trip/start`, but is otherwise the same as
         * [TripService.start].
         */
        @MustBeClosed
        fun start(params: TripStartParams): HttpResponseFor<TripStartResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: TripStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TripStartResponse>
    }
}
