// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.isochrone

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IsochroneComputeParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        IsochroneComputeParams.builder()
            .contoursMeters(0L)
            .contoursMinutes(0L)
            .coordinates("coordinates=1.29363713,103.8383112")
            .key("key=API_KEY")
            .contoursColors("contours_colors=ff0000,bf4040")
            .denoise(0.0)
            .departureTime(0L)
            .generalize(0.0)
            .mode(IsochroneComputeParams.Mode.CAR)
            .polygons(true)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            IsochroneComputeParams.builder()
                .contoursMeters(0L)
                .contoursMinutes(0L)
                .coordinates("coordinates=1.29363713,103.8383112")
                .key("key=API_KEY")
                .contoursColors("contours_colors=ff0000,bf4040")
                .denoise(0.0)
                .departureTime(0L)
                .generalize(0.0)
                .mode(IsochroneComputeParams.Mode.CAR)
                .polygons(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("contours_meters", "0")
                    .put("contours_minutes", "0")
                    .put("coordinates", "coordinates=1.29363713,103.8383112")
                    .put("key", "key=API_KEY")
                    .put("contours_colors", "contours_colors=ff0000,bf4040")
                    .put("denoise", "0.0")
                    .put("departure_time", "0")
                    .put("generalize", "0.0")
                    .put("mode", "`car`")
                    .put("polygons", "true")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            IsochroneComputeParams.builder()
                .contoursMeters(0L)
                .contoursMinutes(0L)
                .coordinates("coordinates=1.29363713,103.8383112")
                .key("key=API_KEY")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("contours_meters", "0")
                    .put("contours_minutes", "0")
                    .put("coordinates", "coordinates=1.29363713,103.8383112")
                    .put("key", "key=API_KEY")
                    .build()
            )
    }
}
