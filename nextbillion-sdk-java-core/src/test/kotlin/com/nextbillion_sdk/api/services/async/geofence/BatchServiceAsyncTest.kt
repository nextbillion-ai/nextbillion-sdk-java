// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.geofence

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.models.geofence.GeofenceEntityCreate
import com.nextbillion_sdk.api.models.geofence.batch.BatchCreateParams
import com.nextbillion_sdk.api.models.geofence.batch.BatchDeleteParams
import com.nextbillion_sdk.api.models.geofence.batch.BatchListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.geofence().batch()

        val batchFuture =
            batchServiceAsync.create(
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

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.geofence().batch()

        val batchesFuture =
            batchServiceAsync.list(BatchListParams.builder().ids("ids").key("key=API_KEY").build())

        val batches = batchesFuture.get()
        batches.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.geofence().batch()

        val simpleRespFuture =
            batchServiceAsync.delete(
                BatchDeleteParams.builder().key("key=API_KEY").addId("string").build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }
}
