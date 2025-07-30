// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search.polygon

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolygonGetParamsTest {

    @Test
    fun create() {
        PolygonGetParams.builder()
            .key("key=API_KEY")
            .polygon(
                "polygon=17.4239,78.4590|17.4575,78.4624|17.4547,78.5483|17.4076,78.5527|17.4239,78.4590"
            )
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
            .sortBy(PolygonGetParams.SortBy.DISTANCE)
            .sortDestination("sort_destination= 34.0241,-118.2550")
            .sortDrivingMode(PolygonGetParams.SortDrivingMode.CAR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PolygonGetParams.builder()
                .key("key=API_KEY")
                .polygon(
                    "polygon=17.4239,78.4590|17.4575,78.4624|17.4547,78.5483|17.4076,78.5527|17.4239,78.4590"
                )
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
                .sortBy(PolygonGetParams.SortBy.DISTANCE)
                .sortDestination("sort_destination= 34.0241,-118.2550")
                .sortDrivingMode(PolygonGetParams.SortDrivingMode.CAR)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "polygon",
                        "polygon=17.4239,78.4590|17.4575,78.4624|17.4547,78.5483|17.4076,78.5527|17.4239,78.4590",
                    )
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
            PolygonGetParams.builder()
                .key("key=API_KEY")
                .polygon(
                    "polygon=17.4239,78.4590|17.4575,78.4624|17.4547,78.5483|17.4076,78.5527|17.4239,78.4590"
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "polygon",
                        "polygon=17.4239,78.4590|17.4575,78.4624|17.4547,78.5483|17.4076,78.5527|17.4239,78.4590",
                    )
                    .build()
            )
    }
}
