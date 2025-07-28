// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.routereport.RouteReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RouteReportServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeReportServiceAsync = client.routeReport()

        val routeReportFuture =
            routeReportServiceAsync.create(
                RouteReportCreateParams.builder()
                    .key("key=API_KEY")
                    .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                    .build()
            )

        val routeReport = routeReportFuture.get()
        routeReport.validate()
    }
}
