// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeofenceContainsParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        GeofenceContainsParams.builder()
            .key("key=API_KEY")
            .locations("13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299")
            .geofences(
                "geofences=80d1fa55-6287-4da0-93ac-2fc162d0a228,70d1fa55-1287-4da0-93ac-2fc162d0a228"
            )
            .verbose("verbose=true")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            GeofenceContainsParams.builder()
                .key("key=API_KEY")
                .locations(
                    "13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299"
                )
                .geofences(
                    "geofences=80d1fa55-6287-4da0-93ac-2fc162d0a228,70d1fa55-1287-4da0-93ac-2fc162d0a228"
                )
                .verbose("verbose=true")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "locations",
                        "13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299",
                    )
                    .put(
                        "geofences",
                        "geofences=80d1fa55-6287-4da0-93ac-2fc162d0a228,70d1fa55-1287-4da0-93ac-2fc162d0a228",
                    )
                    .put("verbose", "verbose=true")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GeofenceContainsParams.builder()
                .key("key=API_KEY")
                .locations(
                    "13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299"
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put(
                        "locations",
                        "13.25805884388484,77.91083661048299|13.25805884388484,77.91083661048299",
                    )
                    .build()
            )
    }
}
