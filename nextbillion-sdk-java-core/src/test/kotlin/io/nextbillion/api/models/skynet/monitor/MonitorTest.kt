// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.monitor

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val monitor =
            Monitor.builder()
                .id("id")
                .createdAt(1672124157L)
                .description("description")
                .geofenceConfig(Monitor.GeofenceConfig.builder().addGeofenceId("string").build())
                .addGeofence("string")
                .idleConfig(
                    Monitor.IdleConfig.builder().distanceTolerance(0.0).timeTolerance(0L).build()
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

        assertThat(monitor.id()).contains("id")
        assertThat(monitor.createdAt()).contains(1672124157L)
        assertThat(monitor.description()).contains("description")
        assertThat(monitor.geofenceConfig())
            .contains(Monitor.GeofenceConfig.builder().addGeofenceId("string").build())
        assertThat(monitor.geofences().getOrNull()).containsExactly("string")
        assertThat(monitor.idleConfig())
            .contains(Monitor.IdleConfig.builder().distanceTolerance(0.0).timeTolerance(0L).build())
        assertThat(monitor.matchFilter())
            .contains(
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
        assertThat(monitor.metaData()).isEqualTo(Metadata.builder().build())
        assertThat(monitor.name()).contains("name")
        assertThat(monitor.speedingConfig())
            .contains(
                Monitor.SpeedingConfig.builder()
                    .customerSpeedLimit(0L)
                    .timeTolerance(0L)
                    .useAdminSpeedLimit(true)
                    .build()
            )
        assertThat(monitor.tags().getOrNull()).containsExactly("string")
        assertThat(monitor.type()).contains(Monitor.Type.ENTER)
        assertThat(monitor.updatedAt()).contains(1672124157L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monitor =
            Monitor.builder()
                .id("id")
                .createdAt(1672124157L)
                .description("description")
                .geofenceConfig(Monitor.GeofenceConfig.builder().addGeofenceId("string").build())
                .addGeofence("string")
                .idleConfig(
                    Monitor.IdleConfig.builder().distanceTolerance(0.0).timeTolerance(0L).build()
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

        val roundtrippedMonitor =
            jsonMapper.readValue(jsonMapper.writeValueAsString(monitor), jacksonTypeRef<Monitor>())

        assertThat(roundtrippedMonitor).isEqualTo(monitor)
    }
}
