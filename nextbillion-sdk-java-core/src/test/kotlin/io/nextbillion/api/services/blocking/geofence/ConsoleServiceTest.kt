// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.geofence

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.models.geofence.GeofenceEntityCreate
import io.nextbillion.api.models.geofence.console.ConsolePreviewParams
import io.nextbillion.api.models.geofence.console.ConsoleSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConsoleServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun preview() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val consoleService = client.geofence().console()

        val response =
            consoleService.preview(
                ConsolePreviewParams.builder()
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

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun search() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val consoleService = client.geofence().console()

        val response = consoleService.search(ConsoleSearchParams.builder().query("query").build())

        response.validate()
    }
}
