// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.navigation.NavigationRetrieveRouteParams
import ai.nextbillion.models.navigation.NavigationRetrieveRouteResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface NavigationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NavigationService

    /**
     * Nextbillion.ai’s Navigation API is a service that computes a route between 2 places, and also
     * returns detailed turn by turn instructions for the route.
     *
     * The Navigation API can be used as an input into your Navigation app. Alternatively, you can
     * directly use Nextbillion.ai’s Navigation SDK for a complete turn by turn navigation
     * experience.
     */
    fun retrieveRoute(params: NavigationRetrieveRouteParams): NavigationRetrieveRouteResponse =
        retrieveRoute(params, RequestOptions.none())

    /** @see retrieveRoute */
    fun retrieveRoute(
        params: NavigationRetrieveRouteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NavigationRetrieveRouteResponse

    /** A view of [NavigationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NavigationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /navigation/json`, but is otherwise the same as
         * [NavigationService.retrieveRoute].
         */
        @MustBeClosed
        fun retrieveRoute(
            params: NavigationRetrieveRouteParams
        ): HttpResponseFor<NavigationRetrieveRouteResponse> =
            retrieveRoute(params, RequestOptions.none())

        /** @see retrieveRoute */
        @MustBeClosed
        fun retrieveRoute(
            params: NavigationRetrieveRouteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NavigationRetrieveRouteResponse>
    }
}
