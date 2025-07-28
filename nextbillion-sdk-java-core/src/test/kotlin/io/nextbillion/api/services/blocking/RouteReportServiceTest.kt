// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.models.routereport.RouteReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RouteReportServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val routeReportService = client.routeReport()

        val routeReport =
            routeReportService.create(
                RouteReportCreateParams.builder()
                    .key("key=API_KEY")
                    .originalShape("original_shape=sbp}_Almgp`FnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                    .build()
            )

        routeReport.validate()
    }
}
