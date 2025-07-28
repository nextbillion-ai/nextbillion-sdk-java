// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.postalcode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostalcodeRetrieveCoordinatesResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val postalcodeRetrieveCoordinatesResponse =
            PostalcodeRetrieveCoordinatesResponse.builder()
                .places(
                    PostalcodeRetrieveCoordinatesResponse.Places.builder()
                        .address("address")
                        .boundary(
                            PostalcodeRetrieveCoordinatesResponse.Places.Boundary.builder()
                                .geometry(
                                    PostalcodeRetrieveCoordinatesResponse.Places.Boundary.Geometry
                                        .builder()
                                        .addCoordinate(listOf(listOf(0.0)))
                                        .type("type")
                                        .build()
                                )
                                .addMultipolygon(
                                    PostalcodeRetrieveCoordinatesResponse.Places.Boundary
                                        .Multipolygon
                                        .builder()
                                        .addPolygon(
                                            PostalcodeRetrieveCoordinatesResponse.Places.Boundary
                                                .Multipolygon
                                                .Polygon
                                                .builder()
                                                .addPoint(
                                                    PostalcodeRetrieveCoordinatesResponse.Places
                                                        .Boundary
                                                        .Multipolygon
                                                        .Polygon
                                                        .Point
                                                        .builder()
                                                        .lat(0.0)
                                                        .lng(0.0)
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .properties("properties")
                                .type("type")
                                .build()
                        )
                        .country("country")
                        .countryCode("countryCode")
                        .distance(0.0)
                        .district("district")
                        .geopoint(
                            PostalcodeRetrieveCoordinatesResponse.Places.Geopoint.builder()
                                .lat(0.0)
                                .lng(0.0)
                                .build()
                        )
                        .postalcode("postalcode")
                        .state("state")
                        .subdistrict("subdistrict")
                        .build()
                )
                .addWarning("string")
                .build()

        assertThat(postalcodeRetrieveCoordinatesResponse.places())
            .contains(
                PostalcodeRetrieveCoordinatesResponse.Places.builder()
                    .address("address")
                    .boundary(
                        PostalcodeRetrieveCoordinatesResponse.Places.Boundary.builder()
                            .geometry(
                                PostalcodeRetrieveCoordinatesResponse.Places.Boundary.Geometry
                                    .builder()
                                    .addCoordinate(listOf(listOf(0.0)))
                                    .type("type")
                                    .build()
                            )
                            .addMultipolygon(
                                PostalcodeRetrieveCoordinatesResponse.Places.Boundary.Multipolygon
                                    .builder()
                                    .addPolygon(
                                        PostalcodeRetrieveCoordinatesResponse.Places.Boundary
                                            .Multipolygon
                                            .Polygon
                                            .builder()
                                            .addPoint(
                                                PostalcodeRetrieveCoordinatesResponse.Places
                                                    .Boundary
                                                    .Multipolygon
                                                    .Polygon
                                                    .Point
                                                    .builder()
                                                    .lat(0.0)
                                                    .lng(0.0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .properties("properties")
                            .type("type")
                            .build()
                    )
                    .country("country")
                    .countryCode("countryCode")
                    .distance(0.0)
                    .district("district")
                    .geopoint(
                        PostalcodeRetrieveCoordinatesResponse.Places.Geopoint.builder()
                            .lat(0.0)
                            .lng(0.0)
                            .build()
                    )
                    .postalcode("postalcode")
                    .state("state")
                    .subdistrict("subdistrict")
                    .build()
            )
        assertThat(postalcodeRetrieveCoordinatesResponse.warning().getOrNull())
            .containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postalcodeRetrieveCoordinatesResponse =
            PostalcodeRetrieveCoordinatesResponse.builder()
                .places(
                    PostalcodeRetrieveCoordinatesResponse.Places.builder()
                        .address("address")
                        .boundary(
                            PostalcodeRetrieveCoordinatesResponse.Places.Boundary.builder()
                                .geometry(
                                    PostalcodeRetrieveCoordinatesResponse.Places.Boundary.Geometry
                                        .builder()
                                        .addCoordinate(listOf(listOf(0.0)))
                                        .type("type")
                                        .build()
                                )
                                .addMultipolygon(
                                    PostalcodeRetrieveCoordinatesResponse.Places.Boundary
                                        .Multipolygon
                                        .builder()
                                        .addPolygon(
                                            PostalcodeRetrieveCoordinatesResponse.Places.Boundary
                                                .Multipolygon
                                                .Polygon
                                                .builder()
                                                .addPoint(
                                                    PostalcodeRetrieveCoordinatesResponse.Places
                                                        .Boundary
                                                        .Multipolygon
                                                        .Polygon
                                                        .Point
                                                        .builder()
                                                        .lat(0.0)
                                                        .lng(0.0)
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .properties("properties")
                                .type("type")
                                .build()
                        )
                        .country("country")
                        .countryCode("countryCode")
                        .distance(0.0)
                        .district("district")
                        .geopoint(
                            PostalcodeRetrieveCoordinatesResponse.Places.Geopoint.builder()
                                .lat(0.0)
                                .lng(0.0)
                                .build()
                        )
                        .postalcode("postalcode")
                        .state("state")
                        .subdistrict("subdistrict")
                        .build()
                )
                .addWarning("string")
                .build()

        val roundtrippedPostalcodeRetrieveCoordinatesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postalcodeRetrieveCoordinatesResponse),
                jacksonTypeRef<PostalcodeRetrieveCoordinatesResponse>(),
            )

        assertThat(roundtrippedPostalcodeRetrieveCoordinatesResponse)
            .isEqualTo(postalcodeRetrieveCoordinatesResponse)
    }
}
