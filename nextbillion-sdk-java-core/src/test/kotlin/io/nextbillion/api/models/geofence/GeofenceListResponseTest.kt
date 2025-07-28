// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geofence

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.jsonMapper
import io.nextbillion.api.models.geofence.console.PolygonGeojson
import io.nextbillion.api.models.skynet.monitor.Pagination
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val geofenceListResponse =
            GeofenceListResponse.builder()
                .data(
                    GeofenceListResponse.Data.builder()
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
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(geofenceListResponse.data())
            .contains(
                GeofenceListResponse.Data.builder()
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
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .build()
            )
        assertThat(geofenceListResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofenceListResponse =
            GeofenceListResponse.builder()
                .data(
                    GeofenceListResponse.Data.builder()
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
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedGeofenceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofenceListResponse),
                jacksonTypeRef<GeofenceListResponse>(),
            )

        assertThat(roundtrippedGeofenceListResponse).isEqualTo(geofenceListResponse)
    }
}
