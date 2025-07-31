// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.directions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectionComputeRouteParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.destination()).isEqualTo("41.349302,2.136480")
        assertThat(body.origin()).isEqualTo("41.349302,2.136480")
        assertThat(body.altcount()).contains(1L)
        assertThat(body.alternatives()).contains(true)
        assertThat(body.approaches()).contains("unrestricted;;curb;")
        assertThat(body.avoid()).contains(DirectionComputeRouteParams.Avoid.TOLL)
        assertThat(body.bearings()).contains("0,180;0,180")
        assertThat(body.crossBorder()).contains(true)
        assertThat(body.departureTime()).contains(0L)
        assertThat(body.driveTimeLimits()).contains("500,400,400")
        assertThat(body.emissionClass()).contains(DirectionComputeRouteParams.EmissionClass.EURO0)
        assertThat(body.exclude()).contains(DirectionComputeRouteParams.Exclude.TOLL)
        assertThat(body.geometry()).contains(DirectionComputeRouteParams.Geometry.POLYLINE)
        assertThat(body.hazmatType()).contains(DirectionComputeRouteParams.HazmatType.GENERAL)
        assertThat(body.mode()).contains(DirectionComputeRouteParams.Mode.CAR)
        assertThat(body.option()).contains(DirectionComputeRouteParams.Option.FAST)
        assertThat(body.overview()).contains(DirectionComputeRouteParams.Overview.FULL)
        assertThat(body.restTimes()).contains("500,300,100")
        assertThat(body.roadInfo()).contains(DirectionComputeRouteParams.RoadInfo.MAX_SPEED)
        assertThat(body.routeType()).contains(DirectionComputeRouteParams.RouteType.FASTEST)
        assertThat(body.steps()).contains(true)
        assertThat(body.truckAxleLoad()).contains(0.0)
        assertThat(body.truckSize()).contains("200,210,600")
        assertThat(body.truckWeight()).contains(1L)
        assertThat(body.turnAngleRange()).contains(0L)
        assertThat(body.waypoints())
            .contains("41.349302,2.136480|41.349303,2.136481|41.349304,2.136482")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DirectionComputeRouteParams.builder()
                .destination("41.349302,2.136480")
                .origin("41.349302,2.136480")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("41.349302,2.136480")
        assertThat(body.origin()).isEqualTo("41.349302,2.136480")
    }
}
