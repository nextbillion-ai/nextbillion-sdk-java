// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.navigation.NavigationRetrieveRouteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NavigationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveRoute() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val navigationService = client.navigation()

        val response =
            navigationService.retrieveRoute(
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
                    .originalShape("original_shape=sbp}_AlmgpFnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(NavigationRetrieveRouteParams.OriginalShapeType.POLYLINE)
                    .overview(NavigationRetrieveRouteParams.Overview.FULL)
                    .waypoints("waypoints=41.349302,2.136480|41.349303,2.136481|41.349304,2.136482")
                    .build()
            )

        response.validate()
    }
}
