// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.restrictionsitems.RestrictionsItemListParams
import ai.nextbillion.models.restrictionsitems.RestrictionsItemListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RestrictionsItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionsItemService

    /** Get restriction items by bbox */
    fun list(params: RestrictionsItemListParams): List<RestrictionsItemListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RestrictionsItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RestrictionsItemListResponse>

    /**
     * A view of [RestrictionsItemService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RestrictionsItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /restrictions_items`, but is otherwise the same as
         * [RestrictionsItemService.list].
         */
        @MustBeClosed
        fun list(
            params: RestrictionsItemListParams
        ): HttpResponseFor<List<RestrictionsItemListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RestrictionsItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RestrictionsItemListResponse>>
    }
}
