// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.mdm

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdmCreateDistanceMatrixResponseTest {

    @Test
    fun create() {
        val mdmCreateDistanceMatrixResponse =
            MdmCreateDistanceMatrixResponse.builder()
                .code("code")
                .message("message")
                .taskId("task_id")
                .addWarning("string")
                .build()

        assertThat(mdmCreateDistanceMatrixResponse.code()).contains("code")
        assertThat(mdmCreateDistanceMatrixResponse.message()).contains("message")
        assertThat(mdmCreateDistanceMatrixResponse.taskId()).contains("task_id")
        assertThat(mdmCreateDistanceMatrixResponse.warning().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mdmCreateDistanceMatrixResponse =
            MdmCreateDistanceMatrixResponse.builder()
                .code("code")
                .message("message")
                .taskId("task_id")
                .addWarning("string")
                .build()

        val roundtrippedMdmCreateDistanceMatrixResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mdmCreateDistanceMatrixResponse),
                jacksonTypeRef<MdmCreateDistanceMatrixResponse>(),
            )

        assertThat(roundtrippedMdmCreateDistanceMatrixResponse)
            .isEqualTo(mdmCreateDistanceMatrixResponse)
    }
}
