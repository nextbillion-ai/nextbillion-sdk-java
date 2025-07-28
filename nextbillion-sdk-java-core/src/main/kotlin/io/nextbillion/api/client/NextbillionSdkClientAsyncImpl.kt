// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.client

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.getPackageVersion
import io.nextbillion.api.services.async.AreaServiceAsync
import io.nextbillion.api.services.async.AreaServiceAsyncImpl
import io.nextbillion.api.services.async.AutocompleteServiceAsync
import io.nextbillion.api.services.async.AutocompleteServiceAsyncImpl
import io.nextbillion.api.services.async.AutosuggestServiceAsync
import io.nextbillion.api.services.async.AutosuggestServiceAsyncImpl
import io.nextbillion.api.services.async.BatchServiceAsync
import io.nextbillion.api.services.async.BatchServiceAsyncImpl
import io.nextbillion.api.services.async.BrowseServiceAsync
import io.nextbillion.api.services.async.BrowseServiceAsyncImpl
import io.nextbillion.api.services.async.DirectionServiceAsync
import io.nextbillion.api.services.async.DirectionServiceAsyncImpl
import io.nextbillion.api.services.async.DiscoverServiceAsync
import io.nextbillion.api.services.async.DiscoverServiceAsyncImpl
import io.nextbillion.api.services.async.DistanceMatrixServiceAsync
import io.nextbillion.api.services.async.DistanceMatrixServiceAsyncImpl
import io.nextbillion.api.services.async.FleetifyServiceAsync
import io.nextbillion.api.services.async.FleetifyServiceAsyncImpl
import io.nextbillion.api.services.async.GeocodeServiceAsync
import io.nextbillion.api.services.async.GeocodeServiceAsyncImpl
import io.nextbillion.api.services.async.GeofenceServiceAsync
import io.nextbillion.api.services.async.GeofenceServiceAsyncImpl
import io.nextbillion.api.services.async.IsochroneServiceAsync
import io.nextbillion.api.services.async.IsochroneServiceAsyncImpl
import io.nextbillion.api.services.async.LookupServiceAsync
import io.nextbillion.api.services.async.LookupServiceAsyncImpl
import io.nextbillion.api.services.async.MapServiceAsync
import io.nextbillion.api.services.async.MapServiceAsyncImpl
import io.nextbillion.api.services.async.MdmServiceAsync
import io.nextbillion.api.services.async.MdmServiceAsyncImpl
import io.nextbillion.api.services.async.MultigeocodeServiceAsync
import io.nextbillion.api.services.async.MultigeocodeServiceAsyncImpl
import io.nextbillion.api.services.async.NavigationServiceAsync
import io.nextbillion.api.services.async.NavigationServiceAsyncImpl
import io.nextbillion.api.services.async.OptimizationServiceAsync
import io.nextbillion.api.services.async.OptimizationServiceAsyncImpl
import io.nextbillion.api.services.async.PostalcodeServiceAsync
import io.nextbillion.api.services.async.PostalcodeServiceAsyncImpl
import io.nextbillion.api.services.async.RestrictionServiceAsync
import io.nextbillion.api.services.async.RestrictionServiceAsyncImpl
import io.nextbillion.api.services.async.RestrictionsItemServiceAsync
import io.nextbillion.api.services.async.RestrictionsItemServiceAsyncImpl
import io.nextbillion.api.services.async.RevgeocodeServiceAsync
import io.nextbillion.api.services.async.RevgeocodeServiceAsyncImpl
import io.nextbillion.api.services.async.RouteReportServiceAsync
import io.nextbillion.api.services.async.RouteReportServiceAsyncImpl
import io.nextbillion.api.services.async.SkynetServiceAsync
import io.nextbillion.api.services.async.SkynetServiceAsyncImpl
import io.nextbillion.api.services.async.SnapToRoadServiceAsync
import io.nextbillion.api.services.async.SnapToRoadServiceAsyncImpl
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

    private val areas: AreaServiceAsync by lazy { AreaServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val lookup: LookupServiceAsync by lazy {
        LookupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

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

    override fun areas(): AreaServiceAsync = areas

    override fun lookup(): LookupServiceAsync = lookup

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

        private val areas: AreaServiceAsync.WithRawResponse by lazy {
            AreaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookup: LookupServiceAsync.WithRawResponse by lazy {
            LookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun areas(): AreaServiceAsync.WithRawResponse = areas

        override fun lookup(): LookupServiceAsync.WithRawResponse = lookup
    }
}
