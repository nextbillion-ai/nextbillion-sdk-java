// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.geofence.GeofenceContainsParams
import ai.nextbillion.models.geofence.GeofenceCreateParams
import ai.nextbillion.models.geofence.GeofenceDeleteParams
import ai.nextbillion.models.geofence.GeofenceEntityCreate
import ai.nextbillion.models.geofence.GeofenceListParams
import ai.nextbillion.models.geofence.GeofenceRetrieveParams
import ai.nextbillion.models.geofence.GeofenceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeofenceServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val geofence =
            geofenceService.create(
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
                            .addTag(
                                "\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]"
                            )
                            .build()
                    )
                    .build()
            )

        geofence.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val geofence =
            geofenceService.retrieve(
                GeofenceRetrieveParams.builder().id("id").key("key=API_KEY").build()
            )

        geofence.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val simpleResp =
            geofenceService.update(
                GeofenceUpdateParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .circle(
                        GeofenceUpdateParams.Circle.builder()
                            .center(
                                GeofenceUpdateParams.Circle.Center.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
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
            )

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val geofences =
            geofenceService.list(
                GeofenceListParams.builder()
                    .key("key=API_KEY")
                    .pn(0L)
                    .ps(100L)
                    .tags("tags=tags_1,O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7")
                    .build()
            )

        geofences.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val simpleResp =
            geofenceService.delete(
                GeofenceDeleteParams.builder().id("id").key("key=API_KEY").build()
            )

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun contains() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geofenceService = client.geofence()

        val response =
            geofenceService.contains(
                GeofenceContainsParams.builder()
                    .key("key=API_KEY")
                    .locations(
                        "13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299"
                    )
                    .geofences(
                        "geofences=80d1fa55-6287-4da0-93ac-2fc162d0a228,70d1fa55-1287-4da0-93ac-2fc162d0a228"
                    )
                    .verbose("verbose=true")
                    .build()
            )

        response.validate()
    }
}
