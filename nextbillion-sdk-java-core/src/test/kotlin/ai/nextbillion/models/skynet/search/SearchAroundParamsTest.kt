// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SearchAroundParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SearchAroundParams.builder()
            .center("56.597801,43.967836")
            .key("key=API_KEY")
            .radius(0.0)
            .filter("filter=tag:delivery,truck")
            .includeAllOfAttributes(
                "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John"
            )
            .includeAnyOfAttributes(
                "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John"
            )
            .maxSearchLimit(true)
            .pn(0L)
            .ps(100L)
            .sortBy(SearchAroundParams.SortBy.DISTANCE)
            .sortDestination("sort_destination= 34.0241,-118.2550")
            .sortDrivingMode(SearchAroundParams.SortDrivingMode.CAR)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            SearchAroundParams.builder()
                .center("56.597801,43.967836")
                .key("key=API_KEY")
                .radius(0.0)
                .filter("filter=tag:delivery,truck")
                .includeAllOfAttributes(
                    "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                )
                .includeAnyOfAttributes(
                    "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John"
                )
                .maxSearchLimit(true)
                .pn(0L)
                .ps(100L)
                .sortBy(SearchAroundParams.SortBy.DISTANCE)
                .sortDestination("sort_destination= 34.0241,-118.2550")
                .sortDrivingMode(SearchAroundParams.SortDrivingMode.CAR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("center", "56.597801,43.967836")
                    .put("key", "key=API_KEY")
                    .put("radius", "0.0")
                    .put("filter", "filter=tag:delivery,truck")
                    .put(
                        "include_all_of_attributes",
                        "include_all_of_attributes=vehicle_type:pickup_truck|driver_name:John",
                    )
                    .put(
                        "include_any_of_attributes",
                        "include_any_of_attributes=vehicle_type:pickup_truck|driver_name:John",
                    )
                    .put("max_search_limit", "true")
                    .put("pn", "0")
                    .put("ps", "100")
                    .put("sort_by", "`distance`")
                    .put("sort_destination", "sort_destination= 34.0241,-118.2550")
                    .put("sort_driving_mode", "`car`")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SearchAroundParams.builder()
                .center("56.597801,43.967836")
                .key("key=API_KEY")
                .radius(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("center", "56.597801,43.967836")
                    .put("key", "key=API_KEY")
                    .put("radius", "0.0")
                    .build()
            )
    }
}
