// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.optimization

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.optimization.driverassignment.DriverAssignmentAssignParams
import ai.nextbillion.models.optimization.driverassignment.Location
import ai.nextbillion.models.optimization.driverassignment.Vehicle
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DriverAssignmentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun assign() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val driverAssignmentServiceAsync = client.optimization().driverAssignment()

        val responseFuture =
            driverAssignmentServiceAsync.assign(
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
                            .location(Location.builder().lat(-90.0).lon(-180.0).build())
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

        val response = responseFuture.get()
        response.validate()
    }
}
