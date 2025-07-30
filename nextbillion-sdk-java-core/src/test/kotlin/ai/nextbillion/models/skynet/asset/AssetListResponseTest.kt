// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.monitor.Pagination
import ai.nextbillion.models.skynet.trip.AssetDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetListResponseTest {

    @Test
    fun create() {
        val assetListResponse =
            AssetListResponse.builder()
                .data(
                    AssetListResponse.Data.builder()
                        .addList(
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
                                            AssetDetails.LatestLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
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
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        assertThat(assetListResponse.data())
            .contains(
                AssetListResponse.Data.builder()
                    .addList(
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
                                        AssetDetails.LatestLocation.Location.builder()
                                            .lat(0.0)
                                            .lon(0.0)
                                            .build()
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
                    )
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .build()
            )
        assertThat(assetListResponse.message()).contains("message")
        assertThat(assetListResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetListResponse =
            AssetListResponse.builder()
                .data(
                    AssetListResponse.Data.builder()
                        .addList(
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
                                            AssetDetails.LatestLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
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
                        )
                        .page(
                            Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()
                        )
                        .build()
                )
                .message("message")
                .status("status")
                .build()

        val roundtrippedAssetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetListResponse),
                jacksonTypeRef<AssetListResponse>(),
            )

        assertThat(roundtrippedAssetListResponse).isEqualTo(assetListResponse)
    }
}
