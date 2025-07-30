// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.isochrone

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsochroneComputeResponseTest {

    @Test
    fun create() {
        val isochroneComputeResponse =
            IsochroneComputeResponse.builder()
                .addFeature(
                    IsochroneComputeResponse.Feature.builder()
                        .geometry(
                            IsochroneComputeResponse.Feature.Geometry.builder()
                                .addCoordinate(0.0)
                                .type("type")
                                .build()
                        )
                        .properties(
                            IsochroneComputeResponse.Feature.Properties.builder()
                                .color("color")
                                .contour(0.0)
                                .fill("fill")
                                .fillColor("fillColor")
                                .fillOpacity(0.0)
                                .metric("metric")
                                .opacity(0.0)
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .msg("msg")
                .status("status")
                .type("type")
                .build()

        assertThat(isochroneComputeResponse.features().getOrNull())
            .containsExactly(
                IsochroneComputeResponse.Feature.builder()
                    .geometry(
                        IsochroneComputeResponse.Feature.Geometry.builder()
                            .addCoordinate(0.0)
                            .type("type")
                            .build()
                    )
                    .properties(
                        IsochroneComputeResponse.Feature.Properties.builder()
                            .color("color")
                            .contour(0.0)
                            .fill("fill")
                            .fillColor("fillColor")
                            .fillOpacity(0.0)
                            .metric("metric")
                            .opacity(0.0)
                            .build()
                    )
                    .type("type")
                    .build()
            )
        assertThat(isochroneComputeResponse.msg()).contains("msg")
        assertThat(isochroneComputeResponse.status()).contains("status")
        assertThat(isochroneComputeResponse.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isochroneComputeResponse =
            IsochroneComputeResponse.builder()
                .addFeature(
                    IsochroneComputeResponse.Feature.builder()
                        .geometry(
                            IsochroneComputeResponse.Feature.Geometry.builder()
                                .addCoordinate(0.0)
                                .type("type")
                                .build()
                        )
                        .properties(
                            IsochroneComputeResponse.Feature.Properties.builder()
                                .color("color")
                                .contour(0.0)
                                .fill("fill")
                                .fillColor("fillColor")
                                .fillOpacity(0.0)
                                .metric("metric")
                                .opacity(0.0)
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .msg("msg")
                .status("status")
                .type("type")
                .build()

        val roundtrippedIsochroneComputeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isochroneComputeResponse),
                jacksonTypeRef<IsochroneComputeResponse>(),
            )

        assertThat(roundtrippedIsochroneComputeResponse).isEqualTo(isochroneComputeResponse)
    }
}
