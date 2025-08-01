// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StepCompleteParamsTest {

    @Test
    fun create() {
        StepCompleteParams.builder()
            .routeId("routeID")
            .stepId("stepID")
            .key("key")
            .document(DocumentSubmission.builder().build())
            .mode("mode")
            .status("status")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StepCompleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("routeID")
        assertThat(params._pathParam(1)).isEqualTo("stepID")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StepCompleteParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .document(DocumentSubmission.builder().build())
                .mode("mode")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            StepCompleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key").build())
    }

    @Test
    fun body() {
        val params =
            StepCompleteParams.builder()
                .routeId("routeID")
                .stepId("stepID")
                .key("key")
                .document(DocumentSubmission.builder().build())
                .mode("mode")
                .status("status")
                .build()

        val body = params._body()

        assertThat(body.document()).contains(DocumentSubmission.builder().build())
        assertThat(body.mode()).contains("mode")
        assertThat(body.status()).contains("status")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StepCompleteParams.builder().routeId("routeID").stepId("stepID").key("key").build()

        val body = params._body()
    }
}
