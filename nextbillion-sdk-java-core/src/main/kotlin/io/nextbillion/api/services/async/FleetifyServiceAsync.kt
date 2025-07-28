// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.services.async.fleetify.DocumentTemplateServiceAsync
import io.nextbillion.api.services.async.fleetify.RouteServiceAsync
import java.util.function.Consumer

interface FleetifyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FleetifyServiceAsync

    fun routes(): RouteServiceAsync

    fun documentTemplates(): DocumentTemplateServiceAsync

    /**
     * A view of [FleetifyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FleetifyServiceAsync.WithRawResponse

        fun routes(): RouteServiceAsync.WithRawResponse

        fun documentTemplates(): DocumentTemplateServiceAsync.WithRawResponse
    }
}
