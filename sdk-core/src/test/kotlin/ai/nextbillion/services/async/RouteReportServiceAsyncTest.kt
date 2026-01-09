// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.routereport.RouteReportCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RouteReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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
                    .originalShape("original_shape=sbp}_AlmgpFnLuToKmKviB{eDlcGhpFvj@qbAwoA_mA")
                    .originalShapeType(RouteReportCreateParams.OriginalShapeType.POLYLINE)
                    .build()
            )

        val routeReport = routeReportFuture.get()
        routeReport.validate()
    }
}
