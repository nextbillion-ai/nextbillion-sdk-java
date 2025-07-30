// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.console

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsoleSearchParamsTest {

    @Test
    fun create() {
        ConsoleSearchParams.builder().query("query").build()
    }

    @Test
    fun queryParams() {
        val params = ConsoleSearchParams.builder().query("query").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("query", "query").build())
    }
}
