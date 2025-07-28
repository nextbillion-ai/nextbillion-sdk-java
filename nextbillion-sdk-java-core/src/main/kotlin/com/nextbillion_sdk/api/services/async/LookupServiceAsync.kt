// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.lookup.LookupByIdParams
import com.nextbillion_sdk.api.models.lookup.LookupByIdResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupServiceAsync

    /** Lookup By ID */
    fun byId(params: LookupByIdParams): CompletableFuture<LookupByIdResponse> =
        byId(params, RequestOptions.none())

    /** @see byId */
    fun byId(
        params: LookupByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupByIdResponse>

    /**
     * A view of [LookupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lookup`, but is otherwise the same as
         * [LookupServiceAsync.byId].
         */
        fun byId(params: LookupByIdParams): CompletableFuture<HttpResponseFor<LookupByIdResponse>> =
            byId(params, RequestOptions.none())

        /** @see byId */
        fun byId(
            params: LookupByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupByIdResponse>>
    }
}
