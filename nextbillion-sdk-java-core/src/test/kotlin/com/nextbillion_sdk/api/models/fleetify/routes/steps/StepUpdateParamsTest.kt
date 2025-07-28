// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.fleetify.routes.steps

import com.nextbillion_sdk.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StepUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        StepUpdateParams.builder()
            .routeId("routeID")
            .stepId("stepID")
            .key("key")
            .arrival(0L)
            .position(0L)
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
            .addLocation(0.0)
            .meta(
                StepUpdateParams.Meta.builder()
                    .customerName("\"customer_name\": \"Chandler Bing\"")
                    .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                    .instructions("\"instructions\": \"Customer asked not to ring the doorbell.\"")
                    .build()
            )
            .type(StepUpdateParams.Type.START)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            StepUpdateParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .arrival(0L)
                .position(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        assertThat(params._pathParam(1)).isEqualTo("stepID")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            StepUpdateParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .arrival(0L)
                .position(0L)
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
                .addLocation(0.0)
                .meta(
                    StepUpdateParams.Meta.builder()
                        .customerName("\"customer_name\": \"Chandler Bing\"")
                        .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                        .instructions(
                            "\"instructions\": \"Customer asked not to ring the doorbell.\""
                        )
                        .build()
                )
                .type(StepUpdateParams.Type.START)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            StepUpdateParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .arrival(0L)
                .position(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            StepUpdateParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .arrival(0L)
                .position(0L)
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
                .addLocation(0.0)
                .meta(
                    StepUpdateParams.Meta.builder()
                        .customerName("\"customer_name\": \"Chandler Bing\"")
                        .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                        .instructions(
                            "\"instructions\": \"Customer asked not to ring the doorbell.\""
                        )
                        .build()
                )
                .type(StepUpdateParams.Type.START)
                .build()

        val body = params._body()

        assertThat(body.arrival()).isEqualTo(0L)
        assertThat(body.position()).isEqualTo(0L)
        assertThat(body.address())
            .contains("\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\",")
        assertThat(body.completionMode()).contains(RouteStepCompletionMode.MANUAL)
        assertThat(body.documentTemplateId()).contains("document_template_id")
        assertThat(body.duration()).contains(0L)
        assertThat(body.geofenceConfig())
            .contains(
                RouteStepGeofenceConfig.builder()
                    .radius(0.0)
                    .type(RouteStepGeofenceConfig.Type.CIRCLE)
                    .build()
            )
        assertThat(body.location().getOrNull()).containsExactly(0.0)
        assertThat(body.meta())
            .contains(
                StepUpdateParams.Meta.builder()
                    .customerName("\"customer_name\": \"Chandler Bing\"")
                    .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                    .instructions("\"instructions\": \"Customer asked not to ring the doorbell.\"")
                    .build()
            )
        assertThat(body.type()).contains(StepUpdateParams.Type.START)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StepUpdateParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .arrival(0L)
                .position(0L)
                .build()

        val body = params._body()

        assertThat(body.arrival()).isEqualTo(0L)
        assertThat(body.position()).isEqualTo(0L)
    }
}
