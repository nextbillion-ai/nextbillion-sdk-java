// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.geofence

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.geofence.GeofenceEntityCreate
import ai.nextbillion.models.geofence.batch.BatchCreateParams
import ai.nextbillion.models.geofence.batch.BatchDeleteParams
import ai.nextbillion.models.geofence.batch.BatchListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.geofence().batch()

        val batch =
            batchService.create(
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
                            .addTag(
                                "\"tags\":[\"tags_1\", \"O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7\"]"
                            )
                            .build()
                    )
                    .build()
            )

        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.geofence().batch()

        val batches =
            batchService.list(BatchListParams.builder().ids("ids").key("key=API_KEY").build())

        batches.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchService = client.geofence().batch()

        val simpleResp =
            batchService.delete(
                BatchDeleteParams.builder().key("key=API_KEY").addId("string").build()
            )

        simpleResp.validate()
    }
}
