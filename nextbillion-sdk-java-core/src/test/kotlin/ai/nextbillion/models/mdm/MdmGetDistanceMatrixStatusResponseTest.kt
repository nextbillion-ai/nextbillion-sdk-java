// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.mdm

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MdmGetDistanceMatrixStatusResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val mdmGetDistanceMatrixStatusResponse =
            MdmGetDistanceMatrixStatusResponse.builder()
                .code(MdmGetDistanceMatrixStatusResponse.Code.OK)
                .outputAddr("output_addr")
                .resultLink("result_link")
                .status("status")
                .build()

        assertThat(mdmGetDistanceMatrixStatusResponse.code())
            .contains(MdmGetDistanceMatrixStatusResponse.Code.OK)
        assertThat(mdmGetDistanceMatrixStatusResponse.outputAddr()).contains("output_addr")
        assertThat(mdmGetDistanceMatrixStatusResponse.resultLink()).contains("result_link")
        assertThat(mdmGetDistanceMatrixStatusResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mdmGetDistanceMatrixStatusResponse =
            MdmGetDistanceMatrixStatusResponse.builder()
                .code(MdmGetDistanceMatrixStatusResponse.Code.OK)
                .outputAddr("output_addr")
                .resultLink("result_link")
                .status("status")
                .build()

        val roundtrippedMdmGetDistanceMatrixStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mdmGetDistanceMatrixStatusResponse),
                jacksonTypeRef<MdmGetDistanceMatrixStatusResponse>(),
            )

        assertThat(roundtrippedMdmGetDistanceMatrixStatusResponse)
            .isEqualTo(mdmGetDistanceMatrixStatusResponse)
    }
}
