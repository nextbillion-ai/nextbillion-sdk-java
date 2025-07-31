// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.mdm.MdmCreateDistanceMatrixParams
import ai.nextbillion.models.mdm.MdmCreateDistanceMatrixResponse
import ai.nextbillion.models.mdm.MdmGetDistanceMatrixStatusParams
import ai.nextbillion.models.mdm.MdmGetDistanceMatrixStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MdmServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmServiceAsync

    /** Create a massive distance matrix task */
    fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams
    ): CompletableFuture<MdmCreateDistanceMatrixResponse> =
        createDistanceMatrix(params, RequestOptions.none())

    /** @see createDistanceMatrix */
    fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdmCreateDistanceMatrixResponse>

    /** Get massive distance matrix task status */
    fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams
    ): CompletableFuture<MdmGetDistanceMatrixStatusResponse> =
        getDistanceMatrixStatus(params, RequestOptions.none())

    /** @see getDistanceMatrixStatus */
    fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MdmGetDistanceMatrixStatusResponse>

    /** A view of [MdmServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mdm/create`, but is otherwise the same as
         * [MdmServiceAsync.createDistanceMatrix].
         */
        fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams
        ): CompletableFuture<HttpResponseFor<MdmCreateDistanceMatrixResponse>> =
            createDistanceMatrix(params, RequestOptions.none())

        /** @see createDistanceMatrix */
        fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdmCreateDistanceMatrixResponse>>

        /**
         * Returns a raw HTTP response for `get /mdm/status`, but is otherwise the same as
         * [MdmServiceAsync.getDistanceMatrixStatus].
         */
        fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams
        ): CompletableFuture<HttpResponseFor<MdmGetDistanceMatrixStatusResponse>> =
            getDistanceMatrixStatus(params, RequestOptions.none())

        /** @see getDistanceMatrixStatus */
        fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MdmGetDistanceMatrixStatusResponse>>
    }
}
