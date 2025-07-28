// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.models.directions.DirectionComputeRouteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DirectionServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun computeRoute() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val directionService = client.directions()

        val response =
            directionService.computeRoute(
                DirectionComputeRouteParams.builder()
                    .destination("41.349302,2.136480")
                    .origin("41.349302,2.136480")
                    .altcount(1L)
                    .alternatives(true)
                    .approaches("unrestricted;;curb;")
                    .avoid(DirectionComputeRouteParams.Avoid.TOLL)
                    .bearings("0,180;0,180")
                    .crossBorder(true)
                    .departureTime(0L)
                    .driveTimeLimits("500,400,400")
                    .emissionClass(DirectionComputeRouteParams.EmissionClass.EURO0)
                    .exclude(DirectionComputeRouteParams.Exclude.TOLL)
                    .geometry(DirectionComputeRouteParams.Geometry.POLYLINE)
                    .hazmatType(DirectionComputeRouteParams.HazmatType.GENERAL)
                    .mode(DirectionComputeRouteParams.Mode.CAR)
                    .option(DirectionComputeRouteParams.Option.FAST)
                    .overview(DirectionComputeRouteParams.Overview.FULL)
                    .restTimes("500,300,100")
                    .roadInfo(DirectionComputeRouteParams.RoadInfo.MAX_SPEED)
                    .routeType(DirectionComputeRouteParams.RouteType.FASTEST)
                    .steps(true)
                    .truckAxleLoad(0.0)
                    .truckSize("200,210,600")
                    .truckWeight(1L)
                    .turnAngleRange(0L)
                    .waypoints("41.349302,2.136480|41.349303,2.136481|41.349304,2.136482")
                    .build()
            )

        response.validate()
    }
}
