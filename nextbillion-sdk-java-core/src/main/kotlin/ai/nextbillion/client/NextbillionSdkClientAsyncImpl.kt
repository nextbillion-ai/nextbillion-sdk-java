// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.client

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.getPackageVersion
import ai.nextbillion.services.async.AreaServiceAsync
import ai.nextbillion.services.async.AreaServiceAsyncImpl
import ai.nextbillion.services.async.AutocompleteServiceAsync
import ai.nextbillion.services.async.AutocompleteServiceAsyncImpl
import ai.nextbillion.services.async.AutosuggestServiceAsync
import ai.nextbillion.services.async.AutosuggestServiceAsyncImpl
import ai.nextbillion.services.async.BatchServiceAsync
import ai.nextbillion.services.async.BatchServiceAsyncImpl
import ai.nextbillion.services.async.BrowseServiceAsync
import ai.nextbillion.services.async.BrowseServiceAsyncImpl
import ai.nextbillion.services.async.DirectionServiceAsync
import ai.nextbillion.services.async.DirectionServiceAsyncImpl
import ai.nextbillion.services.async.DiscoverServiceAsync
import ai.nextbillion.services.async.DiscoverServiceAsyncImpl
import ai.nextbillion.services.async.DistanceMatrixServiceAsync
import ai.nextbillion.services.async.DistanceMatrixServiceAsyncImpl
import ai.nextbillion.services.async.FleetifyServiceAsync
import ai.nextbillion.services.async.FleetifyServiceAsyncImpl
import ai.nextbillion.services.async.GeocodeServiceAsync
import ai.nextbillion.services.async.GeocodeServiceAsyncImpl
import ai.nextbillion.services.async.GeofenceServiceAsync
import ai.nextbillion.services.async.GeofenceServiceAsyncImpl
import ai.nextbillion.services.async.IsochroneServiceAsync
import ai.nextbillion.services.async.IsochroneServiceAsyncImpl
import ai.nextbillion.services.async.LookupServiceAsync
import ai.nextbillion.services.async.LookupServiceAsyncImpl
import ai.nextbillion.services.async.MapServiceAsync
import ai.nextbillion.services.async.MapServiceAsyncImpl
import ai.nextbillion.services.async.MdmServiceAsync
import ai.nextbillion.services.async.MdmServiceAsyncImpl
import ai.nextbillion.services.async.MultigeocodeServiceAsync
import ai.nextbillion.services.async.MultigeocodeServiceAsyncImpl
import ai.nextbillion.services.async.NavigationServiceAsync
import ai.nextbillion.services.async.NavigationServiceAsyncImpl
import ai.nextbillion.services.async.OptimizationServiceAsync
import ai.nextbillion.services.async.OptimizationServiceAsyncImpl
import ai.nextbillion.services.async.PostalcodeServiceAsync
import ai.nextbillion.services.async.PostalcodeServiceAsyncImpl
import ai.nextbillion.services.async.RestrictionServiceAsync
import ai.nextbillion.services.async.RestrictionServiceAsyncImpl
import ai.nextbillion.services.async.RestrictionsItemServiceAsync
import ai.nextbillion.services.async.RestrictionsItemServiceAsyncImpl
import ai.nextbillion.services.async.RevgeocodeServiceAsync
import ai.nextbillion.services.async.RevgeocodeServiceAsyncImpl
import ai.nextbillion.services.async.RouteReportServiceAsync
import ai.nextbillion.services.async.RouteReportServiceAsyncImpl
import ai.nextbillion.services.async.SkynetServiceAsync
import ai.nextbillion.services.async.SkynetServiceAsyncImpl
import ai.nextbillion.services.async.SnapToRoadServiceAsync
import ai.nextbillion.services.async.SnapToRoadServiceAsyncImpl
import java.util.function.Consumer

