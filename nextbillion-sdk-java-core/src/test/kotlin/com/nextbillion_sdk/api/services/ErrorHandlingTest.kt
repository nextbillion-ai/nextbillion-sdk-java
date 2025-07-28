// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.nextbillion_sdk.api.client.NextbillionSdkClient
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.http.Headers
import com.nextbillion_sdk.api.core.jsonMapper
import com.nextbillion_sdk.api.errors.BadRequestException
import com.nextbillion_sdk.api.errors.InternalServerException
import com.nextbillion_sdk.api.errors.NextbillionSdkException
import com.nextbillion_sdk.api.errors.NotFoundException
import com.nextbillion_sdk.api.errors.PermissionDeniedException
import com.nextbillion_sdk.api.errors.RateLimitException
import com.nextbillion_sdk.api.errors.UnauthorizedException
import com.nextbillion_sdk.api.errors.UnexpectedStatusCodeException
import com.nextbillion_sdk.api.errors.UnprocessableEntityException
import com.nextbillion_sdk.api.models.fleetify.routes.RouteCreateParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepCompletionMode
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepGeofenceConfig
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepsRequest
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
    fun routesCreate400() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate400WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate401() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate401WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate403() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate403WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate404() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate404WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate422() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate422WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate429() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate429WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate500() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate500WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate999() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreate999WithRawResponse() {
        val routeService = client.fleetify().routes().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun routesCreateInvalidJsonBody() {
        val routeService = client.fleetify().routes()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<NextbillionSdkException> {
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
