// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetCreateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val assetCreateResponse =
            AssetCreateResponse.builder()
                .data(AssetCreateResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        assertThat(assetCreateResponse.data())
            .contains(AssetCreateResponse.Data.builder().id("id").build())
        assertThat(assetCreateResponse.message()).contains("message")
        assertThat(assetCreateResponse.status()).contains("status")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetCreateResponse =
            AssetCreateResponse.builder()
                .data(AssetCreateResponse.Data.builder().id("id").build())
                .message("message")
                .status("status")
                .build()

        val roundtrippedAssetCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetCreateResponse),
                jacksonTypeRef<AssetCreateResponse>(),
            )

        assertThat(roundtrippedAssetCreateResponse).isEqualTo(assetCreateResponse)
    }
}
