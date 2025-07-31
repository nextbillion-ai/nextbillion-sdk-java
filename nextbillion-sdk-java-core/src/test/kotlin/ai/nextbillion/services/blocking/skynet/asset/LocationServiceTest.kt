// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet.asset

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.skynet.asset.location.LocationGetLastParams
import ai.nextbillion.models.skynet.asset.location.LocationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocationServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locationService = client.skynet().asset().location()

        val locations =
            locationService.list(
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
            )

        locations.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getLast() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locationService = client.skynet().asset().location()

        val response =
            locationService.getLast(
                LocationGetLastParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(LocationGetLastParams.Cluster.AMERICA)
                    .build()
            )

        response.validate()
    }
}
