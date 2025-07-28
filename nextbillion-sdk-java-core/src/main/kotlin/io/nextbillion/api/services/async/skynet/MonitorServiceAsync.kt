// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.asset.SimpleResp
import io.nextbillion.api.models.skynet.monitor.MonitorCreateParams
import io.nextbillion.api.models.skynet.monitor.MonitorCreateResponse
import io.nextbillion.api.models.skynet.monitor.MonitorDeleteParams
import io.nextbillion.api.models.skynet.monitor.MonitorListParams
import io.nextbillion.api.models.skynet.monitor.MonitorListResponse
import io.nextbillion.api.models.skynet.monitor.MonitorRetrieveParams
import io.nextbillion.api.models.skynet.monitor.MonitorRetrieveResponse
import io.nextbillion.api.models.skynet.monitor.MonitorUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MonitorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonitorServiceAsync

    /** Create a Monitor */
    fun create(params: MonitorCreateParams): CompletableFuture<MonitorCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitorCreateResponse>

    /** Get a Monitor */
    fun retrieve(
        id: String,
        params: MonitorRetrieveParams,
    ): CompletableFuture<MonitorRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitorRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: MonitorRetrieveParams): CompletableFuture<MonitorRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitorRetrieveResponse>

    /** Update a Monitor */
    fun update(id: String, params: MonitorUpdateParams): CompletableFuture<SimpleResp> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: MonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: MonitorUpdateParams): CompletableFuture<SimpleResp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Get Monitor List */
    fun list(params: MonitorListParams): CompletableFuture<MonitorListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MonitorListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MonitorListResponse>

    /** Delete a Monitor */
    fun delete(id: String, params: MonitorDeleteParams): CompletableFuture<SimpleResp> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: MonitorDeleteParams): CompletableFuture<SimpleResp> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /**
     * A view of [MonitorServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MonitorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/monitor`, but is otherwise the same as
         * [MonitorServiceAsync.create].
         */
        fun create(
            params: MonitorCreateParams
        ): CompletableFuture<HttpResponseFor<MonitorCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitorCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /skynet/monitor/{id}`, but is otherwise the same as
         * [MonitorServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: MonitorRetrieveParams,
        ): CompletableFuture<HttpResponseFor<MonitorRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitorRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: MonitorRetrieveParams
        ): CompletableFuture<HttpResponseFor<MonitorRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitorRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /skynet/monitor/{id}`, but is otherwise the same as
         * [MonitorServiceAsync.update].
         */
        fun update(
            id: String,
            params: MonitorUpdateParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: MonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: MonitorUpdateParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `get /skynet/monitor/list`, but is otherwise the same as
         * [MonitorServiceAsync.list].
         */
        fun list(
            params: MonitorListParams
        ): CompletableFuture<HttpResponseFor<MonitorListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MonitorListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MonitorListResponse>>

        /**
         * Returns a raw HTTP response for `delete /skynet/monitor/{id}`, but is otherwise the same
         * as [MonitorServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: MonitorDeleteParams,
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: MonitorDeleteParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>
    }
}
