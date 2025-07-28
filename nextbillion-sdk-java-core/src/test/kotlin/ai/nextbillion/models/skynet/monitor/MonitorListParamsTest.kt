// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MonitorListParams.builder()
            .key("key=API_KEY")
            .cluster(MonitorListParams.Cluster.AMERICA)
            .pn(0L)
            .ps(100L)
            .sort("updated_at:desc")
            .tags("tags=tag_1,tag_2")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MonitorListParams.builder()
                .key("key=API_KEY")
                .cluster(MonitorListParams.Cluster.AMERICA)
                .pn(0L)
                .ps(100L)
                .sort("updated_at:desc")
                .tags("tags=tag_1,tag_2")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("cluster", "america")
                    .put("pn", "0")
                    .put("ps", "100")
                    .put("sort", "updated_at:desc")
                    .put("tags", "tags=tag_1,tag_2")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MonitorListParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
