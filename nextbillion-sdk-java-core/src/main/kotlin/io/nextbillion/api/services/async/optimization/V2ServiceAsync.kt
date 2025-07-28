// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.optimization

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.optimization.PostResponse
import io.nextbillion.api.models.optimization.v2.V2RetrieveResultParams
import io.nextbillion.api.models.optimization.v2.V2RetrieveResultResponse
import io.nextbillion.api.models.optimization.v2.V2SubmitParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync

    /** Flexible GET */
    fun retrieveResult(
        params: V2RetrieveResultParams
    ): CompletableFuture<V2RetrieveResultResponse> = retrieveResult(params, RequestOptions.none())

    /** @see retrieveResult */
    fun retrieveResult(
        params: V2RetrieveResultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveResultResponse>

    /** Flexible POST */
    fun submit(params: V2SubmitParams): CompletableFuture<PostResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: V2SubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostResponse>

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /optimization/v2/result`, but is otherwise the same
         * as [V2ServiceAsync.retrieveResult].
         */
        fun retrieveResult(
            params: V2RetrieveResultParams
        ): CompletableFuture<HttpResponseFor<V2RetrieveResultResponse>> =
            retrieveResult(params, RequestOptions.none())

        /** @see retrieveResult */
        fun retrieveResult(
            params: V2RetrieveResultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveResultResponse>>

        /**
         * Returns a raw HTTP response for `post /optimization/v2`, but is otherwise the same as
         * [V2ServiceAsync.submit].
         */
        fun submit(params: V2SubmitParams): CompletableFuture<HttpResponseFor<PostResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: V2SubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostResponse>>
    }
}
