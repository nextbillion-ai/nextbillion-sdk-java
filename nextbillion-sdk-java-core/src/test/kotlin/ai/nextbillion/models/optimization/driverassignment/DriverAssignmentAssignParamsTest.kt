// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.driverassignment

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DriverAssignmentAssignParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
                        DriverAssignmentAssignParams.Options.OrderAttributePriorityMapping.builder()
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DriverAssignmentAssignParams.builder()
                .key("key=API_KEY")
                .filter(DriverAssignmentAssignParams.Filter.builder().build())
                .addOrder(
                    DriverAssignmentAssignParams.Order.builder()
                        .id("id")
                        .pickup(DriverAssignmentAssignParams.Order.Pickup.builder().build())
                        .build()
                )
                .addVehicle(
                    Vehicle.builder().id("id").location(Vehicle.Location.builder().build()).build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.filter())
            .isEqualTo(
                DriverAssignmentAssignParams.Filter.builder()
                    .drivingDistance(0.0)
                    .pickupEta(0L)
                    .radius(0.0)
                    .build()
            )
        assertThat(body.orders())
            .containsExactly(
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
        assertThat(body.vehicles())
            .containsExactly(
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
        assertThat(body.options())
            .contains(
                DriverAssignmentAssignParams.Options.builder()
                    .alternateAssignments(0L)
                    .dropoffDetails(true)
                    .addOrderAttributePriorityMapping(
                        DriverAssignmentAssignParams.Options.OrderAttributePriorityMapping.builder()
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DriverAssignmentAssignParams.builder()
                .key("key=API_KEY")
                .filter(DriverAssignmentAssignParams.Filter.builder().build())
                .addOrder(
                    DriverAssignmentAssignParams.Order.builder()
                        .id("id")
                        .pickup(DriverAssignmentAssignParams.Order.Pickup.builder().build())
                        .build()
                )
                .addVehicle(
                    Vehicle.builder().id("id").location(Vehicle.Location.builder().build()).build()
                )
                .build()

        val body = params._body()

        assertThat(body.filter()).isEqualTo(DriverAssignmentAssignParams.Filter.builder().build())
        assertThat(body.orders())
            .containsExactly(
                DriverAssignmentAssignParams.Order.builder()
                    .id("id")
                    .pickup(DriverAssignmentAssignParams.Order.Pickup.builder().build())
                    .build()
            )
        assertThat(body.vehicles())
            .containsExactly(
                Vehicle.builder().id("id").location(Vehicle.Location.builder().build()).build()
            )
    }
}
