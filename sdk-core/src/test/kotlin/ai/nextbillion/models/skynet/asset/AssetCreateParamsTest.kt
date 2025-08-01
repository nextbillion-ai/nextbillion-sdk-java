// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetCreateParamsTest {

    @Test
    fun create() {
        AssetCreateParams.builder()
            .key("key=API_KEY")
            .cluster(AssetCreateParams.Cluster.AMERICA)
            .attributes(
                JsonValue.from(
                    "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                )
            )
            .customId("custom_id")
            .description("description")
            .metaData(MetaData.builder().build())
            .name("name")
            .addTag("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AssetCreateParams.builder()
                .key("key=API_KEY")
                .cluster(AssetCreateParams.Cluster.AMERICA)
                .attributes(
                    JsonValue.from(
                        "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                    )
                )
                .customId("custom_id")
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

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AssetCreateParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Test
    fun body() {
        val params =
            AssetCreateParams.builder()
                .key("key=API_KEY")
                .cluster(AssetCreateParams.Cluster.AMERICA)
                .attributes(
                    JsonValue.from(
                        "{\n  \"shift_timing\": \"0800-1700\",\n  \"driver_name\": \"John\"\n}"
                    )
                )
                .customId("custom_id")
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
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.description()).contains("description")
        assertThat(body.metaData()).contains(MetaData.builder().build())
        assertThat(body.name()).contains("name")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AssetCreateParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
