// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
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
internal class TripServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val trip =
            tripService.retrieve(
                TripRetrieveParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        trip.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val simpleResp =
            tripService.update(
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

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val simpleResp =
            tripService.delete(
                TripDeleteParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripDeleteParams.Cluster.AMERICA)
                    .build()
            )

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun end() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val simpleResp =
            tripService.end(
                TripEndParams.builder()
                    .key("key=API_KEY")
                    .cluster(TripEndParams.Cluster.AMERICA)
                    .id("id")
                    .build()
            )

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getSummary() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val response =
            tripService.getSummary(
                TripGetSummaryParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(TripGetSummaryParams.Cluster.AMERICA)
                    .build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun start() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tripService = client.skynet().trip()

        val response =
            tripService.start(
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

        response.validate()
    }
}
