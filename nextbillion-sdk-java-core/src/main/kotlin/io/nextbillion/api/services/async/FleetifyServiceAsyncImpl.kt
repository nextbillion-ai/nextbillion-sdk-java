// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.services.async.fleetify.DocumentTemplateServiceAsync
import io.nextbillion.api.services.async.fleetify.DocumentTemplateServiceAsyncImpl
import io.nextbillion.api.services.async.fleetify.RouteServiceAsync
import io.nextbillion.api.services.async.fleetify.RouteServiceAsyncImpl
import java.util.function.Consumer

class FleetifyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FleetifyServiceAsync {

    private val withRawResponse: FleetifyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val routes: RouteServiceAsync by lazy { RouteServiceAsyncImpl(clientOptions) }

    private val documentTemplates: DocumentTemplateServiceAsync by lazy {
        DocumentTemplateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): FleetifyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetifyServiceAsync =
        FleetifyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun routes(): RouteServiceAsync = routes

    override fun documentTemplates(): DocumentTemplateServiceAsync = documentTemplates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FleetifyServiceAsync.WithRawResponse {

        private val routes: RouteServiceAsync.WithRawResponse by lazy {
            RouteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documentTemplates: DocumentTemplateServiceAsync.WithRawResponse by lazy {
            DocumentTemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetifyServiceAsync.WithRawResponse =
            FleetifyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun routes(): RouteServiceAsync.WithRawResponse = routes

        override fun documentTemplates(): DocumentTemplateServiceAsync.WithRawResponse =
            documentTemplates
    }
}
