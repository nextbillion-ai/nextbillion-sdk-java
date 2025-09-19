// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.geofence

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.geofence.GeofenceEntityCreate
import ai.nextbillion.models.geofence.console.ConsolePreviewParams
import ai.nextbillion.models.geofence.console.ConsolePreviewResponse
import ai.nextbillion.models.geofence.console.ConsoleSearchParams
import ai.nextbillion.models.geofence.console.ConsoleSearchResponse
import com.google.errorprone.annotations.MustBeClosed
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

    /** @see preview */
    fun preview(
        geofenceEntityCreate: GeofenceEntityCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConsolePreviewResponse =
        preview(
            ConsolePreviewParams.builder().geofenceEntityCreate(geofenceEntityCreate).build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(geofenceEntityCreate: GeofenceEntityCreate): ConsolePreviewResponse =
        preview(geofenceEntityCreate, RequestOptions.none())

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

        /** @see preview */
        @MustBeClosed
        fun preview(
            geofenceEntityCreate: GeofenceEntityCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConsolePreviewResponse> =
            preview(
                ConsolePreviewParams.builder().geofenceEntityCreate(geofenceEntityCreate).build(),
                requestOptions,
            )

        /** @see preview */
        @MustBeClosed
        fun preview(
            geofenceEntityCreate: GeofenceEntityCreate
        ): HttpResponseFor<ConsolePreviewResponse> =
            preview(geofenceEntityCreate, RequestOptions.none())

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
