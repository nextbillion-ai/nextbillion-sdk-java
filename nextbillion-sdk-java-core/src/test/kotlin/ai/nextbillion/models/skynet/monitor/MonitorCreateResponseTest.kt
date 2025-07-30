// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MonitorCreateResponseTest {

    @Test
    fun create() {
        val monitorCreateResponse =
            MonitorCreateResponse.builder()
                .data(MonitorCreateResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        assertThat(monitorCreateResponse.data())
            .contains(MonitorCreateResponse.Data.builder().id("id").build())
        assertThat(monitorCreateResponse.message()).contains("message")
        assertThat(monitorCreateResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val monitorCreateResponse =
            MonitorCreateResponse.builder()
                .data(MonitorCreateResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        val roundtrippedMonitorCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(monitorCreateResponse),
                jacksonTypeRef<MonitorCreateResponse>(),
            )

        assertThat(roundtrippedMonitorCreateResponse).isEqualTo(monitorCreateResponse)
    }
}
