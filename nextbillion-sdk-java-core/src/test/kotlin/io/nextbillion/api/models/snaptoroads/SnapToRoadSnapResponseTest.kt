// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.snaptoroads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapToRoadSnapResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val snapToRoadSnapResponse =
            SnapToRoadSnapResponse.builder()
                .distance(0L)
                .geojson(
                    SnapToRoadSnapResponse.Geojson.builder()
                        .geometry(
                            SnapToRoadSnapResponse.Geojson.Geometry.builder()
                                .addCoordinate(0.0)
                                .type("type")
                                .build()
                        )
                        .properties("properties")
                        .type("type")
                        .build()
                )
                .addGeometry("string")
                .msg("msg")
                .roadInfo(
                    SnapToRoadSnapResponse.RoadInfo.builder()
                        .addMaxSpeed(
                            SnapToRoadSnapResponse.RoadInfo.MaxSpeed.builder()
                                .length(0L)
                                .offset(0L)
                                .value(0.0)
                                .build()
                        )
                        .build()
                )
                .addSnappedPoint(
                    SnapToRoadSnapResponse.SnappedPoint.builder()
                        .bearing(0.0)
                        .distance(0.0)
                        .location(
                            SnapToRoadSnapResponse.SnappedPoint.Location.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .name("name")
                        .originalIndex(0L)
                        .build()
                )
                .status("status")
                .build()

        assertThat(snapToRoadSnapResponse.distance()).contains(0L)
        assertThat(snapToRoadSnapResponse.geojson())
            .contains(
                SnapToRoadSnapResponse.Geojson.builder()
                    .geometry(
                        SnapToRoadSnapResponse.Geojson.Geometry.builder()
                            .addCoordinate(0.0)
                            .type("type")
                            .build()
                    )
                    .properties("properties")
                    .type("type")
                    .build()
            )
        assertThat(snapToRoadSnapResponse.geometry().getOrNull()).containsExactly("string")
        assertThat(snapToRoadSnapResponse.msg()).contains("msg")
        assertThat(snapToRoadSnapResponse.roadInfo())
            .contains(
                SnapToRoadSnapResponse.RoadInfo.builder()
                    .addMaxSpeed(
                        SnapToRoadSnapResponse.RoadInfo.MaxSpeed.builder()
                            .length(0L)
                            .offset(0L)
                            .value(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(snapToRoadSnapResponse.snappedPoints().getOrNull())
            .containsExactly(
                SnapToRoadSnapResponse.SnappedPoint.builder()
                    .bearing(0.0)
                    .distance(0.0)
                    .location(
                        SnapToRoadSnapResponse.SnappedPoint.Location.builder()
                            .latitude(0.0)
                            .longitude(0.0)
                            .build()
                    )
                    .name("name")
                    .originalIndex(0L)
                    .build()
            )
        assertThat(snapToRoadSnapResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapToRoadSnapResponse =
            SnapToRoadSnapResponse.builder()
                .distance(0L)
                .geojson(
                    SnapToRoadSnapResponse.Geojson.builder()
                        .geometry(
                            SnapToRoadSnapResponse.Geojson.Geometry.builder()
                                .addCoordinate(0.0)
                                .type("type")
                                .build()
                        )
                        .properties("properties")
                        .type("type")
                        .build()
                )
                .addGeometry("string")
                .msg("msg")
                .roadInfo(
                    SnapToRoadSnapResponse.RoadInfo.builder()
                        .addMaxSpeed(
                            SnapToRoadSnapResponse.RoadInfo.MaxSpeed.builder()
                                .length(0L)
                                .offset(0L)
                                .value(0.0)
                                .build()
                        )
                        .build()
                )
                .addSnappedPoint(
                    SnapToRoadSnapResponse.SnappedPoint.builder()
                        .bearing(0.0)
                        .distance(0.0)
                        .location(
                            SnapToRoadSnapResponse.SnappedPoint.Location.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .name("name")
                        .originalIndex(0L)
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedSnapToRoadSnapResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapToRoadSnapResponse),
                jacksonTypeRef<SnapToRoadSnapResponse>(),
            )

        assertThat(roundtrippedSnapToRoadSnapResponse).isEqualTo(snapToRoadSnapResponse)
    }
}
