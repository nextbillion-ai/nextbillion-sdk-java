// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.client

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.services.async.AreaServiceAsync
import ai.nextbillion.services.async.AutocompleteServiceAsync
import ai.nextbillion.services.async.AutosuggestServiceAsync
import ai.nextbillion.services.async.BatchServiceAsync
import ai.nextbillion.services.async.BrowseServiceAsync
import ai.nextbillion.services.async.DirectionServiceAsync
import ai.nextbillion.services.async.DiscoverServiceAsync
import ai.nextbillion.services.async.DistanceMatrixServiceAsync
import ai.nextbillion.services.async.FleetifyServiceAsync
import ai.nextbillion.services.async.GeocodeServiceAsync
import ai.nextbillion.services.async.GeofenceServiceAsync
import ai.nextbillion.services.async.IsochroneServiceAsync
import ai.nextbillion.services.async.LookupServiceAsync
import ai.nextbillion.services.async.MapServiceAsync
import ai.nextbillion.services.async.MdmServiceAsync
import ai.nextbillion.services.async.MultigeocodeServiceAsync
import ai.nextbillion.services.async.NavigationServiceAsync
import ai.nextbillion.services.async.OptimizationServiceAsync
import ai.nextbillion.services.async.PostalcodeServiceAsync
import ai.nextbillion.services.async.RestrictionServiceAsync
import ai.nextbillion.services.async.RestrictionsItemServiceAsync
import ai.nextbillion.services.async.RevgeocodeServiceAsync
import ai.nextbillion.services.async.RouteReportServiceAsync
import ai.nextbillion.services.async.SkynetServiceAsync
import ai.nextbillion.services.async.SnapToRoadServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Nextbillion SDK REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface NextbillionSdkClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): NextbillionSdkClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NextbillionSdkClientAsync

    fun fleetify(): FleetifyServiceAsync

    fun skynet(): SkynetServiceAsync

    fun geocode(): GeocodeServiceAsync

    fun optimization(): OptimizationServiceAsync

    fun geofence(): GeofenceServiceAsync

    fun discover(): DiscoverServiceAsync

    fun browse(): BrowseServiceAsync

    fun mdm(): MdmServiceAsync

    fun isochrone(): IsochroneServiceAsync

    fun restrictions(): RestrictionServiceAsync

    fun restrictionsItems(): RestrictionsItemServiceAsync

    fun distanceMatrix(): DistanceMatrixServiceAsync

    fun autocomplete(): AutocompleteServiceAsync

    fun navigation(): NavigationServiceAsync

    fun map(): MapServiceAsync

    fun autosuggest(): AutosuggestServiceAsync

    fun directions(): DirectionServiceAsync

    fun batch(): BatchServiceAsync

    fun multigeocode(): MultigeocodeServiceAsync

    fun revgeocode(): RevgeocodeServiceAsync

    fun routeReport(): RouteReportServiceAsync

    fun snapToRoads(): SnapToRoadServiceAsync

    fun postalcode(): PostalcodeServiceAsync

    fun lookup(): LookupServiceAsync

    fun areas(): AreaServiceAsync

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
     * A view of [NextbillionSdkClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NextbillionSdkClientAsync.WithRawResponse

        fun fleetify(): FleetifyServiceAsync.WithRawResponse

        fun skynet(): SkynetServiceAsync.WithRawResponse

        fun geocode(): GeocodeServiceAsync.WithRawResponse

        fun optimization(): OptimizationServiceAsync.WithRawResponse

        fun geofence(): GeofenceServiceAsync.WithRawResponse

        fun discover(): DiscoverServiceAsync.WithRawResponse

        fun browse(): BrowseServiceAsync.WithRawResponse

        fun mdm(): MdmServiceAsync.WithRawResponse

        fun isochrone(): IsochroneServiceAsync.WithRawResponse

        fun restrictions(): RestrictionServiceAsync.WithRawResponse

        fun restrictionsItems(): RestrictionsItemServiceAsync.WithRawResponse

        fun distanceMatrix(): DistanceMatrixServiceAsync.WithRawResponse

        fun autocomplete(): AutocompleteServiceAsync.WithRawResponse

        fun navigation(): NavigationServiceAsync.WithRawResponse

        fun map(): MapServiceAsync.WithRawResponse

        fun autosuggest(): AutosuggestServiceAsync.WithRawResponse

        fun directions(): DirectionServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun multigeocode(): MultigeocodeServiceAsync.WithRawResponse

        fun revgeocode(): RevgeocodeServiceAsync.WithRawResponse

        fun routeReport(): RouteReportServiceAsync.WithRawResponse

        fun snapToRoads(): SnapToRoadServiceAsync.WithRawResponse

        fun postalcode(): PostalcodeServiceAsync.WithRawResponse

        fun lookup(): LookupServiceAsync.WithRawResponse

        fun areas(): AreaServiceAsync.WithRawResponse
    }
}
