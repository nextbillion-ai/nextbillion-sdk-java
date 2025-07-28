// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.search.SearchAroundParams
import ai.nextbillion.models.skynet.search.SearchBoundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SearchServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun around() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchServiceAsync = client.skynet().search()

        val searchResponseFuture =
            searchServiceAsync.around(
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
            )

        val searchResponse = searchResponseFuture.get()
        searchResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bound() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val searchServiceAsync = client.skynet().search()

        val searchResponseFuture =
            searchServiceAsync.bound(
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
            )

        val searchResponse = searchResponseFuture.get()
        searchResponse.validate()
    }
}
