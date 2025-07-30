// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.fleetify.routes

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StepServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StepServiceAsync

    /** Insert a new step */
    fun create(routeId: String, params: StepCreateParams): CompletableFuture<StepCreateResponse> =
        create(routeId, params, RequestOptions.none())

    /** @see create */
    fun create(
        routeId: String,
        params: StepCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepCreateResponse> =
        create(params.toBuilder().routeId(routeId).build(), requestOptions)

    /** @see create */
    fun create(params: StepCreateParams): CompletableFuture<StepCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: StepCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepCreateResponse>

    /** Update a step */
    fun update(stepId: String, params: StepUpdateParams): CompletableFuture<StepUpdateResponse> =
        update(stepId, params, RequestOptions.none())

    /** @see update */
    fun update(
        stepId: String,
        params: StepUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepUpdateResponse> =
        update(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see update */
    fun update(params: StepUpdateParams): CompletableFuture<StepUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: StepUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepUpdateResponse>

    /** Delete a step */
    fun delete(stepId: String, params: StepDeleteParams): CompletableFuture<StepDeleteResponse> =
        delete(stepId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        stepId: String,
        params: StepDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepDeleteResponse> =
        delete(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see delete */
    fun delete(params: StepDeleteParams): CompletableFuture<StepDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: StepDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StepDeleteResponse>

    /**
     * Complete a route step with document submission, or update the document of a completed route
     * step.
     *
     * When all steps are completed, the encapsulating route’s status will change to `completed`
     * automatically.
     *
     * Either `Session Token` must be provided to authenticate the request.
     */
    fun complete(stepId: String, params: StepCompleteParams): CompletableFuture<Void?> =
        complete(stepId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        stepId: String,
        params: StepCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        complete(params.toBuilder().stepId(stepId).build(), requestOptions)

    /** @see complete */
    fun complete(params: StepCompleteParams): CompletableFuture<Void?> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: StepCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [StepServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StepServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fleetify/routes/{routeID}/steps`, but is otherwise
         * the same as [StepServiceAsync.create].
         */
        fun create(
            routeId: String,
            params: StepCreateParams,
        ): CompletableFuture<HttpResponseFor<StepCreateResponse>> =
            create(routeId, params, RequestOptions.none())

        /** @see create */
        fun create(
            routeId: String,
            params: StepCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepCreateResponse>> =
            create(params.toBuilder().routeId(routeId).build(), requestOptions)

        /** @see create */
        fun create(
            params: StepCreateParams
        ): CompletableFuture<HttpResponseFor<StepCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: StepCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /fleetify/routes/{routeID}/steps/{stepID}`, but is
         * otherwise the same as [StepServiceAsync.update].
         */
        fun update(
            stepId: String,
            params: StepUpdateParams,
        ): CompletableFuture<HttpResponseFor<StepUpdateResponse>> =
            update(stepId, params, RequestOptions.none())

        /** @see update */
        fun update(
            stepId: String,
            params: StepUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepUpdateResponse>> =
            update(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see update */
        fun update(
            params: StepUpdateParams
        ): CompletableFuture<HttpResponseFor<StepUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: StepUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /fleetify/routes/{routeID}/steps/{stepID}`, but
         * is otherwise the same as [StepServiceAsync.delete].
         */
        fun delete(
            stepId: String,
            params: StepDeleteParams,
        ): CompletableFuture<HttpResponseFor<StepDeleteResponse>> =
            delete(stepId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            stepId: String,
            params: StepDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepDeleteResponse>> =
            delete(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: StepDeleteParams
        ): CompletableFuture<HttpResponseFor<StepDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: StepDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StepDeleteResponse>>

        /**
         * Returns a raw HTTP response for `patch /fleetify/routes/{routeID}/steps/{stepID}`, but is
         * otherwise the same as [StepServiceAsync.complete].
         */
        fun complete(stepId: String, params: StepCompleteParams): CompletableFuture<HttpResponse> =
            complete(stepId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            stepId: String,
            params: StepCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            complete(params.toBuilder().stepId(stepId).build(), requestOptions)

        /** @see complete */
        fun complete(params: StepCompleteParams): CompletableFuture<HttpResponse> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: StepCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
