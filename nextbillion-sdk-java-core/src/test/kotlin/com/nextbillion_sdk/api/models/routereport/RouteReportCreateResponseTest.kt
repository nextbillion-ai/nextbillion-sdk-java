// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.routereport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteReportCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routeReportCreateResponse =
            RouteReportCreateResponse.builder()
                .addGeometry("string")
                .addMileage(
                    RouteReportCreateResponse.Mileage.builder()
                        .segment(
                            RouteReportCreateResponse.Mileage.Segment.builder()
                                .addCountry(
                                    RouteReportCreateResponse.Mileage.Segment.Country.builder()
                                        .distance(0.0)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .addState(
                                    RouteReportCreateResponse.Mileage.Segment.State.builder()
                                        .distance(0.0)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .summary(
                            RouteReportCreateResponse.Mileage.Summary.builder()
                                .country(JsonValue.from(mapOf<String, Any>()))
                                .state(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .msg("msg")
                .addRoadSummary(
                    RouteReportCreateResponse.RoadSummary.builder()
                        .segment(
                            RouteReportCreateResponse.RoadSummary.Segment.builder()
                                .addMaxSpeed(
                                    RouteReportCreateResponse.RoadSummary.Segment.MaxSpeed.builder()
                                        .distance(0L)
                                        .length(0L)
                                        .offset(0L)
                                        .value(0L)
                                        .build()
                                )
                                .addRoadClass(
                                    RouteReportCreateResponse.RoadSummary.Segment.RoadClass
                                        .builder()
                                        .distance(0L)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .summary(
                            RouteReportCreateResponse.RoadSummary.Summary.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .hasBridge(true)
                                .hasRoundabout(true)
                                .hasToll(true)
                                .hasTunnel(true)
                                .roadClass(JsonValue.from(mapOf<String, Any>()))
                                .tollDistance(0.0)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(routeReportCreateResponse.geometry().getOrNull()).containsExactly("string")
        assertThat(routeReportCreateResponse.mileage().getOrNull())
            .containsExactly(
                RouteReportCreateResponse.Mileage.builder()
                    .segment(
                        RouteReportCreateResponse.Mileage.Segment.builder()
                            .addCountry(
                                RouteReportCreateResponse.Mileage.Segment.Country.builder()
                                    .distance(0.0)
                                    .length(0L)
                                    .offset(0L)
                                    .value("value")
                                    .build()
                            )
                            .addState(
                                RouteReportCreateResponse.Mileage.Segment.State.builder()
                                    .distance(0.0)
                                    .length(0L)
                                    .offset(0L)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .summary(
                        RouteReportCreateResponse.Mileage.Summary.builder()
                            .country(JsonValue.from(mapOf<String, Any>()))
                            .state(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
        assertThat(routeReportCreateResponse.msg()).contains("msg")
        assertThat(routeReportCreateResponse.roadSummary().getOrNull())
            .containsExactly(
                RouteReportCreateResponse.RoadSummary.builder()
                    .segment(
                        RouteReportCreateResponse.RoadSummary.Segment.builder()
                            .addMaxSpeed(
                                RouteReportCreateResponse.RoadSummary.Segment.MaxSpeed.builder()
                                    .distance(0L)
                                    .length(0L)
                                    .offset(0L)
                                    .value(0L)
                                    .build()
                            )
                            .addRoadClass(
                                RouteReportCreateResponse.RoadSummary.Segment.RoadClass.builder()
                                    .distance(0L)
                                    .length(0L)
                                    .offset(0L)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .summary(
                        RouteReportCreateResponse.RoadSummary.Summary.builder()
                            .distance(0.0)
                            .duration(0.0)
                            .hasBridge(true)
                            .hasRoundabout(true)
                            .hasToll(true)
                            .hasTunnel(true)
                            .roadClass(JsonValue.from(mapOf<String, Any>()))
                            .tollDistance(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(routeReportCreateResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeReportCreateResponse =
            RouteReportCreateResponse.builder()
                .addGeometry("string")
                .addMileage(
                    RouteReportCreateResponse.Mileage.builder()
                        .segment(
                            RouteReportCreateResponse.Mileage.Segment.builder()
                                .addCountry(
                                    RouteReportCreateResponse.Mileage.Segment.Country.builder()
                                        .distance(0.0)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .addState(
                                    RouteReportCreateResponse.Mileage.Segment.State.builder()
                                        .distance(0.0)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .summary(
                            RouteReportCreateResponse.Mileage.Summary.builder()
                                .country(JsonValue.from(mapOf<String, Any>()))
                                .state(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .msg("msg")
                .addRoadSummary(
                    RouteReportCreateResponse.RoadSummary.builder()
                        .segment(
                            RouteReportCreateResponse.RoadSummary.Segment.builder()
                                .addMaxSpeed(
                                    RouteReportCreateResponse.RoadSummary.Segment.MaxSpeed.builder()
                                        .distance(0L)
                                        .length(0L)
                                        .offset(0L)
                                        .value(0L)
                                        .build()
                                )
                                .addRoadClass(
                                    RouteReportCreateResponse.RoadSummary.Segment.RoadClass
                                        .builder()
                                        .distance(0L)
                                        .length(0L)
                                        .offset(0L)
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .summary(
                            RouteReportCreateResponse.RoadSummary.Summary.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .hasBridge(true)
                                .hasRoundabout(true)
                                .hasToll(true)
                                .hasTunnel(true)
                                .roadClass(JsonValue.from(mapOf<String, Any>()))
                                .tollDistance(0.0)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedRouteReportCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeReportCreateResponse),
                jacksonTypeRef<RouteReportCreateResponse>(),
            )

        assertThat(roundtrippedRouteReportCreateResponse).isEqualTo(routeReportCreateResponse)
    }
}
