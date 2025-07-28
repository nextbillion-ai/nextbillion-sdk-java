// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.routereport

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteReportCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        RouteReportCreateParams.builder()
            .key("key=API_KEY")
            .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
            .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            RouteReportCreateParams.builder()
                .key("key=API_KEY")
                .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            RouteReportCreateParams.builder()
                .key("key=API_KEY")
                .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                .build()

        val body = params._body()

        assertThat(body.originalShape())
            .isEqualTo("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
        assertThat(body.originalShapeType())
            .isEqualTo(RouteReportCreateParams.OriginalShapeType.POLYLINE)
    }
}
