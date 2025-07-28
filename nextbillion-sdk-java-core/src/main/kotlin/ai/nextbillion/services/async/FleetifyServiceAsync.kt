// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.services.async.fleetify.DocumentTemplateServiceAsync
import ai.nextbillion.services.async.fleetify.RouteServiceAsync
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
