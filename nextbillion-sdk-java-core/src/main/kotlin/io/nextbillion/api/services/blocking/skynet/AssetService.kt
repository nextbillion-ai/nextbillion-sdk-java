// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.skynet

import com.google.errorprone.annotations.MustBeClosed
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
import io.nextbillion.api.services.blocking.skynet.asset.EventService
import io.nextbillion.api.services.blocking.skynet.asset.LocationService
import java.util.function.Consumer

interface AssetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService

    fun event(): EventService

    fun location(): LocationService

    /** Create an Asset */
    fun create(params: AssetCreateParams): AssetCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetCreateResponse

    /** Get an Asset */
    fun retrieve(id: String, params: AssetRetrieveParams): AssetRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AssetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AssetRetrieveParams): AssetRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetRetrieveResponse

    /** Update an Asset */
    fun update(id: String, params: AssetUpdateParams): SimpleResp =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: AssetUpdateParams): SimpleResp = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Get Asset List */
    fun list(params: AssetListParams): AssetListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssetListResponse

    /** Delete an Asset */
    fun delete(id: String, params: AssetDeleteParams): SimpleResp =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssetDeleteParams): SimpleResp = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Bind asset to device */
    fun bind(id: String, params: AssetBindParams): SimpleResp =
        bind(id, params, RequestOptions.none())

    /** @see bind */
    fun bind(
        id: String,
        params: AssetBindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = bind(params.toBuilder().id(id).build(), requestOptions)

    /** @see bind */
    fun bind(params: AssetBindParams): SimpleResp = bind(params, RequestOptions.none())

    /** @see bind */
    fun bind(
        params: AssetBindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Upload track info */
    fun track(id: String, params: AssetTrackParams): SimpleResp =
        track(id, params, RequestOptions.none())

    /** @see track */
    fun track(
        id: String,
        params: AssetTrackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = track(params.toBuilder().id(id).build(), requestOptions)

    /** @see track */
    fun track(params: AssetTrackParams): SimpleResp = track(params, RequestOptions.none())

    /** @see track */
    fun track(
        params: AssetTrackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Update asset attributes. (add) */
    fun updateAttributes(id: String, params: AssetUpdateAttributesParams): SimpleResp =
        updateAttributes(id, params, RequestOptions.none())

    /** @see updateAttributes */
    fun updateAttributes(
        id: String,
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = updateAttributes(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateAttributes */
    fun updateAttributes(params: AssetUpdateAttributesParams): SimpleResp =
        updateAttributes(params, RequestOptions.none())

    /** @see updateAttributes */
    fun updateAttributes(
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** A view of [AssetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService.WithRawResponse

        fun event(): EventService.WithRawResponse

        fun location(): LocationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/asset`, but is otherwise the same as
         * [AssetService.create].
         */
        @MustBeClosed
        fun create(params: AssetCreateParams): HttpResponseFor<AssetCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetCreateResponse>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/{id}`, but is otherwise the same as
         * [AssetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AssetRetrieveParams,
        ): HttpResponseFor<AssetRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AssetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AssetRetrieveParams): HttpResponseFor<AssetRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AssetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /skynet/asset/{id}`, but is otherwise the same as
         * [AssetService.update].
         */
        @MustBeClosed
        fun update(id: String, params: AssetUpdateParams): HttpResponseFor<SimpleResp> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AssetUpdateParams): HttpResponseFor<SimpleResp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `get /skynet/asset/list`, but is otherwise the same as
         * [AssetService.list].
         */
        @MustBeClosed
        fun list(params: AssetListParams): HttpResponseFor<AssetListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssetListResponse>

        /**
         * Returns a raw HTTP response for `delete /skynet/asset/{id}`, but is otherwise the same as
         * [AssetService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: AssetDeleteParams): HttpResponseFor<SimpleResp> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssetDeleteParams): HttpResponseFor<SimpleResp> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `post /skynet/asset/{id}/bind`, but is otherwise the same
         * as [AssetService.bind].
         */
        @MustBeClosed
        fun bind(id: String, params: AssetBindParams): HttpResponseFor<SimpleResp> =
            bind(id, params, RequestOptions.none())

        /** @see bind */
        @MustBeClosed
        fun bind(
            id: String,
            params: AssetBindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = bind(params.toBuilder().id(id).build(), requestOptions)

        /** @see bind */
        @MustBeClosed
        fun bind(params: AssetBindParams): HttpResponseFor<SimpleResp> =
            bind(params, RequestOptions.none())

        /** @see bind */
        @MustBeClosed
        fun bind(
            params: AssetBindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `post /skynet/asset/{id}/track`, but is otherwise the
         * same as [AssetService.track].
         */
        @MustBeClosed
        fun track(id: String, params: AssetTrackParams): HttpResponseFor<SimpleResp> =
            track(id, params, RequestOptions.none())

        /** @see track */
        @MustBeClosed
        fun track(
            id: String,
            params: AssetTrackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = track(params.toBuilder().id(id).build(), requestOptions)

        /** @see track */
        @MustBeClosed
        fun track(params: AssetTrackParams): HttpResponseFor<SimpleResp> =
            track(params, RequestOptions.none())

        /** @see track */
        @MustBeClosed
        fun track(
            params: AssetTrackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `put /skynet/asset/{id}/attributes`, but is otherwise the
         * same as [AssetService.updateAttributes].
         */
        @MustBeClosed
        fun updateAttributes(
            id: String,
            params: AssetUpdateAttributesParams,
        ): HttpResponseFor<SimpleResp> = updateAttributes(id, params, RequestOptions.none())

        /** @see updateAttributes */
        @MustBeClosed
        fun updateAttributes(
            id: String,
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> =
            updateAttributes(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateAttributes */
        @MustBeClosed
        fun updateAttributes(params: AssetUpdateAttributesParams): HttpResponseFor<SimpleResp> =
            updateAttributes(params, RequestOptions.none())

        /** @see updateAttributes */
        @MustBeClosed
        fun updateAttributes(
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>
    }
}
