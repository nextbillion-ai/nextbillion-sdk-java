// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val restrictionDeleteResponse =
            RestrictionDeleteResponse.builder().id(0.0).state("state").build()

        assertThat(restrictionDeleteResponse.id()).contains(0.0)
        assertThat(restrictionDeleteResponse.state()).contains("state")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val restrictionDeleteResponse =
            RestrictionDeleteResponse.builder().id(0.0).state("state").build()

        val roundtrippedRestrictionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(restrictionDeleteResponse),
                jacksonTypeRef<RestrictionDeleteResponse>(),
            )

        assertThat(roundtrippedRestrictionDeleteResponse).isEqualTo(restrictionDeleteResponse)
    }
}
