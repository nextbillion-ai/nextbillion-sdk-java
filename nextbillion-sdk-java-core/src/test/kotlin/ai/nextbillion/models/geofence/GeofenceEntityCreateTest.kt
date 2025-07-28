// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceEntityCreateTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val geofenceEntityCreate =
            GeofenceEntityCreate.builder()
                .type(GeofenceEntityCreate.Type.CIRCLE)
                .circle(
                    GeofenceEntityCreate.Circle.builder()
                        .center(
                            GeofenceEntityCreate.Circle.Center.builder().lat(0.0).lon(0.0).build()
                        )
                        .radius(0.0)
                        .build()
                )
                .customId("custom_id")
                .isochrone(
                    GeofenceEntityCreate.Isochrone.builder()
                        .coordinates("\"coordinates\": \"13.25805884,77.91083661\"")
                        .contoursMeter(0L)
                        .contoursMinute(0L)
                        .denoise(0.0)
                        .departureTime(0L)
                        .mode(GeofenceEntityCreate.Isochrone.Mode.CAR)
                        .build()
                )
                .metaData(
                    JsonValue.from("{\n  \"country\": \"USA\",\n  \"state\": \"California\"\n}")
                )
                .name("\"name\":\"Los Angeles Downtown\"")
                .polygon(
                    GeofenceEntityCreate.Polygon.builder()
                        .geojson(
                            GeofenceEntityCreate.Polygon.Geojson.builder()
                                .addCoordinate(listOf(0.0))
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addTag("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
                .build()

        assertThat(geofenceEntityCreate.type()).isEqualTo(GeofenceEntityCreate.Type.CIRCLE)
        assertThat(geofenceEntityCreate.circle())
            .contains(
                GeofenceEntityCreate.Circle.builder()
                    .center(GeofenceEntityCreate.Circle.Center.builder().lat(0.0).lon(0.0).build())
                    .radius(0.0)
                    .build()
            )
        assertThat(geofenceEntityCreate.customId()).contains("custom_id")
        assertThat(geofenceEntityCreate.isochrone())
            .contains(
                GeofenceEntityCreate.Isochrone.builder()
                    .coordinates("\"coordinates\": \"13.25805884,77.91083661\"")
                    .contoursMeter(0L)
                    .contoursMinute(0L)
                    .denoise(0.0)
                    .departureTime(0L)
                    .mode(GeofenceEntityCreate.Isochrone.Mode.CAR)
                    .build()
            )
        assertThat(geofenceEntityCreate._metaData())
            .isEqualTo(JsonValue.from("{\n  \"country\": \"USA\",\n  \"state\": \"California\"\n}"))
        assertThat(geofenceEntityCreate.name()).contains("\"name\":\"Los Angeles Downtown\"")
        assertThat(geofenceEntityCreate.polygon())
            .contains(
                GeofenceEntityCreate.Polygon.builder()
                    .geojson(
                        GeofenceEntityCreate.Polygon.Geojson.builder()
                            .addCoordinate(listOf(0.0))
                            .type("type")
                            .build()
                    )
                    .build()
            )
        assertThat(geofenceEntityCreate.tags().getOrNull())
            .containsExactly("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geofenceEntityCreate =
            GeofenceEntityCreate.builder()
                .type(GeofenceEntityCreate.Type.CIRCLE)
                .circle(
                    GeofenceEntityCreate.Circle.builder()
                        .center(
                            GeofenceEntityCreate.Circle.Center.builder().lat(0.0).lon(0.0).build()
                        )
                        .radius(0.0)
                        .build()
                )
                .customId("custom_id")
                .isochrone(
                    GeofenceEntityCreate.Isochrone.builder()
                        .coordinates("\"coordinates\": \"13.25805884,77.91083661\"")
                        .contoursMeter(0L)
                        .contoursMinute(0L)
                        .denoise(0.0)
                        .departureTime(0L)
                        .mode(GeofenceEntityCreate.Isochrone.Mode.CAR)
                        .build()
                )
                .metaData(
                    JsonValue.from("{\n  \"country\": \"USA\",\n  \"state\": \"California\"\n}")
                )
                .name("\"name\":\"Los Angeles Downtown\"")
                .polygon(
                    GeofenceEntityCreate.Polygon.builder()
                        .geojson(
                            GeofenceEntityCreate.Polygon.Geojson.builder()
                                .addCoordinate(listOf(0.0))
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addTag("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
                .build()

        val roundtrippedGeofenceEntityCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geofenceEntityCreate),
                jacksonTypeRef<GeofenceEntityCreate>(),
            )

        assertThat(roundtrippedGeofenceEntityCreate).isEqualTo(geofenceEntityCreate)
    }
}
