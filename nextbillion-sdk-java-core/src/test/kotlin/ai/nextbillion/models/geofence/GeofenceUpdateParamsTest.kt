// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeofenceUpdateParamsTest {

    @Test
    fun create() {
        GeofenceUpdateParams.builder()
            .id("id")
            .key("key=API_KEY")
            .circle(
                GeofenceUpdateParams.Circle.builder()
                    .center(GeofenceUpdateParams.Circle.Center.builder().lat(0.0).lon(0.0).build())
                    .radius(0.0)
                    .build()
            )
            .isochrone(
                GeofenceUpdateParams.Isochrone.builder()
                    .contoursMeter(0L)
                    .contoursMinute(0L)
                    .coordinates("\"coordinates\": \"13.25805884388484,77.91083661048299\"")
                    .denoise(0.0)
                    .departureTime(0L)
                    .mode("“mode”:”car”")
                    .build()
            )
            .metaData(JsonValue.from(""))
            .name("\"name\":\"Los Angeles Downtown\"")
            .polygon(
                GeofenceUpdateParams.Polygon.builder()
                    .geojson(
                        GeofenceUpdateParams.Polygon.Geojson.builder()
                            .addGeometry(listOf(0.0))
                            .type("type")
                            .build()
                    )
                    .build()
            )
            .addTag("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
            .type(GeofenceUpdateParams.Type.CIRCLE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = GeofenceUpdateParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            GeofenceUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .circle(
                    GeofenceUpdateParams.Circle.builder()
                        .center(
                            GeofenceUpdateParams.Circle.Center.builder().lat(0.0).lon(0.0).build()
                        )
                        .radius(0.0)
                        .build()
                )
                .isochrone(
                    GeofenceUpdateParams.Isochrone.builder()
                        .contoursMeter(0L)
                        .contoursMinute(0L)
                        .coordinates("\"coordinates\": \"13.25805884388484,77.91083661048299\"")
                        .denoise(0.0)
                        .departureTime(0L)
                        .mode("“mode”:”car”")
                        .build()
                )
                .metaData(JsonValue.from(""))
                .name("\"name\":\"Los Angeles Downtown\"")
                .polygon(
                    GeofenceUpdateParams.Polygon.builder()
                        .geojson(
                            GeofenceUpdateParams.Polygon.Geojson.builder()
                                .addGeometry(listOf(0.0))
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addTag("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
                .type(GeofenceUpdateParams.Type.CIRCLE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GeofenceUpdateParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            GeofenceUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .circle(
                    GeofenceUpdateParams.Circle.builder()
                        .center(
                            GeofenceUpdateParams.Circle.Center.builder().lat(0.0).lon(0.0).build()
                        )
                        .radius(0.0)
                        .build()
                )
                .isochrone(
                    GeofenceUpdateParams.Isochrone.builder()
                        .contoursMeter(0L)
                        .contoursMinute(0L)
                        .coordinates("\"coordinates\": \"13.25805884388484,77.91083661048299\"")
                        .denoise(0.0)
                        .departureTime(0L)
                        .mode("“mode”:”car”")
                        .build()
                )
                .metaData(JsonValue.from(""))
                .name("\"name\":\"Los Angeles Downtown\"")
                .polygon(
                    GeofenceUpdateParams.Polygon.builder()
                        .geojson(
                            GeofenceUpdateParams.Polygon.Geojson.builder()
                                .addGeometry(listOf(0.0))
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addTag("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
                .type(GeofenceUpdateParams.Type.CIRCLE)
                .build()

        val body = params._body()

        assertThat(body.circle())
            .contains(
                GeofenceUpdateParams.Circle.builder()
                    .center(GeofenceUpdateParams.Circle.Center.builder().lat(0.0).lon(0.0).build())
                    .radius(0.0)
                    .build()
            )
        assertThat(body.isochrone())
            .contains(
                GeofenceUpdateParams.Isochrone.builder()
                    .contoursMeter(0L)
                    .contoursMinute(0L)
                    .coordinates("\"coordinates\": \"13.25805884388484,77.91083661048299\"")
                    .denoise(0.0)
                    .departureTime(0L)
                    .mode("“mode”:”car”")
                    .build()
            )
        assertThat(body._metaData()).isEqualTo(JsonValue.from(""))
        assertThat(body.name()).contains("\"name\":\"Los Angeles Downtown\"")
        assertThat(body.polygon())
            .contains(
                GeofenceUpdateParams.Polygon.builder()
                    .geojson(
                        GeofenceUpdateParams.Polygon.Geojson.builder()
                            .addGeometry(listOf(0.0))
                            .type("type")
                            .build()
                    )
                    .build()
            )
        assertThat(body.tags().getOrNull())
            .containsExactly("\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]")
        assertThat(body.type()).contains(GeofenceUpdateParams.Type.CIRCLE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GeofenceUpdateParams.builder().id("id").key("key=API_KEY").build()

        val body = params._body()
    }
}
