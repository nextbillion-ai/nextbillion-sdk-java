// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.batch.BatchCreateParams
import com.nextbillion_sdk.api.models.batch.BatchCreateResponse
import com.nextbillion_sdk.api.models.batch.BatchRetrieveParams
import com.nextbillion_sdk.api.models.batch.BatchRetrieveResponse
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

    /** Create Batch Routing */
    fun create(params: BatchCreateParams): CompletableFuture<BatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /** Get Batch Result */
    fun retrieve(params: BatchRetrieveParams): CompletableFuture<BatchRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveResponse>

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
         * Returns a raw HTTP response for `post /batch`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /batch`, but is otherwise the same as
         * [BatchServiceAsync.retrieve].
         */
        fun retrieve(
            params: BatchRetrieveParams
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>>
    }
}
