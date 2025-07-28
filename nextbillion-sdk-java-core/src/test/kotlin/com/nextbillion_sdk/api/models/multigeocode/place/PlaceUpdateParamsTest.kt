// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.multigeocode.place

import com.nextbillion_sdk.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaceUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PlaceUpdateParams.builder()
            .docId("docId")
            .key("key=API_KEY")
            .dataSource(
                PlaceUpdateParams.DataSource.builder()
                    .refId("refId")
                    .source("source")
                    .status(PlaceUpdateParams.DataSource.Status.ENABLE)
                    .build()
            )
            .addPlace(
                PlaceItem.builder()
                    .address("address")
                    .building("building")
                    .city("city")
                    .country("country")
                    .district("district")
                    .geopoint(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
                    .house("house")
                    .poi(PlaceItem.Poi.builder().title("title").build())
                    .postalCode("postalCode")
                    .state("state")
                    .street("street")
                    .subDistrict("subDistrict")
                    .build()
            )
            .score(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = PlaceUpdateParams.builder().docId("docId").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("docId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            PlaceUpdateParams.builder()
                .docId("docId")
                .key("key=API_KEY")
                .dataSource(
                    PlaceUpdateParams.DataSource.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceUpdateParams.DataSource.Status.ENABLE)
                        .build()
                )
                .addPlace(
                    PlaceItem.builder()
                        .address("address")
                        .building("building")
                        .city("city")
                        .country("country")
                        .district("district")
                        .geopoint(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
                        .house("house")
                        .poi(PlaceItem.Poi.builder().title("title").build())
                        .postalCode("postalCode")
                        .state("state")
                        .street("street")
                        .subDistrict("subDistrict")
                        .build()
                )
                .score(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PlaceUpdateParams.builder().docId("docId").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            PlaceUpdateParams.builder()
                .docId("docId")
                .key("key=API_KEY")
                .dataSource(
                    PlaceUpdateParams.DataSource.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceUpdateParams.DataSource.Status.ENABLE)
                        .build()
                )
                .addPlace(
                    PlaceItem.builder()
                        .address("address")
                        .building("building")
                        .city("city")
                        .country("country")
                        .district("district")
                        .geopoint(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
                        .house("house")
                        .poi(PlaceItem.Poi.builder().title("title").build())
                        .postalCode("postalCode")
                        .state("state")
                        .street("street")
                        .subDistrict("subDistrict")
                        .build()
                )
                .score(0L)
                .build()

        val body = params._body()

        assertThat(body.dataSource())
            .contains(
                PlaceUpdateParams.DataSource.builder()
                    .refId("refId")
                    .source("source")
                    .status(PlaceUpdateParams.DataSource.Status.ENABLE)
                    .build()
            )
        assertThat(body.place().getOrNull())
            .containsExactly(
                PlaceItem.builder()
                    .address("address")
                    .building("building")
                    .city("city")
                    .country("country")
                    .district("district")
                    .geopoint(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
                    .house("house")
                    .poi(PlaceItem.Poi.builder().title("title").build())
                    .postalCode("postalCode")
                    .state("state")
                    .street("street")
                    .subDistrict("subDistrict")
                    .build()
            )
        assertThat(body.score()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = PlaceUpdateParams.builder().docId("docId").key("key=API_KEY").build()

        val body = params._body()
    }
}
