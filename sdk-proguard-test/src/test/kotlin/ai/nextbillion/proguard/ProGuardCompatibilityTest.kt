// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.proguard

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.directions.DirectionComputeRouteResponse
import ai.nextbillion.models.fleetify.routes.steps.RouteStepCompletionMode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile = javaClass.classLoader.getResourceAsStream("META-INF/proguard/sdk-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.fleetify()).isNotNull()
        assertThat(client.skynet()).isNotNull()
        assertThat(client.geocode()).isNotNull()
        assertThat(client.optimization()).isNotNull()
        assertThat(client.geofence()).isNotNull()
        assertThat(client.discover()).isNotNull()
        assertThat(client.browse()).isNotNull()
        assertThat(client.mdm()).isNotNull()
        assertThat(client.isochrone()).isNotNull()
        assertThat(client.restrictions()).isNotNull()
        assertThat(client.restrictionsItems()).isNotNull()
        assertThat(client.distanceMatrix()).isNotNull()
        assertThat(client.autocomplete()).isNotNull()
        assertThat(client.navigation()).isNotNull()
        assertThat(client.map()).isNotNull()
        assertThat(client.autosuggest()).isNotNull()
        assertThat(client.directions()).isNotNull()
        assertThat(client.batch()).isNotNull()
        assertThat(client.multigeocode()).isNotNull()
        assertThat(client.revgeocode()).isNotNull()
        assertThat(client.routeReport()).isNotNull()
        assertThat(client.snapToRoads()).isNotNull()
        assertThat(client.postalcode()).isNotNull()
        assertThat(client.lookup()).isNotNull()
        assertThat(client.areas()).isNotNull()
    }

    @Test
    fun directionComputeRouteResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val directionComputeRouteResponse =
            DirectionComputeRouteResponse.builder()
                .msg("msg")
                .route(
                    DirectionComputeRouteResponse.Route.builder()
                        .distance(0.0)
                        .duration(0.0)
                        .endLocation(
                            DirectionComputeRouteResponse.Route.EndLocation.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .geojson(
                            DirectionComputeRouteResponse.Route.Geojson.builder()
                                .geometry(
                                    DirectionComputeRouteResponse.Route.Geojson.Geometry.builder()
                                        .addCoordinate(0.0)
                                        .type("type")
                                        .build()
                                )
                                .properties("properties")
                                .type("type")
                                .build()
                        )
                        .geometry("geometry")
                        .addLeg(
                            DirectionComputeRouteResponse.Route.Leg.builder()
                                .distance(
                                    DirectionComputeRouteResponse.Route.Leg.Distance.builder()
                                        .value(0.0)
                                        .build()
                                )
                                .duration(
                                    DirectionComputeRouteResponse.Route.Leg.Duration.builder()
                                        .value(0.0)
                                        .build()
                                )
                                .endLocation(
                                    DirectionComputeRouteResponse.Route.Leg.EndLocation.builder()
                                        .latitude(0.0)
                                        .longitude(0.0)
                                        .build()
                                )
                                .startLocation(
                                    DirectionComputeRouteResponse.Route.Leg.StartLocation.builder()
                                        .latitude(0.0)
                                        .longitude(0.0)
                                        .build()
                                )
                                .addStep(
                                    DirectionComputeRouteResponse.Route.Leg.Step.builder()
                                        .distance(
                                            DirectionComputeRouteResponse.Route.Leg.Step.Distance
                                                .builder()
                                                .value(0.0)
                                                .build()
                                        )
                                        .duration(
                                            DirectionComputeRouteResponse.Route.Leg.Step.Duration
                                                .builder()
                                                .value(0.0)
                                                .build()
                                        )
                                        .endLocation(
                                            DirectionComputeRouteResponse.Route.Leg.Step.EndLocation
                                                .builder()
                                                .latitude(0.0)
                                                .longitude(0.0)
                                                .build()
                                        )
                                        .geojson(
                                            DirectionComputeRouteResponse.Route.Leg.Step.Geojson
                                                .builder()
                                                .geometry(
                                                    DirectionComputeRouteResponse.Route.Leg.Step
                                                        .Geojson
                                                        .Geometry
                                                        .builder()
                                                        .addCoordinate(0.0)
                                                        .type("type")
                                                        .build()
                                                )
                                                .properties("properties")
                                                .type("type")
                                                .build()
                                        )
                                        .geometry("geometry")
                                        .maneuver(
                                            DirectionComputeRouteResponse.Route.Leg.Step.Maneuver
                                                .builder()
                                                .bearingAfter(0L)
                                                .bearingBefore(0L)
                                                .coordinate(
                                                    DirectionComputeRouteResponse.Route.Leg.Step
                                                        .Maneuver
                                                        .Coordinate
                                                        .builder()
                                                        .latitude(0.0)
                                                        .longitude(0.0)
                                                        .build()
                                                )
                                                .maneuverType("depart")
                                                .modifier("left")
                                                .build()
                                        )
                                        .startLocation(
                                            DirectionComputeRouteResponse.Route.Leg.Step
                                                .StartLocation
                                                .builder()
                                                .latitude(0.0)
                                                .longitude(0.0)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .startLocation(
                            DirectionComputeRouteResponse.Route.StartLocation.builder()
                                .latitude(0.0)
                                .longitude(0.0)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedDirectionComputeRouteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(directionComputeRouteResponse),
                jacksonTypeRef<DirectionComputeRouteResponse>(),
            )

        assertThat(roundtrippedDirectionComputeRouteResponse)
            .isEqualTo(directionComputeRouteResponse)
    }

    @Test
    fun routeStepCompletionModeRoundtrip() {
        val jsonMapper = jsonMapper()
        val routeStepCompletionMode = RouteStepCompletionMode.MANUAL

        val roundtrippedRouteStepCompletionMode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStepCompletionMode),
                jacksonTypeRef<RouteStepCompletionMode>(),
            )

        assertThat(roundtrippedRouteStepCompletionMode).isEqualTo(routeStepCompletionMode)
    }
}
