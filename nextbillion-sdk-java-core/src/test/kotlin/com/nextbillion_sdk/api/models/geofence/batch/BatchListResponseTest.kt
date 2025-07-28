// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geofence.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import com.nextbillion_sdk.api.models.geofence.Geofence
import com.nextbillion_sdk.api.models.geofence.console.PolygonGeojson
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val batchListResponse =
            BatchListResponse.builder()
                .data(
                    BatchListResponse.Data.builder()
                        .addList(
                            Geofence.builder()
                                .id("id")
                                .circleCenter(
                                    Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build()
                                )
                                .circleRadius(0.0)
                                .createdAt(0L)
                                .geojson(
                                    PolygonGeojson.builder()
                                        .addCoordinate(listOf(0.0))
                                        .type("type")
                                        .build()
                                )
                                .icContoursMeter(0L)
                                .icContoursMinute(0L)
                                .icCoordinates("\"ic_coordinates\":13.258058,77.910836")
                                .icDenoise(0.0)
                                .icDepartureTime(0L)
                                .icMode(0.0)
                                .metaData(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .addTag("string")
                                .type(Geofence.Type.CIRCLE)
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(batchListResponse.data())
            .isEqualTo(
                BatchListResponse.Data.builder()
                    .addList(
                        Geofence.builder()
                            .id("id")
                            .circleCenter(Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build())
                            .circleRadius(0.0)
                            .createdAt(0L)
                            .geojson(
                                PolygonGeojson.builder()
                                    .addCoordinate(listOf(0.0))
                                    .type("type")
                                    .build()
                            )
                            .icContoursMeter(0L)
                            .icContoursMinute(0L)
                            .icCoordinates("\"ic_coordinates\":13.258058,77.910836")
                            .icDenoise(0.0)
                            .icDepartureTime(0L)
                            .icMode(0.0)
                            .metaData(JsonValue.from(mapOf<String, Any>()))
                            .name("name")
                            .addTag("string")
                            .type(Geofence.Type.CIRCLE)
                            .updatedAt(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(batchListResponse.status()).isEqualTo("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchListResponse =
            BatchListResponse.builder()
                .data(
                    BatchListResponse.Data.builder()
                        .addList(
                            Geofence.builder()
                                .id("id")
                                .circleCenter(
                                    Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build()
                                )
                                .circleRadius(0.0)
                                .createdAt(0L)
                                .geojson(
                                    PolygonGeojson.builder()
                                        .addCoordinate(listOf(0.0))
                                        .type("type")
                                        .build()
                                )
                                .icContoursMeter(0L)
                                .icContoursMinute(0L)
                                .icCoordinates("\"ic_coordinates\":13.258058,77.910836")
                                .icDenoise(0.0)
                                .icDepartureTime(0L)
                                .icMode(0.0)
                                .metaData(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .addTag("string")
                                .type(Geofence.Type.CIRCLE)
                                .updatedAt(0L)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedBatchListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchListResponse),
                jacksonTypeRef<BatchListResponse>(),
            )

        assertThat(roundtrippedBatchListResponse).isEqualTo(batchListResponse)
    }
}
