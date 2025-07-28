// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.fleetify.routes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteRedispatchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routeRedispatchResponse =
            RouteRedispatchResponse.builder()
                .data(
                    RouteRedispatchResponse.Data.builder()
                        .id("id")
                        .completedSteps(0L)
                        .completion(
                            RouteRedispatchResponse.Data.Completion.builder()
                                .status(RouteRedispatchResponse.Data.Completion.Status.SCHEDULED)
                                .build()
                        )
                        .createdAt(0L)
                        .distance(0L)
                        .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                        .driver(
                            RouteRedispatchResponse.Data.Driver.builder()
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
                        .steps(
                            RouteRedispatchResponse.Data.Steps.builder()
                                .id("id")
                                .address("address")
                                .arrival(0L)
                                .completion(
                                    RouteRedispatchResponse.Data.Steps.Completion.builder()
                                        .status("status")
                                        .build()
                                )
                                .createdAt(0L)
                                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                                .duration(0L)
                                .addLocation(0.0)
                                .meta(
                                    RouteRedispatchResponse.Data.Steps.Meta.builder()
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
                .message("message")
                .status(0L)
                .build()

        assertThat(routeRedispatchResponse.data())
            .contains(
                RouteRedispatchResponse.Data.builder()
                    .id("id")
                    .completedSteps(0L)
                    .completion(
                        RouteRedispatchResponse.Data.Completion.builder()
                            .status(RouteRedispatchResponse.Data.Completion.Status.SCHEDULED)
                            .build()
                    )
                    .createdAt(0L)
                    .distance(0L)
                    .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                    .driver(
                        RouteRedispatchResponse.Data.Driver.builder()
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
                    .steps(
                        RouteRedispatchResponse.Data.Steps.builder()
                            .id("id")
                            .address("address")
                            .arrival(0L)
                            .completion(
                                RouteRedispatchResponse.Data.Steps.Completion.builder()
                                    .status("status")
                                    .build()
                            )
                            .createdAt(0L)
                            .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                            .duration(0L)
                            .addLocation(0.0)
                            .meta(
                                RouteRedispatchResponse.Data.Steps.Meta.builder()
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
        assertThat(routeRedispatchResponse.message()).contains("message")
        assertThat(routeRedispatchResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeRedispatchResponse =
            RouteRedispatchResponse.builder()
                .data(
                    RouteRedispatchResponse.Data.builder()
                        .id("id")
                        .completedSteps(0L)
                        .completion(
                            RouteRedispatchResponse.Data.Completion.builder()
                                .status(RouteRedispatchResponse.Data.Completion.Status.SCHEDULED)
                                .build()
                        )
                        .createdAt(0L)
                        .distance(0L)
                        .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                        .driver(
                            RouteRedispatchResponse.Data.Driver.builder()
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
                        .steps(
                            RouteRedispatchResponse.Data.Steps.builder()
                                .id("id")
                                .address("address")
                                .arrival(0L)
                                .completion(
                                    RouteRedispatchResponse.Data.Steps.Completion.builder()
                                        .status("status")
                                        .build()
                                )
                                .createdAt(0L)
                                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                                .duration(0L)
                                .addLocation(0.0)
                                .meta(
                                    RouteRedispatchResponse.Data.Steps.Meta.builder()
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
                .message("message")
                .status(0L)
                .build()

        val roundtrippedRouteRedispatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeRedispatchResponse),
                jacksonTypeRef<RouteRedispatchResponse>(),
            )

        assertThat(roundtrippedRouteRedispatchResponse).isEqualTo(routeRedispatchResponse)
    }
}
