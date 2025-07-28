// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset

import io.nextbillion.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetListParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AssetListParams.builder()
            .key("key=API_KEY")
            .cluster(AssetListParams.Cluster.AMERICA)
            .includeAllOfAttributes(
                "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John"
            )
            .includeAnyOfAttributes(
                "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John"
            )
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
            AssetListParams.builder()
                .key("key=API_KEY")
                .cluster(AssetListParams.Cluster.AMERICA)
                .includeAllOfAttributes(
                    "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                )
                .includeAnyOfAttributes(
                    "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                )
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
                    .put(
                        "include_all_of_attributes",
                        "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John",
                    )
                    .put(
                        "include_any_of_attributes",
                        "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John",
                    )
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
        val params = AssetListParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
