// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.services.blocking.fleetify.DocumentTemplateService
import io.nextbillion.api.services.blocking.fleetify.DocumentTemplateServiceImpl
import io.nextbillion.api.services.blocking.fleetify.RouteService
import io.nextbillion.api.services.blocking.fleetify.RouteServiceImpl
import java.util.function.Consumer

class FleetifyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FleetifyService {

    private val withRawResponse: FleetifyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptions) }

    private val documentTemplates: DocumentTemplateService by lazy {
        DocumentTemplateServiceImpl(clientOptions)
    }

    override fun withRawResponse(): FleetifyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetifyService =
        FleetifyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun routes(): RouteService = routes

    override fun documentTemplates(): DocumentTemplateService = documentTemplates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FleetifyService.WithRawResponse {

        private val routes: RouteService.WithRawResponse by lazy {
            RouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documentTemplates: DocumentTemplateService.WithRawResponse by lazy {
            DocumentTemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetifyService.WithRawResponse =
            FleetifyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun routes(): RouteService.WithRawResponse = routes

        override fun documentTemplates(): DocumentTemplateService.WithRawResponse =
            documentTemplates
    }
}
