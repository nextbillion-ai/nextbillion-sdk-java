// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.skynet.asset.MetaData
import ai.nextbillion.models.skynet.asset.location.TrackLocation
import ai.nextbillion.models.skynet.monitor.Pagination
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchResponseTest {

    @Test
    fun create() {
        val searchResponse =
            SearchResponse.builder()
                .data(
                    SearchResponse.Data.builder()
                        .addAsset(
                            SearchResponse.Data.Asset.builder()
                                .id("id")
                                .createdAt(0L)
                                .description("description")
                                .latestLocation(
                                    TrackLocation.builder()
                                        .accuracy(0.0)
                                        .altitude(0.0)
                                        .batteryLevel(0L)
                                        .bearing(0.0)
                                        .location(
                                            TrackLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(
                                            JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                        )
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .trackingMode("tracking_mode")
                                        .build()
                                )
                                .metaData(MetaData.builder().build())
                                .name("name")
                                .rankingInfo(
                                    SearchResponse.Data.Asset.RankingInfo.builder()
                                        .distance(0.0)
                                        .duration(0.0)
                                        .index(0L)
                                        .build()
                                )
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

        assertThat(searchResponse.data())
            .contains(
                SearchResponse.Data.builder()
                    .addAsset(
                        SearchResponse.Data.Asset.builder()
                            .id("id")
                            .createdAt(0L)
                            .description("description")
                            .latestLocation(
                                TrackLocation.builder()
                                    .accuracy(0.0)
                                    .altitude(0.0)
                                    .batteryLevel(0L)
                                    .bearing(0.0)
                                    .location(
                                        TrackLocation.Location.builder().lat(0.0).lon(0.0).build()
                                    )
                                    .metaData(
                                        JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                    )
                                    .speed(0.0)
                                    .timestamp(0L)
                                    .trackingMode("tracking_mode")
                                    .build()
                            )
                            .metaData(MetaData.builder().build())
                            .name("name")
                            .rankingInfo(
                                SearchResponse.Data.Asset.RankingInfo.builder()
                                    .distance(0.0)
                                    .duration(0.0)
                                    .index(0L)
                                    .build()
                            )
                            .addTag("string")
                            .trackedAt(0L)
                            .updatedAt(0L)
                            .build()
                    )
                    .page(Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build())
                    .build()
            )
        assertThat(searchResponse.message()).contains("message")
        assertThat(searchResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val searchResponse =
            SearchResponse.builder()
                .data(
                    SearchResponse.Data.builder()
                        .addAsset(
                            SearchResponse.Data.Asset.builder()
                                .id("id")
                                .createdAt(0L)
                                .description("description")
                                .latestLocation(
                                    TrackLocation.builder()
                                        .accuracy(0.0)
                                        .altitude(0.0)
                                        .batteryLevel(0L)
                                        .bearing(0.0)
                                        .location(
                                            TrackLocation.Location.builder()
                                                .lat(0.0)
                                                .lon(0.0)
                                                .build()
                                        )
                                        .metaData(
                                            JsonValue.from("{\n  \"sample_meta_data\": \"test\"\n}")
                                        )
                                        .speed(0.0)
                                        .timestamp(0L)
                                        .trackingMode("tracking_mode")
                                        .build()
                                )
                                .metaData(MetaData.builder().build())
                                .name("name")
                                .rankingInfo(
                                    SearchResponse.Data.Asset.RankingInfo.builder()
                                        .distance(0.0)
                                        .duration(0.0)
                                        .index(0L)
                                        .build()
                                )
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

        val roundtrippedSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchResponse),
                jacksonTypeRef<SearchResponse>(),
            )

        assertThat(roundtrippedSearchResponse).isEqualTo(searchResponse)
    }
}
