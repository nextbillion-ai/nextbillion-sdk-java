// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetaDataTest {

    @Test
    fun create() {
        val metaData = MetaData.builder().build()
    }

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
