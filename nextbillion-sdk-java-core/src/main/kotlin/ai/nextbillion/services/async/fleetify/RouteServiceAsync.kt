// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.fleetify

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.fleetify.routes.RouteCreateParams
import ai.nextbillion.models.fleetify.routes.RouteCreateResponse
import ai.nextbillion.models.fleetify.routes.RouteRedispatchParams
import ai.nextbillion.models.fleetify.routes.RouteRedispatchResponse
import ai.nextbillion.services.async.fleetify.routes.StepServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteServiceAsync

    fun steps(): StepServiceAsync

    /** Dispatch a new route */
    fun create(params: RouteCreateParams): CompletableFuture<RouteCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteCreateResponse>

    /** Re-dispatch route */
    fun redispatch(
        routeId: String,
        params: RouteRedispatchParams,
    ): CompletableFuture<RouteRedispatchResponse> =
        redispatch(routeId, params, RequestOptions.none())

    /** @see redispatch */
    fun redispatch(
        routeId: String,
        params: RouteRedispatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteRedispatchResponse> =
        redispatch(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see redispatch */
    fun redispatch(params: RouteRedispatchParams): CompletableFuture<RouteRedispatchResponse> =
        redispatch(params, RequestOptions.none())

    /** @see redispatch */
    fun redispatch(
        params: RouteRedispatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteRedispatchResponse>

    /** A view of [RouteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteServiceAsync.WithRawResponse

        fun steps(): StepServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/routes`, but is otherwise the same as
         * [RouteServiceAsync.create].
         */
        fun create(
            params: RouteCreateParams
        ): CompletableFuture<HttpResponseFor<RouteCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /fleetify/routes/{routeID}/redispatch`, but is
         * otherwise the same as [RouteServiceAsync.redispatch].
         */
        fun redispatch(
            routeId: String,
            params: RouteRedispatchParams,
        ): CompletableFuture<HttpResponseFor<RouteRedispatchResponse>> =
            redispatch(routeId, params, RequestOptions.none())

        /** @see redispatch */
        fun redispatch(
            routeId: String,
            params: RouteRedispatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteRedispatchResponse>> =
            redispatch(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see redispatch */
        fun redispatch(
            params: RouteRedispatchParams
        ): CompletableFuture<HttpResponseFor<RouteRedispatchResponse>> =
            redispatch(params, RequestOptions.none())

        /** @see redispatch */
        fun redispatch(
            params: RouteRedispatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteRedispatchResponse>>
    }
}
