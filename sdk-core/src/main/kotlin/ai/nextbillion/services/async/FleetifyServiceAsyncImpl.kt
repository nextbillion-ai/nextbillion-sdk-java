// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.services.async.fleetify.DocumentTemplateServiceAsync
import ai.nextbillion.services.async.fleetify.DocumentTemplateServiceAsyncImpl
import ai.nextbillion.services.async.fleetify.RouteServiceAsync
import ai.nextbillion.services.async.fleetify.RouteServiceAsyncImpl
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
