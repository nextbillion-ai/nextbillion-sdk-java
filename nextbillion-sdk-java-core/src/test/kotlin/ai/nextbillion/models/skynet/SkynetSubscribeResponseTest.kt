// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkynetSubscribeResponseTest {

    @Test
    fun create() {
        val skynetSubscribeResponse =
            SkynetSubscribeResponse.builder()
                .id("id")
                .error("error")
                .status("status")
                .timestamp(0L)
                .build()

        assertThat(skynetSubscribeResponse.id()).contains("id")
        assertThat(skynetSubscribeResponse.error()).contains("error")
        assertThat(skynetSubscribeResponse.status()).contains("status")
        assertThat(skynetSubscribeResponse.timestamp()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skynetSubscribeResponse =
            SkynetSubscribeResponse.builder()
                .id("id")
                .error("error")
                .status("status")
                .timestamp(0L)
                .build()

        val roundtrippedSkynetSubscribeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skynetSubscribeResponse),
                jacksonTypeRef<SkynetSubscribeResponse>(),
            )

        assertThat(roundtrippedSkynetSubscribeResponse).isEqualTo(skynetSubscribeResponse)
    }
}
