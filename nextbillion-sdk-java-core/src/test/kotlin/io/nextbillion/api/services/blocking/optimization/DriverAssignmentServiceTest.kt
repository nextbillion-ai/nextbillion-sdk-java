// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.optimization

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.models.optimization.driverassignment.DriverAssignmentAssignParams
import io.nextbillion.api.models.optimization.driverassignment.Location
import io.nextbillion.api.models.optimization.driverassignment.Vehicle
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DriverAssignmentServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun assign() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val driverAssignmentService = client.optimization().driverAssignment()

        val response =
            driverAssignmentService.assign(
                DriverAssignmentAssignParams.builder()
                    .key("key=API_KEY")
                    .filter(
                        DriverAssignmentAssignParams.Filter.builder()
                            .drivingDistance(0.0)
                            .pickupEta(0L)
                            .radius(0.0)
                            .build()
                    )
                    .addOrder(
                        DriverAssignmentAssignParams.Order.builder()
                            .id("id")
                            .pickup(
                                DriverAssignmentAssignParams.Order.Pickup.builder()
                                    .lat(0.0)
                                    .lng(0.0)
                                    .build()
                            )
                            .attributes(JsonValue.from(mapOf<String, Any>()))
                            .addDropoff(
                                DriverAssignmentAssignParams.Order.Dropoff.builder()
                                    .lat(0.0)
                                    .lng(0.0)
                                    .build()
                            )
                            .priority(0L)
                            .serviceTime(0L)
                            .vehiclePreferences(
                                DriverAssignmentAssignParams.Order.VehiclePreferences.builder()
                                    .addExcludeAllOfAttribute(
                                        DriverAssignmentAssignParams.Order.VehiclePreferences
                                            .ExcludeAllOfAttribute
                                            .builder()
                                            .attribute("\"attribute\": \"driver_rating\"")
                                            .operator("\"operator\":\"<\"")
                                            .value("\"value\": \"4\"")
                                            .build()
                                    )
                                    .addRequiredAllOfAttribute(
                                        DriverAssignmentAssignParams.Order.VehiclePreferences
                                            .RequiredAllOfAttribute
                                            .builder()
                                            .attribute("\"attribute\": \"driver_rating\"")
                                            .operator("\"operator\":\"==\"")
                                            .value("\"value\": \"4\"")
                                            .build()
                                    )
                                    .addRequiredAnyOfAttribute(
                                        DriverAssignmentAssignParams.Order.VehiclePreferences
                                            .RequiredAnyOfAttribute
                                            .builder()
                                            .attribute("\"attribute\": \"driver_rating\"")
                                            .operator("\"operator\":\">\"")
                                            .value("\"value\": \"4\"")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .addVehicle(
                        Vehicle.builder()
                            .id("id")
                            .location(Vehicle.Location.builder().lat(0.0).lng(0.0).build())
                            .attributes(
                                JsonValue.from(
                                    "\"attributes\":{\n    \"driver_rating\": \"4.0\",\n    \"trip_types\": \"premium\"\n  }"
                                )
                            )
                            .priority(0L)
                            .addRemainingWaypoint(Location.builder().lat(-90.0).lon(-180.0).build())
                            .build()
                    )
                    .options(
                        DriverAssignmentAssignParams.Options.builder()
                            .alternateAssignments(0L)
                            .dropoffDetails(true)
                            .addOrderAttributePriorityMapping(
                                DriverAssignmentAssignParams.Options.OrderAttributePriorityMapping
                                    .builder()
                                    .attribute("\"attribute\": \"driver_rating\"")
                                    .operator("\"operator\":\"==\"")
                                    .priority("priority")
                                    .value("\"value\": \"4\"")
                                    .build()
                            )
                            .travelCost(DriverAssignmentAssignParams.Options.TravelCost.DRIVING_ETA)
                            .addVehicleAttributePriorityMapping(
                                DriverAssignmentAssignParams.Options.VehicleAttributePriorityMapping
                                    .builder()
                                    .attribute("\"attribute\": \"driver_rating\"")
                                    .operator("\"operator\":\"==\"")
                                    .priority("priority")
                                    .value("\"value\": \"4\"")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
