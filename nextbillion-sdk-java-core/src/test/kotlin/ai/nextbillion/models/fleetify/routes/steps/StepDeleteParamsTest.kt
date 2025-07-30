// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StepDeleteParamsTest {

    @Test
    fun create() {
        StepDeleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()
    }

    @Test
    fun pathParams() {
        val params =
            StepDeleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        assertThat(params._pathParam(1)).isEqualTo("stepID")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StepDeleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }
}
