// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.fleetify

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateCreateResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateDeleteResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateListParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateListResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateRetrieveResponse
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import io.nextbillion.api.models.fleetify.documenttemplates.DocumentTemplateUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentTemplateServiceAsync

    /** Create Document template */
    fun create(
        params: DocumentTemplateCreateParams
    ): CompletableFuture<DocumentTemplateCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateCreateResponse>

    /** Retrieve template by ID */
    fun retrieve(
        id: String,
        params: DocumentTemplateRetrieveParams,
    ): CompletableFuture<DocumentTemplateRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: DocumentTemplateRetrieveParams
    ): CompletableFuture<DocumentTemplateRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateRetrieveResponse>

    /** Update a document template */
    fun update(
        id: String,
        params: DocumentTemplateUpdateParams,
    ): CompletableFuture<DocumentTemplateUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: DocumentTemplateUpdateParams
    ): CompletableFuture<DocumentTemplateUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateUpdateResponse>

    /** Get all document templates */
    fun list(params: DocumentTemplateListParams): CompletableFuture<DocumentTemplateListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentTemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateListResponse>

    /** Delete a document template */
    fun delete(
        id: String,
        params: DocumentTemplateDeleteParams,
    ): CompletableFuture<DocumentTemplateDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: DocumentTemplateDeleteParams
    ): CompletableFuture<DocumentTemplateDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentTemplateDeleteResponse>

    /**
     * A view of [DocumentTemplateServiceAsync] that provides access to raw HTTP responses for each
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
        ): DocumentTemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/document_templates`, but is otherwise the
         * same as [DocumentTemplateServiceAsync.create].
         */
        fun create(
            params: DocumentTemplateCreateParams
        ): CompletableFuture<HttpResponseFor<DocumentTemplateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DocumentTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /fleetify/document_templates/{id}`, but is otherwise
         * the same as [DocumentTemplateServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: DocumentTemplateRetrieveParams,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: DocumentTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentTemplateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /fleetify/document_templates/{id}`, but is otherwise
         * the same as [DocumentTemplateServiceAsync.update].
         */
        fun update(
            id: String,
            params: DocumentTemplateUpdateParams,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: DocumentTemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<DocumentTemplateUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /fleetify/document_templates`, but is otherwise the
         * same as [DocumentTemplateServiceAsync.list].
         */
        fun list(
            params: DocumentTemplateListParams
        ): CompletableFuture<HttpResponseFor<DocumentTemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DocumentTemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateListResponse>>

        /**
         * Returns a raw HTTP response for `delete /fleetify/document_templates/{id}`, but is
         * otherwise the same as [DocumentTemplateServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: DocumentTemplateDeleteParams,
        ): CompletableFuture<HttpResponseFor<DocumentTemplateDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: DocumentTemplateDeleteParams
        ): CompletableFuture<HttpResponseFor<DocumentTemplateDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentTemplateDeleteResponse>>
    }
}
