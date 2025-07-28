// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.console

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConsolePreviewResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val consolePreviewResponse =
            ConsolePreviewResponse.builder()
                .data(
                    ConsolePreviewResponse.Data.builder()
                        .geojson(
                            PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build()
                        )
                        .build()
                )
                .message("message")
                .build()

        assertThat(consolePreviewResponse.data())
            .contains(
                ConsolePreviewResponse.Data.builder()
                    .geojson(
                        PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build()
                    )
                    .build()
            )
        assertThat(consolePreviewResponse.message()).contains("message")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val consolePreviewResponse =
            ConsolePreviewResponse.builder()
                .data(
                    ConsolePreviewResponse.Data.builder()
                        .geojson(
                            PolygonGeojson.builder().addCoordinate(listOf(0.0)).type("type").build()
                        )
                        .build()
                )
                .message("message")
                .build()

        val roundtrippedConsolePreviewResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(consolePreviewResponse),
                jacksonTypeRef<ConsolePreviewResponse>(),
            )

        assertThat(roundtrippedConsolePreviewResponse).isEqualTo(consolePreviewResponse)
    }
}
