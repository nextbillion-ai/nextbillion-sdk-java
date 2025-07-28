// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoutingResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val routingResponse =
            RoutingResponse.builder()
                .approaches("approaches")
                .avoid("avoid")
                .hazmatType("hazmat_type")
                .mode("mode")
                .truckAxleLoad("truck_axle_load")
                .truckSize("truck_size")
                .truckWeight("truck_weight")
                .build()

        assertThat(routingResponse.approaches()).contains("approaches")
        assertThat(routingResponse.avoid()).contains("avoid")
        assertThat(routingResponse.hazmatType()).contains("hazmat_type")
        assertThat(routingResponse.mode()).contains("mode")
        assertThat(routingResponse.truckAxleLoad()).contains("truck_axle_load")
        assertThat(routingResponse.truckSize()).contains("truck_size")
        assertThat(routingResponse.truckWeight()).contains("truck_weight")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingResponse =
            RoutingResponse.builder()
                .approaches("approaches")
                .avoid("avoid")
                .hazmatType("hazmat_type")
                .mode("mode")
                .truckAxleLoad("truck_axle_load")
                .truckSize("truck_size")
                .truckWeight("truck_weight")
                .build()

        val roundtrippedRoutingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingResponse),
                jacksonTypeRef<RoutingResponse>(),
            )

        assertThat(roundtrippedRoutingResponse).isEqualTo(routingResponse)
    }
}
