// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.geofence.console.PolygonGeojson
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeofenceTest {

    @Test
    fun create() {
        val geofence =
            Geofence.builder()
                .id("id")
                .circleCenter(Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build())
                .circleRadius(0.0)
                .createdAt(0L)
                .geojson(PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build())
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

        assertThat(geofence.id()).contains("id")
        assertThat(geofence.circleCenter())
            .contains(Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build())
        assertThat(geofence.circleRadius()).contains(0.0)
        assertThat(geofence.createdAt()).contains(0L)
        assertThat(geofence.geojson())
            .contains(PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build())
        assertThat(geofence.icContoursMeter()).contains(0L)
        assertThat(geofence.icContoursMinute()).contains(0L)
        assertThat(geofence.icCoordinates()).contains("\"ic_coordinates\":13.258058,77.910836")
        assertThat(geofence.icDenoise()).contains(0.0)
        assertThat(geofence.icDepartureTime()).contains(0L)
        assertThat(geofence.icMode()).contains(0.0)
        assertThat(geofence._metaData()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(geofence.name()).contains("name")
        assertThat(geofence.tags().getOrNull()).containsExactly("string")
        assertThat(geofence.type()).contains(Geofence.Type.CIRCLE)
        assertThat(geofence.updatedAt()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofence =
            Geofence.builder()
                .id("id")
                .circleCenter(Geofence.CircleCenter.builder().lat(0.0).lon(0.0).build())
                .circleRadius(0.0)
                .createdAt(0L)
                .geojson(PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build())
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

        val roundtrippedGeofence =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofence),
                jacksonTypeRef<Geofence>(),
            )

        assertThat(roundtrippedGeofence).isEqualTo(geofence)
    }
}
