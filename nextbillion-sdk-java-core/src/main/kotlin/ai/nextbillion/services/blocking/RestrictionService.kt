// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.restrictions.RestrictionCreateParams
import ai.nextbillion.models.restrictions.RestrictionDeleteParams
import ai.nextbillion.models.restrictions.RestrictionDeleteResponse
import ai.nextbillion.models.restrictions.RestrictionListByBboxParams
import ai.nextbillion.models.restrictions.RestrictionListParams
import ai.nextbillion.models.restrictions.RestrictionListResponse
import ai.nextbillion.models.restrictions.RestrictionRetrieveParams
import ai.nextbillion.models.restrictions.RestrictionSetStateParams
import ai.nextbillion.models.restrictions.RestrictionUpdateParams
import ai.nextbillion.models.restrictions.RichGroupResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RestrictionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RestrictionService

    /** Create a new restriction */
    fun create(
        restrictionType: RestrictionCreateParams.RestrictionType,
        params: RestrictionCreateParams,
    ): RichGroupResponse = create(restrictionType, params, RequestOptions.none())

    /** @see create */
    fun create(
        restrictionType: RestrictionCreateParams.RestrictionType,
        params: RestrictionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse =
        create(params.toBuilder().restrictionType(restrictionType).build(), requestOptions)

    /** @see create */
    fun create(params: RestrictionCreateParams): RichGroupResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RestrictionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse

    /** Get a restriction by id */
    fun retrieve(id: Long, params: RestrictionRetrieveParams): RichGroupResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: Long,
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RestrictionRetrieveParams): RichGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RestrictionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse

    /** Update a restriction */
    fun update(id: Long, params: RestrictionUpdateParams): RichGroupResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: Long,
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: RestrictionUpdateParams): RichGroupResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RestrictionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse

    /** Get the paginated list of restrictions */
    fun list(params: RestrictionListParams): RestrictionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RestrictionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RestrictionListResponse

    /** Delete a restriction by ID */
    fun delete(id: Long, params: RestrictionDeleteParams): RestrictionDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RestrictionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: RestrictionDeleteParams): RestrictionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RestrictionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RestrictionDeleteResponse

    /** Get restrictions by bbox */
    fun listByBbox(params: RestrictionListByBboxParams): List<RichGroupResponse> =
        listByBbox(params, RequestOptions.none())

    /** @see listByBbox */
    fun listByBbox(
        params: RestrictionListByBboxParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RichGroupResponse>

    /** Set the state of a restriction by ID */
    fun setState(id: Long, params: RestrictionSetStateParams): RichGroupResponse =
        setState(id, params, RequestOptions.none())

    /** @see setState */
    fun setState(
        id: Long,
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse = setState(params.toBuilder().id(id).build(), requestOptions)

    /** @see setState */
    fun setState(params: RestrictionSetStateParams): RichGroupResponse =
        setState(params, RequestOptions.none())

    /** @see setState */
    fun setState(
        params: RestrictionSetStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RichGroupResponse

    /**
     * A view of [RestrictionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RestrictionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /restrictions/{restriction_type}`, but is otherwise
         * the same as [RestrictionService.create].
         */
        @MustBeClosed
        fun create(
            restrictionType: RestrictionCreateParams.RestrictionType,
            params: RestrictionCreateParams,
        ): HttpResponseFor<RichGroupResponse> =
            create(restrictionType, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            restrictionType: RestrictionCreateParams.RestrictionType,
            params: RestrictionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse> =
            create(params.toBuilder().restrictionType(restrictionType).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RestrictionCreateParams): HttpResponseFor<RichGroupResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RestrictionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse>

        /**
         * Returns a raw HTTP response for `get /restrictions/{id}`, but is otherwise the same as
         * [RestrictionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: RestrictionRetrieveParams,
        ): HttpResponseFor<RichGroupResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RestrictionRetrieveParams): HttpResponseFor<RichGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RestrictionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse>

        /**
         * Returns a raw HTTP response for `patch /restrictions/{id}`, but is otherwise the same as
         * [RestrictionService.update].
         */
        @MustBeClosed
        fun update(id: Long, params: RestrictionUpdateParams): HttpResponseFor<RichGroupResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: Long,
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RestrictionUpdateParams): HttpResponseFor<RichGroupResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RestrictionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse>

        /**
         * Returns a raw HTTP response for `get /restrictions/list`, but is otherwise the same as
         * [RestrictionService.list].
         */
        @MustBeClosed
        fun list(params: RestrictionListParams): HttpResponseFor<RestrictionListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RestrictionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RestrictionListResponse>

        /**
         * Returns a raw HTTP response for `delete /restrictions/{id}`, but is otherwise the same as
         * [RestrictionService.delete].
         */
        @MustBeClosed
        fun delete(
            id: Long,
            params: RestrictionDeleteParams,
        ): HttpResponseFor<RestrictionDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RestrictionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RestrictionDeleteParams): HttpResponseFor<RestrictionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RestrictionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RestrictionDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /restrictions`, but is otherwise the same as
         * [RestrictionService.listByBbox].
         */
        @MustBeClosed
        fun listByBbox(
            params: RestrictionListByBboxParams
        ): HttpResponseFor<List<RichGroupResponse>> = listByBbox(params, RequestOptions.none())

        /** @see listByBbox */
        @MustBeClosed
        fun listByBbox(
            params: RestrictionListByBboxParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RichGroupResponse>>

        /**
         * Returns a raw HTTP response for `put /restrictions/{id}/state`, but is otherwise the same
         * as [RestrictionService.setState].
         */
        @MustBeClosed
        fun setState(
            id: Long,
            params: RestrictionSetStateParams,
        ): HttpResponseFor<RichGroupResponse> = setState(id, params, RequestOptions.none())

        /** @see setState */
        @MustBeClosed
        fun setState(
            id: Long,
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse> =
            setState(params.toBuilder().id(id).build(), requestOptions)

        /** @see setState */
        @MustBeClosed
        fun setState(params: RestrictionSetStateParams): HttpResponseFor<RichGroupResponse> =
            setState(params, RequestOptions.none())

        /** @see setState */
        @MustBeClosed
        fun setState(
            params: RestrictionSetStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RichGroupResponse>
    }
}
