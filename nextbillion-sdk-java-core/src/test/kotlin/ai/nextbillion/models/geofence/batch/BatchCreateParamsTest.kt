// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.batch

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.models.geofence.GeofenceEntityCreate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .key("key=API_KEY")
            .addGeofence(
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

    @Test
    fun queryParams() {
        val params =
            BatchCreateParams.builder()
                .key("key=API_KEY")
                .addGeofence(
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

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BatchCreateParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .key("key=API_KEY")
                .addGeofence(
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

        assertThat(body.geofences().getOrNull())
            .containsExactly(
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchCreateParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
