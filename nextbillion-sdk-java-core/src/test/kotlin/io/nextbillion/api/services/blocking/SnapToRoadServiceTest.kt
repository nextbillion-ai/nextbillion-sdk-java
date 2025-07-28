// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.models.snaptoroads.SnapToRoadSnapParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SnapToRoadServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun snap() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val snapToRoadService = client.snapToRoads()

        val response =
            snapToRoadService.snap(
                SnapToRoadSnapParams.builder()
                    .key("key=API_KEY")
                    .path(
                        "path=41.38602272,2.17621539|41.38312885,2.17207083|41.38157854,2.17906668|41.38288511,2.18186215"
                    )
                    .approaches(SnapToRoadSnapParams.Approaches.UNRESTRICTED)
                    .avoid(SnapToRoadSnapParams.Avoid.TOLL)
                    .geometry(SnapToRoadSnapParams.Geometry.POLYLINE)
                    .mode(SnapToRoadSnapParams.Mode.CAR)
                    .option(SnapToRoadSnapParams.Option.FLEXIBLE)
                    .radiuses("radiuses=14|16|14")
                    .roadInfo(SnapToRoadSnapParams.RoadInfo.MAX_SPEED)
                    .timestamps("timestamps=1656570000|1656570015|1656570030")
                    .tolerateOutlier(true)
                    .build()
            )

        response.validate()
    }
}
