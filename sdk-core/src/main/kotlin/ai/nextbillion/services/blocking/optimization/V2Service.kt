// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.optimization

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.optimization.PostResponse
import ai.nextbillion.models.optimization.v2.V2RetrieveResultParams
import ai.nextbillion.models.optimization.v2.V2RetrieveResultResponse
import ai.nextbillion.models.optimization.v2.V2SubmitParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service

    /** Flexible GET */
    fun retrieveResult(params: V2RetrieveResultParams): V2RetrieveResultResponse =
        retrieveResult(params, RequestOptions.none())

    /** @see retrieveResult */
    fun retrieveResult(
        params: V2RetrieveResultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveResultResponse

    /** Flexible POST */
    fun submit(params: V2SubmitParams): PostResponse = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: V2SubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostResponse

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /optimization/v2/result`, but is otherwise the same
         * as [V2Service.retrieveResult].
         */
        @MustBeClosed
        fun retrieveResult(
            params: V2RetrieveResultParams
        ): HttpResponseFor<V2RetrieveResultResponse> = retrieveResult(params, RequestOptions.none())

        /** @see retrieveResult */
        @MustBeClosed
        fun retrieveResult(
            params: V2RetrieveResultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveResultResponse>

        /**
         * Returns a raw HTTP response for `post /optimization/v2`, but is otherwise the same as
         * [V2Service.submit].
         */
        @MustBeClosed
        fun submit(params: V2SubmitParams): HttpResponseFor<PostResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: V2SubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostResponse>
    }
}
