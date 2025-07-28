// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset

import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetUpdateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AssetUpdateParams.builder()
            .id("id")
            .key("key=API_KEY")
            .cluster(AssetUpdateParams.Cluster.AMERICA)
            .attributes(
                JsonValue.from(
                    "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                )
            )
            .description("description")
            .metaData(MetaData.builder().build())
            .name("name")
            .addTag("string")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = AssetUpdateParams.builder().id("id").key("key=API_KEY").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            AssetUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(AssetUpdateParams.Cluster.AMERICA)
                .attributes(
                    JsonValue.from(
                        "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                    )
                )
                .description("description")
                .metaData(MetaData.builder().build())
                .name("name")
                .addTag("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("cluster", "america").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssetUpdateParams.builder().id("id").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            AssetUpdateParams.builder()
                .id("id")
                .key("key=API_KEY")
                .cluster(AssetUpdateParams.Cluster.AMERICA)
                .attributes(
                    JsonValue.from(
                        "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                    )
                )
                .description("description")
                .metaData(MetaData.builder().build())
                .name("name")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body._attributes())
            .isEqualTo(
                JsonValue.from(
                    "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                )
            )
        assertThat(body.description()).contains("description")
        assertThat(body.metaData()).isEqualTo(MetaData.builder().build())
        assertThat(body.name()).contains("name")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = AssetUpdateParams.builder().id("id").key("key=API_KEY").build()

        val body = params._body()
    }
}
