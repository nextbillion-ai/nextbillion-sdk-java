// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.search.polygon

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolygonCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PolygonCreateParams.builder()
            .key("key=API_KEY")
            .polygon(PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build())
            .filter("\"tag:delivery,truck\"")
            .matchFilter(
                PolygonCreateParams.MatchFilter.builder()
                    .includeAllOfAttributes(
                        "\"shift_timing\": \"0800-1700\",\"driver_name\": \"John\""
                    )
                    .includeAnyOfAttributes("include_any_of_attributes")
                    .build()
            )
            .maxSearchLimit(true)
            .pn(0L)
            .ps(0L)
            .sort(
                PolygonCreateParams.Sort.builder()
                    .sortBy(PolygonCreateParams.Sort.SortBy.DISTANCE)
                    .sortDestination(
                        PolygonCreateParams.Sort.SortDestination.builder().lat(0.0).lon(0.0).build()
                    )
                    .sortDrivingMode(PolygonCreateParams.Sort.SortDrivingMode.CAR)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            PolygonCreateParams.builder()
                .key("key=API_KEY")
                .polygon(
                    PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
                )
                .filter("\"tag:delivery,truck\"")
                .matchFilter(
                    PolygonCreateParams.MatchFilter.builder()
                        .includeAllOfAttributes(
                            "\"shift_timing\": \"0800-1700\",\"driver_name\": \"John\""
                        )
                        .includeAnyOfAttributes("include_any_of_attributes")
                        .build()
                )
                .maxSearchLimit(true)
                .pn(0L)
                .ps(0L)
                .sort(
                    PolygonCreateParams.Sort.builder()
                        .sortBy(PolygonCreateParams.Sort.SortBy.DISTANCE)
                        .sortDestination(
                            PolygonCreateParams.Sort.SortDestination.builder()
                                .lat(0.0)
                                .lon(0.0)
                                .build()
                        )
                        .sortDrivingMode(PolygonCreateParams.Sort.SortDrivingMode.CAR)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PolygonCreateParams.builder()
                .key("key=API_KEY")
                .polygon(
                    PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            PolygonCreateParams.builder()
                .key("key=API_KEY")
                .polygon(
                    PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
                )
                .filter("\"tag:delivery,truck\"")
                .matchFilter(
                    PolygonCreateParams.MatchFilter.builder()
                        .includeAllOfAttributes(
                            "\"shift_timing\": \"0800-1700\",\"driver_name\": \"John\""
                        )
                        .includeAnyOfAttributes("include_any_of_attributes")
                        .build()
                )
                .maxSearchLimit(true)
                .pn(0L)
                .ps(0L)
                .sort(
                    PolygonCreateParams.Sort.builder()
                        .sortBy(PolygonCreateParams.Sort.SortBy.DISTANCE)
                        .sortDestination(
                            PolygonCreateParams.Sort.SortDestination.builder()
                                .lat(0.0)
                                .lon(0.0)
                                .build()
                        )
                        .sortDrivingMode(PolygonCreateParams.Sort.SortDrivingMode.CAR)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.polygon())
            .isEqualTo(
                PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
            )
        assertThat(body.filter()).contains("\"tag:delivery,truck\"")
        assertThat(body.matchFilter())
            .contains(
                PolygonCreateParams.MatchFilter.builder()
                    .includeAllOfAttributes(
                        "\"shift_timing\": \"0800-1700\",\"driver_name\": \"John\""
                    )
                    .includeAnyOfAttributes("include_any_of_attributes")
                    .build()
            )
        assertThat(body.maxSearchLimit()).contains(true)
        assertThat(body.pn()).contains(0L)
        assertThat(body.ps()).contains(0L)
        assertThat(body.sort())
            .contains(
                PolygonCreateParams.Sort.builder()
                    .sortBy(PolygonCreateParams.Sort.SortBy.DISTANCE)
                    .sortDestination(
                        PolygonCreateParams.Sort.SortDestination.builder().lat(0.0).lon(0.0).build()
                    )
                    .sortDrivingMode(PolygonCreateParams.Sort.SortDrivingMode.CAR)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PolygonCreateParams.builder()
                .key("key=API_KEY")
                .polygon(
                    PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
                )
                .build()

        val body = params._body()

        assertThat(body.polygon())
            .isEqualTo(
                PolygonCreateParams.Polygon.builder().addCoordinate(0.0).type("type").build()
            )
    }
}
