// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MonitorUpdateParams.builder()
            .id("id")
            .key("key=API_KEY")
            .description("description")
            .geofenceConfig(
                MonitorUpdateParams.GeofenceConfig.builder().addGeofenceId("string").build()
            )
            .addGeofenceId("string")
            .idleConfig(
                MonitorUpdateParams.IdleConfig.builder()
                    .distanceTolerance(0.0)
                    .timeTolerance(0L)
                    .build()
            )
            .matchFilter(
                MonitorUpdateParams.MatchFilter.builder()
                    .includeAllOfAttributes(
                        JsonValue.from(
                            "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                        )
                    )
                    .includeAnyOfAttributes(
                        JsonValue.from(
                            "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                        )
                    )
                    .build()
            )
            .metaData(Metadata.builder().build())
            .name("\"name\":\"warehouse_exit\"")
            .speedingConfig(
                MonitorUpdateParams.SpeedingConfig.builder()
                    .customerSpeedLimit("\"customer_speed_limit\":8")
                    .timeTolerance(0L)
                    .useAdminSpeedLimit(true)
                    .build()
            )
            .addTag("string")
            .type(MonitorUpdateParams.Type.ENTER)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = MonitorUpdateParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MonitorUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .description("description")
                .geofenceConfig(
                    MonitorUpdateParams.GeofenceConfig.builder().addGeofenceId("string").build()
                )
                .addGeofenceId("string")
                .idleConfig(
                    MonitorUpdateParams.IdleConfig.builder()
                        .distanceTolerance(0.0)
                        .timeTolerance(0L)
                        .build()
                )
                .matchFilter(
                    MonitorUpdateParams.MatchFilter.builder()
                        .includeAllOfAttributes(
                            JsonValue.from(
                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                            )
                        )
                        .includeAnyOfAttributes(
                            JsonValue.from(
                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                            )
                        )
                        .build()
                )
                .metaData(Metadata.builder().build())
                .name("\"name\":\"warehouse_exit\"")
                .speedingConfig(
                    MonitorUpdateParams.SpeedingConfig.builder()
                        .customerSpeedLimit("\"customer_speed_limit\":8")
                        .timeTolerance(0L)
                        .useAdminSpeedLimit(true)
                        .build()
                )
                .addTag("string")
                .type(MonitorUpdateParams.Type.ENTER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MonitorUpdateParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            MonitorUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .description("description")
                .geofenceConfig(
                    MonitorUpdateParams.GeofenceConfig.builder().addGeofenceId("string").build()
                )
                .addGeofenceId("string")
                .idleConfig(
                    MonitorUpdateParams.IdleConfig.builder()
                        .distanceTolerance(0.0)
                        .timeTolerance(0L)
                        .build()
                )
                .matchFilter(
                    MonitorUpdateParams.MatchFilter.builder()
                        .includeAllOfAttributes(
                            JsonValue.from(
                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                            )
                        )
                        .includeAnyOfAttributes(
                            JsonValue.from(
                                "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                            )
                        )
                        .build()
                )
                .metaData(Metadata.builder().build())
                .name("\"name\":\"warehouse_exit\"")
                .speedingConfig(
                    MonitorUpdateParams.SpeedingConfig.builder()
                        .customerSpeedLimit("\"customer_speed_limit\":8")
                        .timeTolerance(0L)
                        .useAdminSpeedLimit(true)
                        .build()
                )
                .addTag("string")
                .type(MonitorUpdateParams.Type.ENTER)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.geofenceConfig())
            .contains(MonitorUpdateParams.GeofenceConfig.builder().addGeofenceId("string").build())
        assertThat(body.geofenceIds().getOrNull()).containsExactly("string")
        assertThat(body.idleConfig())
            .contains(
                MonitorUpdateParams.IdleConfig.builder()
                    .distanceTolerance(0.0)
                    .timeTolerance(0L)
                    .build()
            )
        assertThat(body.matchFilter())
            .contains(
                MonitorUpdateParams.MatchFilter.builder()
                    .includeAllOfAttributes(
                        JsonValue.from(
                            "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                        )
                    )
                    .includeAnyOfAttributes(
                        JsonValue.from(
                            "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                        )
                    )
                    .build()
            )
        assertThat(body.metaData()).isEqualTo(Metadata.builder().build())
        assertThat(body.name()).contains("\"name\":\"warehouse_exit\"")
        assertThat(body.speedingConfig())
            .contains(
                MonitorUpdateParams.SpeedingConfig.builder()
                    .customerSpeedLimit("\"customer_speed_limit\":8")
                    .timeTolerance(0L)
                    .useAdminSpeedLimit(true)
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.type()).contains(MonitorUpdateParams.Type.ENTER)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = MonitorUpdateParams.builder().id("id").key("key=API_KEY").build()

        val body = params._body()
    }
}
