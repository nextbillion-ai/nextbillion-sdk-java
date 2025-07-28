// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset.location

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LocationListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        LocationListParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(LocationListParams.Cluster.AMERICA)
            .correction("correction=mapmatch=1,interpolate=0,mode=`car`")
            .endTime(0L)
            .geometryType(LocationListParams.GeometryType.POLYLINE)
            .pn(0L)
            .ps(500L)
            .startTime(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = LocationListParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            LocationListParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(LocationListParams.Cluster.AMERICA)
                .correction("correction=mapmatch=1,interpolate=0,mode=`car`")
                .endTime(0L)
                .geometryType(LocationListParams.GeometryType.POLYLINE)
                .pn(0L)
                .ps(500L)
                .startTime(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("cluster", "america")
                    .put("correction", "correction=mapmatch=1,interpolate=0,mode=`car`")
                    .put("end_time", "0")
                    .put("geometry_type", "`polyline`")
                    .put("pn", "0")
                    .put("ps", "500")
                    .put("start_time", "0")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LocationListParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
