// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteStepsRequestTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routeStepsRequest =
            RouteStepsRequest.builder()
                .arrival(0L)
                .addLocation(0.0)
                .type(RouteStepsRequest.Type.START)
                .address("\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\",")
                .completionMode(RouteStepCompletionMode.MANUAL)
                .documentTemplateId("document_template_id")
                .duration(0L)
                .geofenceConfig(
                    RouteStepGeofenceConfig.builder()
                        .radius(0.0)
                        .type(RouteStepGeofenceConfig.Type.CIRCLE)
                        .build()
                )
                .meta(
                    RouteStepsRequest.Meta.builder()
                        .customerName("\"customer_name\": \"Chandler Bing\"")
                        .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                        .instructions(
                            "\"instructions\": \"Customer asked not to ring the doorbell.\""
                        )
                        .build()
                )
                .build()

        assertThat(routeStepsRequest.arrival()).isEqualTo(0L)
        assertThat(routeStepsRequest.location()).containsExactly(0.0)
        assertThat(routeStepsRequest.type()).isEqualTo(RouteStepsRequest.Type.START)
        assertThat(routeStepsRequest.address())
            .contains("\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\",")
        assertThat(routeStepsRequest.completionMode()).contains(RouteStepCompletionMode.MANUAL)
        assertThat(routeStepsRequest.documentTemplateId()).contains("document_template_id")
        assertThat(routeStepsRequest.duration()).contains(0L)
        assertThat(routeStepsRequest.geofenceConfig())
            .contains(
                RouteStepGeofenceConfig.builder()
                    .radius(0.0)
                    .type(RouteStepGeofenceConfig.Type.CIRCLE)
                    .build()
            )
        assertThat(routeStepsRequest.meta())
            .contains(
                RouteStepsRequest.Meta.builder()
                    .customerName("\"customer_name\": \"Chandler Bing\"")
                    .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                    .instructions("\"instructions\": \"Customer asked not to ring the doorbell.\"")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStepsRequest =
            RouteStepsRequest.builder()
                .arrival(0L)
                .addLocation(0.0)
                .type(RouteStepsRequest.Type.START)
                .address("\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\",")
                .completionMode(RouteStepCompletionMode.MANUAL)
                .documentTemplateId("document_template_id")
                .duration(0L)
                .geofenceConfig(
                    RouteStepGeofenceConfig.builder()
                        .radius(0.0)
                        .type(RouteStepGeofenceConfig.Type.CIRCLE)
                        .build()
                )
                .meta(
                    RouteStepsRequest.Meta.builder()
                        .customerName("\"customer_name\": \"Chandler Bing\"")
                        .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                        .instructions(
                            "\"instructions\": \"Customer asked not to ring the doorbell.\""
                        )
                        .build()
                )
                .build()

        val roundtrippedRouteStepsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStepsRequest),
                jacksonTypeRef<RouteStepsRequest>(),
            )

        assertThat(roundtrippedRouteStepsRequest).isEqualTo(routeStepsRequest)
    }
}
