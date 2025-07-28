// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode

import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.multigeocode.place.PlaceItem
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MultigeocodeSearchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val multigeocodeSearchResponse =
            MultigeocodeSearchResponse.builder()
                .addEntity(
                    MultigeocodeSearchResponse.Entity.builder()
                        .dataSource(
                            MultigeocodeSearchResponse.Entity.DataSource.builder()
                                .refId("refId")
                                .source("source")
                                .status(MultigeocodeSearchResponse.Entity.DataSource.Status.ENABLE)
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
                )
                .build()

        assertThat(multigeocodeSearchResponse.entities().getOrNull())
            .containsExactly(
                MultigeocodeSearchResponse.Entity.builder()
                    .dataSource(
                        MultigeocodeSearchResponse.Entity.DataSource.builder()
                            .refId("refId")
                            .source("source")
                            .status(MultigeocodeSearchResponse.Entity.DataSource.Status.ENABLE)
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
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multigeocodeSearchResponse =
            MultigeocodeSearchResponse.builder()
                .addEntity(
                    MultigeocodeSearchResponse.Entity.builder()
                        .dataSource(
                            MultigeocodeSearchResponse.Entity.DataSource.builder()
                                .refId("refId")
                                .source("source")
                                .status(MultigeocodeSearchResponse.Entity.DataSource.Status.ENABLE)
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
                )
                .build()

        val roundtrippedMultigeocodeSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multigeocodeSearchResponse),
                jacksonTypeRef<MultigeocodeSearchResponse>(),
            )

        assertThat(roundtrippedMultigeocodeSearchResponse).isEqualTo(multigeocodeSearchResponse)
    }
}
