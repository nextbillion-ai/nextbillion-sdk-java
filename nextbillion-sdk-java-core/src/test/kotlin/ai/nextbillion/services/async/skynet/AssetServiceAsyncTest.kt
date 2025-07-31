// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
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
internal class AssetServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val assetFuture =
            assetServiceAsync.create(
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

        val asset = assetFuture.get()
        asset.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val assetFuture =
            assetServiceAsync.retrieve(
                AssetRetrieveParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetRetrieveParams.Cluster.AMERICA)
                    .build()
            )

        val asset = assetFuture.get()
        asset.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val simpleRespFuture =
            assetServiceAsync.update(
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
        val assetServiceAsync = client.skynet().asset()

        val assetsFuture =
            assetServiceAsync.list(
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

        val assets = assetsFuture.get()
        assets.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val simpleRespFuture =
            assetServiceAsync.delete(
                AssetDeleteParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(AssetDeleteParams.Cluster.AMERICA)
                    .build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bind() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val simpleRespFuture =
            assetServiceAsync.bind(
                AssetBindParams.builder().id("id").key("key=API_KEY").deviceId("device_id").build()
            )

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun track() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val simpleRespFuture =
            assetServiceAsync.track(
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

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun updateAttributes() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val assetServiceAsync = client.skynet().asset()

        val simpleRespFuture =
            assetServiceAsync.updateAttributes(
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

        val simpleResp = simpleRespFuture.get()
        simpleResp.validate()
    }
}
