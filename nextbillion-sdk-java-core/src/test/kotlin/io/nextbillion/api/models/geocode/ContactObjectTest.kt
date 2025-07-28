// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactObjectTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val contactObject =
            ContactObject.builder()
                .addCategory(ContactObject.Category.builder().id("id").build())
                .label("label")
                .value("value")
                .build()

        assertThat(contactObject.categories().getOrNull())
            .containsExactly(ContactObject.Category.builder().id("id").build())
        assertThat(contactObject.label()).contains("label")
        assertThat(contactObject.value()).contains("value")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contactObject =
            ContactObject.builder()
                .addCategory(ContactObject.Category.builder().id("id").build())
                .label("label")
                .value("value")
                .build()

        val roundtrippedContactObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contactObject),
                jacksonTypeRef<ContactObject>(),
            )

        assertThat(roundtrippedContactObject).isEqualTo(contactObject)
    }
}
