// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services

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
import com.nextbillion_sdk.api.client.NextbillionSdkClient
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.models.fleetify.routes.RouteCreateParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepCompletionMode
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepGeofenceConfig
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepsRequest
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
    fun create() {
        val routeService = client.fleetify().routes()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        routeService.create(
            RouteCreateParams.builder()
                .key("key")
                .driverEmail("johndoe@abc.com")
                .addStep(
                    RouteStepsRequest.builder()
                        .arrival(0L)
                        .addLocation(0.0)
                        .type(RouteStepsRequest.Type.START)
                        .address(
                            "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\","
                        )
                        .completionMode(RouteStepCompletionMode.MANUAL)
                        .documentTemplateId("document_template_id")
                        .duration(0L)
                        .geofenceConfig(
                            RouteStepGeofenceConfig.builder()
                                .radius(0.0)
                                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                .build()
                        )
                        .meta(
                            RouteStepsRequest.Meta.builder()
                                .customerName("\"customer_name\": \"Chandler Bing\"")
                                .customerPhoneNumber(
                                    "\"customer_phone_number\": \"+1 707 234 1234\""
                                )
                                .instructions(
                                    "\"instructions\": \"Customer asked not to ring the doorbell.\""
                                )
                                .build()
                        )
                        .build()
                )
                .distance(0L)
                .documentTemplateId(
                    "\"document_template_id\": \"bfbc4799-bc2f-4515-9054-d888560909bf\""
                )
                .roRequestId("ro_request_id")
                .routing(
                    RouteCreateParams.Routing.builder()
                        .approaches(RouteCreateParams.Routing.Approaches.UNRESTRICTED)
                        .avoid(RouteCreateParams.Routing.Avoid.TOLL)
                        .hazmatType(RouteCreateParams.Routing.HazmatType.GENERAL)
                        .mode(RouteCreateParams.Routing.Mode.CAR)
                        .truckAxleLoad(0L)
                        .truckSize("\"truck_size\": \"200, 210, 600\"")
                        .truckWeight(0L)
                        .build()
                )
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
