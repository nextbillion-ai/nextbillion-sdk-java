// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CategoriesTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val categories = Categories.builder().id("id").name("name").primary("primary").build()

        assertThat(categories.id()).contains("id")
        assertThat(categories.name()).contains("name")
        assertThat(categories.primary()).contains("primary")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val categories = Categories.builder().id("id").name("name").primary("primary").build()

        val roundtrippedCategories =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(categories),
                jacksonTypeRef<Categories>(),
            )

        assertThat(roundtrippedCategories).isEqualTo(categories)
    }
}
