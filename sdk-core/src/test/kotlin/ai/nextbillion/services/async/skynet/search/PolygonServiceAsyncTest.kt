// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.search

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.search.polygon.PolygonCreateParams
import ai.nextbillion.models.skynet.search.polygon.PolygonGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PolygonServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val polygonServiceAsync = client.skynet().search().polygon()

        val searchResponseFuture =
            polygonServiceAsync.create(
                PolygonCreateParams.builder()
                    .key("key=API_KEY")
                    .polygon(
                        PolygonCreateParams.Polygon.builder()
                            .addCoordinate(0.0)
                            .type("type")
                            .build()
                    )
                    .filter("\"tag:delivery,truck\"")
                    .matchFilter(
                        PolygonCreateParams.MatchFilter.builder()
                            .includeAllOfAttributes(
                                "\"shift_timing\": \"0800-1700\",\"driver_name\": \"John\""
                            )
                            .includeAnyOfAttributes("include_any_of_attributes")
                            .build()
                    )
                    .maxSearchLimit(true)
                    .pn(0L)
                    .ps(0L)
                    .sort(
                        PolygonCreateParams.Sort.builder()
                            .sortBy(PolygonCreateParams.Sort.SortBy.DISTANCE)
                            .sortDestination(
                                PolygonCreateParams.Sort.SortDestination.builder()
                                    .lat(0.0)
                                    .lon(0.0)
                                    .build()
                            )
                            .sortDrivingMode(PolygonCreateParams.Sort.SortDrivingMode.CAR)
                            .build()
                    )
                    .build()
            )

        val searchResponse = searchResponseFuture.get()
        searchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val polygonServiceAsync = client.skynet().search().polygon()

        val searchResponseFuture =
            polygonServiceAsync.get(
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
            )

        val searchResponse = searchResponseFuture.get()
        searchResponse.validate()
    }
}
