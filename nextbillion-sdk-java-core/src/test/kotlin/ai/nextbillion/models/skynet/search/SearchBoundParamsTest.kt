// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchBoundParamsTest {

    @Test
    fun create() {
        SearchBoundParams.builder()
            .bound("bounds=44.7664,-0.6941|44.9206,-0.4639")
            .key("key=API_KEY")
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
            .sortBy(SearchBoundParams.SortBy.DISTANCE)
            .sortDestination("sort_destination= 34.0241,-118.2550")
            .sortDrivingMode(SearchBoundParams.SortDrivingMode.CAR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SearchBoundParams.builder()
                .bound("bounds=44.7664,-0.6941|44.9206,-0.4639")
                .key("key=API_KEY")
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
                .sortBy(SearchBoundParams.SortBy.DISTANCE)
                .sortDestination("sort_destination= 34.0241,-118.2550")
                .sortDrivingMode(SearchBoundParams.SortDrivingMode.CAR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("bound", "bounds=44.7664,-0.6941|44.9206,-0.4639")
                    .put("key", "key=API_KEY")
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

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SearchBoundParams.builder()
                .bound("bounds=44.7664,-0.6941|44.9206,-0.4639")
                .key("key=API_KEY")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("bound", "bounds=44.7664,-0.6941|44.9206,-0.4639")
                    .put("key", "key=API_KEY")
                    .build()
            )
    }
}
