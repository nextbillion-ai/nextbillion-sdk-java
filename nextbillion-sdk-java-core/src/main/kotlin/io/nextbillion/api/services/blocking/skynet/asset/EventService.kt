// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.skynet.asset

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.asset.event.EventListParams
import io.nextbillion.api.models.skynet.asset.event.EventListResponse
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Event History of an Asset */
    fun list(id: String, params: EventListParams): EventListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(params: EventListParams): EventListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListResponse

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/event/list`, but is otherwise the
         * same as [EventService.list].
         */
        @MustBeClosed
        fun list(id: String, params: EventListParams): HttpResponseFor<EventListResponse> =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: EventListParams): HttpResponseFor<EventListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListResponse>
    }
}
