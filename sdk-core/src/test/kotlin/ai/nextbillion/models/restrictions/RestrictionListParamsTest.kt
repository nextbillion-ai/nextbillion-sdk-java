// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RestrictionListParamsTest {

    @Test
    fun create() {
        RestrictionListParams.builder()
            .area("area")
            .key("key=API_KEY")
            .limit(0L)
            .offset(0L)
            .mode(RestrictionListParams.Mode._0W)
            .name("name")
            .restrictionType(RestrictionListParams.RestrictionType.TURN)
            .source(RestrictionListParams.Source.RRT)
            .state(RestrictionListParams.State.ENABLED)
            .status(RestrictionListParams.Status.ACTIVE)
            .transform(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RestrictionListParams.builder()
                .area("area")
                .key("key=API_KEY")
                .limit(0L)
                .offset(0L)
                .mode(RestrictionListParams.Mode._0W)
                .name("name")
                .restrictionType(RestrictionListParams.RestrictionType.TURN)
                .source(RestrictionListParams.Source.RRT)
                .state(RestrictionListParams.State.ENABLED)
                .status(RestrictionListParams.Status.ACTIVE)
                .transform(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("area", "area")
                    .put("key", "key=API_KEY")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("mode", "0w")
                    .put("name", "name")
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
            RestrictionListParams.builder()
                .area("area")
                .key("key=API_KEY")
                .limit(0L)
                .offset(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("area", "area")
                    .put("key", "key=API_KEY")
                    .put("limit", "0")
                    .put("offset", "0")
                    .build()
            )
    }
}
