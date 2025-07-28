// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.restrictions.RestrictionCreateParams
import io.nextbillion.api.models.restrictions.RestrictionDeleteParams
import io.nextbillion.api.models.restrictions.RestrictionDeleteResponse
import io.nextbillion.api.models.restrictions.RestrictionListByBboxParams
import io.nextbillion.api.models.restrictions.RestrictionListParams
import io.nextbillion.api.models.restrictions.RestrictionListResponse
import io.nextbillion.api.models.restrictions.RestrictionRetrieveParams
import io.nextbillion.api.models.restrictions.RestrictionSetStateParams
import io.nextbillion.api.models.restrictions.RestrictionUpdateParams
import io.nextbillion.api.models.restrictions.RichGroupResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RestrictionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionServiceAsync

    /** Create a new restriction */
    fun create(
        restrictionType: RestrictionCreateParams.RestrictionType,
        params: RestrictionCreateParams,
    ): CompletableFuture<RichGroupResponse> = create(restrictionType, params, RequestOptions.none())

    /** @see create */
    fun create(
        restrictionType: RestrictionCreateParams.RestrictionType,
        params: RestrictionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse> =
        create(params.toBuilder().restrictionType(restrictionType).build(), requestOptions)

    /** @see create */
    fun create(params: RestrictionCreateParams): CompletableFuture<RichGroupResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RestrictionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse>

    /** Get a restriction by id */
    fun retrieve(
        id: Long,
        params: RestrictionRetrieveParams,
    ): CompletableFuture<RichGroupResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RestrictionRetrieveParams): CompletableFuture<RichGroupResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse>

    /** Update a restriction */
    fun update(id: Long, params: RestrictionUpdateParams): CompletableFuture<RichGroupResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: Long,
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: RestrictionUpdateParams): CompletableFuture<RichGroupResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse>

    /** Get the paginated list of restrictions */
    fun list(params: RestrictionListParams): CompletableFuture<RestrictionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RestrictionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RestrictionListResponse>

    /** Delete a restriction by ID */
    fun delete(
        id: Long,
        params: RestrictionDeleteParams,
    ): CompletableFuture<RestrictionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RestrictionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: RestrictionDeleteParams): CompletableFuture<RestrictionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RestrictionDeleteResponse>

    /** Get restrictions by bbox */
    fun listByBbox(
        params: RestrictionListByBboxParams
    ): CompletableFuture<List<RichGroupResponse>> = listByBbox(params, RequestOptions.none())

    /** @see listByBbox */
    fun listByBbox(
        params: RestrictionListByBboxParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RichGroupResponse>>

    /** Set the state of a restriction by ID */
    fun setState(
        id: Long,
        params: RestrictionSetStateParams,
    ): CompletableFuture<RichGroupResponse> = setState(id, params, RequestOptions.none())

    /** @see setState */
    fun setState(
        id: Long,
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse> =
        setState(params.toBuilder().id(id).build(), requestOptions)

    /** @see setState */
    fun setState(params: RestrictionSetStateParams): CompletableFuture<RichGroupResponse> =
        setState(params, RequestOptions.none())

    /** @see setState */
    fun setState(
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RichGroupResponse>

    /**
     * A view of [RestrictionServiceAsync] that provides access to raw HTTP responses for each
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
        ): RestrictionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /restrictions/{restriction_type}`, but is otherwise
         * the same as [RestrictionServiceAsync.create].
         */
        fun create(
            restrictionType: RestrictionCreateParams.RestrictionType,
            params: RestrictionCreateParams,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            create(restrictionType, params, RequestOptions.none())

        /** @see create */
        fun create(
            restrictionType: RestrictionCreateParams.RestrictionType,
            params: RestrictionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            create(params.toBuilder().restrictionType(restrictionType).build(), requestOptions)

        /** @see create */
        fun create(
            params: RestrictionCreateParams
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RestrictionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /restrictions/{id}`, but is otherwise the same as
         * [RestrictionServiceAsync.retrieve].
         */
        fun retrieve(
            id: Long,
            params: RestrictionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: Long,
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RestrictionRetrieveParams
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>>

        /**
         * Returns a raw HTTP response for `patch /restrictions/{id}`, but is otherwise the same as
         * [RestrictionServiceAsync.update].
         */
        fun update(
            id: Long,
            params: RestrictionUpdateParams,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: Long,
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: RestrictionUpdateParams
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /restrictions/list`, but is otherwise the same as
         * [RestrictionServiceAsync.list].
         */
        fun list(
            params: RestrictionListParams
        ): CompletableFuture<HttpResponseFor<RestrictionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RestrictionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RestrictionListResponse>>

        /**
         * Returns a raw HTTP response for `delete /restrictions/{id}`, but is otherwise the same as
         * [RestrictionServiceAsync.delete].
         */
        fun delete(
            id: Long,
            params: RestrictionDeleteParams,
        ): CompletableFuture<HttpResponseFor<RestrictionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RestrictionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: RestrictionDeleteParams
        ): CompletableFuture<HttpResponseFor<RestrictionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RestrictionDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /restrictions`, but is otherwise the same as
         * [RestrictionServiceAsync.listByBbox].
         */
        fun listByBbox(
            params: RestrictionListByBboxParams
        ): CompletableFuture<HttpResponseFor<List<RichGroupResponse>>> =
            listByBbox(params, RequestOptions.none())

        /** @see listByBbox */
        fun listByBbox(
            params: RestrictionListByBboxParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RichGroupResponse>>>

        /**
         * Returns a raw HTTP response for `put /restrictions/{id}/state`, but is otherwise the same
         * as [RestrictionServiceAsync.setState].
         */
        fun setState(
            id: Long,
            params: RestrictionSetStateParams,
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            setState(id, params, RequestOptions.none())

        /** @see setState */
        fun setState(
            id: Long,
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            setState(params.toBuilder().id(id).build(), requestOptions)

        /** @see setState */
        fun setState(
            params: RestrictionSetStateParams
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>> =
            setState(params, RequestOptions.none())

        /** @see setState */
        fun setState(
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RichGroupResponse>>
    }
}
