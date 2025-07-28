// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesParams
import ai.nextbillion.models.postalcode.PostalcodeRetrieveCoordinatesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostalcodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostalcodeServiceAsync

    /** Retrieve coordinates by postal code */
    fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams
    ): CompletableFuture<PostalcodeRetrieveCoordinatesResponse> =
        retrieveCoordinates(params, RequestOptions.none())

    /** @see retrieveCoordinates */
    fun retrieveCoordinates(
        params: PostalcodeRetrieveCoordinatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostalcodeRetrieveCoordinatesResponse>

    /**
     * A view of [PostalcodeServiceAsync] that provides access to raw HTTP responses for each
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
        ): PostalcodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /postalcode`, but is otherwise the same as
         * [PostalcodeServiceAsync.retrieveCoordinates].
         */
        fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams
        ): CompletableFuture<HttpResponseFor<PostalcodeRetrieveCoordinatesResponse>> =
            retrieveCoordinates(params, RequestOptions.none())

        /** @see retrieveCoordinates */
        fun retrieveCoordinates(
            params: PostalcodeRetrieveCoordinatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostalcodeRetrieveCoordinatesResponse>>
    }
}
