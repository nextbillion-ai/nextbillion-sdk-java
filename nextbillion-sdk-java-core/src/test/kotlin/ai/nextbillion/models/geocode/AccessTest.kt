// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccessTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val access = Access.builder().lat(0.0).lng(0.0).build()

        assertThat(access.lat()).contains(0.0)
        assertThat(access.lng()).contains(0.0)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val access = Access.builder().lat(0.0).lng(0.0).build()

        val roundtrippedAccess =
            jsonMapper.readValue(jsonMapper.writeValueAsString(access), jacksonTypeRef<Access>())

        assertThat(roundtrippedAccess).isEqualTo(access)
    }
}
