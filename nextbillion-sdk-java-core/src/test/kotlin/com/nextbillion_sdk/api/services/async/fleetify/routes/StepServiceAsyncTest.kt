// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.fleetify.routes

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.fleetify.routes.steps.DocumentSubmission
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepCompletionMode
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepGeofenceConfig
import com.nextbillion_sdk.api.models.fleetify.routes.steps.RouteStepsRequest
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepCompleteParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepCreateParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepDeleteParams
import com.nextbillion_sdk.api.models.fleetify.routes.steps.StepUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StepServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stepServiceAsync = client.fleetify().routes().steps()

        val stepFuture =
            stepServiceAsync.create(
                StepCreateParams.builder()
                    .routeId("routeID")
                    .key("key")
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
                            .customerPhoneNumber("\"customer_phone_number\": \"+1 707 234 1234\"")
                            .instructions(
                                "\"instructions\": \"Customer asked not to ring the doorbell.\""
                            )
                            .build()
                    )
                    .position(0L)
                    .build()
            )

        val step = stepFuture.get()
        step.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stepServiceAsync = client.fleetify().routes().steps()

        val stepFuture =
            stepServiceAsync.update(
                StepUpdateParams.builder()
                    .routeId("routeID")
                    .stepId("stepID")
                    .key("key")
                    .arrival(0L)
                    .position(0L)
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
            )

        val step = stepFuture.get()
        step.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stepServiceAsync = client.fleetify().routes().steps()

        val stepFuture =
            stepServiceAsync.delete(
                StepDeleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()
            )

        val step = stepFuture.get()
        step.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun complete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val stepServiceAsync = client.fleetify().routes().steps()

        val future =
            stepServiceAsync.complete(
                StepCompleteParams.builder()
                    .routeId("routeID")
                    .stepId("stepID")
                    .key("key")
                    .document(DocumentSubmission.builder().build())
                    .mode("mode")
                    .status("status")
                    .build()
            )

        val response = future.get()
    }
}
