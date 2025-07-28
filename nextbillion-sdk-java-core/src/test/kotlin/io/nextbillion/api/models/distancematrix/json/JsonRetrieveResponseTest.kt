// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.distancematrix.json

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JsonRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val jsonRetrieveResponse =
            JsonRetrieveResponse.builder()
                .msg("msg")
                .addRow(
                    JsonRetrieveResponse.Row.builder()
                        .addElement(
                            JsonRetrieveResponse.Row.Element.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        assertThat(jsonRetrieveResponse.msg()).contains("msg")
        assertThat(jsonRetrieveResponse.rows().getOrNull())
            .containsExactly(
                JsonRetrieveResponse.Row.builder()
                    .addElement(
                        JsonRetrieveResponse.Row.Element.builder()
                            .distance(0.0)
                            .duration(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(jsonRetrieveResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jsonRetrieveResponse =
            JsonRetrieveResponse.builder()
                .msg("msg")
                .addRow(
                    JsonRetrieveResponse.Row.builder()
                        .addElement(
                            JsonRetrieveResponse.Row.Element.builder()
                                .distance(0.0)
                                .duration(0.0)
                                .build()
                        )
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedJsonRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jsonRetrieveResponse),
                jacksonTypeRef<JsonRetrieveResponse>(),
            )

        assertThat(roundtrippedJsonRetrieveResponse).isEqualTo(jsonRetrieveResponse)
    }
}
