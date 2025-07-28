// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.monitor

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MonitorCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
