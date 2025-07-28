// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.services.blocking.fleetify.DocumentTemplateService
import com.nextbillion_sdk.api.services.blocking.fleetify.RouteService
import java.util.function.Consumer

interface FleetifyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetifyService

    fun routes(): RouteService

    fun documentTemplates(): DocumentTemplateService

    /** A view of [FleetifyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetifyService.WithRawResponse

        fun routes(): RouteService.WithRawResponse

        fun documentTemplates(): DocumentTemplateService.WithRawResponse
    }
}
