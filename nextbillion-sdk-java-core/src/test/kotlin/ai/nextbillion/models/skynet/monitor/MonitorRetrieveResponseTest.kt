// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val monitorRetrieveResponse =
            MonitorRetrieveResponse.builder()
                .data(
                    MonitorRetrieveResponse.Data.builder()
                        .monitor(
                            Monitor.builder()
                                .id("id")
                                .createdAt(1672124157L)
                                .description("description")
                                .geofenceConfig(
                                    Monitor.GeofenceConfig.builder().addGeofenceId("string").build()
                                )
                                .addGeofence("string")
                                .idleConfig(
                                    Monitor.IdleConfig.builder()
                                        .distanceTolerance(0.0)
                                        .timeTolerance(0L)
                                        .build()
                                )
                                .matchFilter(
                                    Monitor.MatchFilter.builder()
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
                                    Monitor.SpeedingConfig.builder()
                                        .customerSpeedLimit(0L)
                                        .timeTolerance(0L)
                                        .useAdminSpeedLimit(true)
                                        .build()
                                )
                                .addTag("string")
                                .type(Monitor.Type.ENTER)
                                .updatedAt(1672124157L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(monitorRetrieveResponse.data())
            .contains(
                MonitorRetrieveResponse.Data.builder()
                    .monitor(
                        Monitor.builder()
                            .id("id")
                            .createdAt(1672124157L)
                            .description("description")
                            .geofenceConfig(
                                Monitor.GeofenceConfig.builder().addGeofenceId("string").build()
                            )
                            .addGeofence("string")
                            .idleConfig(
                                Monitor.IdleConfig.builder()
                                    .distanceTolerance(0.0)
                                    .timeTolerance(0L)
                                    .build()
                            )
                            .matchFilter(
                                Monitor.MatchFilter.builder()
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
                                Monitor.SpeedingConfig.builder()
                                    .customerSpeedLimit(0L)
                                    .timeTolerance(0L)
                                    .useAdminSpeedLimit(true)
                                    .build()
                            )
                            .addTag("string")
                            .type(Monitor.Type.ENTER)
                            .updatedAt(1672124157L)
                            .build()
                    )
                    .build()
            )
        assertThat(monitorRetrieveResponse.message()).contains("message")
        assertThat(monitorRetrieveResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monitorRetrieveResponse =
            MonitorRetrieveResponse.builder()
                .data(
                    MonitorRetrieveResponse.Data.builder()
                        .monitor(
                            Monitor.builder()
                                .id("id")
                                .createdAt(1672124157L)
                                .description("description")
                                .geofenceConfig(
                                    Monitor.GeofenceConfig.builder().addGeofenceId("string").build()
                                )
                                .addGeofence("string")
                                .idleConfig(
                                    Monitor.IdleConfig.builder()
                                        .distanceTolerance(0.0)
                                        .timeTolerance(0L)
                                        .build()
                                )
                                .matchFilter(
                                    Monitor.MatchFilter.builder()
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
                                    Monitor.SpeedingConfig.builder()
                                        .customerSpeedLimit(0L)
                                        .timeTolerance(0L)
                                        .useAdminSpeedLimit(true)
                                        .build()
                                )
                                .addTag("string")
                                .type(Monitor.Type.ENTER)
                                .updatedAt(1672124157L)
                                .build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedMonitorRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monitorRetrieveResponse),
                jacksonTypeRef<MonitorRetrieveResponse>(),
            )

        assertThat(roundtrippedMonitorRetrieveResponse).isEqualTo(monitorRetrieveResponse)
    }
}
