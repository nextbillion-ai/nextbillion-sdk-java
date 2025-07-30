// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.areas

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AreaListResponseTest {

    @Test
    fun create() {
        val areaListResponse =
            AreaListResponse.builder()
                .code("code")
                .addMode("string")
                .name("name")
                .timezone(0.0)
                .build()

        assertThat(areaListResponse.code()).contains("code")
        assertThat(areaListResponse.modes().getOrNull()).containsExactly("string")
        assertThat(areaListResponse.name()).contains("name")
        assertThat(areaListResponse.timezone()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val areaListResponse =
            AreaListResponse.builder()
                .code("code")
                .addMode("string")
                .name("name")
                .timezone(0.0)
                .build()

        val roundtrippedAreaListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(areaListResponse),
                jacksonTypeRef<AreaListResponse>(),
            )

        assertThat(roundtrippedAreaListResponse).isEqualTo(areaListResponse)
    }
}
