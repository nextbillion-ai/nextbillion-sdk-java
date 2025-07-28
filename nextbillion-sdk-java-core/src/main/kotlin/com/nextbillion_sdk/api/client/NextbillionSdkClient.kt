// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.client

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.services.blocking.AreaService
import com.nextbillion_sdk.api.services.blocking.AutocompleteService
import com.nextbillion_sdk.api.services.blocking.AutosuggestService
import com.nextbillion_sdk.api.services.blocking.BatchService
import com.nextbillion_sdk.api.services.blocking.BrowseService
import com.nextbillion_sdk.api.services.blocking.DirectionService
import com.nextbillion_sdk.api.services.blocking.DiscoverService
import com.nextbillion_sdk.api.services.blocking.DistancematrixService
import com.nextbillion_sdk.api.services.blocking.FleetifyService
import com.nextbillion_sdk.api.services.blocking.GeocodeService
import com.nextbillion_sdk.api.services.blocking.GeofenceService
import com.nextbillion_sdk.api.services.blocking.IsochroneService
import com.nextbillion_sdk.api.services.blocking.LookupService
import com.nextbillion_sdk.api.services.blocking.MapService
import com.nextbillion_sdk.api.services.blocking.MdmService
import com.nextbillion_sdk.api.services.blocking.MultigeocodeService
import com.nextbillion_sdk.api.services.blocking.NavigationService
import com.nextbillion_sdk.api.services.blocking.OptimizationService
import com.nextbillion_sdk.api.services.blocking.PostalcodeService
import com.nextbillion_sdk.api.services.blocking.RestrictionService
import com.nextbillion_sdk.api.services.blocking.RestrictionsItemService
import com.nextbillion_sdk.api.services.blocking.RevgeocodeService
import com.nextbillion_sdk.api.services.blocking.RouteReportService
import com.nextbillion_sdk.api.services.blocking.SkynetService
import com.nextbillion_sdk.api.services.blocking.SnapToRoadService
import java.util.function.Consumer

/**
 * A client for interacting with the Nextbillion SDK REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface NextbillionSdkClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): NextbillionSdkClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NextbillionSdkClient

    fun fleetify(): FleetifyService

    fun skynet(): SkynetService

    fun geocode(): GeocodeService

    fun optimization(): OptimizationService

    fun geofence(): GeofenceService

    fun discover(): DiscoverService

    fun browse(): BrowseService

    fun mdm(): MdmService

    fun isochrone(): IsochroneService

    fun restrictions(): RestrictionService

    fun restrictionsItems(): RestrictionsItemService

    fun distancematrix(): DistancematrixService

    fun autocomplete(): AutocompleteService

    fun navigation(): NavigationService

    fun map(): MapService

    fun autosuggest(): AutosuggestService

    fun directions(): DirectionService

    fun batch(): BatchService

    fun multigeocode(): MultigeocodeService

    fun revgeocode(): RevgeocodeService

    fun routeReport(): RouteReportService

    fun snapToRoads(): SnapToRoadService

    fun postalcode(): PostalcodeService

    fun areas(): AreaService

    fun lookup(): LookupService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [NextbillionSdkClient] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NextbillionSdkClient.WithRawResponse

        fun fleetify(): FleetifyService.WithRawResponse

        fun skynet(): SkynetService.WithRawResponse

        fun geocode(): GeocodeService.WithRawResponse

        fun optimization(): OptimizationService.WithRawResponse

        fun geofence(): GeofenceService.WithRawResponse

        fun discover(): DiscoverService.WithRawResponse

        fun browse(): BrowseService.WithRawResponse

        fun mdm(): MdmService.WithRawResponse

        fun isochrone(): IsochroneService.WithRawResponse

        fun restrictions(): RestrictionService.WithRawResponse

        fun restrictionsItems(): RestrictionsItemService.WithRawResponse

        fun distancematrix(): DistancematrixService.WithRawResponse

        fun autocomplete(): AutocompleteService.WithRawResponse

        fun navigation(): NavigationService.WithRawResponse

        fun map(): MapService.WithRawResponse

        fun autosuggest(): AutosuggestService.WithRawResponse

        fun directions(): DirectionService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun multigeocode(): MultigeocodeService.WithRawResponse

        fun revgeocode(): RevgeocodeService.WithRawResponse

        fun routeReport(): RouteReportService.WithRawResponse

        fun snapToRoads(): SnapToRoadService.WithRawResponse

        fun postalcode(): PostalcodeService.WithRawResponse

        fun areas(): AreaService.WithRawResponse

        fun lookup(): LookupService.WithRawResponse
    }
}
