// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.driverassignment

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VehicleTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val vehicle =
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

        assertThat(vehicle.id()).isEqualTo("id")
        assertThat(vehicle.location())
            .isEqualTo(Vehicle.Location.builder().lat(0.0).lng(0.0).build())
        assertThat(vehicle._attributes())
            .isEqualTo(
                JsonValue.from(
                    "\"attributes\":{\n    \"driver_rating\": \"4.0\",\n    \"trip_types\": \"premium\"\n  }"
                )
            )
        assertThat(vehicle.priority()).contains(0L)
        assertThat(vehicle.remainingWaypoints().getOrNull())
            .containsExactly(Location.builder().lat(-90.0).lon(-180.0).build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vehicle =
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

        val roundtrippedVehicle =
            jsonMapper.readValue(jsonMapper.writeValueAsString(vehicle), jacksonTypeRef<Vehicle>())

        assertThat(roundtrippedVehicle).isEqualTo(vehicle)
    }
}
