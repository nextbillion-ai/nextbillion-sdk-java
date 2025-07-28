// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StepCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key")
                    .put("arrival", "0")
                    .put("location", listOf("0.0").joinToString(","))
                    .put("type", "`start`")
                    .put(
                        "address",
                        "\"address\": \"503, Dublin Drive, Los Angeles, California - 500674\",",
                    )
                    .put("completion_mode", "`manual`")
                    .put("document_template_id", "document_template_id")
                    .put("duration", "0")
                    .put("geofence_config[radius]", "0.0")
                    .put("geofence_config[type]", "circle")
                    .put("meta[customer_name]", "\"customer_name\": \"Chandler Bing\"")
                    .put(
                        "meta[customer_phone_number]",
                        "\"customer_phone_number\": \"+1 707 234 1234\"",
                    )
                    .put(
                        "meta[instructions]",
                        "\"instructions\": \"Customer asked not to ring the doorbell.\"",
                    )
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
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

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key")
                    .put("arrival", "0")
                    .put("location", listOf("0.0").joinToString(","))
                    .put("type", "`start`")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
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

        assertThat(body.position()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
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

        assertThat(body.position()).isEqualTo(0L)
    }
}
