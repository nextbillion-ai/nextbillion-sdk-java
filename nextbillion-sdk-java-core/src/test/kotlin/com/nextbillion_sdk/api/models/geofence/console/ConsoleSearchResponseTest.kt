// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geofence.console

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConsoleSearchResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val consoleSearchResponse =
            ConsoleSearchResponse.builder()
                .data(
                    ConsoleSearchResponse.Data.builder()
                        .addResult(
                            ConsoleSearchResponse.Data.Result.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(consoleSearchResponse.data())
            .isEqualTo(
                ConsoleSearchResponse.Data.builder()
                    .addResult(
                        ConsoleSearchResponse.Data.Result.builder().id("id").name("name").build()
                    )
                    .build()
            )
        assertThat(consoleSearchResponse.status()).isEqualTo("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val consoleSearchResponse =
            ConsoleSearchResponse.builder()
                .data(
                    ConsoleSearchResponse.Data.builder()
                        .addResult(
                            ConsoleSearchResponse.Data.Result.builder()
                                .id("id")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedConsoleSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(consoleSearchResponse),
                jacksonTypeRef<ConsoleSearchResponse>(),
            )

        assertThat(roundtrippedConsoleSearchResponse).isEqualTo(consoleSearchResponse)
    }
}
