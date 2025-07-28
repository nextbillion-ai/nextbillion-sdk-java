// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset.location

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import com.nextbillion_sdk.api.models.skynet.monitor.Pagination
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val locationListResponse =
            LocationListResponse.builder()
                .data(
                    LocationListResponse.Data.builder()
                        .distance(0.0)
                        .geojson(
                            LocationListResponse.Data.Geojson.builder()
                                .geometry(
                                    LocationListResponse.Data.Geojson.Geometry.builder()
                                        .addCoordinate(0.0)
                                        .type("type")
                                        .build()
                                )
                                .type("type")
                                .build()
                        )
                        .addGeometry("string")
                        .addList(
                            TrackLocation.builder()
                                .accuracy(0.0)
                                .altitude(0.0)
                                .batteryLevel(0L)
                                .bearing(0.0)
                                .location(
                                    TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                )
                                .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                                .speed(0.0)
                                .timestamp(0L)
                                .trackingMode("tracking_mode")
                                .build()
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .addSnappedPoint(
                            LocationListResponse.Data.SnappedPoint.builder()
                                .bearing("bearing")
                                .distance(0.0)
                                .location(
                                    LocationListResponse.Data.SnappedPoint.Location.builder()
                                        .lat(0.0)
                                        .lon(0.0)
                                        .build()
                                )
                                .name("name")
                                .originalIndex("originalIndex")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(locationListResponse.data())
            .contains(
                LocationListResponse.Data.builder()
                    .distance(0.0)
                    .geojson(
                        LocationListResponse.Data.Geojson.builder()
                            .geometry(
                                LocationListResponse.Data.Geojson.Geometry.builder()
                                    .addCoordinate(0.0)
                                    .type("type")
                                    .build()
                            )
                            .type("type")
                            .build()
                    )
                    .addGeometry("string")
                    .addList(
                        TrackLocation.builder()
                            .accuracy(0.0)
                            .altitude(0.0)
                            .batteryLevel(0L)
                            .bearing(0.0)
                            .location(TrackLocation.Location.builder().lat(0.0).lon(0.0).build())
                            .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                            .speed(0.0)
                            .timestamp(0L)
                            .trackingMode("tracking_mode")
                            .build()
                    )
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .addSnappedPoint(
                        LocationListResponse.Data.SnappedPoint.builder()
                            .bearing("bearing")
                            .distance(0.0)
                            .location(
                                LocationListResponse.Data.SnappedPoint.Location.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
                            )
                            .name("name")
                            .originalIndex("originalIndex")
                            .build()
                    )
                    .build()
            )
        assertThat(locationListResponse.message()).contains("message")
        assertThat(locationListResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locationListResponse =
            LocationListResponse.builder()
                .data(
                    LocationListResponse.Data.builder()
                        .distance(0.0)
                        .geojson(
                            LocationListResponse.Data.Geojson.builder()
                                .geometry(
                                    LocationListResponse.Data.Geojson.Geometry.builder()
                                        .addCoordinate(0.0)
                                        .type("type")
                                        .build()
                                )
                                .type("type")
                                .build()
                        )
                        .addGeometry("string")
                        .addList(
                            TrackLocation.builder()
                                .accuracy(0.0)
                                .altitude(0.0)
                                .batteryLevel(0L)
                                .bearing(0.0)
                                .location(
                                    TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                )
                                .metaData(JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}"))
                                .speed(0.0)
                                .timestamp(0L)
                                .trackingMode("tracking_mode")
                                .build()
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .addSnappedPoint(
                            LocationListResponse.Data.SnappedPoint.builder()
                                .bearing("bearing")
                                .distance(0.0)
                                .location(
                                    LocationListResponse.Data.SnappedPoint.Location.builder()
                                        .lat(0.0)
                                        .lon(0.0)
                                        .build()
                                )
                                .name("name")
                                .originalIndex("originalIndex")
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedLocationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locationListResponse),
                jacksonTypeRef<LocationListResponse>(),
            )

        assertThat(roundtrippedLocationListResponse).isEqualTo(locationListResponse)
    }
}
