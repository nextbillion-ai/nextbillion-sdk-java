// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet.asset

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.skynet.asset.location.LocationGetLastParams
import io.nextbillion.api.models.skynet.asset.location.LocationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocationServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                    .correction("correction=mapmatch=1,interpolate=0,mode=`car`")
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

    @Disabled("skipped: tests are disabled for the time being")
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
