// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.models.skynet.monitor.Metadata
import com.nextbillion_sdk.api.models.skynet.monitor.MonitorCreateParams
import com.nextbillion_sdk.api.models.skynet.monitor.MonitorDeleteParams
import com.nextbillion_sdk.api.models.skynet.monitor.MonitorListParams
import com.nextbillion_sdk.api.models.skynet.monitor.MonitorRetrieveParams
import com.nextbillion_sdk.api.models.skynet.monitor.MonitorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MonitorServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.skynet().monitor()

        val monitor =
            monitorService.create(
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
            )

        monitor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.skynet().monitor()

        val monitor =
            monitorService.retrieve(
                MonitorRetrieveParams.builder().id("id").key("key=API_KEY").build()
            )

        monitor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.skynet().monitor()

        val simpleResp =
            monitorService.update(
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
            )

        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.skynet().monitor()

        val monitors =
            monitorService.list(
                MonitorListParams.builder()
                    .key("key=API_KEY")
                    .cluster(MonitorListParams.Cluster.AMERICA)
                    .pn(0L)
                    .ps(100L)
                    .sort("updated_at:desc")
                    .tags("tags=tag_1,tag_2")
                    .build()
            )

        monitors.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.skynet().monitor()

        val simpleResp =
            monitorService.delete(MonitorDeleteParams.builder().id("id").key("key=API_KEY").build())

        simpleResp.validate()
    }
}
