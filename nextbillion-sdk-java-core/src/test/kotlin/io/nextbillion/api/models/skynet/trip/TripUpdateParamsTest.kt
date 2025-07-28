// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.trip

import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TripUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
            .metaData(JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]"))
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            TripUpdateParams.builder().id("id").key("key=API_KEY").assetId("asset_id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TripUpdateParams.builder().id("id").key("key=API_KEY").assetId("asset_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.assetId()).isEqualTo("asset_id")
        assertThat(body._attributes())
            .isEqualTo(
                JsonValue.from(
                    "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                )
            )
        assertThat(body.description()).contains("description")
        assertThat(body._metaData())
            .isEqualTo(JsonValue.from("\"meta_data\":[\"Scheduled Trip\", \"Custom Deliveries\"]"))
        assertThat(body.name()).contains("\"name\": \"Employee Pickup\"")
        assertThat(body.stops().getOrNull())
            .containsExactly(
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TripUpdateParams.builder().id("id").key("key=API_KEY").assetId("asset_id").build()

        val body = params._body()

        assertThat(body.assetId()).isEqualTo("asset_id")
    }
}