class NextbillionSdkClientAsyncImpl(private val clientOptions: ClientOptions) :
    NextbillionSdkClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: NextbillionSdkClient by lazy { NextbillionSdkClientImpl(clientOptions) }

    private val withRawResponse: NextbillionSdkClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fleetify: FleetifyServiceAsync by lazy {
        FleetifyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val skynet: SkynetServiceAsync by lazy {
        SkynetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val geocode: GeocodeServiceAsync by lazy {
        GeocodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val optimization: OptimizationServiceAsync by lazy {
        OptimizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val geofence: GeofenceServiceAsync by lazy {
        GeofenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val discover: DiscoverServiceAsync by lazy {
        DiscoverServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val browse: BrowseServiceAsync by lazy {
        BrowseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val mdm: MdmServiceAsync by lazy { MdmServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val isochrone: IsochroneServiceAsync by lazy {
        IsochroneServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val restrictions: RestrictionServiceAsync by lazy {
        RestrictionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val restrictionsItems: RestrictionsItemServiceAsync by lazy {
        RestrictionsItemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val distanceMatrix: DistanceMatrixServiceAsync by lazy {
        DistanceMatrixServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val autocomplete: AutocompleteServiceAsync by lazy {
        AutocompleteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val navigation: NavigationServiceAsync by lazy {
        NavigationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val map: MapServiceAsync by lazy { MapServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val autosuggest: AutosuggestServiceAsync by lazy {
        AutosuggestServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val directions: DirectionServiceAsync by lazy {
        DirectionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batch: BatchServiceAsync by lazy {
        BatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val multigeocode: MultigeocodeServiceAsync by lazy {
        MultigeocodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val revgeocode: RevgeocodeServiceAsync by lazy {
        RevgeocodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routeReport: RouteReportServiceAsync by lazy {
        RouteReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val snapToRoads: SnapToRoadServiceAsync by lazy {
        SnapToRoadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val postalcode: PostalcodeServiceAsync by lazy {
        PostalcodeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val lookup: LookupServiceAsync by lazy {
        LookupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val areas: AreaServiceAsync by lazy { AreaServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): NextbillionSdkClient = sync

    override fun withRawResponse(): NextbillionSdkClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NextbillionSdkClientAsync =
        NextbillionSdkClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fleetify(): FleetifyServiceAsync = fleetify

    override fun skynet(): SkynetServiceAsync = skynet

    override fun geocode(): GeocodeServiceAsync = geocode

    override fun optimization(): OptimizationServiceAsync = optimization

    override fun geofence(): GeofenceServiceAsync = geofence

    override fun discover(): DiscoverServiceAsync = discover

    override fun browse(): BrowseServiceAsync = browse

    override fun mdm(): MdmServiceAsync = mdm

    override fun isochrone(): IsochroneServiceAsync = isochrone

    override fun restrictions(): RestrictionServiceAsync = restrictions

    override fun restrictionsItems(): RestrictionsItemServiceAsync = restrictionsItems

    override fun distanceMatrix(): DistanceMatrixServiceAsync = distanceMatrix

    override fun autocomplete(): AutocompleteServiceAsync = autocomplete

    override fun navigation(): NavigationServiceAsync = navigation

    override fun map(): MapServiceAsync = map

    override fun autosuggest(): AutosuggestServiceAsync = autosuggest

    override fun directions(): DirectionServiceAsync = directions

    override fun batch(): BatchServiceAsync = batch

    override fun multigeocode(): MultigeocodeServiceAsync = multigeocode

    override fun revgeocode(): RevgeocodeServiceAsync = revgeocode

    override fun routeReport(): RouteReportServiceAsync = routeReport

    override fun snapToRoads(): SnapToRoadServiceAsync = snapToRoads

    override fun postalcode(): PostalcodeServiceAsync = postalcode

    override fun lookup(): LookupServiceAsync = lookup

    override fun areas(): AreaServiceAsync = areas

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NextbillionSdkClientAsync.WithRawResponse {

        private val fleetify: FleetifyServiceAsync.WithRawResponse by lazy {
            FleetifyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val skynet: SkynetServiceAsync.WithRawResponse by lazy {
            SkynetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val geocode: GeocodeServiceAsync.WithRawResponse by lazy {
            GeocodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val optimization: OptimizationServiceAsync.WithRawResponse by lazy {
            OptimizationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val geofence: GeofenceServiceAsync.WithRawResponse by lazy {
            GeofenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val discover: DiscoverServiceAsync.WithRawResponse by lazy {
            DiscoverServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val browse: BrowseServiceAsync.WithRawResponse by lazy {
            BrowseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mdm: MdmServiceAsync.WithRawResponse by lazy {
            MdmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val isochrone: IsochroneServiceAsync.WithRawResponse by lazy {
            IsochroneServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val restrictions: RestrictionServiceAsync.WithRawResponse by lazy {
            RestrictionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val restrictionsItems: RestrictionsItemServiceAsync.WithRawResponse by lazy {
            RestrictionsItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val distanceMatrix: DistanceMatrixServiceAsync.WithRawResponse by lazy {
            DistanceMatrixServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val autocomplete: AutocompleteServiceAsync.WithRawResponse by lazy {
            AutocompleteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigation: NavigationServiceAsync.WithRawResponse by lazy {
            NavigationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val map: MapServiceAsync.WithRawResponse by lazy {
            MapServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val autosuggest: AutosuggestServiceAsync.WithRawResponse by lazy {
            AutosuggestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val directions: DirectionServiceAsync.WithRawResponse by lazy {
            DirectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val multigeocode: MultigeocodeServiceAsync.WithRawResponse by lazy {
            MultigeocodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val revgeocode: RevgeocodeServiceAsync.WithRawResponse by lazy {
            RevgeocodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeReport: RouteReportServiceAsync.WithRawResponse by lazy {
            RouteReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapToRoads: SnapToRoadServiceAsync.WithRawResponse by lazy {
            SnapToRoadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val postalcode: PostalcodeServiceAsync.WithRawResponse by lazy {
            PostalcodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookup: LookupServiceAsync.WithRawResponse by lazy {
            LookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val areas: AreaServiceAsync.WithRawResponse by lazy {
            AreaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NextbillionSdkClientAsync.WithRawResponse =
            NextbillionSdkClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fleetify(): FleetifyServiceAsync.WithRawResponse = fleetify

        override fun skynet(): SkynetServiceAsync.WithRawResponse = skynet

        override fun geocode(): GeocodeServiceAsync.WithRawResponse = geocode

        override fun optimization(): OptimizationServiceAsync.WithRawResponse = optimization

        override fun geofence(): GeofenceServiceAsync.WithRawResponse = geofence

        override fun discover(): DiscoverServiceAsync.WithRawResponse = discover

        override fun browse(): BrowseServiceAsync.WithRawResponse = browse

        override fun mdm(): MdmServiceAsync.WithRawResponse = mdm

        override fun isochrone(): IsochroneServiceAsync.WithRawResponse = isochrone

        override fun restrictions(): RestrictionServiceAsync.WithRawResponse = restrictions

        override fun restrictionsItems(): RestrictionsItemServiceAsync.WithRawResponse =
            restrictionsItems

        override fun distanceMatrix(): DistanceMatrixServiceAsync.WithRawResponse = distanceMatrix

        override fun autocomplete(): AutocompleteServiceAsync.WithRawResponse = autocomplete

        override fun navigation(): NavigationServiceAsync.WithRawResponse = navigation

        override fun map(): MapServiceAsync.WithRawResponse = map

        override fun autosuggest(): AutosuggestServiceAsync.WithRawResponse = autosuggest

        override fun directions(): DirectionServiceAsync.WithRawResponse = directions

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun multigeocode(): MultigeocodeServiceAsync.WithRawResponse = multigeocode

        override fun revgeocode(): RevgeocodeServiceAsync.WithRawResponse = revgeocode

        override fun routeReport(): RouteReportServiceAsync.WithRawResponse = routeReport

        override fun snapToRoads(): SnapToRoadServiceAsync.WithRawResponse = snapToRoads

        override fun postalcode(): PostalcodeServiceAsync.WithRawResponse = postalcode

        override fun lookup(): LookupServiceAsync.WithRawResponse = lookup

        override fun areas(): AreaServiceAsync.WithRawResponse = areas
    }
}
