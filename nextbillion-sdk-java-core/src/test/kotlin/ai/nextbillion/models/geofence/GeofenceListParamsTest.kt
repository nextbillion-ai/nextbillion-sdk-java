// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeofenceListParamsTest {

    @Test
    fun create() {
        GeofenceListParams.builder()
            .key("key=API_KEY")
            .pn(0L)
            .ps(100L)
            .tags("tags=tags_1,O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GeofenceListParams.builder()
                .key("key=API_KEY")
                .pn(0L)
                .ps(100L)
                .tags("tags=tags_1,O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("pn", "0")
                    .put("ps", "100")
                    .put("tags", "tags=tags_1,O69Am2Y4KL8q5Y5JuD-Fy-tdtEpkTRQo_ZYIK7")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GeofenceListParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }
}
