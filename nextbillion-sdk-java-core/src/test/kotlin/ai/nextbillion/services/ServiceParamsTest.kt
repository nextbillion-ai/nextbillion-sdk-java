// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services

import ai.nextbillion.client.NextbillionSdkClient
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.directions.DirectionComputeRouteParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

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
    fun computeRoute() {
        val directionService = client.directions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
