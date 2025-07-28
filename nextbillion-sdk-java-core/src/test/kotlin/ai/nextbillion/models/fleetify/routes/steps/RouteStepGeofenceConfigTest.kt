// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteStepGeofenceConfigTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routeStepGeofenceConfig =
            RouteStepGeofenceConfig.builder()
                .radius(0.0)
                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                .build()

        assertThat(routeStepGeofenceConfig.radius()).contains(0.0)
        assertThat(routeStepGeofenceConfig.type()).contains(RouteStepGeofenceConfig.Type.CIRCLE)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStepGeofenceConfig =
            RouteStepGeofenceConfig.builder()
                .radius(0.0)
                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                .build()

        val roundtrippedRouteStepGeofenceConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStepGeofenceConfig),
                jacksonTypeRef<RouteStepGeofenceConfig>(),
            )

        assertThat(roundtrippedRouteStepGeofenceConfig).isEqualTo(routeStepGeofenceConfig)
    }
}
