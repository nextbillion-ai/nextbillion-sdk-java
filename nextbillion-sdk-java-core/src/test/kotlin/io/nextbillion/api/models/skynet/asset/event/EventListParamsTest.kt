// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset.event

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        EventListParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(EventListParams.Cluster.AMERICA)
            .endTime(0L)
            .monitorId("monitor_id")
            .pn(0L)
            .ps(100L)
            .startTime(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = EventListParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            EventListParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(EventListParams.Cluster.AMERICA)
                .endTime(0L)
                .monitorId("monitor_id")
                .pn(0L)
                .ps(100L)
                .startTime(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("cluster", "america")
                    .put("end_time", "0")
                    .put("monitor_id", "monitor_id")
                    .put("pn", "0")
                    .put("ps", "100")
                    .put("start_time", "0")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
