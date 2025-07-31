// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataTest {

    @Test
    fun create() {
        val metadata = Metadata.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadata = Metadata.builder().build()

        val roundtrippedMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadata),
                jacksonTypeRef<Metadata>(),
            )

        assertThat(roundtrippedMetadata).isEqualTo(metadata)
    }
}
