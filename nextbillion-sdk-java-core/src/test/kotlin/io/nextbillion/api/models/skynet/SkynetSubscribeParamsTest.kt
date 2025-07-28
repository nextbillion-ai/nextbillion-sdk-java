// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SkynetSubscribeParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SkynetSubscribeParams.builder()
            .action(SkynetSubscribeParams.Action.TRIP_SUBSCRIBE)
            .id("id")
            .params(SkynetSubscribeParams.Params.builder().id("id").build())
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
