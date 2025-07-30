// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.console

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConsoleSearchResponseTest {

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
