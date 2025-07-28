// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.navigation.NavigationRetrieveRouteParams
import io.nextbillion.api.models.navigation.NavigationRetrieveRouteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NavigationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationServiceAsync

    /**
     * Nextbillion.ai’s Navigation API is a service that computes a route between 2 places, and also
     * returns detailed turn by turn instructions for the route.
     *
     * The Navigation API can be used as an input into your Navigation app. Alternatively, you can
     * directly use Nextbillion.ai’s Navigation SDK for a complete turn by turn navigation
     * experience.
     */
    fun retrieveRoute(
        params: NavigationRetrieveRouteParams
    ): CompletableFuture<NavigationRetrieveRouteResponse> =
        retrieveRoute(params, RequestOptions.none())

    /** @see retrieveRoute */
    fun retrieveRoute(
        params: NavigationRetrieveRouteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NavigationRetrieveRouteResponse>

    /**
     * A view of [NavigationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /navigation/json`, but is otherwise the same as
         * [NavigationServiceAsync.retrieveRoute].
         */
        fun retrieveRoute(
            params: NavigationRetrieveRouteParams
        ): CompletableFuture<HttpResponseFor<NavigationRetrieveRouteResponse>> =
            retrieveRoute(params, RequestOptions.none())

        /** @see retrieveRoute */
        fun retrieveRoute(
            params: NavigationRetrieveRouteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NavigationRetrieveRouteResponse>>
    }
}
