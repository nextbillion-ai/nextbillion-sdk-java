// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShipmentTest {

    @Test
    fun create() {
        val shipment =
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

        assertThat(shipment.delivery())
            .isEqualTo(
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
        assertThat(shipment.pickup())
            .isEqualTo(
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
        assertThat(shipment.amount().getOrNull()).containsExactly(0L)
        assertThat(shipment.followLifoOrder()).contains(true)
        assertThat(shipment.incompatibleLoadTypes().getOrNull()).containsExactly("string")
        assertThat(shipment.jointOrder()).contains(0L)
        assertThat(shipment.loadTypes().getOrNull()).containsExactly("string")
        assertThat(shipment.maxTimeInVehicle()).contains(0L)
        assertThat(shipment.outsourcingCost()).contains(0L)
        assertThat(shipment.priority()).contains(0L)
        assertThat(shipment.revenue()).contains(0L)
        assertThat(shipment.skills().getOrNull()).containsExactly(0L)
        assertThat(shipment.volume())
            .contains(
                Shipment.Volume.builder()
                    .alignment(Shipment.Volume.Alignment.STRICT)
                    .depth(0.0)
                    .height(0.0)
                    .width(0.0)
                    .build()
            )
        assertThat(shipment.zones().getOrNull()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shipment =
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

        val roundtrippedShipment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(shipment),
                jacksonTypeRef<Shipment>(),
            )

        assertThat(roundtrippedShipment).isEqualTo(shipment)
    }
}
