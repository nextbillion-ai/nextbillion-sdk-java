// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.routereport.RouteReportCreateParams
import com.nextbillion_sdk.api.models.routereport.RouteReportCreateResponse
import java.util.function.Consumer

interface RouteReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RouteReportService

    /** Route Report */
    fun create(params: RouteReportCreateParams): RouteReportCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RouteReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RouteReportCreateResponse

    /**
     * A view of [RouteReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RouteReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /route_report`, but is otherwise the same as
         * [RouteReportService.create].
         */
        @MustBeClosed
        fun create(params: RouteReportCreateParams): HttpResponseFor<RouteReportCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RouteReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RouteReportCreateResponse>
    }
}
