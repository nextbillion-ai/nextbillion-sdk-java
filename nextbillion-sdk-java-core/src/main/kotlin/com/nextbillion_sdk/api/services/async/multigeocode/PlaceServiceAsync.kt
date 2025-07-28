// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.multigeocode

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceCreateParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceCreateResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceDeleteParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceDeleteResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceRetrieveParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceRetrieveResponse
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceUpdateParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaceServiceAsync

    /**
     * The "Add Place" method allows users to create custom places
     *
     * Add place method provides the flexibility to create custom places in a way that suits your
     * business needs. The newly created place and its attributes can be added to custom
     * (proprietary) dataset - to the effect of building your own places dataset (s) - or, to a
     * default dataset. Overcome inaccurate ‘POI’ details from default search provider by creating
     * custom, highly accurate ‘POIs’.
     */
    fun create(params: PlaceCreateParams): CompletableFuture<PlaceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PlaceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceCreateResponse>

    /**
     * Use this method to get the details of previously created custom places using its NextBillion
     * ID.
     */
    fun retrieve(
        docId: String,
        params: PlaceRetrieveParams,
    ): CompletableFuture<PlaceRetrieveResponse> = retrieve(docId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        docId: String,
        params: PlaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceRetrieveResponse> =
        retrieve(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PlaceRetrieveParams): CompletableFuture<PlaceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PlaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceRetrieveResponse>

    /**
     * The "Update Place" method allows businesses to update the attributes of an existing place.
     *
     * This method allows you to update the attributes of custom places. In effect, updating a place
     * replaces the current information in search results with the updated information associated
     * with the specific docID. Use this method to enhance the accuracy/usability of your search
     * results with respect to the default dataset to suit your business needs.
     *
     * If you want to prioritize a particular result in your search results, update the ‘score’ of
     * that specific place. Alternatively, you can block places which are no longer needed by
     * setting their status: ‘disable’.
     */
    fun update(docId: String, params: PlaceUpdateParams): CompletableFuture<PlaceUpdateResponse> =
        update(docId, params, RequestOptions.none())

    /** @see update */
    fun update(
        docId: String,
        params: PlaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceUpdateResponse> =
        update(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see update */
    fun update(params: PlaceUpdateParams): CompletableFuture<PlaceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceUpdateResponse>

    /**
     * The "Delete Place" method enables businesses to delete a previously created place
     *
     * Use this method to delete a previously created place. Please note that the place associated
     * with the specified docID only would be deleted. As a result, once a place is deleted, the
     * search API can still return valid results from the default datasets or others, if present.
     */
    fun delete(docId: String, params: PlaceDeleteParams): CompletableFuture<PlaceDeleteResponse> =
        delete(docId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        docId: String,
        params: PlaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceDeleteResponse> =
        delete(params.toBuilder().docId(docId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PlaceDeleteParams): CompletableFuture<PlaceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PlaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaceDeleteResponse>

    /** A view of [PlaceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /multigeocode/place`, but is otherwise the same as
         * [PlaceServiceAsync.create].
         */
        fun create(
            params: PlaceCreateParams
        ): CompletableFuture<HttpResponseFor<PlaceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PlaceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /multigeocode/place/{docId}`, but is otherwise the
         * same as [PlaceServiceAsync.retrieve].
         */
        fun retrieve(
            docId: String,
            params: PlaceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PlaceRetrieveResponse>> =
            retrieve(docId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            docId: String,
            params: PlaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceRetrieveResponse>> =
            retrieve(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PlaceRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlaceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PlaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /multigeocode/place/{docId}`, but is otherwise the
         * same as [PlaceServiceAsync.update].
         */
        fun update(
            docId: String,
            params: PlaceUpdateParams,
        ): CompletableFuture<HttpResponseFor<PlaceUpdateResponse>> =
            update(docId, params, RequestOptions.none())

        /** @see update */
        fun update(
            docId: String,
            params: PlaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceUpdateResponse>> =
            update(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PlaceUpdateParams
        ): CompletableFuture<HttpResponseFor<PlaceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /multigeocode/place/{docId}`, but is otherwise
         * the same as [PlaceServiceAsync.delete].
         */
        fun delete(
            docId: String,
            params: PlaceDeleteParams,
        ): CompletableFuture<HttpResponseFor<PlaceDeleteResponse>> =
            delete(docId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            docId: String,
            params: PlaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceDeleteResponse>> =
            delete(params.toBuilder().docId(docId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PlaceDeleteParams
        ): CompletableFuture<HttpResponseFor<PlaceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PlaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaceDeleteResponse>>
    }
}
