// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.client

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.getPackageVersion
import ai.nextbillion.services.blocking.AreaService
import ai.nextbillion.services.blocking.AreaServiceImpl
import ai.nextbillion.services.blocking.AutocompleteService
import ai.nextbillion.services.blocking.AutocompleteServiceImpl
import ai.nextbillion.services.blocking.AutosuggestService
import ai.nextbillion.services.blocking.AutosuggestServiceImpl
import ai.nextbillion.services.blocking.BatchService
import ai.nextbillion.services.blocking.BatchServiceImpl
import ai.nextbillion.services.blocking.BrowseService
import ai.nextbillion.services.blocking.BrowseServiceImpl
import ai.nextbillion.services.blocking.DirectionService
import ai.nextbillion.services.blocking.DirectionServiceImpl
import ai.nextbillion.services.blocking.DiscoverService
import ai.nextbillion.services.blocking.DiscoverServiceImpl
import ai.nextbillion.services.blocking.DistanceMatrixService
import ai.nextbillion.services.blocking.DistanceMatrixServiceImpl
import ai.nextbillion.services.blocking.FleetifyService
import ai.nextbillion.services.blocking.FleetifyServiceImpl
import ai.nextbillion.services.blocking.GeocodeService
import ai.nextbillion.services.blocking.GeocodeServiceImpl
import ai.nextbillion.services.blocking.GeofenceService
import ai.nextbillion.services.blocking.GeofenceServiceImpl
import ai.nextbillion.services.blocking.IsochroneService
import ai.nextbillion.services.blocking.IsochroneServiceImpl
import ai.nextbillion.services.blocking.LookupService
import ai.nextbillion.services.blocking.LookupServiceImpl
import ai.nextbillion.services.blocking.MapService
import ai.nextbillion.services.blocking.MapServiceImpl
import ai.nextbillion.services.blocking.MdmService
import ai.nextbillion.services.blocking.MdmServiceImpl
import ai.nextbillion.services.blocking.MultigeocodeService
import ai.nextbillion.services.blocking.MultigeocodeServiceImpl
import ai.nextbillion.services.blocking.NavigationService
import ai.nextbillion.services.blocking.NavigationServiceImpl
import ai.nextbillion.services.blocking.OptimizationService
import ai.nextbillion.services.blocking.OptimizationServiceImpl
import ai.nextbillion.services.blocking.PostalcodeService
import ai.nextbillion.services.blocking.PostalcodeServiceImpl
import ai.nextbillion.services.blocking.RestrictionService
import ai.nextbillion.services.blocking.RestrictionServiceImpl
import ai.nextbillion.services.blocking.RestrictionsItemService
import ai.nextbillion.services.blocking.RestrictionsItemServiceImpl
import ai.nextbillion.services.blocking.RevgeocodeService
import ai.nextbillion.services.blocking.RevgeocodeServiceImpl
import ai.nextbillion.services.blocking.RouteReportService
import ai.nextbillion.services.blocking.RouteReportServiceImpl
import ai.nextbillion.services.blocking.SkynetService
import ai.nextbillion.services.blocking.SkynetServiceImpl
import ai.nextbillion.services.blocking.SnapToRoadService
import ai.nextbillion.services.blocking.SnapToRoadServiceImpl
import java.util.function.Consumer

class NextbillionSdkClientImpl(private val clientOptions: ClientOptions) : NextbillionSdkClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: NextbillionSdkClientAsync by lazy {
        NextbillionSdkClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: NextbillionSdkClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fleetify: FleetifyService by lazy {
        FleetifyServiceImpl(clientOptionsWithUserAgent)
    }

    private val skynet: SkynetService by lazy { SkynetServiceImpl(clientOptionsWithUserAgent) }

    private val geocode: GeocodeService by lazy { GeocodeServiceImpl(clientOptionsWithUserAgent) }

    private val optimization: OptimizationService by lazy {
        OptimizationServiceImpl(clientOptionsWithUserAgent)
    }

