// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.asset

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.asset.event.EventListParams
import ai.nextbillion.models.skynet.asset.event.EventListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    /** Event History of an Asset */
    fun list(id: String, params: EventListParams): CompletableFuture<EventListResponse> =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(params: EventListParams): CompletableFuture<EventListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventListResponse>

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}/event/list`, but is otherwise the
         * same as [EventServiceAsync.list].
         */
        fun list(
            id: String,
            params: EventListParams,
        ): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(params: EventListParams): CompletableFuture<HttpResponseFor<EventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: EventListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventListResponse>>
    }
}
