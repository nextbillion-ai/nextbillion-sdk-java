// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes

import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.models.fleetify.routes.steps.RouteStepCompletionMode
import ai.nextbillion.models.fleetify.routes.steps.RouteStepGeofenceConfig
import ai.nextbillion.models.fleetify.routes.steps.RouteStepsRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
                            .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RouteCreateParams.builder()
                .key("key")
                .driverEmail("johndoe@abc.com")
                .addStep(
                    RouteStepsRequest.builder()
                        .arrival(0L)
                        .addLocation(0.0)
                        .type(RouteStepsRequest.Type.START)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.driverEmail()).isEqualTo("johndoe@abc.com")
        assertThat(body.steps())
            .containsExactly(
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
                            .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                            .instructions(
                                "\"instructions\": \"Customer asked not to ring the doorbell.\""
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.distance()).contains(0L)
        assertThat(body.documentTemplateId())
            .contains("\"document_template_id\": \"bfbc4799-bc2f-4515-9054-d888560909bf\"")
        assertThat(body.roRequestId()).contains("ro_request_id")
        assertThat(body.routing())
            .contains(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RouteCreateParams.builder()
                .key("key")
                .driverEmail("johndoe@abc.com")
                .addStep(
                    RouteStepsRequest.builder()
                        .arrival(0L)
                        .addLocation(0.0)
                        .type(RouteStepsRequest.Type.START)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.driverEmail()).isEqualTo("johndoe@abc.com")
        assertThat(body.steps())
            .containsExactly(
                RouteStepsRequest.builder()
                    .arrival(0L)
                    .addLocation(0.0)
                    .type(RouteStepsRequest.Type.START)
                    .build()
            )
    }
}
