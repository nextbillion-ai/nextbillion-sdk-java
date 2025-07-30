// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.geofence.console.PolygonGeojson
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeofenceContainsResponseTest {

    @Test
    fun create() {
        val geofenceContainsResponse =
            GeofenceContainsResponse.builder()
                .data(
                    GeofenceContainsResponse.Data.builder()
                        .addResultList(
                            GeofenceContainsResponse.Data.ResultList.builder()
                                .geofenceDetail(
                                    Geofence.builder()
                                        .id("id")
                                        .circleCenter(
                                            Geofence.CircleCenter.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
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
                                .geofenceId("geofence_id")
                                .addResult(
                                    GeofenceContainsResponse.Data.ResultList.Result.builder()
                                        .contain(true)
                                        .locationIndex(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(geofenceContainsResponse.data())
            .contains(
                GeofenceContainsResponse.Data.builder()
                    .addResultList(
                        GeofenceContainsResponse.Data.ResultList.builder()
                            .geofenceDetail(
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
                            .geofenceId("geofence_id")
                            .addResult(
                                GeofenceContainsResponse.Data.ResultList.Result.builder()
                                    .contain(true)
                                    .locationIndex(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(geofenceContainsResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofenceContainsResponse =
            GeofenceContainsResponse.builder()
                .data(
                    GeofenceContainsResponse.Data.builder()
                        .addResultList(
                            GeofenceContainsResponse.Data.ResultList.builder()
                                .geofenceDetail(
                                    Geofence.builder()
                                        .id("id")
                                        .circleCenter(
                                            Geofence.CircleCenter.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
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
                                .geofenceId("geofence_id")
                                .addResult(
                                    GeofenceContainsResponse.Data.ResultList.Result.builder()
                                        .contain(true)
                                        .locationIndex(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedGeofenceContainsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofenceContainsResponse),
                jacksonTypeRef<GeofenceContainsResponse>(),
            )

        assertThat(roundtrippedGeofenceContainsResponse).isEqualTo(geofenceContainsResponse)
    }
}
