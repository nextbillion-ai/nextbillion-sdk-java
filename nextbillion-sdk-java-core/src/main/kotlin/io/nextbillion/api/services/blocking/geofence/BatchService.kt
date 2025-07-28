// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.geofence

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.geofence.batch.BatchCreateParams
import io.nextbillion.api.models.geofence.batch.BatchCreateResponse
import io.nextbillion.api.models.geofence.batch.BatchDeleteParams
import io.nextbillion.api.models.geofence.batch.BatchListParams
import io.nextbillion.api.models.geofence.batch.BatchListResponse
import io.nextbillion.api.models.skynet.asset.SimpleResp
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /** Batch Creation of Geofence */
    fun create(params: BatchCreateParams): BatchCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCreateResponse

    /** Batch Query of Geofence */
    fun list(params: BatchListParams): BatchListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BatchListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchListResponse

    /** Delete Batch Geofence */
    fun delete(params: BatchDeleteParams): SimpleResp = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence/batch`, but is otherwise the same as
         * [BatchService.create].
         */
        @MustBeClosed
        fun create(params: BatchCreateParams): HttpResponseFor<BatchCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCreateResponse>

        /**
         * Returns a raw HTTP response for `get /geofence/batch`, but is otherwise the same as
         * [BatchService.list].
         */
        @MustBeClosed
        fun list(params: BatchListParams): HttpResponseFor<BatchListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BatchListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchListResponse>

        /**
         * Returns a raw HTTP response for `delete /geofence/batch`, but is otherwise the same as
         * [BatchService.delete].
         */
        @MustBeClosed
        fun delete(params: BatchDeleteParams): HttpResponseFor<SimpleResp> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>
    }
}
