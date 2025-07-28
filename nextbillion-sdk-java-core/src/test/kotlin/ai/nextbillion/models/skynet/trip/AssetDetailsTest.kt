// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.asset.MetaData
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetDetailsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val assetDetails =
            AssetDetails.builder()
                .id("id")
                .attributes(
                    JsonValue.from(
                        "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                    )
                )
                .createdAt(0L)
                .description("description")
                .deviceId("device_id")
                .latestLocation(
                    AssetDetails.LatestLocation.builder()
                        .accuracy(0.0)
                        .altitude(0.0)
                        .bearing(0.0)
                        .location(
                            AssetDetails.LatestLocation.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .speed(0.0)
                        .timestamp(0L)
                        .build()
                )
                .metaData(MetaData.builder().build())
                .name("name")
                .state("state")
                .addTag("string")
                .trackedAt(0L)
                .updatedAt(0L)
                .build()

        assertThat(assetDetails.id()).contains("id")
        assertThat(assetDetails._attributes())
            .isEqualTo(
                JsonValue.from(
                    "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                )
            )
        assertThat(assetDetails.createdAt()).contains(0L)
        assertThat(assetDetails.description()).contains("description")
        assertThat(assetDetails.deviceId()).contains("device_id")
        assertThat(assetDetails.latestLocation())
            .contains(
                AssetDetails.LatestLocation.builder()
                    .accuracy(0.0)
                    .altitude(0.0)
                    .bearing(0.0)
                    .location(
                        AssetDetails.LatestLocation.Location.builder().lat(0.0).lon(0.0).build()
                    )
                    .speed(0.0)
                    .timestamp(0L)
                    .build()
            )
        assertThat(assetDetails.metaData()).isEqualTo(MetaData.builder().build())
        assertThat(assetDetails.name()).contains("name")
        assertThat(assetDetails.state()).contains("state")
        assertThat(assetDetails.tags().getOrNull()).containsExactly("string")
        assertThat(assetDetails.trackedAt()).contains(0L)
        assertThat(assetDetails.updatedAt()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetDetails =
            AssetDetails.builder()
                .id("id")
                .attributes(
                    JsonValue.from(
                        "{\n  \"asset_type\": \"delivery\",\n  \"area\": \"Los Angeles downtown\"\n}"
                    )
                )
                .createdAt(0L)
                .description("description")
                .deviceId("device_id")
                .latestLocation(
                    AssetDetails.LatestLocation.builder()
                        .accuracy(0.0)
                        .altitude(0.0)
                        .bearing(0.0)
                        .location(
                            AssetDetails.LatestLocation.Location.builder().lat(0.0).lon(0.0).build()
                        )
                        .speed(0.0)
                        .timestamp(0L)
                        .build()
                )
                .metaData(MetaData.builder().build())
                .name("name")
                .state("state")
                .addTag("string")
                .trackedAt(0L)
                .updatedAt(0L)
                .build()

        val roundtrippedAssetDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetDetails),
                jacksonTypeRef<AssetDetails>(),
            )

        assertThat(roundtrippedAssetDetails).isEqualTo(assetDetails)
    }
}
