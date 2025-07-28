// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ContactsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val contacts =
            Contacts.builder()
                .addEmail(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addFax(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addMobile(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addPhone(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addTollFree(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addWww(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .build()

        assertThat(contacts.email().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
        assertThat(contacts.fax().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
        assertThat(contacts.mobile().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
        assertThat(contacts.phone().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
        assertThat(contacts.tollFree().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
        assertThat(contacts.www().getOrNull())
            .containsExactly(
                ContactObject.builder()
                    .addCategory(ContactObject.Category.builder().id("id").build())
                    .label("label")
                    .value("value")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contacts =
            Contacts.builder()
                .addEmail(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addFax(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addMobile(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addPhone(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addTollFree(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .addWww(
                    ContactObject.builder()
                        .addCategory(ContactObject.Category.builder().id("id").build())
                        .label("label")
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedContacts =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contacts),
                jacksonTypeRef<Contacts>(),
            )

        assertThat(roundtrippedContacts).isEqualTo(contacts)
    }
}
