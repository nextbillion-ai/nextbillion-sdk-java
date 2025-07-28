// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.batch

import io.nextbillion.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        BatchCreateParams.builder()
            .key("key=API_KEY")
            .addRequest(BatchCreateParams.Request.builder().query("query").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            BatchCreateParams.builder()
                .key("key=API_KEY")
                .addRequest(BatchCreateParams.Request.builder().query("query").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BatchCreateParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .key("key=API_KEY")
                .addRequest(BatchCreateParams.Request.builder().query("query").build())
                .build()

        val body = params._body()

        assertThat(body.requests().getOrNull())
            .containsExactly(BatchCreateParams.Request.builder().query("query").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchCreateParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