    private val geofence: GeofenceService by lazy {
        GeofenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val discover: DiscoverService by lazy {
        DiscoverServiceImpl(clientOptionsWithUserAgent)
    }

    private val browse: BrowseService by lazy { BrowseServiceImpl(clientOptionsWithUserAgent) }

    private val mdm: MdmService by lazy { MdmServiceImpl(clientOptionsWithUserAgent) }

    private val isochrone: IsochroneService by lazy {
        IsochroneServiceImpl(clientOptionsWithUserAgent)
    }

    private val restrictions: RestrictionService by lazy {
        RestrictionServiceImpl(clientOptionsWithUserAgent)
    }

    private val restrictionsItems: RestrictionsItemService by lazy {
        RestrictionsItemServiceImpl(clientOptionsWithUserAgent)
    }

    private val distanceMatrix: DistanceMatrixService by lazy {
        DistanceMatrixServiceImpl(clientOptionsWithUserAgent)
    }

    private val autocomplete: AutocompleteService by lazy {
        AutocompleteServiceImpl(clientOptionsWithUserAgent)
    }

    private val navigation: NavigationService by lazy {
        NavigationServiceImpl(clientOptionsWithUserAgent)
    }

    private val map: MapService by lazy { MapServiceImpl(clientOptionsWithUserAgent) }

    private val autosuggest: AutosuggestService by lazy {
        AutosuggestServiceImpl(clientOptionsWithUserAgent)
    }

    private val directions: DirectionService by lazy {
        DirectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptionsWithUserAgent) }

    private val multigeocode: MultigeocodeService by lazy {
        MultigeocodeServiceImpl(clientOptionsWithUserAgent)
    }

    private val revgeocode: RevgeocodeService by lazy {
        RevgeocodeServiceImpl(clientOptionsWithUserAgent)
    }

    private val routeReport: RouteReportService by lazy {
        RouteReportServiceImpl(clientOptionsWithUserAgent)
    }

    private val snapToRoads: SnapToRoadService by lazy {
        SnapToRoadServiceImpl(clientOptionsWithUserAgent)
    }

    private val postalcode: PostalcodeService by lazy {
        PostalcodeServiceImpl(clientOptionsWithUserAgent)
    }

    private val lookup: LookupService by lazy { LookupServiceImpl(clientOptionsWithUserAgent) }

    private val areas: AreaService by lazy { AreaServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): NextbillionSdkClientAsync = async

    override fun withRawResponse(): NextbillionSdkClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NextbillionSdkClient =
        NextbillionSdkClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fleetify(): FleetifyService = fleetify

    override fun skynet(): SkynetService = skynet

    override fun geocode(): GeocodeService = geocode

    override fun optimization(): OptimizationService = optimization

    override fun geofence(): GeofenceService = geofence

    override fun discover(): DiscoverService = discover

    override fun browse(): BrowseService = browse

    override fun mdm(): MdmService = mdm

    override fun isochrone(): IsochroneService = isochrone

    override fun restrictions(): RestrictionService = restrictions

    override fun restrictionsItems(): RestrictionsItemService = restrictionsItems

    override fun distanceMatrix(): DistanceMatrixService = distanceMatrix

    override fun autocomplete(): AutocompleteService = autocomplete

    override fun navigation(): NavigationService = navigation

    override fun map(): MapService = map

    override fun autosuggest(): AutosuggestService = autosuggest

    override fun directions(): DirectionService = directions

    override fun batch(): BatchService = batch

    override fun multigeocode(): MultigeocodeService = multigeocode

    override fun revgeocode(): RevgeocodeService = revgeocode

    override fun routeReport(): RouteReportService = routeReport

    override fun snapToRoads(): SnapToRoadService = snapToRoads

    override fun postalcode(): PostalcodeService = postalcode

    override fun lookup(): LookupService = lookup

