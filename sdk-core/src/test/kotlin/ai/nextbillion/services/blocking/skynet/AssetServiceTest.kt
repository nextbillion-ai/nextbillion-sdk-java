// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.JsonValue
import ai.nextbillion.models.skynet.asset.AssetBindParams
import ai.nextbillion.models.skynet.asset.AssetCreateParams
import ai.nextbillion.models.skynet.asset.AssetDeleteParams
import ai.nextbillion.models.skynet.asset.AssetListParams
import ai.nextbillion.models.skynet.asset.AssetRetrieveParams
import ai.nextbillion.models.skynet.asset.AssetTrackParams
import ai.nextbillion.models.skynet.asset.AssetUpdateAttributesParams
import ai.nextbillion.models.skynet.asset.AssetUpdateParams
import ai.nextbillion.models.skynet.asset.MetaData
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val asset =
            assetService.create(
                AssetCreateParams.builder()
                    .key("key=API_KEY")
                    .cluster(AssetCreateParams.Cluster.AMERICA)
                    .attributes(
                        JsonValue.from(
                            "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                        )
                    )
                    .customId("custom_id")
                    .description("description")
                    .metaData(MetaData.builder().build())
                    .name("name")
                    .addTag("string")
                    .build()
            )

        asset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val asset =
            assetService.retrieve(
                AssetRetrieveParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        asset.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val simpleResp =
            assetService.update(
                AssetUpdateParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetUpdateParams.Cluster.AMERICA)
                    .attributes(
                        JsonValue.from(
                            "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                        )
                    )
                    .description("description")
                    .metaData(MetaData.builder().build())
                    .name("name")
                    .addTag("string")
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
        val assetService = client.skynet().asset()

        val assets =
            assetService.list(
                AssetListParams.builder()
                    .key("key=API_KEY")
                    .cluster(AssetListParams.Cluster.AMERICA)
                    .includeAllOfAttributes(
                        "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                    )
                    .includeAnyOfAttributes(
                        "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                    )
                    .pn(0L)
                    .ps(100L)
                    .sort("updated_at:desc")
                    .tags("tags=tag_1,tag_2")
                    .build()
            )

        assets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val simpleResp =
            assetService.delete(
                AssetDeleteParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetDeleteParams.Cluster.AMERICA)
                    .build()
            )

        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bind() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val simpleResp =
            assetService.bind(
                AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()
            )

        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun track() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val simpleResp =
            assetService.track(
                AssetTrackParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetTrackParams.Cluster.AMERICA)
                    .deviceId("device_id")
                    .locations(
                        AssetTrackParams.Locations.builder()
                            .location(
                                AssetTrackParams.Locations.Location.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
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
            )

        simpleResp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateAttributes() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetService = client.skynet().asset()

        val simpleResp =
            assetService.updateAttributes(
                AssetUpdateAttributesParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .attributes(
                        JsonValue.from(
                            "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                        )
                    )
                    .build()
            )

        simpleResp.validate()
    }
}
