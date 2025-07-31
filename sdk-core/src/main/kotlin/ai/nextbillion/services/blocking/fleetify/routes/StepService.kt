// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.fleetify.routes

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.fleetify.routes.steps.StepCompleteParams
import ai.nextbillion.models.fleetify.routes.steps.StepCreateParams
import ai.nextbillion.models.fleetify.routes.steps.StepCreateResponse
import ai.nextbillion.models.fleetify.routes.steps.StepDeleteParams
import ai.nextbillion.models.fleetify.routes.steps.StepDeleteResponse
import ai.nextbillion.models.fleetify.routes.steps.StepUpdateParams
import ai.nextbillion.models.fleetify.routes.steps.StepUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface StepService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StepService

    /** Insert a new step */
    fun create(routeId: String, params: StepCreateParams): StepCreateResponse =
        create(routeId, params, RequestOptions.none())

    /** @see create */
    fun create(
        routeId: String,
        params: StepCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepCreateResponse = create(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see create */
    fun create(params: StepCreateParams): StepCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StepCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepCreateResponse

    /** Update a step */
    fun update(stepId: String, params: StepUpdateParams): StepUpdateResponse =
        update(stepId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stepId: String,
        params: StepUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepUpdateResponse = update(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see update */
    fun update(params: StepUpdateParams): StepUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StepUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepUpdateResponse

    /** Delete a step */
    fun delete(stepId: String, params: StepDeleteParams): StepDeleteResponse =
        delete(stepId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stepId: String,
        params: StepDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepDeleteResponse = delete(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see delete */
    fun delete(params: StepDeleteParams): StepDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StepDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StepDeleteResponse

    /**
     * Complete a route step with document submission, or update the document of a completed route
     * step.
     *
     * When all steps are completed, the encapsulating route’s status will change to completed
     * automatically.
     *
     * Either Session Token must be provided to authenticate the request.
     */
    fun complete(stepId: String, params: StepCompleteParams) =
        complete(stepId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        stepId: String,
        params: StepCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = complete(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see complete */
    fun complete(params: StepCompleteParams) = complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(params: StepCompleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [StepService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StepService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/routes/{routeID}/steps`, but is otherwise
         * the same as [StepService.create].
         */
        @MustBeClosed
        fun create(routeId: String, params: StepCreateParams): HttpResponseFor<StepCreateResponse> =
            create(routeId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            routeId: String,
            params: StepCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepCreateResponse> =
            create(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: StepCreateParams): HttpResponseFor<StepCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: StepCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepCreateResponse>

        /**
         * Returns a raw HTTP response for `put /fleetify/routes/{routeID}/steps/{stepID}`, but is
         * otherwise the same as [StepService.update].
         */
        @MustBeClosed
        fun update(stepId: String, params: StepUpdateParams): HttpResponseFor<StepUpdateResponse> =
            update(stepId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            stepId: String,
            params: StepUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepUpdateResponse> =
            update(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: StepUpdateParams): HttpResponseFor<StepUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: StepUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /fleetify/routes/{routeID}/steps/{stepID}`, but
         * is otherwise the same as [StepService.delete].
         */
        @MustBeClosed
        fun delete(stepId: String, params: StepDeleteParams): HttpResponseFor<StepDeleteResponse> =
            delete(stepId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            stepId: String,
            params: StepDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepDeleteResponse> =
            delete(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: StepDeleteParams): HttpResponseFor<StepDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: StepDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StepDeleteResponse>

        /**
         * Returns a raw HTTP response for `patch /fleetify/routes/{routeID}/steps/{stepID}`, but is
         * otherwise the same as [StepService.complete].
         */
        @MustBeClosed
        fun complete(stepId: String, params: StepCompleteParams): HttpResponse =
            complete(stepId, params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            stepId: String,
            params: StepCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = complete(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        fun complete(params: StepCompleteParams): HttpResponse =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: StepCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
