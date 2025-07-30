// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlaceItemTest {

    @Test
    fun create() {
        val placeItem =
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

        assertThat(placeItem.address()).contains("address")
        assertThat(placeItem.building()).contains("building")
        assertThat(placeItem.city()).contains("city")
        assertThat(placeItem.country()).contains("country")
        assertThat(placeItem.district()).contains("district")
        assertThat(placeItem.geopoint())
            .contains(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
        assertThat(placeItem.house()).contains("house")
        assertThat(placeItem.poi()).contains(PlaceItem.Poi.builder().title("title").build())
        assertThat(placeItem.postalCode()).contains("postalCode")
        assertThat(placeItem.state()).contains("state")
        assertThat(placeItem.street()).contains("street")
        assertThat(placeItem.subDistrict()).contains("subDistrict")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val placeItem =
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

        val roundtrippedPlaceItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(placeItem),
                jacksonTypeRef<PlaceItem>(),
            )

        assertThat(roundtrippedPlaceItem).isEqualTo(placeItem)
    }
}
