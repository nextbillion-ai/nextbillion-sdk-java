// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.fleetify.routes.steps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
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
