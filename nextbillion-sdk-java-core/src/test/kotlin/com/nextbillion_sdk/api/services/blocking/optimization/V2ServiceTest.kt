// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.optimization

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.models.optimization.driverassignment.Location
import com.nextbillion_sdk.api.models.optimization.driverassignment.Vehicle
import com.nextbillion_sdk.api.models.optimization.v2.Job
import com.nextbillion_sdk.api.models.optimization.v2.Shipment
import com.nextbillion_sdk.api.models.optimization.v2.V2RetrieveResultParams
import com.nextbillion_sdk.api.models.optimization.v2.V2SubmitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V2ServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveResult() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v2Service = client.optimization().v2()

        val response =
            v2Service.retrieveResult(
                V2RetrieveResultParams.builder().id("id").key("key=API_KEY").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun submit() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v2Service = client.optimization().v2()

        val postResponse =
            v2Service.submit(
                V2SubmitParams.builder()
                    .key("key=API_KEY")
                    .locations(
                        V2SubmitParams.Locations.builder()
                            .addLocation("string")
                            .id(0L)
                            .addApproach(V2SubmitParams.Locations.Approach.UNRESTRICTED)
                            .build()
                    )
                    .addVehicle(
                        Vehicle.builder()
                            .id("id")
                            .location(Vehicle.Location.builder().lat(0.0).lng(0.0).build())
                            .attributes(
                                JsonValue.from(
                                    "\"attributes\":{\n    \"driver_rating\": \"4.0\",\n    \"trip_types\": \"premium\"\n  }"
                                )
                            )
                            .priority(0L)
                            .addRemainingWaypoint(Location.builder().lat(-90.0).lon(-180.0).build())
                            .build()
                    )
                    .addCostMatrix(listOf(0L))
                    .addDepot(
                        V2SubmitParams.Depot.builder()
                            .id("\"id\":\"depot 1\"")
                            .locationIndex(0L)
                            .description("“description”:”Los_Angeles_depot”")
                            .service(0L)
                            .addTimeWindow(listOf(0L))
                            .build()
                    )
                    .description("\"description\": \"Sample Optimization\"")
                    .addDistanceMatrix(listOf(0L))
                    .addDurationMatrix(listOf(0L))
                    .existingSolutionId("existing_solution_id")
                    .addJob(
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
                    .options(
                        V2SubmitParams.Options.builder()
                            .constraint(
                                V2SubmitParams.Options.Constraint.builder()
                                    .maxActivityWaitingTime(0L)
                                    .maxVehicleOvertime(0L)
                                    .maxVisitLateness(0L)
                                    .build()
                            )
                            .grouping(
                                V2SubmitParams.Options.Grouping.builder()
                                    .orderGrouping(
                                        V2SubmitParams.Options.Grouping.OrderGrouping.builder()
                                            .groupingDiameter(0.0)
                                            .build()
                                    )
                                    .proximityFactor(0.0)
                                    .routeGrouping(
                                        V2SubmitParams.Options.Grouping.RouteGrouping.builder()
                                            .penaltyFactor(0.0)
                                            .zoneDiameter(0.0)
                                            .zoneSource(
                                                V2SubmitParams.Options.Grouping.RouteGrouping
                                                    .ZoneSource
                                                    .SYSTEM_GENERATED
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .objective(
                                V2SubmitParams.Options.Objective.builder()
                                    .allowEarlyArrival(true)
                                    .custom(
                                        V2SubmitParams.Options.Objective.Custom.builder()
                                            .type(V2SubmitParams.Options.Objective.Custom.Type.MIN)
                                            .value(
                                                V2SubmitParams.Options.Objective.Custom.Value
                                                    .VEHICLES
                                            )
                                            .build()
                                    )
                                    .minimiseNumDepots(true)
                                    .solverMode(
                                        V2SubmitParams.Options.Objective.SolverMode.FLEXIBLE
                                    )
                                    .solvingTimeLimit(0L)
                                    .travelCost(
                                        V2SubmitParams.Options.Objective.TravelCost.DURATION
                                    )
                                    .build()
                            )
                            .routing(
                                V2SubmitParams.Options.Routing.builder()
                                    .addAllow(V2SubmitParams.Options.Routing.Allow.TAXI)
                                    .addAvoid(V2SubmitParams.Options.Routing.Avoid.TOLL)
                                    .context(V2SubmitParams.Options.Routing.Context.AVGSPEED)
                                    .crossBorder(true)
                                    .disableCache(true)
                                    .addHazmatType(
                                        V2SubmitParams.Options.Routing.HazmatType.GENERAL
                                    )
                                    .mode(V2SubmitParams.Options.Routing.Mode.CAR)
                                    .profiles(
                                        JsonValue.from(
                                            "\"profiles\":{\n    \"mini-van\":{\n        \"mode\": \"car\",\n        \"avoid\":[\"highway, toll\"]\n        },\n    \"trailer\":{\n        \"mode\": \"truck\",\n        \"truck_weight\":12000,\n        \"truck_size\":\"200, 210, 600\",\n        \"hazmat_type\": [\"general\", \"harmful_to_water\"]\n        }\n    }\n"
                                        )
                                    )
                                    .trafficTimestamp(0L)
                                    .truckAxleLoad(0.0)
                                    .truckSize("\"truck_size\":\"200,210,600\"")
                                    .truckWeight(0L)
                                    .build()
                            )
                            .build()
                    )
                    .addRelation(
                        V2SubmitParams.Relation.builder()
                            .addStep(
                                V2SubmitParams.Relation.Step.builder()
                                    .type(V2SubmitParams.Relation.Step.Type.START)
                                    .id("\"id\":\"Job 1\"")
                                    .build()
                            )
                            .type(V2SubmitParams.Relation.Type.IN_SAME_ROUTE)
                            .id(0L)
                            .maxDuration(0L)
                            .minDuration(0L)
                            .vehicle("\"vehicle\": \"Vehicle 10\"")
                            .build()
                    )
                    .addShipment(
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
                    .addSolution(
                        V2SubmitParams.Solution.builder()
                            .cost(0L)
                            .addStep(
                                V2SubmitParams.Solution.Step.builder()
                                    .id("\"id\": \"Job 10\"")
                                    .arrival(0L)
                                    .type(V2SubmitParams.Solution.Step.Type.START)
                                    .description("description")
                                    .distance(0L)
                                    .duration(0L)
                                    .addLoad(0L)
                                    .addLocation(0.0)
                                    .locationIndex(0L)
                                    .service(0L)
                                    .setup(0L)
                                    .waitingTime(0L)
                                    .build()
                            )
                            .vehicle("vehicle")
                            .addDelivery(0L)
                            .description("description")
                            .distance(0L)
                            .duration(0L)
                            .geometry("\"geometry\": \"}ebGgcsxRE?CuDOYCYAG???\"")
                            .addPickup(0L)
                            .priority(0L)
                            .service(0L)
                            .setup(0L)
                            .waitingTime(0L)
                            .build()
                    )
                    .unassigned(
                        V2SubmitParams.Unassigned.builder()
                            .addJob("string")
                            .addShipment(listOf("string"))
                            .build()
                    )
                    .addZone(
                        V2SubmitParams.Zone.builder()
                            .id(0L)
                            .geofenceId("geofence_id")
                            .geometry(
                                V2SubmitParams.Zone.Geometry.builder()
                                    .addCoordinate(listOf(0.0))
                                    .description("description")
                                    .type(V2SubmitParams.Zone.Geometry.Type.POLYGON)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        postResponse.validate()
    }
}
