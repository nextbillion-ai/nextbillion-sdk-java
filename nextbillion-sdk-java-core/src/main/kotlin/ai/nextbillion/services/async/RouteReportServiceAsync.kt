// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.routereport.RouteReportCreateParams
import ai.nextbillion.models.routereport.RouteReportCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RouteReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteReportServiceAsync

    /** Route Report */
    fun create(params: RouteReportCreateParams): CompletableFuture<RouteReportCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RouteReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RouteReportCreateResponse>

    /**
     * A view of [RouteReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): RouteReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /route_report`, but is otherwise the same as
         * [RouteReportServiceAsync.create].
         */
        fun create(
            params: RouteReportCreateParams
        ): CompletableFuture<HttpResponseFor<RouteReportCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RouteReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RouteReportCreateResponse>>
    }
}
