// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlaceRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val placeRetrieveResponse =
            PlaceRetrieveResponse.builder()
                .dataSorce(
                    PlaceRetrieveResponse.DataSorce.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceRetrieveResponse.DataSorce.Status.ENABLE)
                        .build()
                )
                .docId("docId")
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

        assertThat(placeRetrieveResponse.dataSorce())
            .contains(
                PlaceRetrieveResponse.DataSorce.builder()
                    .refId("refId")
                    .source("source")
                    .status(PlaceRetrieveResponse.DataSorce.Status.ENABLE)
                    .build()
            )
        assertThat(placeRetrieveResponse.docId()).contains("docId")
        assertThat(placeRetrieveResponse.place().getOrNull())
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
        assertThat(placeRetrieveResponse.score()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placeRetrieveResponse =
            PlaceRetrieveResponse.builder()
                .dataSorce(
                    PlaceRetrieveResponse.DataSorce.builder()
                        .refId("refId")
                        .source("source")
                        .status(PlaceRetrieveResponse.DataSorce.Status.ENABLE)
                        .build()
                )
                .docId("docId")
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

        val roundtrippedPlaceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placeRetrieveResponse),
                jacksonTypeRef<PlaceRetrieveResponse>(),
            )

        assertThat(roundtrippedPlaceRetrieveResponse).isEqualTo(placeRetrieveResponse)
    }
}
