// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.asset

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.asset.location.LocationGetLastParams
import ai.nextbillion.models.skynet.asset.location.LocationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locationServiceAsync = client.skynet().asset().location()

        val locationsFuture =
            locationServiceAsync.list(
                LocationListParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(LocationListParams.Cluster.AMERICA)
                    .correction("correction=mapmatch=1,interpolate=0,mode=car")
                    .endTime(0L)
                    .geometryType(LocationListParams.GeometryType.POLYLINE)
                    .pn(0L)
                    .ps(500L)
                    .startTime(0L)
                    .build()
            )

        val locations = locationsFuture.get()
        locations.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLast() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locationServiceAsync = client.skynet().asset().location()

        val responseFuture =
            locationServiceAsync.getLast(
                LocationGetLastParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(LocationGetLastParams.Cluster.AMERICA)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
