// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.navigation.NavigationRetrieveRouteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NavigationServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveRoute() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val navigationServiceAsync = client.navigation()

        val responseFuture =
            navigationServiceAsync.retrieveRoute(
                NavigationRetrieveRouteParams.builder()
                    .key("key=API_KEY")
                    .altcount(1L)
                    .alternatives(true)
                    .approaches(NavigationRetrieveRouteParams.Approaches.UNRESTRICTED)
                    .avoid(NavigationRetrieveRouteParams.Avoid.TOLL)
                    .bearings("bearings=0,180;0,180")
                    .destination("destination=41.349302,2.136480")
                    .geometry(NavigationRetrieveRouteParams.Geometry.POLYLINE)
                    .lang("lang=en")
                    .mode(NavigationRetrieveRouteParams.Mode.CAR)
                    .origin("origin=41.349302,2.136480")
                    .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(NavigationRetrieveRouteParams.OriginalShapeType.POLYLINE)
                    .overview(NavigationRetrieveRouteParams.Overview.FULL)
                    .waypoints("waypoints=41.349302,2.136480|41.349303,2.136481|41.349304,2.136482")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
