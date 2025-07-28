// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.jsonMapper
import io.nextbillion.api.models.skynet.monitor.Pagination
import io.nextbillion.api.models.skynet.trip.AssetDetails
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
