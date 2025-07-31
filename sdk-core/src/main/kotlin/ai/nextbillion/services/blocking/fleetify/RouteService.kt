// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.fleetify

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.fleetify.routes.RouteCreateParams
import ai.nextbillion.models.fleetify.routes.RouteCreateResponse
import ai.nextbillion.models.fleetify.routes.RouteRedispatchParams
import ai.nextbillion.models.fleetify.routes.RouteRedispatchResponse
import ai.nextbillion.services.blocking.fleetify.routes.StepService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteService

    fun steps(): StepService

    /** Dispatch a new route */
    fun create(params: RouteCreateParams): RouteCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteCreateResponse

    /** Re-dispatch route */
    fun redispatch(routeId: String, params: RouteRedispatchParams): RouteRedispatchResponse =
        redispatch(routeId, params, RequestOptions.none())

    /** @see redispatch */
    fun redispatch(
        routeId: String,
        params: RouteRedispatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRedispatchResponse =
        redispatch(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see redispatch */
    fun redispatch(params: RouteRedispatchParams): RouteRedispatchResponse =
        redispatch(params, RequestOptions.none())

    /** @see redispatch */
    fun redispatch(
        params: RouteRedispatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteRedispatchResponse

    /** A view of [RouteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteService.WithRawResponse

        fun steps(): StepService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/routes`, but is otherwise the same as
         * [RouteService.create].
         */
        @MustBeClosed
        fun create(params: RouteCreateParams): HttpResponseFor<RouteCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteCreateResponse>

        /**
         * Returns a raw HTTP response for `post /fleetify/routes/{routeID}/redispatch`, but is
         * otherwise the same as [RouteService.redispatch].
         */
        @MustBeClosed
        fun redispatch(
            routeId: String,
            params: RouteRedispatchParams,
        ): HttpResponseFor<RouteRedispatchResponse> =
            redispatch(routeId, params, RequestOptions.none())

        /** @see redispatch */
        @MustBeClosed
        fun redispatch(
            routeId: String,
            params: RouteRedispatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRedispatchResponse> =
            redispatch(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see redispatch */
        @MustBeClosed
        fun redispatch(params: RouteRedispatchParams): HttpResponseFor<RouteRedispatchResponse> =
            redispatch(params, RequestOptions.none())

        /** @see redispatch */
        @MustBeClosed
        fun redispatch(
            params: RouteRedispatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteRedispatchResponse>
    }
}
