// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.fleetify

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateCreateParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateCreateResponse
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateDeleteParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateDeleteResponse
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateListParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateListResponse
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateRetrieveParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateRetrieveResponse
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateUpdateParams
import ai.nextbillion.models.fleetify.documenttemplates.DocumentTemplateUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DocumentTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentTemplateService

    /** Create Document template */
    fun create(params: DocumentTemplateCreateParams): DocumentTemplateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DocumentTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateCreateResponse

    /** Retrieve template by ID */
    fun retrieve(
        id: String,
        params: DocumentTemplateRetrieveParams,
    ): DocumentTemplateRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DocumentTemplateRetrieveParams): DocumentTemplateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateRetrieveResponse

    /** Update a document template */
    fun update(id: String, params: DocumentTemplateUpdateParams): DocumentTemplateUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: DocumentTemplateUpdateParams): DocumentTemplateUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DocumentTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateUpdateResponse

    /** Get all document templates */
    fun list(params: DocumentTemplateListParams): DocumentTemplateListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentTemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateListResponse

    /** Delete a document template */
    fun delete(id: String, params: DocumentTemplateDeleteParams): DocumentTemplateDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: DocumentTemplateDeleteParams): DocumentTemplateDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DocumentTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentTemplateDeleteResponse

    /**
     * A view of [DocumentTemplateService] that provides access to raw HTTP responses for each
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
        ): DocumentTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/document_templates`, but is otherwise the
         * same as [DocumentTemplateService.create].
         */
        @MustBeClosed
        fun create(
            params: DocumentTemplateCreateParams
        ): HttpResponseFor<DocumentTemplateCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DocumentTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /fleetify/document_templates/{id}`, but is otherwise
         * the same as [DocumentTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentTemplateRetrieveParams,
        ): HttpResponseFor<DocumentTemplateRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentTemplateRetrieveParams
        ): HttpResponseFor<DocumentTemplateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /fleetify/document_templates/{id}`, but is otherwise
         * the same as [DocumentTemplateService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: DocumentTemplateUpdateParams,
        ): HttpResponseFor<DocumentTemplateUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: DocumentTemplateUpdateParams
        ): HttpResponseFor<DocumentTemplateUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DocumentTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /fleetify/document_templates`, but is otherwise the
         * same as [DocumentTemplateService.list].
         */
        @MustBeClosed
        fun list(
            params: DocumentTemplateListParams
        ): HttpResponseFor<DocumentTemplateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentTemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateListResponse>

        /**
         * Returns a raw HTTP response for `delete /fleetify/document_templates/{id}`, but is
         * otherwise the same as [DocumentTemplateService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: DocumentTemplateDeleteParams,
        ): HttpResponseFor<DocumentTemplateDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DocumentTemplateDeleteParams
        ): HttpResponseFor<DocumentTemplateDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DocumentTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentTemplateDeleteResponse>
    }
}
