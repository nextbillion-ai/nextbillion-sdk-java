// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geofence

import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        GeofenceCreateParams.builder()
            .key("key=API_KEY")
            .geofenceEntityCreate(
                GeofenceEntityCreate.builder()
                    .type(GeofenceEntityCreate.Type.CIRCLE)
                    .circle(
                        GeofenceEntityCreate.Circle.builder()
                            .center(
                                GeofenceEntityCreate.Circle.Center.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
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
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            GeofenceCreateParams.builder()
                .key("key=API_KEY")
                .geofenceEntityCreate(
                    GeofenceEntityCreate.builder()
                        .type(GeofenceEntityCreate.Type.CIRCLE)
                        .circle(
                            GeofenceEntityCreate.Circle.builder()
                                .center(
                                    GeofenceEntityCreate.Circle.Center.builder()
                                        .lat(0.0)
                                        .lon(0.0)
                                        .build()
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
                            JsonValue.from(
                                "{\n  \"country\": \"USA\",\n  \"state\": \"California\"\n}"
                            )
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
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GeofenceCreateParams.builder()
                .key("key=API_KEY")
                .geofenceEntityCreate(
                    GeofenceEntityCreate.builder().type(GeofenceEntityCreate.Type.CIRCLE).build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            GeofenceCreateParams.builder()
                .key("key=API_KEY")
                .geofenceEntityCreate(
                    GeofenceEntityCreate.builder()
                        .type(GeofenceEntityCreate.Type.CIRCLE)
                        .circle(
                            GeofenceEntityCreate.Circle.builder()
                                .center(
                                    GeofenceEntityCreate.Circle.Center.builder()
                                        .lat(0.0)
                                        .lon(0.0)
                                        .build()
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
                            JsonValue.from(
                                "{\n  \"country\": \"USA\",\n  \"state\": \"California\"\n}"
                            )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                GeofenceEntityCreate.builder()
                    .type(GeofenceEntityCreate.Type.CIRCLE)
                    .circle(
                        GeofenceEntityCreate.Circle.builder()
                            .center(
                                GeofenceEntityCreate.Circle.Center.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
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
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GeofenceCreateParams.builder()
                .key("key=API_KEY")
                .geofenceEntityCreate(
                    GeofenceEntityCreate.builder().type(GeofenceEntityCreate.Type.CIRCLE).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                GeofenceEntityCreate.builder().type(GeofenceEntityCreate.Type.CIRCLE).build()
            )
    }
}
