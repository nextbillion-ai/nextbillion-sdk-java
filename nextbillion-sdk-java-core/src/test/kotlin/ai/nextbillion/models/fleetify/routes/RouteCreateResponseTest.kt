// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.fleetify.routes.steps.DocumentSubmission
import ai.nextbillion.models.fleetify.routes.steps.RouteStepCompletionMode
import ai.nextbillion.models.fleetify.routes.steps.RouteStepGeofenceConfig
import ai.nextbillion.models.fleetify.routes.steps.RouteStepsResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routeCreateResponse =
            RouteCreateResponse.builder()
                .data(
                    RouteCreateResponse.Data.builder()
                        .id("id")
                        .createdAt(0L)
                        .distance(0L)
                        .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                        .driver(
                            RouteCreateResponse.Data.Driver.builder()
                                .id("id")
                                .email("email")
                                .fullname("fullname")
                                .build()
                        )
                        .roRequestId("ro_request_id")
                        .routing(
                            RoutingResponse.builder()
                                .approaches("approaches")
                                .avoid("avoid")
                                .hazmatType("hazmat_type")
                                .mode("mode")
                                .truckAxleLoad("truck_axle_load")
                                .truckSize("truck_size")
                                .truckWeight("truck_weight")
                                .build()
                        )
                        .shortId("short_id")
                        .addStep(
                            RouteStepsResponse.builder()
                                .id("id")
                                .address("address")
                                .arrival(0L)
                                .completion(
                                    RouteStepsResponse.Completion.builder()
                                        .completedAt(0L)
                                        .completedByMode(RouteStepCompletionMode.MANUAL)
                                        .completionMode(RouteStepCompletionMode.MANUAL)
                                        .document(DocumentSubmission.builder().build())
                                        .documentModifiedAt(0L)
                                        .geofenceConfig(
                                            RouteStepGeofenceConfig.builder()
                                                .radius(0.0)
                                                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                                .build()
                                        )
                                        .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                                        .build()
                                )
                                .createdAt(0L)
                                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                                .duration(0L)
                                .addLocation(0.0)
                                .meta(
                                    RouteStepsResponse.Meta.builder()
                                        .customerName("customer_name")
                                        .customerPhoneNumber("customer_phone_number")
                                        .instructions("instructions")
                                        .build()
                                )
                                .shortId("short_id")
                                .type("type")
                                .updatedAt(0L)
                                .build()
                        )
                        .totalSteps(0L)
                        .updatedAt(0L)
                        .vehicleId("vehicle_id")
                        .build()
                )
                .status(0L)
                .build()

        assertThat(routeCreateResponse.data())
            .contains(
                RouteCreateResponse.Data.builder()
                    .id("id")
                    .createdAt(0L)
                    .distance(0L)
                    .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                    .driver(
                        RouteCreateResponse.Data.Driver.builder()
                            .id("id")
                            .email("email")
                            .fullname("fullname")
                            .build()
                    )
                    .roRequestId("ro_request_id")
                    .routing(
                        RoutingResponse.builder()
                            .approaches("approaches")
                            .avoid("avoid")
                            .hazmatType("hazmat_type")
                            .mode("mode")
                            .truckAxleLoad("truck_axle_load")
                            .truckSize("truck_size")
                            .truckWeight("truck_weight")
                            .build()
                    )
                    .shortId("short_id")
                    .addStep(
                        RouteStepsResponse.builder()
                            .id("id")
                            .address("address")
                            .arrival(0L)
                            .completion(
                                RouteStepsResponse.Completion.builder()
                                    .completedAt(0L)
                                    .completedByMode(RouteStepCompletionMode.MANUAL)
                                    .completionMode(RouteStepCompletionMode.MANUAL)
                                    .document(DocumentSubmission.builder().build())
                                    .documentModifiedAt(0L)
                                    .geofenceConfig(
                                        RouteStepGeofenceConfig.builder()
                                            .radius(0.0)
                                            .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                            .build()
                                    )
                                    .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                                    .build()
                            )
                            .createdAt(0L)
                            .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                            .duration(0L)
                            .addLocation(0.0)
                            .meta(
                                RouteStepsResponse.Meta.builder()
                                    .customerName("customer_name")
                                    .customerPhoneNumber("customer_phone_number")
                                    .instructions("instructions")
                                    .build()
                            )
                            .shortId("short_id")
                            .type("type")
                            .updatedAt(0L)
                            .build()
                    )
                    .totalSteps(0L)
                    .updatedAt(0L)
                    .vehicleId("vehicle_id")
                    .build()
            )
        assertThat(routeCreateResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeCreateResponse =
            RouteCreateResponse.builder()
                .data(
                    RouteCreateResponse.Data.builder()
                        .id("id")
                        .createdAt(0L)
                        .distance(0L)
                        .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                        .driver(
                            RouteCreateResponse.Data.Driver.builder()
                                .id("id")
                                .email("email")
                                .fullname("fullname")
                                .build()
                        )
                        .roRequestId("ro_request_id")
                        .routing(
                            RoutingResponse.builder()
                                .approaches("approaches")
                                .avoid("avoid")
                                .hazmatType("hazmat_type")
                                .mode("mode")
                                .truckAxleLoad("truck_axle_load")
                                .truckSize("truck_size")
                                .truckWeight("truck_weight")
                                .build()
                        )
                        .shortId("short_id")
                        .addStep(
                            RouteStepsResponse.builder()
                                .id("id")
                                .address("address")
                                .arrival(0L)
                                .completion(
                                    RouteStepsResponse.Completion.builder()
                                        .completedAt(0L)
                                        .completedByMode(RouteStepCompletionMode.MANUAL)
                                        .completionMode(RouteStepCompletionMode.MANUAL)
                                        .document(DocumentSubmission.builder().build())
                                        .documentModifiedAt(0L)
                                        .geofenceConfig(
                                            RouteStepGeofenceConfig.builder()
                                                .radius(0.0)
                                                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                                .build()
                                        )
                                        .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                                        .build()
                                )
                                .createdAt(0L)
                                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                                .duration(0L)
                                .addLocation(0.0)
                                .meta(
                                    RouteStepsResponse.Meta.builder()
                                        .customerName("customer_name")
                                        .customerPhoneNumber("customer_phone_number")
                                        .instructions("instructions")
                                        .build()
                                )
                                .shortId("short_id")
                                .type("type")
                                .updatedAt(0L)
                                .build()
                        )
                        .totalSteps(0L)
                        .updatedAt(0L)
                        .vehicleId("vehicle_id")
                        .build()
                )
                .status(0L)
                .build()

        val roundtrippedRouteCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeCreateResponse),
                jacksonTypeRef<RouteCreateResponse>(),
            )

        assertThat(roundtrippedRouteCreateResponse).isEqualTo(routeCreateResponse)
    }
}
