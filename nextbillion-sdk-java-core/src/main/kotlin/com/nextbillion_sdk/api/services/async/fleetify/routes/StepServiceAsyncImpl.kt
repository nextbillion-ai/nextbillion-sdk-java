// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.fleetify.routes

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.handlers.emptyHandler
import com.nextbillion_sdk.api.core.handlers.errorBodyHandler
import com.nextbillion_sdk.api.core.handlers.errorHandler
import com.nextbillion_sdk.api.core.handlers.jsonHandler
import com.nextbillion_sdk.api.core.http.HttpMethod
import com.nextbillion_sdk.api.core.http.HttpRequest
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.core.http.HttpResponse.Handler
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.core.http.json
import com.nextbillion_sdk.api.core.http.parseable
import com.nextbillion_sdk.api.core.prepareAsync
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepCompleteParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepCreateParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepCreateResponse
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepDeleteParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepDeleteResponse
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepUpdateParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StepServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StepServiceAsync {

    private val withRawResponse: StepServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StepServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StepServiceAsync =
        StepServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: StepCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StepCreateResponse> =
        // post /fleetify/routes/{routeID}/steps
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: StepUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StepUpdateResponse> =
        // put /fleetify/routes/{routeID}/steps/{stepID}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: StepDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StepDeleteResponse> =
        // delete /fleetify/routes/{routeID}/steps/{stepID}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun complete(
        params: StepCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /fleetify/routes/{routeID}/steps/{stepID}
        withRawResponse().complete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StepServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StepServiceAsync.WithRawResponse =
            StepServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<StepCreateResponse> =
            jsonHandler<StepCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: StepCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StepCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("routeId", params.routeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fleetify", "routes", params._pathParam(0), "steps")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<StepUpdateResponse> =
            jsonHandler<StepUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: StepUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StepUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stepId", params.stepId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "fleetify",
                        "routes",
                        params._pathParam(0),
                        "steps",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<StepDeleteResponse> =
            jsonHandler<StepDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: StepDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StepDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stepId", params.stepId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "fleetify",
                        "routes",
                        params._pathParam(0),
                        "steps",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val completeHandler: Handler<Void?> = emptyHandler()

        override fun complete(
            params: StepCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("stepId", params.stepId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "fleetify",
                        "routes",
                        params._pathParam(0),
                        "steps",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { completeHandler.handle(it) }
                    }
                }
        }
    }
}
