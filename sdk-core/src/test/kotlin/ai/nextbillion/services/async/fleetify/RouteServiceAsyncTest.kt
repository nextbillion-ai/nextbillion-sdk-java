// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.fleetify

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.fleetify.routes.RouteCreateParams
import ai.nextbillion.models.fleetify.routes.RouteRedispatchParams
import ai.nextbillion.models.fleetify.routes.steps.RouteStepCompletionMode
import ai.nextbillion.models.fleetify.routes.steps.RouteStepGeofenceConfig
import ai.nextbillion.models.fleetify.routes.steps.RouteStepsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RouteServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeServiceAsync = client.fleetify().routes()

        val routeFuture =
            routeServiceAsync.create(
                RouteCreateParams.builder()
                    .key("key")
                    .driverEmail("johndoe@abc.com")
                    .addStep(
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
                    .distance(0L)
                    .documentTemplateId(
                        "\"document_template_id\": \"bfbc4799-bc2f-4515-9054-d888560909bf\""
                    )
                    .roRequestId("ro_request_id")
                    .routing(
                        RouteCreateParams.Routing.builder()
                            .approaches(RouteCreateParams.Routing.Approaches.UNRESTRICTED)
                            .avoid(RouteCreateParams.Routing.Avoid.TOLL)
                            .hazmatType(RouteCreateParams.Routing.HazmatType.GENERAL)
                            .mode(RouteCreateParams.Routing.Mode.CAR)
                            .truckAxleLoad(0L)
                            .truckSize("\"truck_size\": \"200, 210, 600\"")
                            .truckWeight(0L)
                            .build()
                    )
                    .build()
            )

        val route = routeFuture.get()
        route.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun redispatch() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeServiceAsync = client.fleetify().routes()

        val responseFuture =
            routeServiceAsync.redispatch(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
