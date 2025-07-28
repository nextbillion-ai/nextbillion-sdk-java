// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geofence

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import com.nextbillion_sdk.api.models.geofence.console.PolygonGeojson
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val geofenceRetrieveResponse =
            GeofenceRetrieveResponse.builder()
                .data(
                    GeofenceRetrieveResponse.Data.builder()
                        .geofence(
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

        assertThat(geofenceRetrieveResponse.data())
            .contains(
                GeofenceRetrieveResponse.Data.builder()
                    .geofence(
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
        assertThat(geofenceRetrieveResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofenceRetrieveResponse =
            GeofenceRetrieveResponse.builder()
                .data(
                    GeofenceRetrieveResponse.Data.builder()
                        .geofence(
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

        val roundtrippedGeofenceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofenceRetrieveResponse),
                jacksonTypeRef<GeofenceRetrieveResponse>(),
            )

        assertThat(roundtrippedGeofenceRetrieveResponse).isEqualTo(geofenceRetrieveResponse)
    }
}
