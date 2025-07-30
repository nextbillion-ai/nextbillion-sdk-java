// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StepCreateResponseTest {

    @Test
    fun create() {
        val stepCreateResponse =
            StepCreateResponse.builder()
                .data(
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
                )
                .message("message")
                .status(0L)
                .build()

        assertThat(stepCreateResponse.data())
            .contains(
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
            )
        assertThat(stepCreateResponse.message()).contains("message")
        assertThat(stepCreateResponse.status()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stepCreateResponse =
            StepCreateResponse.builder()
                .data(
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
                )
                .message("message")
                .status(0L)
                .build()

        val roundtrippedStepCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stepCreateResponse),
                jacksonTypeRef<StepCreateResponse>(),
            )

        assertThat(roundtrippedStepCreateResponse).isEqualTo(stepCreateResponse)
    }
}
