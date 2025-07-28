// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixParams
import com.nextbillion_sdk.api.models.mdm.MdmCreateDistanceMatrixResponse
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusParams
import com.nextbillion_sdk.api.models.mdm.MdmGetDistanceMatrixStatusResponse
import java.util.function.Consumer

interface MdmService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmService

    /** Create a massive distance matrix task */
    fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams
    ): MdmCreateDistanceMatrixResponse = createDistanceMatrix(params, RequestOptions.none())

    /** @see createDistanceMatrix */
    fun createDistanceMatrix(
        params: MdmCreateDistanceMatrixParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdmCreateDistanceMatrixResponse

    /** Get massive distance matrix task status */
    fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams
    ): MdmGetDistanceMatrixStatusResponse = getDistanceMatrixStatus(params, RequestOptions.none())

    /** @see getDistanceMatrixStatus */
    fun getDistanceMatrixStatus(
        params: MdmGetDistanceMatrixStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MdmGetDistanceMatrixStatusResponse

    /** A view of [MdmService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MdmService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mdm/create`, but is otherwise the same as
         * [MdmService.createDistanceMatrix].
         */
        @MustBeClosed
        fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams
        ): HttpResponseFor<MdmCreateDistanceMatrixResponse> =
            createDistanceMatrix(params, RequestOptions.none())

        /** @see createDistanceMatrix */
        @MustBeClosed
        fun createDistanceMatrix(
            params: MdmCreateDistanceMatrixParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdmCreateDistanceMatrixResponse>

        /**
         * Returns a raw HTTP response for `get /mdm/status`, but is otherwise the same as
         * [MdmService.getDistanceMatrixStatus].
         */
        @MustBeClosed
        fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams
        ): HttpResponseFor<MdmGetDistanceMatrixStatusResponse> =
            getDistanceMatrixStatus(params, RequestOptions.none())

        /** @see getDistanceMatrixStatus */
        @MustBeClosed
        fun getDistanceMatrixStatus(
            params: MdmGetDistanceMatrixStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MdmGetDistanceMatrixStatusResponse>
    }
}
