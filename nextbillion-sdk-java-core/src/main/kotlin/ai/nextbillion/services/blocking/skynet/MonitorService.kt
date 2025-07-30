// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.models.skynet.monitor.MonitorCreateParams
import ai.nextbillion.models.skynet.monitor.MonitorCreateResponse
import ai.nextbillion.models.skynet.monitor.MonitorDeleteParams
import ai.nextbillion.models.skynet.monitor.MonitorListParams
import ai.nextbillion.models.skynet.monitor.MonitorListResponse
import ai.nextbillion.models.skynet.monitor.MonitorRetrieveParams
import ai.nextbillion.models.skynet.monitor.MonitorRetrieveResponse
import ai.nextbillion.models.skynet.monitor.MonitorUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface MonitorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonitorService

    /** Create a Monitor */
    fun create(params: MonitorCreateParams): MonitorCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitorCreateResponse

    /** Get a Monitor */
    fun retrieve(id: String, params: MonitorRetrieveParams): MonitorRetrieveResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitorRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: MonitorRetrieveParams): MonitorRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitorRetrieveResponse

    /** Update a Monitor */
    fun update(id: String, params: MonitorUpdateParams): SimpleResp =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: MonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: MonitorUpdateParams): SimpleResp = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Get Monitor List */
    fun list(params: MonitorListParams): MonitorListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MonitorListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MonitorListResponse

    /** Delete a Monitor */
    fun delete(id: String, params: MonitorDeleteParams): SimpleResp =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: MonitorDeleteParams): SimpleResp = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** A view of [MonitorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonitorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/monitor`, but is otherwise the same as
         * [MonitorService.create].
         */
        @MustBeClosed
        fun create(params: MonitorCreateParams): HttpResponseFor<MonitorCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitorCreateResponse>

        /**
         * Returns a raw HTTP response for `get /skynet/monitor/{id}`, but is otherwise the same as
         * [MonitorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MonitorRetrieveParams,
        ): HttpResponseFor<MonitorRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitorRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: MonitorRetrieveParams): HttpResponseFor<MonitorRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitorRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /skynet/monitor/{id}`, but is otherwise the same as
         * [MonitorService.update].
         */
        @MustBeClosed
        fun update(id: String, params: MonitorUpdateParams): HttpResponseFor<SimpleResp> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MonitorUpdateParams): HttpResponseFor<SimpleResp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `get /skynet/monitor/list`, but is otherwise the same as
         * [MonitorService.list].
         */
        @MustBeClosed
        fun list(params: MonitorListParams): HttpResponseFor<MonitorListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MonitorListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MonitorListResponse>

        /**
         * Returns a raw HTTP response for `delete /skynet/monitor/{id}`, but is otherwise the same
         * as [MonitorService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: MonitorDeleteParams): HttpResponseFor<SimpleResp> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: MonitorDeleteParams): HttpResponseFor<SimpleResp> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>
    }
}
