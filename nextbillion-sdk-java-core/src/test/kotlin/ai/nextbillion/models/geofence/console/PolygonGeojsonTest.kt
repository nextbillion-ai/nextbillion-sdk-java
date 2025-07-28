// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.console

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolygonGeojsonTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val polygonGeojson =
            PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build()

        assertThat(polygonGeojson.coordinates().getOrNull()).containsExactly(listOf(0.0))
        assertThat(polygonGeojson.type()).contains("type")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val polygonGeojson =
            PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build()

        val roundtrippedPolygonGeojson =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(polygonGeojson),
                jacksonTypeRef<PolygonGeojson>(),
            )

        assertThat(roundtrippedPolygonGeojson).isEqualTo(polygonGeojson)
    }
}
