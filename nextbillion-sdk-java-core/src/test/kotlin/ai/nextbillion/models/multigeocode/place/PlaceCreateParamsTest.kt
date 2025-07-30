// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceCreateParamsTest {

    @Test
    fun create() {
        PlaceCreateParams.builder()
            .key("key=API_KEY")
            .addPlace(
                PlaceCreateParams.Place.builder()
                    .geopoint(PlaceCreateParams.Place.Geopoint.builder().lat(0.0).lng(0.0).build())
                    .address("address")
                    .building("building")
                    .city("city")
                    .country("\"country\":\"IND\"")
                    .district("district")
                    .house("house")
                    .poi(PlaceCreateParams.Place.Poi.builder().title("title").build())
                    .postalCode("postalCode")
                    .state("state")
                    .street("street")
                    .subDistrict("subDistrict")
                    .build()
            )
            .dataSource(
                PlaceCreateParams.DataSource.builder()
                    .refId("refId")
                    .source("source")
                    .status(PlaceCreateParams.DataSource.Status.ENABLE)
                    .build()
            )
            .force(true)
            .score(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PlaceCreateParams.builder()
                .key("key=API_KEY")
                .addPlace(
                    PlaceCreateParams.Place.builder()
                        .geopoint(
                            PlaceCreateParams.Place.Geopoint.builder().lat(0.0).lng(0.0).build()
                        )
                        .address("address")
                        .building("building")
                        .city("city")
                        .country("\"country\":\"IND\"")
                        .district("district")
                        .house("house")
                        .poi(PlaceCreateParams.Place.Poi.builder().title("title").build())
                        .postalCode("postalCode")
                        .state("state")
                        .street("street")
                        .subDistrict("subDistrict")
                        .build()
                )
                .dataSource(
                    PlaceCreateParams.DataSource.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceCreateParams.DataSource.Status.ENABLE)
                        .build()
                )
                .force(true)
                .score(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PlaceCreateParams.builder()
                .key("key=API_KEY")
                .addPlace(
                    PlaceCreateParams.Place.builder()
                        .geopoint(PlaceCreateParams.Place.Geopoint.builder().build())
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            PlaceCreateParams.builder()
                .key("key=API_KEY")
                .addPlace(
                    PlaceCreateParams.Place.builder()
                        .geopoint(
                            PlaceCreateParams.Place.Geopoint.builder().lat(0.0).lng(0.0).build()
                        )
                        .address("address")
                        .building("building")
                        .city("city")
                        .country("\"country\":\"IND\"")
                        .district("district")
                        .house("house")
                        .poi(PlaceCreateParams.Place.Poi.builder().title("title").build())
                        .postalCode("postalCode")
                        .state("state")
                        .street("street")
                        .subDistrict("subDistrict")
                        .build()
                )
                .dataSource(
                    PlaceCreateParams.DataSource.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceCreateParams.DataSource.Status.ENABLE)
                        .build()
                )
                .force(true)
                .score(0L)
                .build()

        val body = params._body()

        assertThat(body.place())
            .containsExactly(
                PlaceCreateParams.Place.builder()
                    .geopoint(PlaceCreateParams.Place.Geopoint.builder().lat(0.0).lng(0.0).build())
                    .address("address")
                    .building("building")
                    .city("city")
                    .country("\"country\":\"IND\"")
                    .district("district")
                    .house("house")
                    .poi(PlaceCreateParams.Place.Poi.builder().title("title").build())
                    .postalCode("postalCode")
                    .state("state")
                    .street("street")
                    .subDistrict("subDistrict")
                    .build()
            )
        assertThat(body.dataSource())
            .contains(
                PlaceCreateParams.DataSource.builder()
                    .refId("refId")
                    .source("source")
                    .status(PlaceCreateParams.DataSource.Status.ENABLE)
                    .build()
            )
        assertThat(body.force()).contains(true)
        assertThat(body.score()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlaceCreateParams.builder()
                .key("key=API_KEY")
                .addPlace(
                    PlaceCreateParams.Place.builder()
                        .geopoint(PlaceCreateParams.Place.Geopoint.builder().build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.place())
            .containsExactly(
                PlaceCreateParams.Place.builder()
                    .geopoint(PlaceCreateParams.Place.Geopoint.builder().build())
                    .build()
            )
    }
}
