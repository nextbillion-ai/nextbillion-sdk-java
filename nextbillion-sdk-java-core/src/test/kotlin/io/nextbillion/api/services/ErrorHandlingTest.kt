// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import io.nextbillion.api.client.NextbillionSdkClient
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.jsonMapper
import io.nextbillion.api.errors.BadRequestException
import io.nextbillion.api.errors.InternalServerException
import io.nextbillion.api.errors.NextbillionSdkException
import io.nextbillion.api.errors.NotFoundException
import io.nextbillion.api.errors.PermissionDeniedException
import io.nextbillion.api.errors.RateLimitException
import io.nextbillion.api.errors.UnauthorizedException
import io.nextbillion.api.errors.UnexpectedStatusCodeException
import io.nextbillion.api.errors.UnprocessableEntityException
import io.nextbillion.api.models.directions.DirectionComputeRouteParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: NextbillionSdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute400() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute400WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute401() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute401WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute403() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute403WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute404() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute404WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute422() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute422WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute429() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute429WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute500() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute500WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute999() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRoute999WithRawResponse() {
        val directionService = client.directions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun directionsComputeRouteInvalidJsonBody() {
        val directionService = client.directions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<NextbillionSdkException> {
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
