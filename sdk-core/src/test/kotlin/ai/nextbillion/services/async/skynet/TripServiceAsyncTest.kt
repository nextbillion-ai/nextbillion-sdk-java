// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.skynet.trip.TripDeleteParams
import ai.nextbillion.models.skynet.trip.TripEndParams
import ai.nextbillion.models.skynet.trip.TripGetSummaryParams
import ai.nextbillion.models.skynet.trip.TripRetrieveParams
import ai.nextbillion.models.skynet.trip.TripStartParams
import ai.nextbillion.models.skynet.trip.TripUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TripServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val tripFuture =
            tripServiceAsync.retrieve(
                TripRetrieveParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        val trip = tripFuture.get()
        trip.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val simpleRespFuture =
            tripServiceAsync.update(
                TripUpdateParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripUpdateParams.Cluster.AMERICA)
                    .assetId("asset_id")
                    .attributes(
                        JsonValue.from(
                            "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                        )
                    )
                    .description("description")
                    .metaData(
                        JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]")
                    )
                    .name("\"name\": \"Employee Pickup\"")
                    .addStop(
                        TripUpdateParams.Stop.builder()
                            .geofenceId("geofence_id")
                            .metaData(
                                JsonValue.from(
                                    "\"meta_data\":[\"Staff Entry Point\", \"Biometric checkpoint\"]"
                                )
                            )
                            .name("\"name\":\"Head Office\"")
                            .build()
                    )
                    .build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val simpleRespFuture =
            tripServiceAsync.delete(
                TripDeleteParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripDeleteParams.Cluster.AMERICA)
                    .build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val simpleRespFuture =
            tripServiceAsync.end(
                TripEndParams.builder()
                    .key("key=API_KEY")
                    .cluster(TripEndParams.Cluster.AMERICA)
                    .id("id")
                    .build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSummary() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val responseFuture =
            tripServiceAsync.getSummary(
                TripGetSummaryParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripGetSummaryParams.Cluster.AMERICA)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripServiceAsync = client.skynet().trip()

        val responseFuture =
            tripServiceAsync.start(
                TripStartParams.builder()
                    .key("key=API_KEY")
                    .cluster(TripStartParams.Cluster.AMERICA)
                    .assetId("asset_id")
                    .attributes(
                        JsonValue.from(
                            "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                        )
                    )
                    .customId("custom_id")
                    .description("description")
                    .metaData(
                        JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]")
                    )
                    .name("\"name\": \"Employee Pickup\"")
                    .addStop(
                        TripStartParams.Stop.builder()
                            .geofenceId("geofence_id")
                            .metaData(
                                JsonValue.from(
                                    "\"meta_data\":[\"Staff Entry Point\", \"Biometric checkpoint\"]"
                                )
                            )
                            .name("\"name\":\"Head Office\"")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
