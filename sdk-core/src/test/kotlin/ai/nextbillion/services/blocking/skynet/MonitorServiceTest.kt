// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
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
internal class MonitorServiceTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
