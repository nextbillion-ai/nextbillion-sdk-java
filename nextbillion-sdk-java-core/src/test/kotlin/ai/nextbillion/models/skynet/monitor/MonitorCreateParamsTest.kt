// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MonitorCreateParams.builder()
            .key("key=API_KEY")
            .cluster(MonitorCreateParams.Cluster.AMERICA)
            .addTag("string")
            .type(MonitorCreateParams.Type.ENTER)
            .customId("custom_id")
            .description("description")
            .geofenceConfig(
                MonitorCreateParams.GeofenceConfig.builder().addGeofenceId("string").build()
            )
            .addGeofenceId("string")
            .idleConfig(
                MonitorCreateParams.IdleConfig.builder()
                    .distanceTolerance(0.0)
                    .timeTolerance(0L)
                    .build()
            )
            .matchFilter(
                MonitorCreateParams.MatchFilter.builder()
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
            .name("name")
            .speedingConfig(
                MonitorCreateParams.SpeedingConfig.builder()
                    .customerSpeedLimit(0L)
                    .timeTolerance(0L)
                    .useAdminSpeedLimit(true)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MonitorCreateParams.builder()
                .key("key=API_KEY")
                .cluster(MonitorCreateParams.Cluster.AMERICA)
                .addTag("string")
                .type(MonitorCreateParams.Type.ENTER)
                .customId("custom_id")
                .description("description")
                .geofenceConfig(
                    MonitorCreateParams.GeofenceConfig.builder().addGeofenceId("string").build()
                )
                .addGeofenceId("string")
                .idleConfig(
                    MonitorCreateParams.IdleConfig.builder()
                        .distanceTolerance(0.0)
                        .timeTolerance(0L)
                        .build()
                )
                .matchFilter(
                    MonitorCreateParams.MatchFilter.builder()
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
                .name("name")
                .speedingConfig(
                    MonitorCreateParams.SpeedingConfig.builder()
                        .customerSpeedLimit(0L)
                        .timeTolerance(0L)
                        .useAdminSpeedLimit(true)
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
            MonitorCreateParams.builder()
                .key("key=API_KEY")
                .addTag("string")
                .type(MonitorCreateParams.Type.ENTER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            MonitorCreateParams.builder()
                .key("key=API_KEY")
                .cluster(MonitorCreateParams.Cluster.AMERICA)
                .addTag("string")
                .type(MonitorCreateParams.Type.ENTER)
                .customId("custom_id")
                .description("description")
                .geofenceConfig(
                    MonitorCreateParams.GeofenceConfig.builder().addGeofenceId("string").build()
                )
                .addGeofenceId("string")
                .idleConfig(
                    MonitorCreateParams.IdleConfig.builder()
                        .distanceTolerance(0.0)
                        .timeTolerance(0L)
                        .build()
                )
                .matchFilter(
                    MonitorCreateParams.MatchFilter.builder()
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
                .name("name")
                .speedingConfig(
                    MonitorCreateParams.SpeedingConfig.builder()
                        .customerSpeedLimit(0L)
                        .timeTolerance(0L)
                        .useAdminSpeedLimit(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.tags()).containsExactly("string")
        assertThat(body.type()).isEqualTo(MonitorCreateParams.Type.ENTER)
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.description()).contains("description")
        assertThat(body.geofenceConfig())
            .contains(MonitorCreateParams.GeofenceConfig.builder().addGeofenceId("string").build())
        assertThat(body.geofenceIds().getOrNull()).containsExactly("string")
        assertThat(body.idleConfig())
            .contains(
                MonitorCreateParams.IdleConfig.builder()
                    .distanceTolerance(0.0)
                    .timeTolerance(0L)
                    .build()
            )
        assertThat(body.matchFilter())
            .contains(
                MonitorCreateParams.MatchFilter.builder()
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
        assertThat(body.name()).contains("name")
        assertThat(body.speedingConfig())
            .contains(
                MonitorCreateParams.SpeedingConfig.builder()
                    .customerSpeedLimit(0L)
                    .timeTolerance(0L)
                    .useAdminSpeedLimit(true)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MonitorCreateParams.builder()
                .key("key=API_KEY")
                .addTag("string")
                .type(MonitorCreateParams.Type.ENTER)
                .build()

        val body = params._body()

        assertThat(body.tags()).containsExactly("string")
        assertThat(body.type()).isEqualTo(MonitorCreateParams.Type.ENTER)
    }
}
