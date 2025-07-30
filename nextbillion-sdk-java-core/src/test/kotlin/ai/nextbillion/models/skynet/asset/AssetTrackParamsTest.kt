// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetTrackParamsTest {

    @Test
    fun create() {
        AssetTrackParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(AssetTrackParams.Cluster.AMERICA)
            .deviceId("device_id")
            .locations(
                AssetTrackParams.Locations.builder()
                    .location(
                        AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                    )
                    .timestamp(0L)
                    .accuracy(0.0)
                    .altitude(0.0)
                    .batteryLevel(0L)
                    .bearing(0.0)
                    .metaData(
                        JsonValue.from(
                            "{\n  \"driver_name\": \"Tyler Durden\",\n  \"type\": \"parcel\"\n}"
                        )
                    )
                    .speed(0.0)
                    .trackingMode("tracking_mode")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssetTrackParams.builder()
                .id("id")
                .key("key=API_KEY")
                .deviceId("device_id")
                .locations(
                    AssetTrackParams.Locations.builder()
                        .location(
                            AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .timestamp(0L)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssetTrackParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(AssetTrackParams.Cluster.AMERICA)
                .deviceId("device_id")
                .locations(
                    AssetTrackParams.Locations.builder()
                        .location(
                            AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .timestamp(0L)
                        .accuracy(0.0)
                        .altitude(0.0)
                        .batteryLevel(0L)
                        .bearing(0.0)
                        .metaData(
                            JsonValue.from(
                                "{\n  \"driver_name\": \"Tyler Durden\",\n  \"type\": \"parcel\"\n}"
                            )
                        )
                        .speed(0.0)
                        .trackingMode("tracking_mode")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AssetTrackParams.builder()
                .id("id")
                .key("key=API_KEY")
                .deviceId("device_id")
                .locations(
                    AssetTrackParams.Locations.builder()
                        .location(
                            AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .timestamp(0L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            AssetTrackParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(AssetTrackParams.Cluster.AMERICA)
                .deviceId("device_id")
                .locations(
                    AssetTrackParams.Locations.builder()
                        .location(
                            AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .timestamp(0L)
                        .accuracy(0.0)
                        .altitude(0.0)
                        .batteryLevel(0L)
                        .bearing(0.0)
                        .metaData(
                            JsonValue.from(
                                "{\n  \"driver_name\": \"Tyler Durden\",\n  \"type\": \"parcel\"\n}"
                            )
                        )
                        .speed(0.0)
                        .trackingMode("tracking_mode")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.deviceId()).isEqualTo("device_id")
        assertThat(body.locations())
            .isEqualTo(
                AssetTrackParams.Locations.builder()
                    .location(
                        AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                    )
                    .timestamp(0L)
                    .accuracy(0.0)
                    .altitude(0.0)
                    .batteryLevel(0L)
                    .bearing(0.0)
                    .metaData(
                        JsonValue.from(
                            "{\n  \"driver_name\": \"Tyler Durden\",\n  \"type\": \"parcel\"\n}"
                        )
                    )
                    .speed(0.0)
                    .trackingMode("tracking_mode")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssetTrackParams.builder()
                .id("id")
                .key("key=API_KEY")
                .deviceId("device_id")
                .locations(
                    AssetTrackParams.Locations.builder()
                        .location(
                            AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .timestamp(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.deviceId()).isEqualTo("device_id")
        assertThat(body.locations())
            .isEqualTo(
                AssetTrackParams.Locations.builder()
                    .location(
                        AssetTrackParams.Locations.Location.builder().lat(0.0).lon(0.0).build()
                    )
                    .timestamp(0L)
                    .build()
            )
    }
}
