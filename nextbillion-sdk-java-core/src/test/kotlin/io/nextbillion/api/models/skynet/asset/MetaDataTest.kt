// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetaDataTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val metaData = MetaData.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metaData = MetaData.builder().build()

        val roundtrippedMetaData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metaData),
                jacksonTypeRef<MetaData>(),
            )

        assertThat(roundtrippedMetaData).isEqualTo(metaData)
    }
}
