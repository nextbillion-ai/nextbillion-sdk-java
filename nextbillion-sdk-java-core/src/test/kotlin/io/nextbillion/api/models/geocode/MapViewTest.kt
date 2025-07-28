// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MapViewTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val mapView =
            MapView.builder().east("east").north("north").south("south").west("west").build()

        assertThat(mapView.east()).contains("east")
        assertThat(mapView.north()).contains("north")
        assertThat(mapView.south()).contains("south")
        assertThat(mapView.west()).contains("west")
    }

    @Disabled("skipped: tests are disabled for the time being")
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
