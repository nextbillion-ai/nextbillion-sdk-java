// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.routereport.RouteReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RouteReportServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val routeReportService = client.routeReport()

        val routeReport =
            routeReportService.create(
                RouteReportCreateParams.builder()
                    .key("key=API_KEY")
                    .originalShape("original_shape=sbp}_AlmgpFnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                    .build()
            )

        routeReport.validate()
    }
}
