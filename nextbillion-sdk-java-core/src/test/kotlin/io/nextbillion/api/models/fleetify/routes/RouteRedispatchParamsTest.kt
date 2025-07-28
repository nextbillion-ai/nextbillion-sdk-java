// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.routes

import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.models.fleetify.routes.steps.RouteStepCompletionMode
import io.nextbillion.api.models.fleetify.routes.steps.RouteStepGeofenceConfig
import io.nextbillion.api.models.fleetify.routes.steps.RouteStepsRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteRedispatchParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        RouteRedispatchParams.builder()
            .routeId("routeID")
            .key("key")
            .addOperation(
                RouteRedispatchParams.Operation.builder()
                    .data(
                        RouteRedispatchParams.Operation.Data.builder()
                            .completionMode(RouteStepCompletionMode.MANUAL)
                            .documentTemplateId("document_template_id")
                            .step(
                                RouteStepsRequest.builder()
                                    .arrival(0L)
                                    .addLocation(0.0)
                                    .type(RouteStepsRequest.Type.START)
                                    .address(
                                        "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\","
                                    )
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
                                            .customerPhoneNumber(
                                                "\"customer_phone_number\": \"+1 707 234 1234\""
                                            )
                                            .instructions(
                                                "\"instructions\": \"Customer asked not to ring the doorbell.\""
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .stepId("step_id")
                            .build()
                    )
                    .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                    .build()
            )
            .distance(0.0)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            RouteRedispatchParams.builder()
                .routeId("routeID")
                .key("key")
                .addOperation(
                    RouteRedispatchParams.Operation.builder()
                        .data(RouteRedispatchParams.Operation.Data.builder().build())
                        .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            RouteRedispatchParams.builder()
                .routeId("routeID")
                .key("key")
                .addOperation(
                    RouteRedispatchParams.Operation.builder()
                        .data(
                            RouteRedispatchParams.Operation.Data.builder()
                                .completionMode(RouteStepCompletionMode.MANUAL)
                                .documentTemplateId("document_template_id")
                                .step(
                                    RouteStepsRequest.builder()
                                        .arrival(0L)
                                        .addLocation(0.0)
                                        .type(RouteStepsRequest.Type.START)
                                        .address(
                                            "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\","
                                        )
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
                                                .customerName(
                                                    "\"customer_name\": \"Chandler Bing\""
                                                )
                                                .customerPhoneNumber(
                                                    "\"customer_phone_number\": \"+1 707 234 1234\""
                                                )
                                                .instructions(
                                                    "\"instructions\": \"Customer asked not to ring the doorbell.\""
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .stepId("step_id")
                                .build()
                        )
                        .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                        .build()
                )
                .distance(0.0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RouteRedispatchParams.builder()
                .routeId("routeID")
                .key("key")
                .addOperation(
                    RouteRedispatchParams.Operation.builder()
                        .data(RouteRedispatchParams.Operation.Data.builder().build())
                        .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            RouteRedispatchParams.builder()
                .routeId("routeID")
                .key("key")
                .addOperation(
                    RouteRedispatchParams.Operation.builder()
                        .data(
                            RouteRedispatchParams.Operation.Data.builder()
                                .completionMode(RouteStepCompletionMode.MANUAL)
                                .documentTemplateId("document_template_id")
                                .step(
                                    RouteStepsRequest.builder()
                                        .arrival(0L)
                                        .addLocation(0.0)
                                        .type(RouteStepsRequest.Type.START)
                                        .address(
                                            "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\","
                                        )
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
                                                .customerName(
                                                    "\"customer_name\": \"Chandler Bing\""
                                                )
                                                .customerPhoneNumber(
                                                    "\"customer_phone_number\": \"+1 707 234 1234\""
                                                )
                                                .instructions(
                                                    "\"instructions\": \"Customer asked not to ring the doorbell.\""
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .stepId("step_id")
                                .build()
                        )
                        .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                        .build()
                )
                .distance(0.0)
                .build()

        val body = params._body()

        assertThat(body.operations())
            .containsExactly(
                RouteRedispatchParams.Operation.builder()
                    .data(
                        RouteRedispatchParams.Operation.Data.builder()
                            .completionMode(RouteStepCompletionMode.MANUAL)
                            .documentTemplateId("document_template_id")
                            .step(
                                RouteStepsRequest.builder()
                                    .arrival(0L)
                                    .addLocation(0.0)
                                    .type(RouteStepsRequest.Type.START)
                                    .address(
                                        "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\","
                                    )
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
                                            .customerPhoneNumber(
                                                "\"customer_phone_number\": \"+1 707 234 1234\""
                                            )
                                            .instructions(
                                                "\"instructions\": \"Customer asked not to ring the doorbell.\""
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .stepId("step_id")
                            .build()
                    )
                    .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                    .build()
            )
        assertThat(body.distance()).contains(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RouteRedispatchParams.builder()
                .routeId("routeID")
                .key("key")
                .addOperation(
                    RouteRedispatchParams.Operation.builder()
                        .data(RouteRedispatchParams.Operation.Data.builder().build())
                        .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.operations())
            .containsExactly(
                RouteRedispatchParams.Operation.builder()
                    .data(RouteRedispatchParams.Operation.Data.builder().build())
                    .operation(RouteRedispatchParams.Operation.InnerOperation.CREATE)
                    .build()
            )
    }
}
