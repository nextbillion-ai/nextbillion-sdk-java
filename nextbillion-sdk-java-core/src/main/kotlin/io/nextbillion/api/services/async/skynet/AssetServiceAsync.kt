// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.asset.AssetBindParams
import io.nextbillion.api.models.skynet.asset.AssetCreateParams
import io.nextbillion.api.models.skynet.asset.AssetCreateResponse
import io.nextbillion.api.models.skynet.asset.AssetDeleteParams
import io.nextbillion.api.models.skynet.asset.AssetListParams
import io.nextbillion.api.models.skynet.asset.AssetListResponse
import io.nextbillion.api.models.skynet.asset.AssetRetrieveParams
import io.nextbillion.api.models.skynet.asset.AssetRetrieveResponse
import io.nextbillion.api.models.skynet.asset.AssetTrackParams
import io.nextbillion.api.models.skynet.asset.AssetUpdateAttributesParams
import io.nextbillion.api.models.skynet.asset.AssetUpdateParams
import io.nextbillion.api.models.skynet.asset.SimpleResp
import io.nextbillion.api.services.async.skynet.asset.EventServiceAsync
import io.nextbillion.api.services.async.skynet.asset.LocationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetServiceAsync

    fun event(): EventServiceAsync

    fun location(): LocationServiceAsync

    /** Create an Asset */
    fun create(params: AssetCreateParams): CompletableFuture<AssetCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetCreateResponse>

    /** Get an Asset */
    fun retrieve(
        id: String,
        params: AssetRetrieveParams,
    ): CompletableFuture<AssetRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AssetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AssetRetrieveParams): CompletableFuture<AssetRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetRetrieveResponse>

    /** Update an Asset */
    fun update(id: String, params: AssetUpdateParams): CompletableFuture<SimpleResp> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: AssetUpdateParams): CompletableFuture<SimpleResp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Get Asset List */
    fun list(params: AssetListParams): CompletableFuture<AssetListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssetListResponse>

    /** Delete an Asset */
    fun delete(id: String, params: AssetDeleteParams): CompletableFuture<SimpleResp> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssetDeleteParams): CompletableFuture<SimpleResp> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Bind asset to device */
    fun bind(id: String, params: AssetBindParams): CompletableFuture<SimpleResp> =
        bind(id, params, RequestOptions.none())

    /** @see bind */
    fun bind(
        id: String,
        params: AssetBindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = bind(params.toBuilder().id(id).build(), requestOptions)

    /** @see bind */
    fun bind(params: AssetBindParams): CompletableFuture<SimpleResp> =
        bind(params, RequestOptions.none())

    /** @see bind */
    fun bind(
        params: AssetBindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Upload track info */
    fun track(id: String, params: AssetTrackParams): CompletableFuture<SimpleResp> =
        track(id, params, RequestOptions.none())

    /** @see track */
    fun track(
        id: String,
        params: AssetTrackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = track(params.toBuilder().id(id).build(), requestOptions)

    /** @see track */
    fun track(params: AssetTrackParams): CompletableFuture<SimpleResp> =
        track(params, RequestOptions.none())

    /** @see track */
    fun track(
        params: AssetTrackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Update asset attributes. (add) */
    fun updateAttributes(
        id: String,
        params: AssetUpdateAttributesParams,
    ): CompletableFuture<SimpleResp> = updateAttributes(id, params, RequestOptions.none())

    /** @see updateAttributes */
    fun updateAttributes(
        id: String,
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> =
        updateAttributes(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateAttributes */
    fun updateAttributes(params: AssetUpdateAttributesParams): CompletableFuture<SimpleResp> =
        updateAttributes(params, RequestOptions.none())

    /** @see updateAttributes */
    fun updateAttributes(
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** A view of [AssetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetServiceAsync.WithRawResponse

        fun event(): EventServiceAsync.WithRawResponse

        fun location(): LocationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/asset`, but is otherwise the same as
         * [AssetServiceAsync.create].
         */
        fun create(
            params: AssetCreateParams
        ): CompletableFuture<HttpResponseFor<AssetCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}`, but is otherwise the same as
         * [AssetServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: AssetRetrieveParams,
        ): CompletableFuture<HttpResponseFor<AssetRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AssetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: AssetRetrieveParams
        ): CompletableFuture<HttpResponseFor<AssetRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AssetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /skynet/asset/{id}`, but is otherwise the same as
         * [AssetServiceAsync.update].
         */
        fun update(
            id: String,
            params: AssetUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: AssetUpdateParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/list`, but is otherwise the same as
         * [AssetServiceAsync.list].
         */
        fun list(params: AssetListParams): CompletableFuture<HttpResponseFor<AssetListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssetListResponse>>

        /**
         * Returns a raw HTTP response for `delete /skynet/asset/{id}`, but is otherwise the same as
         * [AssetServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: AssetDeleteParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssetDeleteParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `post /skynet/asset/{id}/bind`, but is otherwise the same
         * as [AssetServiceAsync.bind].
         */
        fun bind(
            id: String,
            params: AssetBindParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> = bind(id, params, RequestOptions.none())

        /** @see bind */
        fun bind(
            id: String,
            params: AssetBindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            bind(params.toBuilder().id(id).build(), requestOptions)

        /** @see bind */
        fun bind(params: AssetBindParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            bind(params, RequestOptions.none())

        /** @see bind */
        fun bind(
            params: AssetBindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `post /skynet/asset/{id}/track`, but is otherwise the
         * same as [AssetServiceAsync.track].
         */
        fun track(
            id: String,
            params: AssetTrackParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> = track(id, params, RequestOptions.none())

        /** @see track */
        fun track(
            id: String,
            params: AssetTrackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            track(params.toBuilder().id(id).build(), requestOptions)

        /** @see track */
        fun track(params: AssetTrackParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            track(params, RequestOptions.none())

        /** @see track */
        fun track(
            params: AssetTrackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `put /skynet/asset/{id}/attributes`, but is otherwise the
         * same as [AssetServiceAsync.updateAttributes].
         */
        fun updateAttributes(
            id: String,
            params: AssetUpdateAttributesParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            updateAttributes(id, params, RequestOptions.none())

        /** @see updateAttributes */
        fun updateAttributes(
            id: String,
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            updateAttributes(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateAttributes */
        fun updateAttributes(
            params: AssetUpdateAttributesParams
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            updateAttributes(params, RequestOptions.none())

        /** @see updateAttributes */
        fun updateAttributes(
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>
    }
}
