// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.geofence

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.geofence.batch.BatchCreateParams
import com.nextbillion_sdk.api.models.geofence.batch.BatchCreateResponse
import com.nextbillion_sdk.api.models.geofence.batch.BatchDeleteParams
import com.nextbillion_sdk.api.models.geofence.batch.BatchListParams
import com.nextbillion_sdk.api.models.geofence.batch.BatchListResponse
import com.nextbillion_sdk.api.models.skynet.asset.SimpleResp
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /** Batch Creation of Geofence */
    fun create(params: BatchCreateParams): CompletableFuture<BatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /** Batch Query of Geofence */
    fun list(params: BatchListParams): CompletableFuture<BatchListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BatchListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListResponse>

    /** Delete Batch Geofence */
    fun delete(params: BatchDeleteParams): CompletableFuture<SimpleResp> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /geofence/batch`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /geofence/batch`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        fun list(params: BatchListParams): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BatchListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListResponse>>

        /**
         * Returns a raw HTTP response for `delete /geofence/batch`, but is otherwise the same as
         * [BatchServiceAsync.delete].
         */
        fun delete(params: BatchDeleteParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>
    }
}
