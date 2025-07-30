// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RouteStepsResponseTest {

    @Test
    fun create() {
        val routeStepsResponse =
            RouteStepsResponse.builder()
                .id("id")
                .address("address")
                .arrival(0L)
                .completion(
                    RouteStepsResponse.Completion.builder()
                        .completedAt(0L)
                        .completedByMode(RouteStepCompletionMode.MANUAL)
                        .completionMode(RouteStepCompletionMode.MANUAL)
                        .document(DocumentSubmission.builder().build())
                        .documentModifiedAt(0L)
                        .geofenceConfig(
                            RouteStepGeofenceConfig.builder()
                                .radius(0.0)
                                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                .build()
                        )
                        .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                        .build()
                )
                .createdAt(0L)
                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                .duration(0L)
                .addLocation(0.0)
                .meta(
                    RouteStepsResponse.Meta.builder()
                        .customerName("customer_name")
                        .customerPhoneNumber("customer_phone_number")
                        .instructions("instructions")
                        .build()
                )
                .shortId("short_id")
                .type("type")
                .updatedAt(0L)
                .build()

        assertThat(routeStepsResponse.id()).contains("id")
        assertThat(routeStepsResponse.address()).contains("address")
        assertThat(routeStepsResponse.arrival()).contains(0L)
        assertThat(routeStepsResponse.completion())
            .contains(
                RouteStepsResponse.Completion.builder()
                    .completedAt(0L)
                    .completedByMode(RouteStepCompletionMode.MANUAL)
                    .completionMode(RouteStepCompletionMode.MANUAL)
                    .document(DocumentSubmission.builder().build())
                    .documentModifiedAt(0L)
                    .geofenceConfig(
                        RouteStepGeofenceConfig.builder()
                            .radius(0.0)
                            .type(RouteStepGeofenceConfig.Type.CIRCLE)
                            .build()
                    )
                    .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                    .build()
            )
        assertThat(routeStepsResponse.createdAt()).contains(0L)
        assertThat(routeStepsResponse.documentSnapshot().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(routeStepsResponse.duration()).contains(0L)
        assertThat(routeStepsResponse.location().getOrNull()).containsExactly(0.0)
        assertThat(routeStepsResponse.meta())
            .contains(
                RouteStepsResponse.Meta.builder()
                    .customerName("customer_name")
                    .customerPhoneNumber("customer_phone_number")
                    .instructions("instructions")
                    .build()
            )
        assertThat(routeStepsResponse.shortId()).contains("short_id")
        assertThat(routeStepsResponse.type()).contains("type")
        assertThat(routeStepsResponse.updatedAt()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routeStepsResponse =
            RouteStepsResponse.builder()
                .id("id")
                .address("address")
                .arrival(0L)
                .completion(
                    RouteStepsResponse.Completion.builder()
                        .completedAt(0L)
                        .completedByMode(RouteStepCompletionMode.MANUAL)
                        .completionMode(RouteStepCompletionMode.MANUAL)
                        .document(DocumentSubmission.builder().build())
                        .documentModifiedAt(0L)
                        .geofenceConfig(
                            RouteStepGeofenceConfig.builder()
                                .radius(0.0)
                                .type(RouteStepGeofenceConfig.Type.CIRCLE)
                                .build()
                        )
                        .status(RouteStepsResponse.Completion.Status.SCHEDULED)
                        .build()
                )
                .createdAt(0L)
                .addDocumentSnapshot(JsonValue.from(mapOf<String, Any>()))
                .duration(0L)
                .addLocation(0.0)
                .meta(
                    RouteStepsResponse.Meta.builder()
                        .customerName("customer_name")
                        .customerPhoneNumber("customer_phone_number")
                        .instructions("instructions")
                        .build()
                )
                .shortId("short_id")
                .type("type")
                .updatedAt(0L)
                .build()

        val roundtrippedRouteStepsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routeStepsResponse),
                jacksonTypeRef<RouteStepsResponse>(),
            )

        assertThat(roundtrippedRouteStepsResponse).isEqualTo(routeStepsResponse)
    }
}
