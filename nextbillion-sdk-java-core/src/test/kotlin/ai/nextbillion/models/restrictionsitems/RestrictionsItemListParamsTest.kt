// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictionsitems

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionsItemListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        RestrictionsItemListParams.builder()
            .maxLat(0.0)
            .maxLon(0.0)
            .minLat(0.0)
            .minLon(0.0)
            .groupId(0.0)
            .mode(RestrictionsItemListParams.Mode._0W)
            .restrictionType(RestrictionsItemListParams.RestrictionType.TURN)
            .source("source")
            .state(RestrictionsItemListParams.State.ENABLED)
            .status(RestrictionsItemListParams.Status.ACTIVE)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            RestrictionsItemListParams.builder()
                .maxLat(0.0)
                .maxLon(0.0)
                .minLat(0.0)
                .minLon(0.0)
                .groupId(0.0)
                .mode(RestrictionsItemListParams.Mode._0W)
                .restrictionType(RestrictionsItemListParams.RestrictionType.TURN)
                .source("source")
                .state(RestrictionsItemListParams.State.ENABLED)
                .status(RestrictionsItemListParams.Status.ACTIVE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("max_lat", "0.0")
                    .put("max_lon", "0.0")
                    .put("min_lat", "0.0")
                    .put("min_lon", "0.0")
                    .put("group_id", "0.0")
                    .put("mode", "0w")
                    .put("restriction_type", "turn")
                    .put("source", "source")
                    .put("state", "enabled")
                    .put("status", "active")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RestrictionsItemListParams.builder()
                .maxLat(0.0)
                .maxLon(0.0)
                .minLat(0.0)
                .minLon(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("max_lat", "0.0")
                    .put("max_lon", "0.0")
                    .put("min_lat", "0.0")
                    .put("min_lon", "0.0")
                    .build()
            )
    }
}
