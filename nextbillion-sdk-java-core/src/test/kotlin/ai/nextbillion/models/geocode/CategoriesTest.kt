// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CategoriesTest {

    @Test
    fun create() {
        val categories = Categories.builder().id("id").name("name").primary("primary").build()

        assertThat(categories.id()).contains("id")
        assertThat(categories.name()).contains("name")
        assertThat(categories.primary()).contains("primary")
    }

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
