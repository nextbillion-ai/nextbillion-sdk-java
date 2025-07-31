// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RestrictionListByBboxParamsTest {

    @Test
    fun create() {
        RestrictionListByBboxParams.builder()
            .key("key=API_KEY")
            .maxLat(0.0)
            .maxLon(0.0)
            .minLat(0.0)
            .minLon(0.0)
            .addMode(RestrictionListByBboxParams.Mode._0W)
            .restrictionType(RestrictionListByBboxParams.RestrictionType.TURN)
            .source(RestrictionListByBboxParams.Source.RRT)
            .state(RestrictionListByBboxParams.State.ENABLED)
            .status(RestrictionListByBboxParams.Status.ACTIVE)
            .transform(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RestrictionListByBboxParams.builder()
                .key("key=API_KEY")
                .maxLat(0.0)
                .maxLon(0.0)
                .minLat(0.0)
                .minLon(0.0)
                .addMode(RestrictionListByBboxParams.Mode._0W)
                .restrictionType(RestrictionListByBboxParams.RestrictionType.TURN)
                .source(RestrictionListByBboxParams.Source.RRT)
                .state(RestrictionListByBboxParams.State.ENABLED)
                .status(RestrictionListByBboxParams.Status.ACTIVE)
                .transform(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("max_lat", "0.0")
                    .put("max_lon", "0.0")
                    .put("min_lat", "0.0")
                    .put("min_lon", "0.0")
                    .put("mode", listOf("0w").joinToString(","))
                    .put("restriction_type", "turn")
                    .put("source", "rrt")
                    .put("state", "enabled")
                    .put("status", "active")
                    .put("transform", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RestrictionListByBboxParams.builder()
                .key("key=API_KEY")
                .maxLat(0.0)
                .maxLon(0.0)
                .minLat(0.0)
                .minLon(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("max_lat", "0.0")
                    .put("max_lon", "0.0")
                    .put("min_lat", "0.0")
                    .put("min_lon", "0.0")
                    .build()
            )
    }
}
