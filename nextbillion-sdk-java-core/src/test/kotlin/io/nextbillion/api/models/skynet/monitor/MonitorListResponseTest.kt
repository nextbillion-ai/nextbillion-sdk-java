// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.monitor

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val monitorListResponse =
            MonitorListResponse.builder()
                .data(
                    MonitorListResponse.Data.builder()
                        .addList(
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
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(monitorListResponse.data())
            .contains(
                MonitorListResponse.Data.builder()
                    .addList(
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
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .build()
            )
        assertThat(monitorListResponse.message()).contains("message")
        assertThat(monitorListResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monitorListResponse =
            MonitorListResponse.builder()
                .data(
                    MonitorListResponse.Data.builder()
                        .addList(
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
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedMonitorListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monitorListResponse),
                jacksonTypeRef<MonitorListResponse>(),
            )

        assertThat(roundtrippedMonitorListResponse).isEqualTo(monitorListResponse)
    }
}
