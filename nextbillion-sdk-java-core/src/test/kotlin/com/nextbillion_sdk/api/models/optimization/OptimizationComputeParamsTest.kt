// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OptimizationComputeParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "coordinates",
                        "coordinates=41.35544869444527,2.0747669962025292|41.37498154684205,2.103705 4530396886|41.38772862000152,2.1311887061315526",
                    )
                    .put("key", "key=API_KEY")
                    .put("approaches", "`unrestricted`")
                    .put("destination", "`any`")
                    .put("geometries", "`polyline`")
                    .put("mode", "`car`")
                    .put("roundtrip", "true")
                    .put("source", "`any`")
                    .put("with_geometry", "true")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            OptimizationComputeParams.builder()
                .coordinates(
                    "coordinates=41.35544869444527,2.0747669962025292|41.37498154684205,2.103705 4530396886|41.38772862000152,2.1311887061315526"
                )
                .key("key=API_KEY")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "coordinates",
                        "coordinates=41.35544869444527,2.0747669962025292|41.37498154684205,2.103705 4530396886|41.38772862000152,2.1311887061315526",
                    )
                    .put("key", "key=API_KEY")
                    .build()
            )
    }
}
