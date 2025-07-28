// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StepDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val stepDeleteResponse = StepDeleteResponse.builder().message("message").status(0L).build()

        assertThat(stepDeleteResponse.message()).contains("message")
        assertThat(stepDeleteResponse.status()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stepDeleteResponse = StepDeleteResponse.builder().message("message").status(0L).build()

        val roundtrippedStepDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stepDeleteResponse),
                jacksonTypeRef<StepDeleteResponse>(),
            )

        assertThat(roundtrippedStepDeleteResponse).isEqualTo(stepDeleteResponse)
    }
}
