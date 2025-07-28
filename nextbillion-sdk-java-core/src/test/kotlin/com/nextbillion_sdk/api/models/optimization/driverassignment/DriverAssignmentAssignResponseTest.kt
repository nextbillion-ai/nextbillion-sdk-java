// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization.driverassignment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DriverAssignmentAssignResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val driverAssignmentAssignResponse =
            DriverAssignmentAssignResponse.builder()
                .message("message")
                .result(
                    DriverAssignmentAssignResponse.Result.builder()
                        .addAlternateAssignment(
                            DriverAssignmentAssignResponse.Result.AlternateAssignment.builder()
                                .addAssignment(
                                    DriverAssignmentAssignResponse.Result.AlternateAssignment
                                        .Assignment
                                        .builder()
                                        .pickupEta(0L)
                                        .vehicleId("vehicle_id")
                                        .build()
                                )
                                .orderId("order_id")
                                .build()
                        )
                        .addAvailableVehicle("string")
                        .addTrip(
                            DriverAssignmentAssignResponse.Result.Trip.builder()
                                .tripId("trip_id")
                                .vehicle(
                                    DriverAssignmentAssignResponse.Result.Trip.Vehicle.builder()
                                        .id("id")
                                        .steps(
                                            DriverAssignmentAssignResponse.Result.Trip.Vehicle.Steps
                                                .builder()
                                                .distance(0L)
                                                .eta(0L)
                                                .location(
                                                    Location.builder()
                                                        .lat(-90.0)
                                                        .lon(-180.0)
                                                        .build()
                                                )
                                                .orderId("order_id")
                                                .type(
                                                    DriverAssignmentAssignResponse.Result.Trip
                                                        .Vehicle
                                                        .Steps
                                                        .Type
                                                        .PICKUP
                                                )
                                                .build()
                                        )
                                        .vehicleCurrentLocation(
                                            Location.builder().lat(-90.0).lon(-180.0).build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addUnassignedOrder(
                            DriverAssignmentAssignResponse.Result.UnassignedOrder.builder()
                                .orderId("order_id")
                                .unassignedReason("unassigned_reason")
                                .build()
                        )
                        .build()
                )
                .status(0L)
                .build()

        assertThat(driverAssignmentAssignResponse.message()).contains("message")
        assertThat(driverAssignmentAssignResponse.result())
            .contains(
                DriverAssignmentAssignResponse.Result.builder()
                    .addAlternateAssignment(
                        DriverAssignmentAssignResponse.Result.AlternateAssignment.builder()
                            .addAssignment(
                                DriverAssignmentAssignResponse.Result.AlternateAssignment.Assignment
                                    .builder()
                                    .pickupEta(0L)
                                    .vehicleId("vehicle_id")
                                    .build()
                            )
                            .orderId("order_id")
                            .build()
                    )
                    .addAvailableVehicle("string")
                    .addTrip(
                        DriverAssignmentAssignResponse.Result.Trip.builder()
                            .tripId("trip_id")
                            .vehicle(
                                DriverAssignmentAssignResponse.Result.Trip.Vehicle.builder()
                                    .id("id")
                                    .steps(
                                        DriverAssignmentAssignResponse.Result.Trip.Vehicle.Steps
                                            .builder()
                                            .distance(0L)
                                            .eta(0L)
                                            .location(
                                                Location.builder().lat(-90.0).lon(-180.0).build()
                                            )
                                            .orderId("order_id")
                                            .type(
                                                DriverAssignmentAssignResponse.Result.Trip.Vehicle
                                                    .Steps
                                                    .Type
                                                    .PICKUP
                                            )
                                            .build()
                                    )
                                    .vehicleCurrentLocation(
                                        Location.builder().lat(-90.0).lon(-180.0).build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .addUnassignedOrder(
                        DriverAssignmentAssignResponse.Result.UnassignedOrder.builder()
                            .orderId("order_id")
                            .unassignedReason("unassigned_reason")
                            .build()
                    )
                    .build()
            )
        assertThat(driverAssignmentAssignResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val driverAssignmentAssignResponse =
            DriverAssignmentAssignResponse.builder()
                .message("message")
                .result(
                    DriverAssignmentAssignResponse.Result.builder()
                        .addAlternateAssignment(
                            DriverAssignmentAssignResponse.Result.AlternateAssignment.builder()
                                .addAssignment(
                                    DriverAssignmentAssignResponse.Result.AlternateAssignment
                                        .Assignment
                                        .builder()
                                        .pickupEta(0L)
                                        .vehicleId("vehicle_id")
                                        .build()
                                )
                                .orderId("order_id")
                                .build()
                        )
                        .addAvailableVehicle("string")
                        .addTrip(
                            DriverAssignmentAssignResponse.Result.Trip.builder()
                                .tripId("trip_id")
                                .vehicle(
                                    DriverAssignmentAssignResponse.Result.Trip.Vehicle.builder()
                                        .id("id")
                                        .steps(
                                            DriverAssignmentAssignResponse.Result.Trip.Vehicle.Steps
                                                .builder()
                                                .distance(0L)
                                                .eta(0L)
                                                .location(
                                                    Location.builder()
                                                        .lat(-90.0)
                                                        .lon(-180.0)
                                                        .build()
                                                )
                                                .orderId("order_id")
                                                .type(
                                                    DriverAssignmentAssignResponse.Result.Trip
                                                        .Vehicle
                                                        .Steps
                                                        .Type
                                                        .PICKUP
                                                )
                                                .build()
                                        )
                                        .vehicleCurrentLocation(
                                            Location.builder().lat(-90.0).lon(-180.0).build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addUnassignedOrder(
                            DriverAssignmentAssignResponse.Result.UnassignedOrder.builder()
                                .orderId("order_id")
                                .unassignedReason("unassigned_reason")
                                .build()
                        )
                        .build()
                )
                .status(0L)
                .build()

        val roundtrippedDriverAssignmentAssignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(driverAssignmentAssignResponse),
                jacksonTypeRef<DriverAssignmentAssignResponse>(),
            )

        assertThat(roundtrippedDriverAssignmentAssignResponse)
            .isEqualTo(driverAssignmentAssignResponse)
    }
}
