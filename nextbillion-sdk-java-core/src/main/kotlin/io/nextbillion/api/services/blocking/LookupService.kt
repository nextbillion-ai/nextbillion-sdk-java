// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.lookup.LookupByIdParams
import io.nextbillion.api.models.lookup.LookupByIdResponse
import java.util.function.Consumer

interface LookupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService

    /** Lookup By ID */
    fun byId(params: LookupByIdParams): LookupByIdResponse = byId(params, RequestOptions.none())

    /** @see byId */
    fun byId(
        params: LookupByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupByIdResponse

    /** A view of [LookupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lookup`, but is otherwise the same as
         * [LookupService.byId].
         */
        @MustBeClosed
        fun byId(params: LookupByIdParams): HttpResponseFor<LookupByIdResponse> =
            byId(params, RequestOptions.none())

        /** @see byId */
        @MustBeClosed
        fun byId(
            params: LookupByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupByIdResponse>
    }
}
