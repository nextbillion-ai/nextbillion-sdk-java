// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.navigation

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NavigationRetrieveRouteParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("altcount", "1")
                    .put("alternatives", "true")
                    .put("approaches", "unrestricted")
                    .put("avoid", "toll")
                    .put("bearings", "bearings=0,180;0,180")
                    .put("destination", "destination=41.349302,2.136480")
                    .put("geometry", "polyline")
                    .put("lang", "lang=en")
                    .put("mode", "car")
                    .put("origin", "origin=41.349302,2.136480")
                    .put(
                        "original_shape",
                        "original_shape=sbp}_AlmgpFnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA",
                    )
                    .put("original_shape_type", "polyline")
                    .put("overview", "full")
                    .put(
                        "waypoints",
                        "waypoints=41.349302,2.136480|41.349303,2.136481|41.349304,2.136482",
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NavigationRetrieveRouteParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
