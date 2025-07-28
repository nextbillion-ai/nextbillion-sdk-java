// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentSubmissionTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val documentSubmission = DocumentSubmission.builder().build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentSubmission = DocumentSubmission.builder().build()

        val roundtrippedDocumentSubmission =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentSubmission),
                jacksonTypeRef<DocumentSubmission>(),
            )

        assertThat(roundtrippedDocumentSubmission).isEqualTo(documentSubmission)
    }
}