    override fun areas(): AreaService = areas

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NextbillionSdkClient.WithRawResponse {

        private val fleetify: FleetifyService.WithRawResponse by lazy {
            FleetifyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val skynet: SkynetService.WithRawResponse by lazy {
            SkynetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val geocode: GeocodeService.WithRawResponse by lazy {
            GeocodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val optimization: OptimizationService.WithRawResponse by lazy {
            OptimizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val geofence: GeofenceService.WithRawResponse by lazy {
            GeofenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val discover: DiscoverService.WithRawResponse by lazy {
            DiscoverServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val browse: BrowseService.WithRawResponse by lazy {
            BrowseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mdm: MdmService.WithRawResponse by lazy {
            MdmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val isochrone: IsochroneService.WithRawResponse by lazy {
            IsochroneServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val restrictions: RestrictionService.WithRawResponse by lazy {
            RestrictionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val restrictionsItems: RestrictionsItemService.WithRawResponse by lazy {
            RestrictionsItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val distanceMatrix: DistanceMatrixService.WithRawResponse by lazy {
            DistanceMatrixServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val autocomplete: AutocompleteService.WithRawResponse by lazy {
            AutocompleteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigation: NavigationService.WithRawResponse by lazy {
            NavigationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val map: MapService.WithRawResponse by lazy {
            MapServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val autosuggest: AutosuggestService.WithRawResponse by lazy {
            AutosuggestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val directions: DirectionService.WithRawResponse by lazy {
            DirectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multigeocode: MultigeocodeService.WithRawResponse by lazy {
            MultigeocodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val revgeocode: RevgeocodeService.WithRawResponse by lazy {
            RevgeocodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeReport: RouteReportService.WithRawResponse by lazy {
            RouteReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapToRoads: SnapToRoadService.WithRawResponse by lazy {
            SnapToRoadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val postalcode: PostalcodeService.WithRawResponse by lazy {
            PostalcodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookup: LookupService.WithRawResponse by lazy {
            LookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val areas: AreaService.WithRawResponse by lazy {
            AreaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NextbillionSdkClient.WithRawResponse =
            NextbillionSdkClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fleetify(): FleetifyService.WithRawResponse = fleetify

        override fun skynet(): SkynetService.WithRawResponse = skynet

        override fun geocode(): GeocodeService.WithRawResponse = geocode

        override fun optimization(): OptimizationService.WithRawResponse = optimization

        override fun geofence(): GeofenceService.WithRawResponse = geofence

        override fun discover(): DiscoverService.WithRawResponse = discover

        override fun browse(): BrowseService.WithRawResponse = browse

        override fun mdm(): MdmService.WithRawResponse = mdm

        override fun isochrone(): IsochroneService.WithRawResponse = isochrone

        override fun restrictions(): RestrictionService.WithRawResponse = restrictions

        override fun restrictionsItems(): RestrictionsItemService.WithRawResponse =
            restrictionsItems

        override fun distanceMatrix(): DistanceMatrixService.WithRawResponse = distanceMatrix

        override fun autocomplete(): AutocompleteService.WithRawResponse = autocomplete

        override fun navigation(): NavigationService.WithRawResponse = navigation

        override fun map(): MapService.WithRawResponse = map

        override fun autosuggest(): AutosuggestService.WithRawResponse = autosuggest

        override fun directions(): DirectionService.WithRawResponse = directions

        override fun batch(): BatchService.WithRawResponse = batch

        override fun multigeocode(): MultigeocodeService.WithRawResponse = multigeocode

        override fun revgeocode(): RevgeocodeService.WithRawResponse = revgeocode

        override fun routeReport(): RouteReportService.WithRawResponse = routeReport

        override fun snapToRoads(): SnapToRoadService.WithRawResponse = snapToRoads

        override fun postalcode(): PostalcodeService.WithRawResponse = postalcode

        override fun lookup(): LookupService.WithRawResponse = lookup

        override fun areas(): AreaService.WithRawResponse = areas
    }
}
