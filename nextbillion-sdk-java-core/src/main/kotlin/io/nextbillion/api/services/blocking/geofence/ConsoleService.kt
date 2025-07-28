// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.geofence

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.geofence.console.ConsolePreviewParams
import io.nextbillion.api.models.geofence.console.ConsolePreviewResponse
import io.nextbillion.api.models.geofence.console.ConsoleSearchParams
import io.nextbillion.api.models.geofence.console.ConsoleSearchResponse
import java.util.function.Consumer

interface ConsoleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsoleService

    /** preview geofence geojson */
    fun preview(params: ConsolePreviewParams): ConsolePreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: ConsolePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConsolePreviewResponse

    /** Console Geofence Search API */
    fun search(params: ConsoleSearchParams): ConsoleSearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: ConsoleSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConsoleSearchResponse

    /** A view of [ConsoleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConsoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence/console/preview`, but is otherwise the
         * same as [ConsoleService.preview].
         */
        @MustBeClosed
        fun preview(params: ConsolePreviewParams): HttpResponseFor<ConsolePreviewResponse> =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: ConsolePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConsolePreviewResponse>

        /**
         * Returns a raw HTTP response for `get /geofence/console/search`, but is otherwise the same
         * as [ConsoleService.search].
         */
        @MustBeClosed
        fun search(params: ConsoleSearchParams): HttpResponseFor<ConsoleSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: ConsoleSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConsoleSearchResponse>
    }
}
