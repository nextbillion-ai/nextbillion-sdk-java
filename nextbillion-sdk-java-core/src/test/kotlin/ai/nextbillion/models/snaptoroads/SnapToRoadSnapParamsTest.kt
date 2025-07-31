// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.snaptoroads

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapToRoadSnapParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "path",
                        "path=41.38602272,2.17621539|41.38312885,2.17207083|41.38157854,2.17906668|41.38288511,2.18186215",
                    )
                    .put("approaches", "`unrestricted`")
                    .put("avoid", "toll")
                    .put("geometry", "`polyline`")
                    .put("mode", "`car`")
                    .put("option", "`flexible`")
                    .put("radiuses", "radiuses=14|16|14")
                    .put("road_info", "`max_speed`")
                    .put("timestamps", "timestamps=1656570000|1656570015|1656570030")
                    .put("tolerate_outlier", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SnapToRoadSnapParams.builder()
                .key("key=API_KEY")
                .path(
                    "path=41.38602272,2.17621539|41.38312885,2.17207083|41.38157854,2.17906668|41.38288511,2.18186215"
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "path",
                        "path=41.38602272,2.17621539|41.38312885,2.17207083|41.38157854,2.17906668|41.38288511,2.18186215",
                    )
                    .build()
            )
    }
}
