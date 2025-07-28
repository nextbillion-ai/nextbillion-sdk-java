// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TripStartParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
            .metaData(JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]"))
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TripStartParams.builder().key("key=API_KEY").assetId("asset_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.assetId()).isEqualTo("asset_id")
        assertThat(body._attributes())
            .isEqualTo(
                JsonValue.from(
                    "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                )
            )
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.description()).contains("description")
        assertThat(body._metaData())
            .isEqualTo(JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]"))
        assertThat(body.name()).contains("\"name\": \"Employee Pickup\"")
        assertThat(body.stops().getOrNull())
            .containsExactly(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = TripStartParams.builder().key("key=API_KEY").assetId("asset_id").build()

        val body = params._body()

        assertThat(body.assetId()).isEqualTo("asset_id")
    }
}
