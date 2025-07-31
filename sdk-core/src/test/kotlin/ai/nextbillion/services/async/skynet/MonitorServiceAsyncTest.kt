// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.skynet.monitor.Metadata
import ai.nextbillion.models.skynet.monitor.MonitorCreateParams
import ai.nextbillion.models.skynet.monitor.MonitorDeleteParams
import ai.nextbillion.models.skynet.monitor.MonitorListParams
import ai.nextbillion.models.skynet.monitor.MonitorRetrieveParams
import ai.nextbillion.models.skynet.monitor.MonitorUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MonitorServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorServiceAsync = client.skynet().monitor()

        val monitorFuture =
            monitorServiceAsync.create(
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

        val monitor = monitorFuture.get()
        monitor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorServiceAsync = client.skynet().monitor()

        val monitorFuture =
            monitorServiceAsync.retrieve(
                MonitorRetrieveParams.builder().id("id").key("key=API_KEY").build()
            )

        val monitor = monitorFuture.get()
        monitor.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorServiceAsync = client.skynet().monitor()

        val simpleRespFuture =
            monitorServiceAsync.update(
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

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorServiceAsync = client.skynet().monitor()

        val monitorsFuture =
            monitorServiceAsync.list(
                MonitorListParams.builder()
                    .key("key=API_KEY")
                    .cluster(MonitorListParams.Cluster.AMERICA)
                    .pn(0L)
                    .ps(100L)
                    .sort("updated_at:desc")
                    .tags("tags=tag_1,tag_2")
                    .build()
            )

        val monitors = monitorsFuture.get()
        monitors.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorServiceAsync = client.skynet().monitor()

        val simpleRespFuture =
            monitorServiceAsync.delete(
                MonitorDeleteParams.builder().id("id").key("key=API_KEY").build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }
}
