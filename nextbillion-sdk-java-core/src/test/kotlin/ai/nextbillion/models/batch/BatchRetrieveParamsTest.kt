// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.batch

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchRetrieveParamsTest {

    @Test
    fun create() {
        BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()
    }

    @Test
    fun queryParams() {
        val params = BatchRetrieveParams.builder().key("key=API_KEY").trackId("track_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("track_id", "track_id").build()
            )
    }
}
