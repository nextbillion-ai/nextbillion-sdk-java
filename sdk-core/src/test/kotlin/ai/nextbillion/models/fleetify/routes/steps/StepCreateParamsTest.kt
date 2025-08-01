// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StepCreateParamsTest {

    @Test
    fun create() {
        StepCreateParams.builder()
            .routeId("routeID")
            .key("key")
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
                    .instructions("\"instructions\": \"Customer asked not to ring the doorbell.\"")
                    .build()
            )
            .position(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StepCreateParams.builder()
                .routeId("routeID")
                .key("key")
                .arrival(0L)
                .addLocation(0.0)
                .type(RouteStepsRequest.Type.START)
                .position(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StepCreateParams.builder()
                .routeId("routeID")
                .key("key")
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
                .position(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            StepCreateParams.builder()
                .routeId("routeID")
                .key("key")
                .arrival(0L)
                .addLocation(0.0)
                .type(RouteStepsRequest.Type.START)
                .position(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun body() {
        val params =
            StepCreateParams.builder()
                .routeId("routeID")
                .key("key")
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
                .position(0L)
                .build()

        val body = params._body()

        assertThat(body.arrival()).isEqualTo(0L)
        assertThat(body.location()).containsExactly(0.0)
        assertThat(body.type()).isEqualTo(RouteStepsRequest.Type.START)
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
        assertThat(body.meta())
            .contains(
                RouteStepsRequest.Meta.builder()
                    .customerName("\"customer_name\": \"Chandler Bing\"")
                    .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                    .instructions("\"instructions\": \"Customer asked not to ring the doorbell.\"")
                    .build()
            )
        assertThat(body.position()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StepCreateParams.builder()
                .routeId("routeID")
                .key("key")
                .arrival(0L)
                .addLocation(0.0)
                .type(RouteStepsRequest.Type.START)
                .position(0L)
                .build()

        val body = params._body()

        assertThat(body.arrival()).isEqualTo(0L)
        assertThat(body.location()).containsExactly(0.0)
        assertThat(body.type()).isEqualTo(RouteStepsRequest.Type.START)
        assertThat(body.position()).isEqualTo(0L)
    }
}
