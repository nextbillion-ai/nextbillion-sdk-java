// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.optimization

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptimizationComputeResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val optimizationComputeResponse =
            OptimizationComputeResponse.builder()
                .code("code")
                .location(
                    OptimizationComputeResponse.Location.builder()
                        .latitude(0.0)
                        .longitude(0.0)
                        .build()
                )
                .addTrip(
                    OptimizationComputeResponse.Trip.builder()
                        .distance(0.0)
                        .duration(0.0)
                        .geojson(
                            OptimizationComputeResponse.Trip.Geojson.builder()
                                .geometry("geometry")
                                .properties("properties")
                                .type(OptimizationComputeResponse.Trip.Geojson.Type.POINT)
                                .build()
                        )
                        .geometry("geometry")
                        .addLeg(
                            OptimizationComputeResponse.Trip.Leg.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .addStep(
                                    OptimizationComputeResponse.Trip.Leg.Step.builder()
                                        .distance(0.0)
                                        .duration(0.0)
                                        .geojson(
                                            OptimizationComputeResponse.Trip.Leg.Step.Geojson
                                                .builder()
                                                .geometry("geometry")
                                                .properties("properties")
                                                .type(
                                                    OptimizationComputeResponse.Trip.Leg.Step
                                                        .Geojson
                                                        .Type
                                                        .POINT
                                                )
                                                .build()
                                        )
                                        .geometry("geometry")
                                        .build()
                                )
                                .summary("summary")
                                .build()
                        )
                        .build()
                )
                .addWaypoint(
                    OptimizationComputeResponse.Waypoint.builder()
                        .location(
                            OptimizationComputeResponse.Waypoint.Location.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .name("name")
                        .tripsIndex(0L)
                        .waypointIndex(0L)
                        .build()
                )
                .build()

        assertThat(optimizationComputeResponse.code()).contains("code")
        assertThat(optimizationComputeResponse.location())
            .contains(
                OptimizationComputeResponse.Location.builder().latitude(0.0).longitude(0.0).build()
            )
        assertThat(optimizationComputeResponse.trips().getOrNull())
            .containsExactly(
                OptimizationComputeResponse.Trip.builder()
                    .distance(0.0)
                    .duration(0.0)
                    .geojson(
                        OptimizationComputeResponse.Trip.Geojson.builder()
                            .geometry("geometry")
                            .properties("properties")
                            .type(OptimizationComputeResponse.Trip.Geojson.Type.POINT)
                            .build()
                    )
                    .geometry("geometry")
                    .addLeg(
                        OptimizationComputeResponse.Trip.Leg.builder()
                            .distance(0.0)
                            .duration(0.0)
                            .addStep(
                                OptimizationComputeResponse.Trip.Leg.Step.builder()
                                    .distance(0.0)
                                    .duration(0.0)
                                    .geojson(
                                        OptimizationComputeResponse.Trip.Leg.Step.Geojson.builder()
                                            .geometry("geometry")
                                            .properties("properties")
                                            .type(
                                                OptimizationComputeResponse.Trip.Leg.Step.Geojson
                                                    .Type
                                                    .POINT
                                            )
                                            .build()
                                    )
                                    .geometry("geometry")
                                    .build()
                            )
                            .summary("summary")
                            .build()
                    )
                    .build()
            )
        assertThat(optimizationComputeResponse.waypoints().getOrNull())
            .containsExactly(
                OptimizationComputeResponse.Waypoint.builder()
                    .location(
                        OptimizationComputeResponse.Waypoint.Location.builder()
                            .latitude(0.0)
                            .longitude(0.0)
                            .build()
                    )
                    .name("name")
                    .tripsIndex(0L)
                    .waypointIndex(0L)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optimizationComputeResponse =
            OptimizationComputeResponse.builder()
                .code("code")
                .location(
                    OptimizationComputeResponse.Location.builder()
                        .latitude(0.0)
                        .longitude(0.0)
                        .build()
                )
                .addTrip(
                    OptimizationComputeResponse.Trip.builder()
                        .distance(0.0)
                        .duration(0.0)
                        .geojson(
                            OptimizationComputeResponse.Trip.Geojson.builder()
                                .geometry("geometry")
                                .properties("properties")
                                .type(OptimizationComputeResponse.Trip.Geojson.Type.POINT)
                                .build()
                        )
                        .geometry("geometry")
                        .addLeg(
                            OptimizationComputeResponse.Trip.Leg.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .addStep(
                                    OptimizationComputeResponse.Trip.Leg.Step.builder()
                                        .distance(0.0)
                                        .duration(0.0)
                                        .geojson(
                                            OptimizationComputeResponse.Trip.Leg.Step.Geojson
                                                .builder()
                                                .geometry("geometry")
                                                .properties("properties")
                                                .type(
                                                    OptimizationComputeResponse.Trip.Leg.Step
                                                        .Geojson
                                                        .Type
                                                        .POINT
                                                )
                                                .build()
                                        )
                                        .geometry("geometry")
                                        .build()
                                )
                                .summary("summary")
                                .build()
                        )
                        .build()
                )
                .addWaypoint(
                    OptimizationComputeResponse.Waypoint.builder()
                        .location(
                            OptimizationComputeResponse.Waypoint.Location.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .name("name")
                        .tripsIndex(0L)
                        .waypointIndex(0L)
                        .build()
                )
                .build()

        val roundtrippedOptimizationComputeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optimizationComputeResponse),
                jacksonTypeRef<OptimizationComputeResponse>(),
            )

        assertThat(roundtrippedOptimizationComputeResponse).isEqualTo(optimizationComputeResponse)
    }
}
