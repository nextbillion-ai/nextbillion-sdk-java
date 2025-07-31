// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkynetSubscribeParamsTest {

    @Test
    fun create() {
        SkynetSubscribeParams.builder()
            .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
            .id("id")
            .params(SkynetSubscribeParams.Params.builder().id("id").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            SkynetSubscribeParams.builder()
                .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
                .id("id")
                .params(SkynetSubscribeParams.Params.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
        assertThat(body.id()).contains("id")
        assertThat(body.params()).contains(SkynetSubscribeParams.Params.builder().id("id").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SkynetSubscribeParams.builder()
                .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
                .build()

        val body = params._body()

        assertThat(body.action()).isEqualTo(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
    }
}
