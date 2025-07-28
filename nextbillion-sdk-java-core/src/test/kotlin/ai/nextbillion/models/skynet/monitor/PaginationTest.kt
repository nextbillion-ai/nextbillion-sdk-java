// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaginationTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val pagination = Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()

        assertThat(pagination.hasmore()).contains(true)
        assertThat(pagination.page()).contains(0L)
        assertThat(pagination.size()).contains(0L)
        assertThat(pagination.total()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagination = Pagination.builder().hasmore(true).page(0L).size(0L).total(0L).build()

        val roundtrippedPagination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagination),
                jacksonTypeRef<Pagination>(),
            )

        assertThat(roundtrippedPagination).isEqualTo(pagination)
    }
}
