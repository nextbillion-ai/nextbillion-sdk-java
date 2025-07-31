// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MapViewTest {

    @Test
    fun create() {
        val mapView =
            MapView.builder().east("east").north("north").south("south").west("west").build()

        assertThat(mapView.east()).contains("east")
        assertThat(mapView.north()).contains("north")
        assertThat(mapView.south()).contains("south")
        assertThat(mapView.west()).contains("west")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mapView =
            MapView.builder().east("east").north("north").south("south").west("west").build()

        val roundtrippedMapView =
            jsonMapper.readValue(jsonMapper.writeValueAsString(mapView), jacksonTypeRef<MapView>())

        assertThat(roundtrippedMapView).isEqualTo(mapView)
    }
}
