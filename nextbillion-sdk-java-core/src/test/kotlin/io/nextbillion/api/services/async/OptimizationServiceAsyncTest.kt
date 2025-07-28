// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.models.optimization.OptimizationComputeParams
import io.nextbillion.api.models.optimization.OptimizationReOptimizeParams
import io.nextbillion.api.models.optimization.driverassignment.Location
import io.nextbillion.api.models.optimization.driverassignment.Vehicle
import io.nextbillion.api.models.optimization.v2.Job
import io.nextbillion.api.models.optimization.v2.Shipment
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OptimizationServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun compute() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val optimizationServiceAsync = client.optimization()

        val responseFuture =
            optimizationServiceAsync.compute(
                OptimizationComputeParams.builder()
                    .coordinates(
                        "coordinates=41.35544869444527,2.0747669962025292|41.37498154684205,2.103705 4530396886|41.38772862000152,2.1311887061315526"
                    )
                    .key("key=API_KEY")
                    .approaches(OptimizationComputeParams.Approaches.UNRESTRICTED)
                    .destination(OptimizationComputeParams.Destination.ANY)
                    .geometries(OptimizationComputeParams.Geometries.POLYLINE)
                    .mode(OptimizationComputeParams.Mode.CAR)
                    .roundtrip(true)
                    .source(OptimizationComputeParams.Source.ANY)
                    .withGeometry(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun reOptimize() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val optimizationServiceAsync = client.optimization()

        val postResponseFuture =
            optimizationServiceAsync.reOptimize(
                OptimizationReOptimizeParams.builder()
                    .key("key=API_KEY")
                    .existingRequestId("existing_request_id")
                    .jobChanges(
                        OptimizationReOptimizeParams.JobChanges.builder()
                            .addAdd(
                                Job.builder()
                                    .id("\"id\":\"Job 1\"")
                                    .locationIndex(0L)
                                    .addDelivery(0L)
                                    .addDepotId("string")
                                    .description("description")
                                    .followLifoOrder(true)
                                    .addIncompatibleLoadType("string")
                                    .jointOrder(0L)
                                    .addLoadType("string")
                                    .maxVisitLateness(0L)
                                    .metadata(
                                        JsonValue.from(
                                            "{\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                        )
                                    )
                                    .outsourcingCost(0L)
                                    .addPickup(0L)
                                    .priority(0L)
                                    .revenue(0L)
                                    .sequenceOrder(0L)
                                    .service(0L)
                                    .setup(0L)
                                    .addSkill(1L)
                                    .addTimeWindow(listOf(0L))
                                    .volume(
                                        Job.Volume.builder()
                                            .alignment(Job.Volume.Alignment.STRICT)
                                            .depth(0.0)
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .addZone(0L)
                                    .build()
                            )
                            .addModify(
                                Job.builder()
                                    .id("\"id\":\"Job 1\"")
                                    .locationIndex(0L)
                                    .addDelivery(0L)
                                    .addDepotId("string")
                                    .description("description")
                                    .followLifoOrder(true)
                                    .addIncompatibleLoadType("string")
                                    .jointOrder(0L)
                                    .addLoadType("string")
                                    .maxVisitLateness(0L)
                                    .metadata(
                                        JsonValue.from(
                                            "{\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                        )
                                    )
                                    .outsourcingCost(0L)
                                    .addPickup(0L)
                                    .priority(0L)
                                    .revenue(0L)
                                    .sequenceOrder(0L)
                                    .service(0L)
                                    .setup(0L)
                                    .addSkill(1L)
                                    .addTimeWindow(listOf(0L))
                                    .volume(
                                        Job.Volume.builder()
                                            .alignment(Job.Volume.Alignment.STRICT)
                                            .depth(0.0)
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .addZone(0L)
                                    .build()
                            )
                            .addRemove("string")
                            .build()
                    )
                    .addLocation("string")
                    .shipmentChanges(
                        OptimizationReOptimizeParams.ShipmentChanges.builder()
                            .addAdd(
                                Shipment.builder()
                                    .delivery(
                                        Shipment.Delivery.builder()
                                            .id("\"id\":\"Shipment Delivery 1\"")
                                            .locationIndex(0L)
                                            .description("description")
                                            .maxVisitLateness(0L)
                                            .metadata(
                                                JsonValue.from(
                                                    "{\n  \"notes\": \"dropoff at the patio\",\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                                )
                                            )
                                            .sequenceOrder(0L)
                                            .service(0L)
                                            .setup(0L)
                                            .addTimeWindow(listOf(0L))
                                            .build()
                                    )
                                    .pickup(
                                        Shipment.Pickup.builder()
                                            .id("\"id\": \"Shipment Pickup 1\"")
                                            .locationIndex(0L)
                                            .description("description")
                                            .maxVisitLateness(0L)
                                            .metadata(
                                                JsonValue.from(
                                                    "{\n  \"notes\": \"involves fragile items\",\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                                )
                                            )
                                            .sequenceOrder(0L)
                                            .service(0L)
                                            .setup(0L)
                                            .addTimeWindow(listOf(0L))
                                            .build()
                                    )
                                    .addAmount(0L)
                                    .followLifoOrder(true)
                                    .addIncompatibleLoadType("string")
                                    .jointOrder(0L)
                                    .addLoadType("string")
                                    .maxTimeInVehicle(0L)
                                    .outsourcingCost(0L)
                                    .priority(0L)
                                    .revenue(0L)
                                    .addSkill(0L)
                                    .volume(
                                        Shipment.Volume.builder()
                                            .alignment(Shipment.Volume.Alignment.STRICT)
                                            .depth(0.0)
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .addZone(0L)
                                    .build()
                            )
                            .addModify(
                                Shipment.builder()
                                    .delivery(
                                        Shipment.Delivery.builder()
                                            .id("\"id\":\"Shipment Delivery 1\"")
                                            .locationIndex(0L)
                                            .description("description")
                                            .maxVisitLateness(0L)
                                            .metadata(
                                                JsonValue.from(
                                                    "{\n  \"notes\": \"dropoff at the patio\",\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                                )
                                            )
                                            .sequenceOrder(0L)
                                            .service(0L)
                                            .setup(0L)
                                            .addTimeWindow(listOf(0L))
                                            .build()
                                    )
                                    .pickup(
                                        Shipment.Pickup.builder()
                                            .id("\"id\": \"Shipment Pickup 1\"")
                                            .locationIndex(0L)
                                            .description("description")
                                            .maxVisitLateness(0L)
                                            .metadata(
                                                JsonValue.from(
                                                    "{\n  \"notes\": \"involves fragile items\",\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"
                                                )
                                            )
                                            .sequenceOrder(0L)
                                            .service(0L)
                                            .setup(0L)
                                            .addTimeWindow(listOf(0L))
                                            .build()
                                    )
                                    .addAmount(0L)
                                    .followLifoOrder(true)
                                    .addIncompatibleLoadType("string")
                                    .jointOrder(0L)
                                    .addLoadType("string")
                                    .maxTimeInVehicle(0L)
                                    .outsourcingCost(0L)
                                    .priority(0L)
                                    .revenue(0L)
                                    .addSkill(0L)
                                    .volume(
                                        Shipment.Volume.builder()
                                            .alignment(Shipment.Volume.Alignment.STRICT)
                                            .depth(0.0)
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .addZone(0L)
                                    .build()
                            )
                            .addRemove("string")
                            .build()
                    )
                    .vehicleChanges(
                        OptimizationReOptimizeParams.VehicleChanges.builder()
                            .addAdd(
                                Vehicle.builder()
                                    .id("id")
                                    .location(Vehicle.Location.builder().lat(0.0).lng(0.0).build())
                                    .attributes(
                                        JsonValue.from(
                                            "\"attributes\":{\n    \"driver_rating\": \"4.0\",\n    \"trip_types\": \"premium\"\n  }"
                                        )
                                    )
                                    .priority(0L)
                                    .addRemainingWaypoint(
                                        Location.builder().lat(-90.0).lon(-180.0).build()
                                    )
                                    .build()
                            )
                            .modify(
                                Vehicle.builder()
                                    .id("id")
                                    .location(Vehicle.Location.builder().lat(0.0).lng(0.0).build())
                                    .attributes(
                                        JsonValue.from(
                                            "\"attributes\":{\n    \"driver_rating\": \"4.0\",\n    \"trip_types\": \"premium\"\n  }"
                                        )
                                    )
                                    .priority(0L)
                                    .addRemainingWaypoint(
                                        Location.builder().lat(-90.0).lon(-180.0).build()
                                    )
                                    .build()
                            )
                            .addRemove("string")
                            .build()
                    )
                    .build()
            )

        val postResponse = postResponseFuture.get()
        postResponse.validate()
    }
}
